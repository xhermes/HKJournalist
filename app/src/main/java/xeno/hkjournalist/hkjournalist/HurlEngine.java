package xeno.hkjournalist.hkjournalist;

import android.widget.ImageView;

import java.io.InputStream;

/**
 * Created by Administrator on 2018/7/14.
 */

public class HurlEngine extends NetworkEngine {

    @Override
    public InputStream execute(LoadImageTask task) {
        return null;
    }

    @Override
    public void enqueue(LoadImageTask task) {

    }

    @Override
    public void enqueue(Request request) {

    }
}
