package com.example.hamza.app;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by hamza on 9/23/2017.
 */

public class MyViewHolder extends RecyclerView.ViewHolder {
    final ImageView logo;
    public TextView name;

    public MyViewHolder(View itemView) {
        super(itemView);
        logo = (ImageView)itemView.findViewById(R.id.ivLogo);
        name = (TextView)itemView.findViewById(R.id.tvCompany);
    }
}
