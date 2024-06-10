package com.developer.ujjaintourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class WonderActivity extends AppCompatActivity {
    ImageView bhrathari,chandesari,gomti,jantar,kaliadeh,kalidas,mahakall,triveni,vikram,vikramkirti,mayurvan,kothi,taramandal,naulakhi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wonder);

        bhrathari = findViewById(R.id.imageView2);
        bhrathari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WonderActivity.this,BharathariActivity.class);
                startActivity(intent);
            }
        });

        chandesari = findViewById(R.id.imageView3);
        chandesari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WonderActivity.this,ChandesariActivity.class);
                startActivity(intent);
            }
        });

        gomti = findViewById(R.id.imageView4);
        gomti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WonderActivity.this,GomtiActivity.class);
                startActivity(intent);
            }
        });

        jantar = findViewById(R.id.imageView16);
        jantar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WonderActivity.this,JantarActivity.class);
                startActivity(intent);
            }
        });

        kaliadeh = findViewById(R.id.imageView9);
        kaliadeh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WonderActivity.this,KaliadehActivity.class);
                startActivity(intent);
            }
        });

       kalidas = findViewById(R.id.imageView11);
        kalidas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WonderActivity.this,KalidasActivity.class);
                startActivity(intent);
            }
        });

        mahakall = findViewById(R.id.imageView8);
        mahakall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WonderActivity.this,MahakallActivity.class);
                startActivity(intent);
            }
        });

        triveni = findViewById(R.id.imageView);
        triveni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WonderActivity.this,TriveniActivity.class);
                startActivity(intent);
            }
        });

        vikram = findViewById(R.id.imageView5);
        vikram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WonderActivity.this,VikramActivity.class);
                startActivity(intent);
            }
        });

        vikramkirti = findViewById(R.id.imageView60);
        vikramkirti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WonderActivity.this,VikramkirtiActivity.class);
                startActivity(intent);
            }
        });

        kothi = findViewById(R.id.imageView15);
        kothi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WonderActivity.this,KothiActivity.class);
                startActivity(intent);
            }
        });

        taramandal = findViewById(R.id.imageView50);
        taramandal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WonderActivity.this, TaramandalActivity.class);
                startActivity(intent);
            }
        });
        naulakhi = findViewById(R.id.imageView51);
        naulakhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (WonderActivity.this, NaulakhiActivity.class);
                startActivity(intent);
            }
        });



        mayurvan = findViewById(R.id.imageView18);
        mayurvan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WonderActivity.this,MayurActivity.class);
                startActivity(intent);
            }
        });

    }
}