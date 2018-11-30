package com.aluri.naveen.e_aarogya.HealthGuidePack;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.aluri.naveen.e_aarogya.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class DataAdapter1 extends RecyclerView.Adapter<DataAdapter1.ViewHolder> {
    private ArrayList<ItemsData> android_versions;
    private Context context;

    public DataAdapter1(Context context, ArrayList<ItemsData> android_versions) {
        this.context = context;
        this.android_versions = android_versions;

    }

    @Override
    public DataAdapter1.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_layout, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {

        viewHolder.tv_android.setText(android_versions.get(i).getItem_name());
        Picasso.with(context).load(android_versions.get(i).getItem_image_url()).resize(120, 120).into(viewHolder.img_android);

        viewHolder.setClickListener(new ItemClickListener() {
            @Override
            public void onClick(View view, int i, boolean isLongClick) {

               if(i==1){


                   Intent intent = new Intent(context,LunchActivity.class);
                   context.startActivity(intent);
               }

            }
        });

    }

    @Override
    public int getItemCount() {
        return android_versions.size();
    }





    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {
        TextView tv_android;
        ImageView img_android;
        private ItemClickListener clickListener;



        public ViewHolder(View view) {
            super(view);

            tv_android = (TextView) view.findViewById(R.id.tv_android);
            img_android = (ImageView) view.findViewById(R.id.img_android);
            view.setTag(view);
            view.setOnClickListener(this);
            view.setOnLongClickListener(this);
        }

        public void setClickListener(ItemClickListener itemClickListener) {
            this.clickListener = itemClickListener;


        }

        public void onClick(View view) {
            clickListener.onClick(view, getPosition(), false);
        }

        @Override
        public boolean onLongClick(View view) {
            clickListener.onClick(view, getPosition(), true);
            return true;
        }
    }


}