package com.example.appsd.progressbardilatingdots;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.channguyen.adv.AnimatedDotsView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final AnimatedDotsView red = (AnimatedDotsView) findViewById(R.id.adv_1);
        red.startAnimation();

        final AnimatedDotsView yellow = (AnimatedDotsView) findViewById(R.id.adv_2);
        yellow.startAnimation();
    }
}
