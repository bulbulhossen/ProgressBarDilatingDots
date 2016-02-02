package com.example.appsd.progressbardilatingdots;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.channguyen.adv.AnimatedDotsView;
import com.trncic.library.DottedProgressBar;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


import com.trncic.library.DottedProgressBar;


public class MainActivity extends AppCompatActivity {


    DottedProgressBar bar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final AnimatedDotsView red = (AnimatedDotsView) findViewById(R.id.adv_1);
        red.startAnimation();

        final AnimatedDotsView yellow = (AnimatedDotsView) findViewById(R.id.adv_2);
        yellow.startAnimation();


        bar = (DottedProgressBar) findViewById(R.id.progress);
        Runnable run = new Runnable() {


            @Override
            public void run() {
                bar.startProgress();
            }
        };
        Handler han = new Handler();
        han.postAtTime(run, 100);
    }


    public void stopProgress(View view) {
        bar.stopProgress();
    }


    public void startProgress(View view) {
        bar.startProgress();
    }
}