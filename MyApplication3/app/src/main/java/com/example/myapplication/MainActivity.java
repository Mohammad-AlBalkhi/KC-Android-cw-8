package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList <Student> students = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





      Student student1 = new Student("Hamad", 17,12, R.drawable.boy1);
      Student student2 = new Student("Salman", 14,9, R.drawable.boy2);
      Student student3 = new Student("Mohammad", 16,11, R.drawable.boy3);
      Student student4 = new Student("Ahmad", 15,10, R.drawable.boy4);
      Student student5 = new Student("Khaled", 11,6, R.drawable.boy5);
      Student student6 = new Student("Bayder", 13,8, R.drawable.boy6);

     students.add(student1);
     students.add(student2);
     students.add(student3);
     students.add(student4);
     students.add(student5);
     students.add(student6);


     StudentsAdapter StudentsAdapter = new StudentsAdapter(this, 0, students);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(StudentsAdapter);

listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        Student currentStudent = students.get(i);
        Intent intent = new Intent(MainActivity.this , DetailsActivity.class);
        intent.putExtra("student", currentStudent);
        startActivity(intent);
    }
});





    }
}