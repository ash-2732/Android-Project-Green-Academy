package com.example.greenacademy2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class HelpLineFragment extends Fragment {

    Button LoggingOut , sendEmailBtn , callBtn;
    EditText Subject , Content , Email;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_help_line, container, false);


        // FOR CALL
        callBtn = view.findViewById(R.id.callBtn);
        callBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01781268486"));
                startActivity(intent);
            }
        });


        // FOR SENDING EMAIL

        Subject = view.findViewById(R.id.subject);
        Email = view.findViewById(R.id.email);
        Content = view.findViewById(R.id.con);
        sendEmailBtn = view.findViewById(R.id.sendEmailBtn);

        sendEmailBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String subject , con , email;
                subject = Subject.getText().toString();
                con = Content.getText().toString();
                email = Email.getText().toString();

                if( subject.equals("") || con.equals("") || email.equals("") ){
                    Toast.makeText(getContext(), "Please fill up all field", Toast.LENGTH_SHORT).show();
                }
                else{
                    sendEmail( subject , con , email);
                }
            }
        });

        return view;
    }

    private void sendEmail(String subject, String con, String email) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL , new String[]{ email });
        intent.putExtra(Intent.EXTRA_SUBJECT , subject);
        intent.putExtra(Intent.EXTRA_TEXT , con);
        intent.setType("message/rfc822");

        startActivity(Intent.createChooser(intent,"Choose email client:"));
    }
}