package com.developer.ujjaintourism;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class MahakallActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mahakall);

        ImageSlider imageSlider;


        imageSlider =findViewById(R.id.image_slider);

        ArrayList<SlideModel> imageList = new ArrayList<>();

        imageList.add(new SlideModel(R.drawable.mahakallone,null));
        imageList.add(new SlideModel(R.drawable.mahakalltwo,null));
        imageList.add(new SlideModel(R.drawable.mahakallthree,null));
        imageList.add(new SlideModel(R.drawable.mahakallfour,null));
        imageList.add(new SlideModel(R.drawable.mahakallfive,null));
        imageList.add(new SlideModel(R.drawable.mahakallsix,null));
        imageList.add(new SlideModel(R.drawable.mahakallseven,null));
        imageList.add(new SlideModel(R.drawable.mahakalleight,null));
        imageList.add(new SlideModel(R.drawable.mahakallnine,null));
        imageList.add(new SlideModel(R.drawable.mahakallten,null));

        imageSlider.setImageList(imageList);

        ImageView img =findViewById(R.id.mahakalMap);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String source = "Your location";
                String destination = "Mahakal lok ujjain";

                Uri uri = Uri.parse("https://www.google.com/maps/dir/" + source + "/" + destination);
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });

    }
}