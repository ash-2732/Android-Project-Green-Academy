package com.example.greenacademy2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import com.google.android.material.datepicker.MaterialStyledDatePickerDialog;

public class Video extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        WebView webView = findViewById(R.id.webView);

        // Now this part will come from another intent
        //String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/voaXwzxJTr8?si=89GGh_ukimdW3ClO\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";


        String vid = getIntent().getStringExtra("keyvideo");

        webView.loadData(vid,"text/html" , "utf-8");
        webView.getSettings().setJavaScriptEnabled( true );
        webView.setWebChromeClient( new WebChromeClient());
    }


}