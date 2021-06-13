package com.example.gitemptyactivitytemplatesettingsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        
        getSupportFragmentManager().beginTransaction()
                .add(R.id.testFragmentContainerView, TestFragment.class,null)
                .setReorderingAllowed(true)
                .commit();
        
    }
}