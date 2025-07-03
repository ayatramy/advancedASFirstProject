package com.example.finalproject.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.finalproject.R;

public class morning extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morning);
        //button sabah & masaa
        Button bt_morningEvening = findViewById(R.id.bt_morning);
        bt_morningEvening.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent morEven = new Intent(getApplicationContext(), morning_evening.class);
                startActivity(morEven);
//                finish();
            }
        });

        //button noom
        Button bt_noom = findViewById(R.id.bt_morning2);
        bt_noom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent noom1 = new Intent(getApplicationContext(),noom.class);
                startActivity(noom1);
//                finish();
            }
        });

        // button wakeup
        Button bt_wakeUp = findViewById(R.id.bt_morning3);
        bt_wakeUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wakeUp = new Intent(getApplicationContext(), waking_up_from_sleep.class);
                startActivity(wakeUp);
//                finish();
            }
        });
    }
}