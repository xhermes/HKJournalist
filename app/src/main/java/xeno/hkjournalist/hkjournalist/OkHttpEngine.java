package xeno.hkjournalist.hkjournalist;

import android.util.Log;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by Administrator on 2018/7/14.
 */

public class OkHttpEngine extends NetworkEngine {

    public OkHttpEngine() {

    }


    public void a() {


        String url = "http://wwww.baidu.com";
        OkHttpClient okHttpClient = new OkHttpClient();
        final Request request = new Request.Builder()
                .url(url)
                .get()//默认就是GET请求，可以不写
                .build();
        Call call = okHttpClient.newCall(request);

        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.d("a", "onFailure: ");
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                Log.d("a", "onResponse: " + response.body().string());
            }
        });
    }

    @Override
    public InputStream execute(LoadImageTask task) {
        OkHttpClient okHttpClient = new OkHttpClient();
        final Request okRequest = new Request.Builder()
                .url(task.getUrl())
                .get()//默认就是GET请求，可以不写
                .build();
        Call call = okHttpClient.newCall(okRequest);
        Response response = null;
        try {
           response = call.execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response.body().byteStream();
    }

    @Override
    public void enqueue(LoadImageTask task) {

    }

    @Override
    public void enqueue(final xeno.hkjournalist.hkjournalist.Request request) {
        //TODO 入队OKHttp
        OkHttpClient okHttpClient = new OkHttpClient();
        final Request okRequest = new Request.Builder()
                .url(request.getUrl())
                .get()//默认就是GET请求，可以不写
                .build();
        Call call = okHttpClient.newCall(okRequest);

        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
//                request.onFail();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
//                request.onSuccess(response.body().byteStream());

            }
        });
    }
}
