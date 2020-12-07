package com.example.deneme;

import android.animation.Animator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity{

    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        imageView = findViewById(R.id.selectedImage);
        textView = findViewById(R.id.photoText);

        Bundle extras = getIntent().getExtras();
        if (extras == null)
        {
            return;
        }
        int res = extras.getInt("resourceInt");
        String imageName = extras.getString("resourceName");

        imageView.setImageResource(res);
        textView.setText(imageName);
    }
}
