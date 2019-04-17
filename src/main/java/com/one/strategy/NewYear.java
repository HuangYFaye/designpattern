package com.one.strategy;

/**
 * @author huangyifei
 * @version V1.0
 * @ClassName: NewYear
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @date 2019/4/17
 */

public class NewYear implements Counter {

    @Override
    public float count(float price) {
        return (float) (price * 0.5);
    }
}
