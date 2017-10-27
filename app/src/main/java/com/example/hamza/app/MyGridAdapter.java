package com.example.hamza.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by hamza on 9/23/2017.
 */

public class MyGridAdapter extends RecyclerView.Adapter<MyViewHolder> {

    public String[] companyList;
    Bitmap[] logoList;
    Context con;

    public MyGridAdapter(String[] companyList, Bitmap[] logoList, Context con) {
        this.companyList = companyList;
        this.logoList = logoList;
        this.con = con;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_grid_item, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        holder.logo.setImageBitmap(logoList[position]);
        holder.logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(con, "This is: " + companyList[position], Toast.LENGTH_SHORT).show();
            }
        });
        holder.name.setText(companyList[position]);
    }

    @Override
    public int getItemCount() {
        return companyList.length;
    }
}
