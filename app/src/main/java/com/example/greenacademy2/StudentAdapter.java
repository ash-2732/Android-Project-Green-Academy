package com.example.greenacademy2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.ViewHolder> {

    Context context;
    List<StudentQuestion> studentQuestionList;

    // creating constructor

    public StudentAdapter(Context context , List<StudentQuestion> studentQuestionList) {
        this.context = context;
        this.studentQuestionList = studentQuestionList;
    }

    @NonNull
    @Override
    public StudentAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from( parent.getContext()).inflate(R.layout.design_row_for_recycleview , parent,false);

        // design row connectivity here

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentAdapter.ViewHolder holder, int position) {

        // here we will bind it
        StudentQuestion studentQuestion = studentQuestionList.get(position);
        holder.tvLast.setText("Problem Statement: " + studentQuestion.getLastName());
        holder.tvFirst.setText("Name: " + studentQuestion.getFirstName());

        String imageUrl = null;
        imageUrl = studentQuestion.getImage();
        Picasso.get().load(imageUrl).into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return studentQuestionList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        // here declare design
        ImageView imageView;
        TextView tvFirst , tvLast;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.image_recyclerView_id);
            tvFirst = itemView.findViewById(R.id.tvFirstName_recyclerView_id);
            tvLast = itemView.findViewById(R.id.tvLastName_recyclerView_id);


        }
    }
}
