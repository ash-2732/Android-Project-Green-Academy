package com.example.greenacademy2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class skill_programming extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skill_programming);

        Toolbar toolbarProgramming = findViewById(R.id.toolbarProgramming);
        setSupportActionBar( toolbarProgramming );
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );
    }

    public boolean onSupportNavigateUp(){
        // Handle back button click
        onBackPressed();
        return true;
    }
}