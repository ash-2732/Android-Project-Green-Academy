package com.example.greenacademy2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class skill_webdesign extends AppCompatActivity {

    private CardView html , css , javaScript;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skill_webdesign);

        Toolbar toolbarWebDesign = findViewById(R.id.toolbarWebDesign);
        setSupportActionBar( toolbarWebDesign );
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );


        String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/AP3_V7KXHs4?si=vZvQAeAEhijMnC4H\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";

        html = findViewById(R.id.html);
        html.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext() , Video.class);
                intent.putExtra("keyvideo" , video);
                startActivity(intent);
            }
        });

        css = findViewById(R.id.css);
        css.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext() , Video.class);
                intent.putExtra("keyvideo" , video);
                startActivity(intent);
            }
        });

        javaScript = findViewById(R.id.javaScript);
        javaScript.setOnClickListener(new View.OnClickListener() {
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