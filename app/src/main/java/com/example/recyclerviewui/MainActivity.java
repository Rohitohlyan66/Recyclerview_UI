package com.example.recyclerviewui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Adapter adapter;
    List<Data> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);


        //List that stores the data------>
        data = new ArrayList<>();

        //Adapter Class Object------->
        adapter = new Adapter(this, data);

        //Recycler View Layout Visible Type------>
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



        //Adding Data to List which will be shown in Recycler View------>
        data.add(new Data(R.drawable.facebook, "Facebook"));
        data.add(new Data(R.drawable.instagram, "Instagram"));
        data.add(new Data(R.drawable.reddit, "Reddit"));
        data.add(new Data(R.drawable.twitter, "Twitter"));
        data.add(new Data(R.drawable.whatsapp, "Whatsapp"));
        data.add(new Data(R.drawable.github, "Github"));
        data.add(new Data(R.drawable.facebook, "Facebook"));
        data.add(new Data(R.drawable.instagram, "Instagram"));
        data.add(new Data(R.drawable.reddit, "Reddit"));
        data.add(new Data(R.drawable.twitter, "Twitter"));
        data.add(new Data(R.drawable.whatsapp, "Whatsapp"));
        data.add(new Data(R.drawable.github, "Github"));
        data.add(new Data(R.drawable.facebook, "Facebook"));
        data.add(new Data(R.drawable.instagram, "Instagram"));
        data.add(new Data(R.drawable.reddit, "Reddit"));
        data.add(new Data(R.drawable.twitter, "Twitter"));
        data.add(new Data(R.drawable.whatsapp, "Whatsapp"));
        data.add(new Data(R.drawable.github, "Github"));



        //Setting adapter to recycler view----->
        recyclerView.setAdapter(adapter);


    }
}