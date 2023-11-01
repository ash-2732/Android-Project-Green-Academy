package com.example.greenacademy2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ImageView;

public class HSC_course extends AppCompatActivity {

    private CardView hsc_physics1 , hsc_physics2 , hsc_chemistry1 , hsc_chemistry2 ,
    hsc_higherMath1 , hsc_higherMath2 ,hsc_biology1 , hsc_biology2 , hsc_ict;

    private CardView  premium1 ,premium2 , premium3 , free1 , free2 , free3;

    private CardView  details;
    private AppCompatButton seeDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hsc_course);

        Toolbar toolbarHSC = findViewById(R.id.toolbarHSC);
        setSupportActionBar( toolbarHSC );
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );

        hsc_physics1 = findViewById(R.id.hsc_physics1);
        hsc_physics1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext() , HSC_Physics.class);
                startActivity(intent);
            }
        });

        hsc_physics2 = findViewById(R.id.hsc_physics2);
        hsc_physics2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext() , HSC_Physics2.class);
                startActivity(intent);
            }
        });

        hsc_chemistry1 = findViewById(R.id.hsc_chemistry1);
        hsc_chemistry1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext() , HSC_Chemistry1.class);
                startActivity(intent);
            }
        });

        hsc_chemistry2 = findViewById(R.id.hsc_chemistry2);
        hsc_chemistry2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext() , HSC_Chemistry2.class);
                startActivity(intent);
            }
        });

        hsc_higherMath1 = findViewById(R.id.hsc_higherMath1);
        hsc_higherMath1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext() , HSC_HigherMath1.class);
                startActivity(intent);
            }
        });

        hsc_higherMath2 = findViewById(R.id.hsc_higherMath2);
        hsc_higherMath2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext() , HSC_HigherMath2.class);
                startActivity(intent);
            }
        });

        hsc_biology1 = findViewById(R.id.hsc_biology1);
        hsc_biology1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext() , HSC_Biology1.class);
                startActivity(intent);
            }
        });

        hsc_biology2 = findViewById(R.id.hsc_biology2);
        hsc_biology2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext() , HSC_Biology2.class);
                startActivity(intent);
            }
        });

        hsc_ict = findViewById(R.id.hsc_ict);
        hsc_ict.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext() , HSC_ICT.class);
                startActivity(intent);
            }
        });


        details = findViewById(R.id.details);
        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAlertDialogBox();
            }
        });

        seeDetails = findViewById(R.id.seeDetails);
        seeDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAlertDialogBox();
            }
        });

        premium1 = findViewById(R.id.premium1);
        premium1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/s1MUcxO-x8Q?si=y1ErZfKNVUm5Jsa9\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
                String msg = "1000TK";

                String teacher_1 = "Dibbyo Roy";
                String teacher_2 = "Ferdous Mondol";

                Intent intent = new Intent(getApplicationContext() , PremiumVideo.class);
                intent.putExtra("keymsg" , msg);
                intent.putExtra("keyvideo" , video);

                intent.putExtra("keyTeach_1" , teacher_1);
                intent.putExtra("keyTeach_2" , teacher_2);

                startActivity(intent);
            }
        });

        premium2 = findViewById(R.id.premium2);
        premium2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/s1MUcxO-x8Q?si=y1ErZfKNVUm5Jsa9\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
                String msg = "1000TK";

                String teacher_1 = "Dibbyo Roy";
                String teacher_2 = "Ferdous Mondol";

                Intent intent = new Intent(getApplicationContext() , PremiumVideo.class);
                intent.putExtra("keymsg" , msg);
                intent.putExtra("keyvideo" , video);

                intent.putExtra("keyTeach_1" , teacher_1);
                intent.putExtra("keyTeach_2" , teacher_2);

                startActivity(intent);
            }
        });

        premium3 = findViewById(R.id.premium3);
        premium3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/s1MUcxO-x8Q?si=y1ErZfKNVUm5Jsa9\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
                String msg = "1000TK";

                String teacher_1 = "Dibbyo Roy";
                String teacher_2 = "Ferdous Mondol";

                Intent intent = new Intent(getApplicationContext() , PremiumVideo.class);
                intent.putExtra("keymsg" , msg);
                intent.putExtra("keyvideo" , video);

                intent.putExtra("keyTeach_1" , teacher_1);
                intent.putExtra("keyTeach_2" , teacher_2);

                startActivity(intent);
            }
        });

        free1 = findViewById(R.id.free1);
        free1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/s1MUcxO-x8Q?si=y1ErZfKNVUm5Jsa9\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
                String msg = "1000TK";

                String teacher_1 = "Dibbyo Roy";
                String teacher_2 = "Ferdous Mondol";

                Intent intent = new Intent(getApplicationContext() , PremiumVideo.class);
                intent.putExtra("keymsg" , msg);
                intent.putExtra("keyvideo" , video);

                intent.putExtra("keyTeach_1" , teacher_1);
                intent.putExtra("keyTeach_2" , teacher_2);

                startActivity(intent);
            }
        });

        free2 = findViewById(R.id.free2);
        free2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/s1MUcxO-x8Q?si=y1ErZfKNVUm5Jsa9\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
                String msg = "1000TK";

                String teacher_1 = "Dibbyo Roy";
                String teacher_2 = "Ferdous Mondol";

                Intent intent = new Intent(getApplicationContext() , PremiumVideo.class);
                intent.putExtra("keymsg" , msg);
                intent.putExtra("keyvideo" , video);

                intent.putExtra("keyTeach_1" , teacher_1);
                intent.putExtra("keyTeach_2" , teacher_2);

                startActivity(intent);
            }
        });

        free3 = findViewById(R.id.free3);
        free3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/s1MUcxO-x8Q?si=y1ErZfKNVUm5Jsa9\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
                String msg = "1000TK";

                String teacher_1 = "Dibbyo Roy";
                String teacher_2 = "Ferdous Mondol";

                Intent intent = new Intent(getApplicationContext() , PremiumVideo.class);
                intent.putExtra("keymsg" , msg);
                intent.putExtra("keyvideo" , video);

                intent.putExtra("keyTeach_1" , teacher_1);
                intent.putExtra("keyTeach_2" , teacher_2);

                startActivity(intent);
            }
        });
    }

    private void showAlertDialogBox() {

        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.video_dialogbox);

        WebView webView2 = dialog.findViewById(R.id.webView2);
        //String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/voaXwzxJTr8?si=89GGh_ukimdW3ClO\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";

        String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/qxYbHzn8bbU?si=ywO_Tz_PCNqQXWpo\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
        webView2.loadData(video,"text/html" , "utf-8");
        webView2.getSettings().setJavaScriptEnabled( true );
        webView2.setWebChromeClient( new WebChromeClient());

        ImageView cancelVideo = dialog.findViewById(R.id.cancelVideo);
        cancelVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(SSC_course.this, "Video Stopped", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });
        dialog.show();
    }

    public boolean onSupportNavigateUp(){
        // Handle back button click
        onBackPressed();
        return true;
    }
}