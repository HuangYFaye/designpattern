package com.one.prototype;
/**
  * @ClassName: Shape
  * @Description: TODO(这里用一句话描述这个类的作用)
  * @author huangyifei
  * @date 2019/3/18
  * @version V1.0
*/
    
public abstract class Shape implements Cloneable{

    private String id;
    protected String type;//只允许本类与派生类访问

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    abstract void draw();
    @Override
    protected Object clone(){

        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
