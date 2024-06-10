package com.developer.ujjaintourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MallsActivity extends AppCompatActivity {
    ImageView c21,cosmos,pakiza;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malls);

        c21 = findViewById(R.id.imageView2);
        c21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MallsActivity.this,C21Activity.class);
                startActivity(intent);
            }
        });

        cosmos = findViewById(R.id.imageView3);
        cosmos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MallsActivity.this,CosmosActivity.class);
                startActivity(intent);
            }
        });

        pakiza = findViewById(R.id.imageView4);
        pakiza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MallsActivity.this,PakizaActivity.class);
                startActivity(intent);
            }
        });

    }
}