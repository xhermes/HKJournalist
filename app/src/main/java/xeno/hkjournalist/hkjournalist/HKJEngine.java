package xeno.hkjournalist.hkjournalist;

import android.widget.ImageView;

/**
 * Created by xeno on 2018/7/17.
 */

public class HKJEngine extends NetworkEngine {

    private DefaultDispatcher mDispatcher = new DefaultDispatcher();


    @Override
    public void enqueue(LoadImageTask task) {
        mDispatcher.dispatch(task);
    }
}
