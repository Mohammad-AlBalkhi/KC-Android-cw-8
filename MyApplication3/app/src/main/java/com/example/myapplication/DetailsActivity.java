package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);setContentView(R.layout.activity_details);

        Bundle bundle = getIntent().getExtras();
        Student delStudent = (Student) bundle.getSerializable("student");

        TextView DSName = findViewById(R.id.DSName);
        TextView DSAge = findViewById(R.id.DSAge);
        ImageView DSImg = findViewById(R.id.DSImg);

        DSName.setText(delStudent.getStudentName());
        DSAge.setText(String.valueOf(delStudent.getStudentAge()));
        DSImg.setImageResource(delStudent.getStudentImg());
    }
}