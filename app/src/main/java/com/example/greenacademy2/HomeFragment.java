package com.example.greenacademy2;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.imageview.ShapeableImageView;

public class HomeFragment extends Fragment {

    CardView faq;
    CardView SSC , HSC , Admission ,first , notice , seeCourse ,seeVideo;

    ShapeableImageView profileImage;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        faq = view.findViewById(R.id.faq);
        faq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( getActivity() , FAQ.class);
                startActivity( intent);
            }
        });

        SSC = view.findViewById(R.id.SSC);
        SSC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( getActivity() , SSC_course.class);
                startActivity( intent);
            }
        });

        HSC = view.findViewById(R.id.HSC);
        HSC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( getActivity() , HSC_course.class);
                startActivity( intent);
            }
        });

        Admission = view.findViewById(R.id.Admission);
        Admission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( getActivity() , Admission_course.class);
                startActivity( intent);
            }
        });

        profileImage = view.findViewById(R.id.profileImage);
        profileImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( getActivity() , UserProfile.class);
                startActivity( intent);
            }
        });

        notice = view.findViewById(R.id.notice);
        notice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( getActivity() , NoticeBoard.class);
                startActivity( intent);
            }
        });

        seeCourse = view.findViewById(R.id.seeCourse);
        seeCourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showCourseDialogBox();
            }
        });

        seeVideo = view.findViewById(R.id.seeVideo);
        seeVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAlertDialogBox();
            }
        });

        return view;
 }

    private void showAlertDialogBox() {

        Dialog dialog = new Dialog(getActivity());
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

    private void showCourseDialogBox() {

        LinearLayout SSC_Course , HSC_Course , Admission_Course;

        View alertCustomDialog = LayoutInflater.from(getActivity()).inflate(R.layout.courseview_layout , null);
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(getActivity());

        alertDialog.setView(alertCustomDialog);
        ImageButton cancelButton = alertCustomDialog.findViewById(R.id.cancelButton);

        SSC_Course = alertCustomDialog.findViewById(R.id.SSC_Course);
        HSC_Course = alertCustomDialog.findViewById(R.id.HSC_Course);
        Admission_Course = alertCustomDialog.findViewById(R.id.Admission_Course);

        SSC_Course.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity() , SSC_course.class);
                startActivity(intent);
            }
        });

        HSC_Course.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity() , HSC_course.class);
                startActivity(intent);
            }
        });

        Admission_Course.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity() , Admission_course.class);
                startActivity(intent);
            }
        });



        final AlertDialog dialog = alertDialog.create();
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.cancel();
                //Toast.makeText(getActivity(), "Closed!", Toast.LENGTH_SHORT).show();
            }
        });
    }



}