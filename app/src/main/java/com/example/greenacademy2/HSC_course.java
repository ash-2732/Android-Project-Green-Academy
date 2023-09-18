package com.example.greenacademy2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class HSC_course extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hsc_course);

        Toolbar toolbarHSC = findViewById(R.id.toolbarHSC);
        setSupportActionBar( toolbarHSC );
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );
    }

    public boolean onSupportNavigateUp(){
        // Handle back button click
        onBackPressed();
        return true;
    }
}