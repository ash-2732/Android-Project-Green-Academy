package com.example.greenacademy2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

public class DashBoard extends AppCompatActivity {

    TextView fullName , email , phone , dob , verifyMsg;
    FirebaseFirestore fStore;
    FirebaseAuth fAuth;
    String userId;
    Button seeProfile , resendCode;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

//        phone = findViewById(R.id.profilePhone);
//        fullName = findViewById(R.id.profileName);
//        email = findViewById(R.id.profileEmail);
//        dob = findViewById(R.id.profileDob);
//
//
        fAuth = FirebaseAuth.getInstance();
//        fStore = FirebaseFirestore.getInstance();
        userId = fAuth.getCurrentUser().getUid();
//
//        DocumentReference documentReference = fStore.collection("users").document(userId);
//        documentReference.addSnapshotListener(this, new EventListener<DocumentSnapshot>() {
//            @Override
//            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
//                phone.setText( value.getString("phone"));
//                fullName.setText( value.getString("fName"));
//                email.setText( value.getString("email"));
//                dob.setText( value.getString("dob"));
//            }
//        });
//
//
//        Button logout = findViewById(R.id.logout);
//        logout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//               FirebaseAuth.getInstance().signOut();
//               startActivity( new Intent(getApplicationContext(), LogIn.class));
//               finish();
//            }
//        });

        seeProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent( DashBoard.this , UserProfile.class));
            }
        });

        // For verification of Email
        verifyMsg = findViewById(R.id.verifyMsg);
        resendCode = findViewById(R.id.resendCode);

        FirebaseUser user = fAuth.getCurrentUser();

        if( !user.isEmailVerified() ){
            resendCode.setVisibility( View.VISIBLE);
            verifyMsg.setVisibility( View.VISIBLE);

            //FirebaseUser mUser = fAuth.getCurrentUser();
            user.sendEmailVerification().addOnSuccessListener(new OnSuccessListener<Void>() {
                @Override
                public void onSuccess(Void unused) {
                    Toast.makeText(DashBoard.this, "Verification Email Has been Sent", Toast.LENGTH_SHORT).show();
                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(DashBoard.this, "Email not sent"+e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        }

    }
}