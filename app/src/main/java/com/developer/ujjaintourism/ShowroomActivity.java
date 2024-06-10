package com.developer.ujjaintourism;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ShowroomActivity extends AppCompatActivity {
ImageView bike,car,scooter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showroom);

        bike = findViewById(R.id.imageView1);
        bike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShowroomActivity.this, BikeActivity.class);
                startActivity(intent);
            }
        });

        car = findViewById(R.id.imageView2);
        car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShowroomActivity.this, CarActivity.class);
                startActivity(intent);
            }
        });

        scooter = findViewById(R.id.imageView3);
        scooter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShowroomActivity.this, ScooterActivity.class);
                startActivity(intent);
            }
        });

    }
}