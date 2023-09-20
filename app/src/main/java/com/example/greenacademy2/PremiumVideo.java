package com.example.greenacademy2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class PremiumVideo extends AppCompatActivity {

    private TextView msg , teacher_1 , teacher_2 ;
    private AppCompatButton showVideo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_premium_video);


        WebView webView = findViewById(R.id.webView);
        //String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/voaXwzxJTr8?si=89GGh_ukimdW3ClO\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";

        String vid = getIntent().getStringExtra("keyvideo");

        webView.loadData(vid,"text/html" , "utf-8");
        webView.getSettings().setJavaScriptEnabled( true );
        webView.setWebChromeClient( new WebChromeClient());

        // For setting teacher name
        teacher_1 = findViewById(R.id.teacher_1);
        String tea1 = getIntent().getStringExtra("keyTeach_1");
        teacher_1.setText( tea1 );

        teacher_2 = findViewById(R.id.teacher_2);
        String tea2 = getIntent().getStringExtra("keyTeach_2");
        teacher_2.setText( tea2 );

        // Premium or free
        msg = findViewById(R.id.msg);
        String text = getIntent().getStringExtra("keymsg");
        msg.setText(text);



        // for dialog box to show video
        showVideo = findViewById(R.id.showVideo);
        showVideo.setOnClickListener(new View.OnClickListener() {
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
                //Toast.makeText(PremiumVideo.this, "Video Stopped", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });
        dialog.show();
    }
}