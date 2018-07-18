package xeno.hkjournalist.hkjournalist;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/**
 * Created by xeno on 2018/7/18.
 */

public interface DecodeCallback {
    void onDecodeCompleted(Drawable drawable);
    void onDecodeFail(String errorMsg);
}
