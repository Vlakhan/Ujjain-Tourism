package com.developer.ujjaintourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class RestrauntActivity extends AppCompatActivity {
    ImageView abika,anandam,anjushree,apna, atharv,avantika,embassy,imperial,meghdoot,mittal,park,president,rajkumar,rudraksh,shikhar,
    shipra,shiv,shreeganga,solitaire;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restraunt);

        abika = findViewById(R.id.imageView2);
        abika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RestrauntActivity.this , AbikaActivity.class);
                startActivity(intent);
            }
        });

        anandam = findViewById(R.id.imageView3);
        anandam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RestrauntActivity.this , AnandamActivity.class);
                startActivity(intent);
            }
        });


        anjushree = findViewById(R.id.imageView4);
        anjushree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RestrauntActivity.this , AnjushreeeActivity.class);
                startActivity(intent);
            }
        });


        apna = findViewById(R.id.imageView16);
        apna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RestrauntActivity.this , ApnaActivity.class);
                startActivity(intent);
            }
        });


        atharv = findViewById(R.id.imageView9);
        atharv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RestrauntActivity.this , AtharvaActivity.class);
                startActivity(intent);
            }
        });


        avantika = findViewById(R.id.imageView11);
        avantika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RestrauntActivity.this , AvantikaActivity.class);
                startActivity(intent);
            }
        });


        embassy = findViewById(R.id.imageView8);
        embassy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RestrauntActivity.this , EmbassyActivity.class);
                startActivity(intent);
            }
        });


        imperial = findViewById(R.id.imageView12);
        imperial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RestrauntActivity.this , ImperialActivity.class);
                startActivity(intent);
            }
        });


        meghdoot = findViewById(R.id.imageView);
        meghdoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RestrauntActivity.this , Meghdootctivity.class);
                startActivity(intent);
            }
        });


        mittal = findViewById(R.id.imageView5);
        mittal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RestrauntActivity.this , MittalActivity.class);
                startActivity(intent);
            }
        });


        park = findViewById(R.id.imageView7);
        park.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RestrauntActivity.this , ParkActivity.class);
                startActivity(intent);
            }
        });


        president = findViewById(R.id.imageView10);
        president.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RestrauntActivity.this , PresidentActivity.class);
                startActivity(intent);
            }
        });


        rajkumar = findViewById(R.id.imageView13);
        rajkumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RestrauntActivity.this , RajkumarActivity.class);
                startActivity(intent);
            }
        });


        rudraksh = findViewById(R.id.imageView14);
        rudraksh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RestrauntActivity.this , RudrakshActivity.class);
                startActivity(intent);
            }
        });


        shikhar = findViewById(R.id.imageView15);
        shikhar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RestrauntActivity.this , ShikharActivity.class);
                startActivity(intent);
            }
        });


        shipra = findViewById(R.id.imageView17);
        shipra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RestrauntActivity.this ,  ShipraActivity.class);
                startActivity(intent);
            }
        });


        shiv = findViewById(R.id.imageView18);
        shiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RestrauntActivity.this , ShivActivity.class);
                startActivity(intent);
            }
        });


        shreeganga = findViewById(R.id.imageView19);
        shreeganga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RestrauntActivity.this , ShreegangaActivity.class);
                startActivity(intent);
            }
        });


        solitaire = findViewById(R.id.imageView20);
        solitaire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RestrauntActivity.this , SolitaireActivity.class);
                startActivity(intent);
            }
        });

    }
}