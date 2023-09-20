package com.example.greenacademy2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HSC_course extends AppCompatActivity {

    private CardView hsc_physics;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hsc_course);

        Toolbar toolbarHSC = findViewById(R.id.toolbarHSC);
        setSupportActionBar( toolbarHSC );
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );

        hsc_physics = findViewById(R.id.hsc_physics);
        hsc_physics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext() , HSC_Physics.class);
                startActivity(intent);
            }
        });
    }

    public boolean onSupportNavigateUp(){
        // Handle back button click
        onBackPressed();
        return true;
    }
}