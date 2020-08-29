package com.example.recyclerviewui;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    Context mContext;
    List<Data> values;



    //Constructor------>
    public Adapter(Context mContext, List<Data> values) {
        this.mContext = mContext;
        this.values = values;
    }


    //Inflating the layout to recycler view------>
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_layout, parent, false);
        return new MyViewHolder(view);
    }



    //Binding Data to views------>
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.logoText.setText(values.get(position).getText());
        holder.logoImage.setImageResource(values.get(position).getImage());
    }




    //Responsible for the size of the Recycler Views------>
    @Override
    public int getItemCount() {
        return values.size();
    }




    //View Holder Class-------->
    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


        //Views
        ImageView logoImage;
        TextView logoText;
        CardView cardView;
        View view;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);


            //Initializing Views------->
            view = itemView;
            cardView = itemView.findViewById(R.id.card_view);
            logoImage = itemView.findViewById(R.id.image_view);
            logoText = itemView.findViewById(R.id.text_view);


            //Click Listener for Recycler view
            itemView.setOnClickListener(this);
        }


        //Task to be performed on OnClick------->
        @Override
        public void onClick(View v) {


            //New Intent for opening Second Activity------->
            Intent intent = new Intent(mContext, DetailActivity.class);


            //Attaching image to Intent-------->
            logoImage.buildDrawingCache();
            intent.putExtra("image", logoImage.getDrawingCache());


            //Performing Transition between Elements-------->
            ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity) mContext, logoImage, "shared");


            //Attaching Text to Intent------>
            intent.putExtra("text", "Hi from "+logoText.getText());


            //Starting Activity------>
            mContext.startActivity(intent, activityOptions.toBundle());
        }
    }
}
