package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class StudentsAdapter extends ArrayAdapter {
    List <Student> studentsList;
    public StudentsAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        studentsList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View View = LayoutInflater.from(getContext()).inflate(R.layout.xml2, parent , false);

        Student currentstudent = studentsList.get(position);

        TextView studentName = View.findViewById(R.id.SName);
        ImageView studentImg = View.findViewById(R.id.SImg);
        TextView studentAge = View.findViewById(R.id.SAge);
        TextView studentGrade = View.findViewById(R.id.SGrade);

        studentName.setText(currentstudent.getStudentName());
        studentImg.setImageResource(currentstudent.getStudentImg());
        studentAge.setText(String.valueOf(currentstudent.getStudentAge()));
        studentGrade.setText(String.valueOf(currentstudent.getStudentGrade()));

        ImageView deleteBtn = View.findViewById(R.id.deleteBtn);
     deleteBtn.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(android.view.View view) {
            studentsList.remove(position);
            notifyDataSetChanged();

         }
     });
        return View;


    }
}
