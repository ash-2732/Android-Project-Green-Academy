package com.example.greenacademy2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class HSC_Physics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hsc_physics);

        Toolbar toolbarHSC_Physics = findViewById(R.id.toolbarHSC_Physics);
        setSupportActionBar( toolbarHSC_Physics );
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );
    }

    public boolean onSupportNavigateUp(){
        // Handle back button click
        onBackPressed();
        return true;
    }
}