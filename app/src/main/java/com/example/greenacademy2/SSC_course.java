package com.example.greenacademy2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SSC_course extends AppCompatActivity {

    private CardView ssc_physics , ssc_chemistry , ssc_math , ssc_higher_math,
            ssc_biology , ssc_ict , premium1 , free1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ssc_course);


        Toolbar toolbarSSC = findViewById(R.id.toolbarSSC);
        setSupportActionBar( toolbarSSC );
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );


        ssc_physics = findViewById(R.id.ssc_physics);
        ssc_physics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( getApplicationContext() , SSC_Physics.class);
                startActivity(intent);
            }
        });

        ssc_chemistry = findViewById(R.id.ssc_chemistry);
        ssc_chemistry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( getApplicationContext() , SSC_Chemistry.class);
                startActivity(intent);
            }
        });

        ssc_math = findViewById(R.id.ssc_math);
        ssc_math.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext() , SSC_Math.class);
                startActivity(intent);
            }
        });

        ssc_higher_math = findViewById(R.id.ssc_higher_math);
        ssc_higher_math.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext() , SSC_HigherMath.class);
                startActivity(intent);
            }
        });

        ssc_biology = findViewById(R.id.ssc_biology);
        ssc_biology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext() , SSC_Biology.class);
                startActivity( intent);
            }
        });

        ssc_ict = findViewById(R.id.ssc_ict);
        ssc_ict.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),SSC_ICT.class);
                startActivity(intent);
            }
        });

        premium1 = findViewById(R.id.premium1);
        premium1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/DfwPsKxqhfU?si=bO9PW7EEI8jjOrsi\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
                String msg = "1000TK";
                Intent intent = new Intent(getApplicationContext() , PremiumVideo.class);
                intent.putExtra("keymsg" , msg);
                intent.putExtra("keyvideo" , video);
                startActivity(intent);
            }
        });

        free1 = findViewById(R.id.free1);
        free1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/voaXwzxJTr8?si=89GGh_ukimdW3ClO\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
                String msg = "Free";
                Intent intent = new Intent(getApplicationContext() , PremiumVideo.class);
                intent.putExtra("keymsg" , msg);
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