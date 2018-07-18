package xeno.hkjournalist.hkjournalist;

import android.widget.ImageView;

import java.io.InputStream;

/**
 * Created by xeno on 2018/7/18.
 */

public interface NetworkCallback {
    void onSuccess(InputStream is);
    void onFail(String errorMsg);
}
