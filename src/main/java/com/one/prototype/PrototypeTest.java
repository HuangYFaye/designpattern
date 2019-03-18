package com.one.prototype;
/**
  * @ClassName: PrototypeTest
  * @Description: TODO(这里用一句话描述这个类的作用)
  * @author huangyifei
  * @date 2019/3/18
  * @version V1.0
*/
    
public class PrototypeTest {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape cloneShape1 = ShapeCache.getShape("1");
        Shape cloneShape2 = ShapeCache.getShape("1");
        System.out.println("shape" + cloneShape1.getType());
        System.out.println(cloneShape1 == cloneShape2);
        Shape cloneShape3 = ShapeCache.getShape("2");
        System.out.println("shape" + cloneShape2.getType());
    }
}
