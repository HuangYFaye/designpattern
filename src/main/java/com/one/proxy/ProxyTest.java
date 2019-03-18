package com.one.proxy;

/**
 * @author huangyifei
 * @version V1.0
 * @ClassName: ProxyTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @date 2019/3/18
 */

public class ProxyTest {

    public static void main(String[] args) throws Exception {
        Person obj = (Person) new MeiPo().getInstance(new XieMu());
        obj.findJob();
    }

}
