package com.developer.ujjaintourism;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
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

public class ShikharActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shikhar);

        ImageSlider imageSlider;

        TextView txtview = findViewById(R.id.textView8);
        txtview.setMovementMethod(LinkMovementMethod.getInstance());

        imageSlider =findViewById(R.id.image_slider);

        ArrayList<SlideModel> imageList = new ArrayList<>();

        imageList.add(new SlideModel(R.drawable.shikhardarshan1,null));
        imageList.add(new SlideModel(R.drawable.shikhardarshan2,null));
        imageList.add(new SlideModel(R.drawable.shikhardarshan3,null));
        imageList.add(new SlideModel(R.drawable.shikhardarshan4,null));
        imageList.add(new SlideModel(R.drawable.shikhardarshan5,null));

        imageSlider.setImageList(imageList);


        ImageView img =findViewById(R.id.mahakalMap);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String source = "Your location";
                String destination = "Hotel Shikhardarshan ujjain";

                Uri uri = Uri.parse("https://www.google.com/maps/dir/" + source + "/" + destination);
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });

    }
}