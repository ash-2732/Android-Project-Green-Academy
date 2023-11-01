package com.example.greenacademy2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class skill_programming extends AppCompatActivity {

    private CardView python , c , cc , java;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skill_programming);

        Toolbar toolbarProgramming = findViewById(R.id.toolbarProgramming);
        setSupportActionBar( toolbarProgramming );
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );

        String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/fjdWnDQQMqg?si=1ROwnWfm9DO58zQE\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";

        python = findViewById(R.id.python);
        python.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext() , Video.class);
                intent.putExtra("keyvideo" , video);
                startActivity(intent);
            }
        });

        c = findViewById(R.id.c);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext() , Video.class);
                intent.putExtra("keyvideo" , video);
                startActivity(intent);
            }
        });

        cc = findViewById(R.id.cc);
        cc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext() , Video.class);
                intent.putExtra("keyvideo" , video);
                startActivity(intent);
            }
        });

        java = findViewById(R.id.java);
        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext() , Video.class);
                intent.putExtra("keyvideo" , video);
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