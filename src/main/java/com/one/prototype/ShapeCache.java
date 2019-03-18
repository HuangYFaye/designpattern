package com.one.prototype;

import java.util.HashMap;

/**
 * @author huangyifei
 * @version V1.0
 * @ClassName: ShapeCache
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @date 2019/3/18
 */

public class ShapeCache {

    private static HashMap<String, Shape> shapeMap = new HashMap<>();

    public static void loadCache() {
        Rectangle rectangle = new Rectangle();
        rectangle.setId("1");
        shapeMap.put(rectangle.getId(), rectangle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);
    }

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }
}
