package com.example.greenacademy2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.greenacademy2.databinding.ActivityMainBinding;
import com.example.greenacademy2.databinding.ActivityStartAfterOpenningBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class StartAfterOpenning extends AppCompatActivity {

    ActivityStartAfterOpenningBinding binding;
    //BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityStartAfterOpenningBinding.inflate(getLayoutInflater());
        //setContentView(R.layout.activity_start_after_openning);
        setContentView(binding.getRoot());

        replaceFragment( new HomeFragment());
        binding.bottomNavigationView.setBackground( null );

        binding.bottomNavigationView.setOnItemSelectedListener( item -> {

            if( item.getItemId() == R.id.home ){
                replaceFragment( new HomeFragment());
            }
            else if( item.getItemId() == R.id.about ){
                replaceFragment( new AboutFragment());
            } else if ( item.getItemId() == R.id.help) {
                replaceFragment( new HelpLineFragment());
            } else if ( item.getItemId() == R.id.skill) {
                replaceFragment( new ProfileFragment());
            }
            return true;
        });

//        binding.fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                showBottomDialog();
//            }
//        });

    }

    private void replaceFragment(Fragment fragment ){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout , fragment);
        fragmentTransaction.commit();
    }


    // FOR SHOWING ALERT DIALOG
    private void showBottomDialog(){

        final Dialog dialog = new Dialog( this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);

        dialog.setContentView( R.layout.bottomsheet_layout);
        LinearLayout videoLayout = dialog.findViewById(R.id.layoutVideo);
        LinearLayout shortsLayout = dialog.findViewById(R.id.layoutShorts);
        LinearLayout liveLayout = dialog.findViewById(R.id.layoutLive);
        ImageView cancelButton = dialog.findViewById(R.id.cancelButton);

        videoLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
                Toast.makeText(StartAfterOpenning.this, "Upload a video is clicked", Toast.LENGTH_SHORT).show();
            }
        });

        shortsLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
                Toast.makeText(StartAfterOpenning.this, "Create a short is clicked", Toast.LENGTH_SHORT).show();
            }
        });

        liveLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
                Toast.makeText(StartAfterOpenning.this, "Go Live is clicked", Toast.LENGTH_SHORT).show();
            }
        });

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

        dialog.show();
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT , ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawable( new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
        dialog.getWindow().setGravity(Gravity.BOTTOM);
    }
}