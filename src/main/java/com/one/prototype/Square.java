package com.one.prototype;
/**
  * @ClassName: Square
  * @Description: TODO(这里用一句话描述这个类的作用)
  * @author huangyifei
  * @date 2019/3/18
  * @version V1.0
*/
    
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Square : draw() method");
    }
}
