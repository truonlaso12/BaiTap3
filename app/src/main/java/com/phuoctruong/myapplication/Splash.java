package com.phuoctruong.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import static android.os.SystemClock.sleep;

public class Splash extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.giaodien_moapp);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                sleep(3500);
                Intent i = new Intent(Splash.this, main.class);
                startActivity(i);
            }
        });
        thread.start();
    }
}
