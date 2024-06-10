package com.developer.ujjaintourism;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint; //if you got error delet this...
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class BadeGaneshActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId") //and this also
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bade_ganesh);

        ImageSlider imageSlider;

        TextView txtview = findViewById(R.id.textView6);
        txtview.setMovementMethod(LinkMovementMethod.getInstance());

        imageSlider =findViewById(R.id.image_slider);

        ArrayList<SlideModel> imageList = new ArrayList<>();

        imageList.add(new SlideModel(R.drawable.badaganeshone,null));
        imageList.add(new SlideModel(R.drawable.badaganeshtwo,null));
        imageList.add(new SlideModel(R.drawable.badaganeshthree,null));
        imageList.add(new SlideModel(R.drawable.badaganeshfour,null));
        imageList.add(new SlideModel(R.drawable.badaganeshfive,null));

        imageSlider.setImageList(imageList);


        ImageView img =findViewById(R.id.mahakalMap);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String source = "Your location";
                String destination = "Bade ganesh temple ujjain";

                Uri uri = Uri.parse("https://www.google.com/maps/dir/" + source + "/" + destination);
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });

    }
}