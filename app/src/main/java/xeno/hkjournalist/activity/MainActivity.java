package xeno.hkjournalist.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.ImageLoader;

import xeno.hkjournalist.R;
import xeno.hkjournalist.hkjournalist.HKJournalist;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageLoader.getInstance().displayImage("fasf", new ImageView());
        HKJournalist.getInstance().load()
    }
}
