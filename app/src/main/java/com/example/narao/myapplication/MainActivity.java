package com.example.narao.myapplication;

import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.Menu;

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
        getMenuInflater().

    }
}
