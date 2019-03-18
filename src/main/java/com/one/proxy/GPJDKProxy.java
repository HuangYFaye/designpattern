package com.one.proxy;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author huangyifei
 * @version V1.0
 * @ClassName: GPJDKProxy
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @date 2019/3/18
 */

public class GPJDKProxy {

    public static final String ln = "\r\n";

    private static GPClassLoader classloader = new GPClassLoader();

    /**
     * 生成代理类
     *
     * @param interfaces
     * @param h
     * @return
     */
    public static Object newProxyInstance(Class<?>[] interfaces, GPInvocationHandler h) {

        try {
            //1、动态生成源代码.java文件
            String src = generateSrc(interfaces);

            //2、Java文件输出磁盘
            String filePath = GPJDKProxy.class.getResource("").getPath();
            System.out.println(filePath);
            File f = new File(filePath + "$Proxy0.java");
            FileWriter fw = new FileWriter(f);
            fw.write(src);
            fw.flush();
            fw.close();

            //3、把生成的.java文件编译成.class文件
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manager = compiler.getStandardFileManager(null, null, null);
            Iterable iterable = manager.getJavaFileObjects(f);
            JavaCompiler.CompilationTask task = compiler.getTask(null, manager, null, null, null, iterable);
            task.call();
            manager.close();

            //4、编译生成的.class文件加载到JVM中来
            Class proxyClazz = classloader.findClass("$Proxy0");
            Constructor c = proxyClazz.getConstructor(GPInvocationHandler.class);
            //5、返回字节码重组以后的新的代理对象
            return c.newInstance(h);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 根据被代理类的接口生成直接代理类
     *
     * @param interfaces
     * @return
     */
    private static String generateSrc(Class<?>[] interfaces) {

        StringBuffer sb = new StringBuffer();
        sb.append("package com.one.proxy;" + ln);
        sb.append("import com.one.proxy.Person;" + ln);
        sb.append("import java.lang.reflect.Method;" + ln);
        sb.append("public class $Proxy0 implements " + interfaces[0].getName() + "{" + ln);

        sb.append("GPInvocationHandler h;" + ln);

        sb.append("public $Proxy0(GPInvocationHandler h) { " + ln);

        sb.append("this.h = h;");

        sb.append("}" + ln);


        for (Method m : interfaces[0].getMethods()) {
            sb.append("public " + m.getReturnType().getName() + " " + m.getName() + "() {" + ln);
            sb.append("try{" + ln);
            sb.append("Method m = " + interfaces[0].getName() + ".class.getMethod(\"" + m.getName() + "\",new Class[]{});" + ln);
            sb.append("this.h.invoke(this,m,null);" + ln);
            sb.append("}catch(Throwable e){" + ln);
            sb.append("e.printStackTrace();" + ln);
            sb.append("}");
            sb.append("}");
        }

        sb.append("}" + ln);

        return sb.toString();
    }

}
