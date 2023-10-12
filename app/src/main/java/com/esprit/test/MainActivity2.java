package com.esprit.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
ImageView profile ;
ImageView home ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame,new home()).commit();
        home= findViewById(R.id.imageViewHome);
        home.setOnClickListener(view -> {

            getSupportFragmentManager().beginTransaction().replace(R.id.frame,new home()).commit();

        });


        profile= findViewById(R.id.imageViewProfile);
        profile.setOnClickListener(view -> {

            getSupportFragmentManager().beginTransaction().replace(R.id.frame,new signup()).commit();

        });
    }
}
