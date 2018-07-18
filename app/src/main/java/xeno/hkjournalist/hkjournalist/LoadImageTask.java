package xeno.hkjournalist.hkjournalist;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.ImageView;

import java.io.InputStream;

/**
 * Created by xeno on 2018/7/17.
 */

public class LoadImageTask implements Runnable {

    public static final int SUCCESS = 1;

    private Handler mMainThreadHandler = new Handler(Looper.getMainLooper());

    private NetworkEngine mEngine;
    private String mUrl;
    private DecodeCallback mDecodeCallback;

    private Drawable mResultDrawable;

    public LoadImageTask(NetworkEngine engine, String url, DecodeCallback callback) {
        mEngine = engine;
        this.mUrl = url;
        mDecodeCallback = callback;
    }

    @Override
    public void run() {

        //使用engine同步获得InputStream
        InputStream is = mEngine.execute(this);

        //识别图片类型，选择解码器解码，生产出来一个Drawable
        mResultDrawable = decode(is);

        //已经拿到Drawable了，在线程的最后，要切换回主线程
        mMainThreadHandler.obtainMessage(SUCCESS, this);


    }

    public Drawable decode(InputStream is) {
        //TODO 关键步骤 InputStream--解码-->Drawable
        return
    }

    public void handleOnMainThread() {
        //回调给HKJ
        mDecodeCallback.onDecodeCompleted(mResultDrawable);
    }

    private static class MainThreadCallback implements Handler.Callback {



        @Override
        public boolean handleMessage(Message msg) {
            switch (msg.what) {
                case SUCCESS:
                    LoadImageTask task = (LoadImageTask) msg.obj;
                    task.handleOnMainThread();
                    break;
            }
            return false;
        }
    }

    public NetworkEngine getEngine() {
        return mEngine;
    }

    public void setEngine(NetworkEngine engine) {
        this.mEngine = engine;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        this.mUrl = url;
    }

}
