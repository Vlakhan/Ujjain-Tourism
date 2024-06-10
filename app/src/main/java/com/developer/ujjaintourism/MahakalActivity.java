package com.developer.ujjaintourism;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MahakalActivity extends AppCompatActivity {


    @SuppressLint("ServiceCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mahakal);

        ImageSlider imageSlider;
        imageSlider =findViewById(R.id.image_slider);

        TextView txtview = findViewById(R.id.textView6);
        txtview.setMovementMethod(LinkMovementMethod.getInstance());

        ArrayList<SlideModel> imageList = new ArrayList<>();

        imageList.add(new SlideModel(R.drawable.mahakalone,null));
        imageList.add(new SlideModel(R.drawable.mahakaltwo,null));
        imageList.add(new SlideModel(R.drawable.mahakalthree,null));
        imageList.add(new SlideModel(R.drawable.mahakalfour,null));
        imageList.add(new SlideModel(R.drawable.mahakalfive,null));
        imageList.add(new SlideModel(R.drawable.mahakalsix,null));
        imageList.add(new SlideModel(R.drawable.mahakalseven,null));
        imageList.add(new SlideModel(R.drawable.mahakaleight,null));
        imageList.add(new SlideModel(R.drawable.mahakalnine,null));
        imageList.add(new SlideModel(R.drawable.mahakalten,null));

        imageSlider.setImageList(imageList);

        ImageView img =findViewById(R.id.mahakalMap);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String source = "Your location";
                String destination = "Mahakaleshwar Jyotirlinga";

                Uri uri = Uri.parse("https://www.google.com/maps/dir/" + source + "/" + destination);
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });

    }
}