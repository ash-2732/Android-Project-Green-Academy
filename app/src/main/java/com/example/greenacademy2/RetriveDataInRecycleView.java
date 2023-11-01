package com.example.greenacademy2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;

import java.util.ArrayList;
import java.util.List;

public class RetriveDataInRecycleView extends AppCompatActivity {

    // here we will retrive data
    FirebaseDatabase mDatabase;
    DatabaseReference mRef;
    FirebaseStorage mStorage;
    RecyclerView recyclerView;
    StudentAdapter studentAdapter;
    List<StudentQuestion> studentQuestionList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrive_data_in_recycle_view);

        mDatabase = FirebaseDatabase.getInstance();
        mRef = mDatabase.getReference().child("Student");
        mStorage = FirebaseStorage.getInstance();

        recyclerView = findViewById(R.id.recycleView_id);
        recyclerView.setHasFixedSize( true );
        recyclerView.setLayoutManager( new LinearLayoutManager( this ));

        studentQuestionList = new ArrayList< StudentQuestion>( );
        studentAdapter = new StudentAdapter(RetriveDataInRecycleView.this,studentQuestionList);
        recyclerView.setAdapter(studentAdapter);


        mRef.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

                StudentQuestion studentQuestion = snapshot.getValue(StudentQuestion.class);
                studentQuestionList.add(studentQuestion);
                studentAdapter.notifyDataSetChanged();
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot snapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}