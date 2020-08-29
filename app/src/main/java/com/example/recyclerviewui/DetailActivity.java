package com.example.recyclerviewui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    ImageView image;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        image = findViewById(R.id.image);
        text = findViewById(R.id.text);


        //get Intent that comes from Adapter Class------>
        Intent intent = getIntent();

        //setting image to this activity that comes from adapter class------>
        Bitmap bitmap = intent.getParcelableExtra("image");
        image.setImageBitmap(bitmap);

        //setting text to this activity that comes from adapter class-------->
        text.setText(intent.getStringExtra("text"));
    }
}