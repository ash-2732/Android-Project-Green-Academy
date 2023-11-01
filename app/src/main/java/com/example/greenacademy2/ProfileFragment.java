package com.example.greenacademy2;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;


public class ProfileFragment extends Fragment {


    Button logout;

    TextView programming , webDesign , others;

    private CardView python , c , cc , java , html , css , javaScript ,
    video , freelancing , marketing , speaking , graphics;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        programming = view.findViewById(R.id.programming);
        programming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), skill_programming.class);
                startActivity( intent );
            }
        });

        webDesign = view.findViewById(R.id.webDesign);
        webDesign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity() , skill_webdesign.class);
                startActivity( intent );
            }
        });

        others = view.findViewById(R.id.others);
        others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity() , skill_others.class);
                startActivity( intent );
            }
        });

        String video1 = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/fjdWnDQQMqg?si=1ROwnWfm9DO58zQE\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
        String video2 = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/AP3_V7KXHs4?si=vZvQAeAEhijMnC4H\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
        String video3 = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Pf_oGJE1vDc?si=VyYdPF2N1KVFUh2c\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";


        python = view.findViewById(R.id.python);
        python.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity() , Video.class);
                intent.putExtra("keyvideo" , video1);
                startActivity(intent);
            }
        });

        c = view.findViewById(R.id.c);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity() , Video.class);
                intent.putExtra("keyvideo" , video1);
                startActivity(intent);
            }
        });

        cc = view.findViewById(R.id.cc);
        cc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity() , Video.class);
                intent.putExtra("keyvideo" , video1);
                startActivity(intent);
            }
        });

        java = view.findViewById(R.id.java);
        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity() , Video.class);
                intent.putExtra("keyvideo" , video1);
                startActivity(intent);
            }
        });

        html = view.findViewById(R.id.html);
        html.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity() , Video.class);
                intent.putExtra("keyvideo" , video2);
                startActivity(intent);
            }
        });

        css = view.findViewById(R.id.css);
        css.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity() , Video.class);
                intent.putExtra("keyvideo" , video2);
                startActivity(intent);
            }
        });

        javaScript = view.findViewById(R.id.javaScript);
        javaScript.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity() , Video.class);
                intent.putExtra("keyvideo" , video2);
                startActivity(intent);
            }
        });

        video = view.findViewById(R.id.video);
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity() , Video.class);
                intent.putExtra("keyvideo" , video3);
                startActivity(intent);
            }
        });

        freelancing = view.findViewById(R.id.freelancing);
        freelancing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity() , Video.class);
                intent.putExtra("keyvideo" , video3);
                startActivity(intent);
            }
        });

        marketing = view.findViewById(R.id.marketing);
        marketing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity() , Video.class);
                intent.putExtra("keyvideo" , video3);
                startActivity(intent);
            }
        });

        speaking = view.findViewById(R.id.speaking);
        speaking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity() , Video.class);
                intent.putExtra("keyvideo" , video3);
                startActivity(intent);
            }
        });

        graphics = view.findViewById(R.id.graphics);
        graphics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity() , Video.class);
                intent.putExtra("keyvideo" , video3);
                startActivity(intent);
            }
        });


        return view;
    }


}