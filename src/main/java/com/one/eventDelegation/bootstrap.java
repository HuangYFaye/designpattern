package com.one.eventDelegation;

import java.util.Date;

/**
  * @ClassName: bootstrap
  * @Description: TODO(这里用一句话描述这个类的作用)
  * @author huangyifei
  * @date 2019/1/23
  * @version V1.0
*/
    
public class bootstrap {
    public static void main(String[] args) {
        GoodNotifier goodNotifier = new GoodNotifier();
        WatchCartoonListener watchCartoonListener = new WatchCartoonListener();
        WatchingNBAListener watchingNBAListener = new WatchingNBAListener();

        goodNotifier.addListener(watchCartoonListener,"stopWatchingTV",new Date());
        goodNotifier.addListener(watchingNBAListener,"stopPlayingGame",new Date());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        goodNotifier.notifyX();
    }
}
