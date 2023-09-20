package com.example.greenacademy2;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.imageview.ShapeableImageView;

public class HomeFragment extends Fragment {

    CardView gotoUserProfile;
    CardView SSC , HSC , Admission ,first , notice;

    ShapeableImageView profileImage;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        gotoUserProfile = view.findViewById(R.id.gotoUserProfile);
        gotoUserProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( getActivity() , UserProfile.class);
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

        return view;
 }
}