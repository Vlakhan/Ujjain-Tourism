package com.developer.ujjaintourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class BankActivity extends AppCompatActivity {
    ImageView axis, baroda, boi,canara,central, hdfc,icici,kotak,bom,pnb,sbi,union,yes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank);
        setContentView(R.layout.activity_bank);

        axis = findViewById(R.id.imageView2);
        axis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BankActivity.this, AxisActivity.class);
                startActivity(intent);
            }
        });

        baroda = findViewById(R.id.imageView3);
        baroda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BankActivity.this, BarodaActivity.class);
                startActivity(intent);
            }
        });

        boi = findViewById(R.id.imageView4);
        boi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BankActivity.this, BoiActivity.class);
                startActivity(intent);
            }
        });

        canara = findViewById(R.id.imageView16);
        canara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BankActivity.this, CanaraActivity.class);
                startActivity(intent);
            }
        });

        central = findViewById(R.id.imageView9);
        central.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BankActivity.this, CentralActivity.class);
                startActivity(intent);
            }
        });

        hdfc = findViewById(R.id.imageView11);
        hdfc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BankActivity.this, HdfcActivity.class);
                startActivity(intent);
            }
        });

        icici = findViewById(R.id.imageView8);
        icici.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BankActivity.this, IciciActivity.class);
                startActivity(intent);
            }
        });

        kotak = findViewById(R.id.imageView);
        kotak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BankActivity.this, KotakActivity.class);
                startActivity(intent);
            }
        });

        bom = findViewById(R.id.imageView5);
        bom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BankActivity.this, BomActivity.class);
                startActivity(intent);
            }
        });

        pnb = findViewById(R.id.imageView17);
        pnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BankActivity.this, PnbActivity.class);
                startActivity(intent);
            }
        });

        sbi = findViewById(R.id.imageView19);
        sbi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BankActivity.this, SbiActivity.class);
                startActivity(intent);
            }
        });

        union = findViewById(R.id.imageView18);
        union.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BankActivity.this, UnionActivity.class);
                startActivity(intent);
            }
        });

        yes = findViewById(R.id.imageView60);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BankActivity.this, YesActivity.class);
                startActivity(intent);
            }
        });
    }
}