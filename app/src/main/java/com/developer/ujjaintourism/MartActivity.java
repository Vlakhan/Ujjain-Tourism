package com.developer.ujjaintourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MartActivity extends AppCompatActivity {
    ImageView dmart,vishalmart,vmart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mart);

        dmart = findViewById(R.id.imageView2);
        dmart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MartActivity.this,DmartActivity.class);
                startActivity(intent);
            }
        });

        vishalmart = findViewById(R.id.imageView3);
        vishalmart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MartActivity.this,VishalActivity.class);
                startActivity(intent);
            }
        });

        vmart = findViewById(R.id.imageView4);
        vmart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MartActivity.this,VActivity.class);
                startActivity(intent);
            }
        });

    }
}