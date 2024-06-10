package com.developer.ujjaintourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TravelingActivity extends AppCompatActivity {
    ImageView bus,train;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traveling);
        bus = findViewById(R.id.imageView2);
        bus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TravelingActivity.this, BusActivity.class);
                startActivity(intent);
            }
        });

        train = findViewById(R.id.imageView3);
        train.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TravelingActivity.this,TrainActivity.class);
                startActivity(intent);
            }
        });
    }
}