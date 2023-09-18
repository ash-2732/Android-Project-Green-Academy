package com.example.greenacademy2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class Admission_course extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admission_course);

        Toolbar toolbarAdmission = findViewById(R.id.toolbarAdmission );
        setSupportActionBar( toolbarAdmission );
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );
    }

    public boolean onSupportNavigateUp(){
        // Handle back button click
        onBackPressed();
        return true;
    }
}