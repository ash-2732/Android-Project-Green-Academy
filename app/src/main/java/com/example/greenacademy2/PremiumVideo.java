package com.example.greenacademy2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.TextView;

public class PremiumVideo extends AppCompatActivity {

    private TextView msg;
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

        msg = findViewById(R.id.msg);
        String text = getIntent().getStringExtra("keymsg");
        msg.setText(text);

    }
}