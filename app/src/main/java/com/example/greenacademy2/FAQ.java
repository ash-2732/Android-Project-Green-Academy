package com.example.greenacademy2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.utils.widget.ImageFilterButton;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

public class FAQ extends AppCompatActivity {

    FirebaseDatabase mDatabase;
    DatabaseReference mRef;
    FirebaseStorage mStorage;

    ImageButton imageButton;
    EditText editFirst , editLast;
    FloatingActionButton btnInsert , seePost;

    private static final int Gallery_Code = 1;
    Uri imageUrl = null;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);

        imageButton = findViewById(R.id.imageButton);
        editFirst = findViewById(R.id.editfirstname);
        editLast = findViewById(R.id.editlastname);
        btnInsert = findViewById(R.id.btnInsert);
        seePost = findViewById(R.id.seePost);

        mDatabase = FirebaseDatabase.getInstance();
        mRef = mDatabase.getReference().child("Student");
        mStorage = FirebaseStorage.getInstance();

        progressDialog = new ProgressDialog(this);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("image/*");
                startActivityForResult(intent , Gallery_Code);

            }
        });

        seePost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(FAQ.this, RetriveDataInRecycleView.class);
                startActivity(intent1);
            }
        });


        Toolbar toolbar_faq = findViewById(R.id.toolbar_faq);
        setSupportActionBar( toolbar_faq );
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if( requestCode == Gallery_Code ){
            if( resultCode == RESULT_OK ){
                imageUrl = data.getData();
                imageButton.setImageURI( imageUrl );
            }
        }

        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fn = editFirst.getText().toString().trim();
                String ln = editLast.getText().toString().trim();

                if( !( fn.isEmpty() && ln.isEmpty() && imageUrl != null ) ){

                    progressDialog.setTitle("Uploading......");
                    progressDialog.show();

                    StorageReference filepath = mStorage.getReference().child("imagePost").child(imageUrl.getLastPathSegment());
                    filepath.putFile( imageUrl ).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {

                            Task<Uri> downloadUrl = taskSnapshot.getStorage().getDownloadUrl().addOnCompleteListener(new OnCompleteListener<Uri>() {
                                @Override
                                public void onComplete(@NonNull Task<Uri> task) {

                                    String t = task.getResult().toString();

                                    DatabaseReference newPost = mRef.push();

                                    newPost.child("FirstName").setValue(fn);
                                    newPost.child("LastName").setValue(ln);
                                    newPost.child("image").setValue(task.getResult().toString());

                                    progressDialog.dismiss();

                                    Intent intent = new Intent(FAQ.this, RetriveDataInRecycleView.class);
                                    startActivity(intent);


                                }
                            });
                        }
                    });
                }

            }
        });

    }

    public boolean onSupportNavigateUp(){
        // Handle back button click
        onBackPressed();
        return true;
    }
}