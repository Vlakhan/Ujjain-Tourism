package com.developer.ujjaintourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class First_Screen extends AppCompatActivity {
    ImageView temple,wonders,malls,contactus,helpline,traveling, restaurant,taste,nightlight,bank,
            mart,showroom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);
        temple = findViewById(R.id.imageView2);
        temple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(First_Screen.this,TempleActivity.class);
                startActivity(intent);
            }
        });
        wonders = findViewById(R.id.imageView3);
        wonders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(First_Screen.this,WonderActivity.class);
                startActivity(intent);
            }
        });

        malls = findViewById(R.id.imageView4);
        malls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(First_Screen.this,MallsActivity.class);
                startActivity(intent);
            }
        });

        restaurant = findViewById(R.id.imageView16);
        restaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(First_Screen.this,RestrauntActivity.class);
                startActivity(intent);
            }
        });

        taste = findViewById(R.id.imageView9);
        taste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(First_Screen.this,TasteActivity.class);
                startActivity(intent);
            }
        });

        nightlight = findViewById(R.id.imageView11);
        nightlight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(First_Screen.this,NightLightActivity.class);
                startActivity(intent);
            }
        });

        bank = findViewById(R.id.imageView8);
        bank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(First_Screen.this,BankActivity.class);
                startActivity(intent);
            }
        });


        traveling = findViewById(R.id.imageView13);
        traveling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(First_Screen.this,TravelingActivity.class);
                startActivity(intent);
            }
        });


        mart = findViewById(R.id.imageView17);
        mart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(First_Screen.this,MartActivity.class);
                startActivity(intent);
            }
        });


        contactus = findViewById(R.id.imageView19);
        contactus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(First_Screen.this, ContectActivity.class);
                startActivity(intent);
            }
        });

        helpline = findViewById(R.id.imageView20);
        helpline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(First_Screen.this, HelplineActivity.class);
                startActivity(intent);
            }
        });

        showroom = findViewById(R.id.imageView31);
        showroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(First_Screen.this, ShowroomActivity.class);
                startActivity(intent);
            }
        });

    }
}