package com.example.finalproject.activities;

import android.os.Bundle;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.finalproject.R;
import com.example.finalproject.fragments.WakingUpFromSleepFragment;

public class waking_up_from_sleep extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waking_up_from_sleep);
        FrameLayout wakeUpId = findViewById(R.id.wakeupid);
        //fragment object
        WakingUpFromSleepFragment wakeupFrag = new WakingUpFromSleepFragment();
        // get the fragment manager and start a trasaction
        FragmentManager wakeupmanagerFrag = getSupportFragmentManager();
        // fragment transaction and begin trasaction
        FragmentTransaction myFragTrasaction = wakeupmanagerFrag.beginTransaction();
        myFragTrasaction.add(R.id.wakeupid,wakeupFrag);
        myFragTrasaction.commit();

    }
}