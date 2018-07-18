package xeno.hkjournalist.hkjournalist;

import android.graphics.Bitmap;
import android.widget.ImageView;

/**
 * Created by xeno on 2018/7/18.
 * 多个的，表示获取到图片以后，最终将导入的目标，绑定Request
 */
@Deprecated
public class Target {

    ImageView mImageView;
    Request mRequest;

    Target() {
//        mImageView = iv;
//        mRequest = request;
    }

    public void onImageReady(Bitmap bitmap) {
        mImageView.setImageBitmap(bitmap);
    }
}
