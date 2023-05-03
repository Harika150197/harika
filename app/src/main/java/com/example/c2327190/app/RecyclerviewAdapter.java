package com.example.c2327190.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.MyHolder> {
    
    private Context mContext;
    private List<Receips> mData;
    private ViewGroup viewGroup;

    public RecyclerviewAdapter(Context mContext,List<Receips> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }
    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardlayout_restaurants,viewGroup,false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int i){
        holder.restaurantTitle.setText(mData.get(i).getRestaurantName());
        holder.img_restaurant.setImageResource(mData.get(i).getThumbNail());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext,RestaurantsActivity.class);

                intent.putExtra("Name",mData.get(holder.getAdapterPosition()).getRestaurantName());
                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {

        TextView restaurantTitle;
        CardView cardView;
        ImageView img_restaurant;
        public MyHolder(@NonNull View itemView) {
            super(itemView);

            restaurantTitle = (TextView)itemView.findViewById(R.id.text_restaurant);
            img_restaurant = (ImageView)itemView.findViewById(R.id.restaurant_img);
            cardView = (CardView)itemView.findViewById(R.id.cardview_res);
        }
    }
}
