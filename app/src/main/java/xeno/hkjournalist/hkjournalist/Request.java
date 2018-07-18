package xeno.hkjournalist.hkjournalist;

import android.graphics.Bitmap;

import java.io.InputStream;

/**
 * Created by xeno on 2018/7/18.
 * 多个的，主线程，记录整个请求，由Engine寻找具体网络组件入队执行，目前还负责解码
 */
@Deprecated
public class Request implements NetworkCallback {

    Target target;
    String url;

    Request(String url, Target target) {
        this.url = url;
        this.target = target;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public void onSuccess(InputStream is) {
        //TODO 解码
//        Bitmap bitmap = decoder.decode(is);
//        target.onImageReady(bitmap);
    }

    @Override
    public void onFail(String errorMsg) {

    }
}
