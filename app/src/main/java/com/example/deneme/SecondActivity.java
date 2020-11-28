package com.example.deneme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;


public class SecondActivity extends AppCompatActivity{

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        imageView = findViewById(R.id.selectedImage);

        Bundle extras = getIntent().getExtras();
        if (extras == null)
        {
            return;
        }
        int res = extras.getInt("resourceInt");


        imageView.setImageResource(res);
    }
}
