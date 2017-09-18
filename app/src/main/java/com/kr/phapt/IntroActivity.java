package com.kr.phapt;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;


/**
 * Created by Administrator on 2016-11-08.
 */
public class IntroActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                OnNext();
            }
        }, 3000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public void OnNext(){
        Intent intent = new Intent(this, WebActivity.class);
        startActivity(intent);
        finish();
    }
}
