package xeno.hkjournalist.hkjournalist;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by xeno on 2018/7/17.
 * 默认线程调度器
 */

public class DefaultDispatcher {

    private ExecutorService mExecutorService;

    public DefaultDispatcher() {
        mExecutorService = Executors.newFixedThreadPool(5);
    }

    public void dispatch(Runnable r) {
        mExecutorService.execute(r);
    }
}
