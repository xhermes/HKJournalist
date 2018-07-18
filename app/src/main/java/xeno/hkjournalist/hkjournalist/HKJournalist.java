package xeno.hkjournalist.hkjournalist;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import java.io.InputStream;

/**
 * Created by Administrator on 2018/7/14.
 * 唯一的，配置，设定，用什么网络组件，怎么展示图片，要不要裁剪
 */

public class HKJournalist {

    private volatile static HKJournalist instance;

    private NetworkEngine mEngine;
    private DefaultDispatcher mDispatcher;

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

    public void setEngine(NetworkEngine engine) {
        mEngine = engine;
    }


    public void init() {

    }

    public void loadImage(String url, final ImageView iv) {

        final Target target = new Target();
        Request request = new Request(url, target);
        LoadImageTask task = new LoadImageTask(mEngine, url, new DecodeCallback() {
            @Override
            public void onDecodeCompleted(Drawable drawable) {
                target.mImageView.setImageDrawable(drawable);
            }

            @Override
            public void onDecodeFail(String errorMsg) {

            }
        });

        mDispatcher.dispatch(task);

//        LoadImageTask task = new LoadImageTask(mEngine, url, iv, new NetworkCallback() {
//            @Override
//            public void onSuccess(InputStream is, ImageView iv) {
//                displayImage(is, iv);
//            }
//
//            @Override
//            public void onFail(String errorMsg) {
//
//            }
//        });
//
//        mEngine.enqueue(task);



    }


    public void displayImage(InputStream is, ImageView iv) {

    }

}

