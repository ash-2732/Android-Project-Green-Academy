package com.example.greenacademy2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class SSC_course extends AppCompatActivity {

    private CardView ssc_physics , ssc_chemistry , ssc_math , ssc_higher_math,
            ssc_biology , ssc_ict;

    private CardView  premium1 ,premium2 , premium3 , free1 , free2 , free3;
    private CardView details;

    private Button seeDetails;

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

                String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/DfwPsKxqhfU?si=bO9PW7EEI8jjOrsi\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
                String msg = "1000TK";

                String teacher_1 = "Emon Khan";
                String teacher_2 = "Hridoy Ahmed";

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

                String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/DfwPsKxqhfU?si=bO9PW7EEI8jjOrsi\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
                String msg = "1000TK";

                String teacher_1 = "Dipto Mistry";
                String teacher_2 = "Himel Roy";

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

                //String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/voaXwzxJTr8?si=89GGh_ukimdW3ClO\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";

                String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/DfwPsKxqhfU?si=bO9PW7EEI8jjOrsi\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
                String msg = "Free";
                String teacher_1 = "Tahsin Ahmed";
                String teacher_2 = "Mh Shawon";
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

                //String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/voaXwzxJTr8?si=89GGh_ukimdW3ClO\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";

                String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/DfwPsKxqhfU?si=bO9PW7EEI8jjOrsi\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
                String msg = "Free";
                String teacher_1 = "Abrar Eyasir";
                String teacher_2 = "Abir Hassan";
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

                //String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/voaXwzxJTr8?si=89GGh_ukimdW3ClO\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";

                String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/DfwPsKxqhfU?si=bO9PW7EEI8jjOrsi\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
                String msg = "Free";
                String teacher_1 = "Jahid Hassan";
                String teacher_2 = "Rifat Hossain";
                Intent intent = new Intent(getApplicationContext() , PremiumVideo.class);
                intent.putExtra("keymsg" , msg);
                intent.putExtra("keyvideo" , video);

                intent.putExtra("keyTeach_1" , teacher_1);
                intent.putExtra("keyTeach_2" , teacher_2);

                startActivity(intent);
            }
        });


        // this part is for dialog_video
        seeDetails = findViewById(R.id.seeDetails);
        seeDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAlertDialogBox();
            }
        });

        details = findViewById(R.id.details);
        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAlertDialogBox();
            }
        });
    }

    private void showAlertDialogBox() {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.video_dialogbox);

        WebView webView2 = dialog.findViewById(R.id.webView2);
        //String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/voaXwzxJTr8?si=89GGh_ukimdW3ClO\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";

        String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/DfwPsKxqhfU?si=bO9PW7EEI8jjOrsi\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
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