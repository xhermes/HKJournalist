package xeno.hkjournalist.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.ImageLoader;

import xeno.hkjournalist.R;
import xeno.hkjournalist.hkjournalist.HKJournalist;
import xeno.hkjournalist.hkjournalist.NetworkEngine;
import xeno.hkjournalist.hkjournalist.OkHttpEngine;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView iv = (ImageView) findViewById(R.id.iv);
//        ImageLoader.getInstance().displayImage("fasf", new ImageView());

        NetworkEngine engine = new OkHttpEngine();
        HKJournalist.getInstance().setEngine(engine);

        HKJournalist.getInstance().loadImage("gegaweg", iv);
    }
}
