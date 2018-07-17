package xeno.hkjournalist.hkjournalist;

/**
 * Created by Administrator on 2018/7/14.
 */

public class HKJournalist {

    private volatile static HKJournalist instance;

    private HKJournalist(){

    }

    public static HKJournalist getInstance() {
        if(instance == null) {
            synchronized (HKJournalist.class) {
                if (instance == null) {
                    instance = new HKJournalist();
                } else {
                }
            }
        }
        return instance;
    }



}

