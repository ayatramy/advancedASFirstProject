package com.example.finalproject.activities;


import android.os.Bundle;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.finalproject.R;
import com.example.finalproject.fragments.WakingUpFromSleepFragment;
import com.example.finalproject.fragments.noomFragment;

public class noom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noom);
        FrameLayout noomId = findViewById(R.id.noomFragID);
        //fragment object
        noomFragment noomFrag = new noomFragment();
        // get the fragment manager and start a trasaction
        FragmentManager noomManagerFrag = getSupportFragmentManager();
        // fragment transaction and begin trasaction
        FragmentTransaction myFragTrasaction = noomManagerFrag.beginTransaction();
        myFragTrasaction.add(R.id.noomFragID,noomFrag);
        myFragTrasaction.commit();
    }
}