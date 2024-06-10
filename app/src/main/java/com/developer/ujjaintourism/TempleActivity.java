package com.developer.ujjaintourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.net.Inet4Address;

public class TempleActivity extends AppCompatActivity {
    ImageView mahakal,angareshwar,badeganesh,bharatmata,bhookhimata,chardham,chaubeeskhamba,chintamanganesh,gadkalika,gopalmandir,harsiddhi,iskontemple
            ,jagdeeshmandir,kaalbhairav,kalyanman,mangalnath,navgrah,prasantidham,radhamadan,ramghat,ramjanki;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temple);
        mahakal = findViewById(R.id.imageView15);
        mahakal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TempleActivity.this,MahakalActivity.class);
                startActivity(intent);
            }
        });
        angareshwar = findViewById(R.id.imageView2);
        angareshwar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TempleActivity.this,AngareshwarActivity2.class);
                startActivity(intent);
            }
        });
        badeganesh = findViewById(R.id.imageView3);
        badeganesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TempleActivity.this,BadeGaneshActivity.class);
                startActivity(intent);
            }
        });
        bharatmata = findViewById(R.id.imageView4);
        bharatmata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TempleActivity.this,BharatMataActivity.class);
                startActivity(intent);
            }
        });
        bhookhimata = findViewById(R.id.imageView16);
        bhookhimata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TempleActivity.this,BhookhiMataActivity.class);
                startActivity(intent);
            }
        });
        chardham = findViewById(R.id.imageView9);
        chardham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TempleActivity.this,CharDhamActivity.class);
                startActivity(intent);
            }
        });
        chaubeeskhamba = findViewById(R.id.imageView11);
        chaubeeskhamba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TempleActivity.this,ChaubisKhambaActivity.class);
                startActivity(intent);
            }
        });
        chintamanganesh = findViewById(R.id.imageView8);
        chintamanganesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TempleActivity.this,ChintamanGaneshActivity.class);
                startActivity(intent);
            }
        });
        gadkalika = findViewById(R.id.imageView12);
        gadkalika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TempleActivity.this,GadKalikaActivity.class);
                startActivity(intent);
            }
        });
        gopalmandir = findViewById(R.id.imageView);
        gopalmandir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TempleActivity.this,GopalMandirActivity.class);
                startActivity(intent);
            }
        });
        harsiddhi = findViewById(R.id.imageView5);
        harsiddhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TempleActivity.this,HarsiddhiActivity.class);
                startActivity(intent);
            }
        });
        iskontemple = findViewById(R.id.imageView7);
        iskontemple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TempleActivity.this,IskonTempleActivity.class);
                startActivity(intent);
            }
        });
        jagdeeshmandir = findViewById(R.id.imageView10);
        jagdeeshmandir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TempleActivity.this,JagdeesMandirActivity.class);
                startActivity(intent);
            }
        });
        kaalbhairav = findViewById(R.id.imageView13);
        kaalbhairav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TempleActivity.this,KaalBhairavActivity.class);
                startActivity(intent);
            }
        });
        kalyanman = findViewById(R.id.imageView14);
        kalyanman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TempleActivity.this,KalyanmanActivity.class);
                startActivity(intent);
            }
        });
        mangalnath = findViewById(R.id.imageView17);
        mangalnath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TempleActivity.this,MangalnathActivity.class);
                startActivity(intent);
            }
        });
        navgrah = findViewById(R.id.imageView18);
        navgrah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TempleActivity.this,NavgrahActivity.class);
                startActivity(intent);
            }
        });
        prasantidham = findViewById(R.id.imageView21);
        prasantidham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TempleActivity.this,PrasantiDhamActivity.class);
                startActivity(intent);
            }
        });
        radhamadan = findViewById(R.id.imageView20);
        radhamadan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TempleActivity.this, RadhaMadanActivity.class);
                startActivity(intent);
            }
        });
        ramghat = findViewById(R.id.imageView22);
        ramghat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TempleActivity.this,RamGhatActivity.class);
                startActivity(intent);
            }
        });
        ramjanki = findViewById(R.id.imageView19);
        ramjanki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TempleActivity.this,RamJankiActivity.class);
                startActivity(intent);
            }
        });

    }
}