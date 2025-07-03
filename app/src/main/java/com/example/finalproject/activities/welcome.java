//package com.example.finalproject.activities;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.os.Handler;
//import android.os.Looper;
//import android.widget.ImageView;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import com.example.finalproject.R;
//
//public class welcome extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_welcome);
//
//        ImageView welcome = findViewById(R.id.IV_quran);
//
//        // تأخير الانتقال لمدة 3 ثوانٍ باستخدام Handler
//        new Handler(Looper.getMainLooper()).postDelayed(() -> {
//            Intent intent = new Intent(welcome.this, MainActivity.class);
//            startActivity(intent);
//            finish();
//        }, 3000); // 3000 = 3 ثوانٍ
//    }
//}




package com.example.finalproject.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.finalproject.R;

public class welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        ImageView welcome = findViewById(R.id.IV_quran);
        Thread thread = new Thread(){
            public void run(){
                try {
                    sleep(5000);
                    Intent mainActivity = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(mainActivity);
                    finish();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        thread.start();
    }
}
