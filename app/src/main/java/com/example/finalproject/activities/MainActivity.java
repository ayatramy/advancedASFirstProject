package com.example.finalproject.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.finalproject.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //morning page
        ImageView im_morning = findViewById(R.id.iv_crescent);
        Button btn_morning = findViewById(R.id.bt_crescent);
        im_morning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent morning = new Intent(getApplicationContext(),morning.class);
                startActivity(morning);

            }
        });
        btn_morning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent morning = new Intent(getApplicationContext(),morning.class);
                startActivity(morning);
            }
        });
        //pray page
        ImageView im_pray = findViewById(R.id.iv_prayer);
        Button btn_pray = findViewById(R.id.bt_pray);
        im_pray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pray = new Intent(getApplicationContext(), prayer_ablution.class);
                startActivity(pray);

            }
        });
        btn_pray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pray = new Intent(getApplicationContext(), prayer_ablution.class);
                startActivity(pray);
            }
        });
        //eat page
        ImageView im_eat = findViewById(R.id.iv_eat);
        Button btn_eat = findViewById(R.id.bt_eat);
        im_eat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent eat = new Intent(getApplicationContext(), eat_drink.class);
                startActivity(eat);

            }
        });
        btn_eat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent eat = new Intent(getApplicationContext(), eat_drink.class);
                startActivity(eat);
            }
        });
        //kabbah page
        ImageView im_kabbah = findViewById(R.id.iv_kabbah);
        Button btn_kabbah = findViewById(R.id.bt_kabbah);
        im_kabbah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kabbah = new Intent(getApplicationContext(), kabbah.class);
                startActivity(kabbah);

            }
        });
        btn_kabbah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kabbah = new Intent(getApplicationContext(), kabbah.class);
                startActivity(kabbah);
            }
        });

    }
}