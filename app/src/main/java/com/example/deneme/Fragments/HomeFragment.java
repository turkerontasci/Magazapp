package com.example.deneme.Fragments;


import android.app.SearchManager;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.deneme.R;
import com.example.deneme.SecondActivity;
import com.example.deneme.Singleton;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment{



    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        /**
        final Bitmap tren = BitmapFactory.decodeResource(getResources(), R.drawable.tren);
        Bitmap cicek = BitmapFactory.decodeResource(getResources(), R.drawable.cicek);
        Bitmap gece = BitmapFactory.decodeResource(getResources(), R.drawable.gece);
        Bitmap sunset = BitmapFactory.decodeResource(getResources(), R.drawable.sunset);
        **/

        ImageView imageView1 = (ImageView) view.findViewById(R.id.imageView1);
        imageView1.setImageResource(R.drawable.tren);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.imageView2);
        imageView2.setImageResource(R.drawable.cicek);
        ImageView imageView3 = (ImageView) view.findViewById(R.id.imageView3);
        imageView3.setImageResource(R.drawable.sunset);
        ImageView imageView4 = (ImageView) view.findViewById(R.id.imageView4);
        imageView4.setImageResource(R.drawable.gece);




        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), SecondActivity.class);
                startActivity(i);
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), SecondActivity.class);
                startActivity(i);
            }
        });

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), SecondActivity.class);
                startActivity(i);
            }
        });

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), SecondActivity.class);
                startActivity(i);
            }
        });

        return view;
    }



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




    }


}
