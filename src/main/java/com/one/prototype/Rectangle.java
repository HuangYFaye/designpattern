package com.one.prototype;
/**
  * @ClassName: Rectangle
  * @Description: TODO(这里用一句话描述这个类的作用)
  * @author huangyifei
  * @date 2019/3/18
  * @version V1.0
*/
    
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Rectangle : draw() method");
    }
}
