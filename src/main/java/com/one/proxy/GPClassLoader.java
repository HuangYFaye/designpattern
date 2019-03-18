package com.one.proxy;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author huangyifei
 * @version V1.0
 * @ClassName: GPClassLoader
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @date 2019/3/18
 */

public class GPClassLoader extends ClassLoader {

    private File classPathFile;

    public GPClassLoader() {
        //ClassLoader所在类的路径
        String classPath = GPClassLoader.class.getResource("").getPath();
        System.out.println(classPath);
        //访问ClassLoader路径
        this.classPathFile = new File(classPath);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        //拼接类名
        String className = GPClassLoader.class.getPackage().getName() + "." + name;

        if (classPathFile != null) {
            //打开对应类文件
            File classFile = new File(classPathFile, name.replaceAll("\\.", "/") + ".class");
            //如何文件存在
            if (classFile.exists()) {
                FileInputStream in = null;//文件流输入
                ByteArrayOutputStream out = null;//二进制流输出

                try {
                    in = new FileInputStream(classFile);
                    out = new ByteArrayOutputStream();
                    byte[] buff = new byte[1024];
                    int len;
                    while ((len = in.read(buff)) != -1) {
                        out.write(buff, 0, len);
                    }
                    return defineClass(className, out.toByteArray(), 0, out.size());
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    if (null != in) {
                        try {
                            in.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                    if (out != null) {
                        try {
                            out.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        return null;
    }
}
