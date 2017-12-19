package com.example.narao.myapplication;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import java.util.concurrent.ScheduledExecutorService;


public class MainActivity extends AppCompatActivity {

    @Overrride
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        //ゲーム画面を表示
        Display display = getWindowManager().getDefaultDisplay();
        Point p = new Point();
        display.getSize(p);
        MySurfaceView mySurfaceView = new MySerfaceView(this,p);
    }
    @Overrride
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }
    @Override
    public boolean onOptionsltemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id_settings){
            return true;
        }

        return  super.onOptionsItemSelected(item);
    }

    //実際の画面
    //この中で画像を描画している
    class MySurfaceView extends SurfaceView implements SurfaceHolder.Callback{

        private final int INTERVAL_PERIOD = 1;
        private final int RESULT_TEXT_SIZE = 200;
        private final int RESULT_TEXT_SIZE_HALF = 100;
        private final int TARGET_IMAGE_SIZE = 200;
        private final String RESULT_TEXT_SUCCESS = "Success";
        private final String RESULT_TEXT_FAILED = "Failed...";

        private int mTargetX = 0;
        private int mTargetY = 0;
        private Paint mPaint;
        private Bitmap mTargetImage;
        private ScheduledExecutorService mScheduledExecutorService;
    }
}
