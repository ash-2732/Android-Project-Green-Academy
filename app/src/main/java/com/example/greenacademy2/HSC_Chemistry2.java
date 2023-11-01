package com.example.greenacademy2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class HSC_Chemistry2 extends AppCompatActivity {

    private LinearLayout chapter_1 ,chapter_2,chapter_3 , chapter_4 , chapter_5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hsc_chemistry2);

        Toolbar toolbarHSC_Physics = findViewById(R.id.toolbarHSC_Chemistry2);
        setSupportActionBar( toolbarHSC_Physics );
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );

        String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/KAh2TOrtTq4?si=KY3o4t_wCApRsJc3\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";


        chapter_1 = findViewById(R.id.chapter_1);
        chapter_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // we can also pass from here if the video is different from each to other
                //String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/KAh2TOrtTq4?si=KY3o4t_wCApRsJc3\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
                Intent intent = new Intent(getApplicationContext() , Video.class);
                intent.putExtra("keyvideo" , video);
                startActivity(intent);
            }
        });

        chapter_2 = findViewById(R.id.chapter_2);
        chapter_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // we can also pass from here if the video is different from each to other
                //String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/KAh2TOrtTq4?si=KY3o4t_wCApRsJc3\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
                Intent intent = new Intent(getApplicationContext() , Video.class);
                intent.putExtra("keyvideo" , video);
                startActivity(intent);
            }
        });

        chapter_3 = findViewById(R.id.chapter_3);
        chapter_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // we can also pass from here if the video is different from each to other
                //String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/KAh2TOrtTq4?si=KY3o4t_wCApRsJc3\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
                Intent intent = new Intent(getApplicationContext() , Video.class);
                intent.putExtra("keyvideo" , video);
                startActivity(intent);
            }
        });

        chapter_4 = findViewById(R.id.chapter_4);
        chapter_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // we can also pass from here if the video is different from each to other
                //String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/KAh2TOrtTq4?si=KY3o4t_wCApRsJc3\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
                Intent intent = new Intent(getApplicationContext() , Video.class);
                intent.putExtra("keyvideo" , video);
                startActivity(intent);
            }
        });

        chapter_5 = findViewById(R.id.chapter_5);
        chapter_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // we can also pass from here if the video is different from each to other
                //String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/KAh2TOrtTq4?si=KY3o4t_wCApRsJc3\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
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