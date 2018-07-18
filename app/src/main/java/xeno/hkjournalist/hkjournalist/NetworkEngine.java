package xeno.hkjournalist.hkjournalist;

import android.widget.ImageView;

import java.io.InputStream;

/**
 * Created by xeno on 2018/7/17.
 * 唯一的，与具体网络执行平台相关的
 */

public abstract class NetworkEngine {

    public abstract InputStream execute(LoadImageTask task);


    public abstract void enqueue(LoadImageTask task);

    public abstract void enqueue(Request request);

}
