package com.example.greenacademy2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class skill_others extends AppCompatActivity {

    private CardView video , freelancing , marketing , speaking , graphics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skill_others);

        Toolbar toolbarOthers = findViewById(R.id.toolbarOthers);
        setSupportActionBar( toolbarOthers );
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );

        String videos = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Pf_oGJE1vDc?si=VyYdPF2N1KVFUh2c\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
        video = findViewById(R.id.video);
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext() , Video.class);
                intent.putExtra("keyvideo" , videos);
                startActivity(intent);
            }
        });

        freelancing = findViewById(R.id.freelancing);
        freelancing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext() , Video.class);
                intent.putExtra("keyvideo" , videos);
                startActivity(intent);
            }
        });

        marketing = findViewById(R.id.marketing);
        marketing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext() , Video.class);
                intent.putExtra("keyvideo" , videos);
                startActivity(intent);
            }
        });

        speaking = findViewById(R.id.speaking);
        speaking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext() , Video.class);
                intent.putExtra("keyvideo" , videos);
                startActivity(intent);
            }
        });

        graphics = findViewById(R.id.graphics);
        graphics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext() , Video.class);
                intent.putExtra("keyvideo" , videos );
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