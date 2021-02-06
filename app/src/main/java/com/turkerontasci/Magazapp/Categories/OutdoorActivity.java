package com.turkerontasci.Magazapp.Categories;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.turkerontasci.Magazapp.R;

public class OutdoorActivity extends AppCompatActivity {

    ImageView backArrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outdoor);

        backArrow = findViewById(R.id.back);

        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                onBackPressed();

            }
        });

    }
}