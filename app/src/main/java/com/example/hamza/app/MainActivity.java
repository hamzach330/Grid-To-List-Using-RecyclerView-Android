package com.example.hamza.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {


    RecyclerView rvMain;
    ToggleButton btn;
    Bitmap[] logos = new Bitmap[12];
    Context con = this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rvMain = (RecyclerView) findViewById(R.id.rvMain);
        btn = (ToggleButton) findViewById(R.id.btn);

        logos[0] =  BitmapFactory.decodeResource(getResources(), R.drawable.facebook);
        logos[1] =  BitmapFactory.decodeResource(getResources(), R.drawable.badoo);
        logos[2] =  BitmapFactory.decodeResource(getResources(), R.drawable.behance);
        logos[3] =  BitmapFactory.decodeResource(getResources(), R.drawable.deviantart);
        logos[4] =  BitmapFactory.decodeResource(getResources(), R.drawable.dribbble);
        logos[5] =  BitmapFactory.decodeResource(getResources(), R.drawable.flickr);
        logos[6] =  BitmapFactory.decodeResource(getResources(), R.drawable.googleplus);
        logos[7] =  BitmapFactory.decodeResource(getResources(), R.drawable.instagram);
        logos[8] =  BitmapFactory.decodeResource(getResources(), R.drawable.lastfm);
        logos[9] =  BitmapFactory.decodeResource(getResources(), R.drawable.pinterest);
        logos[10] = BitmapFactory.decodeResource(getResources(), R.drawable.soundcloud);
        logos[11] = BitmapFactory.decodeResource(getResources(), R.drawable.swarm);


        MyGridAdapter adapter = new MyGridAdapter(getResources().getStringArray(R.array.company_list), logos, con);
        rvMain.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));
        rvMain.setAdapter(adapter);


        btn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                //LIST VIEW
                if (!isChecked) {
                    MyGridAdapter adapter = new MyGridAdapter(getResources().getStringArray(R.array.company_list), logos, con);
                    rvMain.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));
                    rvMain.setAdapter(adapter);
                }

                //GRID VIEW
                else {
                    MyListAdapter adapter = new MyListAdapter(getResources().getStringArray(R.array.company_list), logos, con);
                    rvMain.setLayoutManager(new GridLayoutManager(MainActivity.this, 1));
                    rvMain.setAdapter(adapter);
                }

            }
        });


    }
}
