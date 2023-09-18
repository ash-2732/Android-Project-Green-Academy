package com.example.greenacademy2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class skill_others extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skill_others);

        Toolbar toolbarOthers = findViewById(R.id.toolbarOthers);
        setSupportActionBar( toolbarOthers );
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );
    }

    public boolean onSupportNavigateUp(){
        // Handle back button click
        onBackPressed();
        return true;
    }
}