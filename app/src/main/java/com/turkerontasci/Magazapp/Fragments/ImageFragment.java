package com.turkerontasci.Magazapp.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.turkerontasci.Magazapp.R;

public class ImageFragment extends Fragment {

    public ImageFragment() {

    }

    ImageView imageView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_image, container, false);

        imageView = view.findViewById(R.id.showImage);
        return view;

    }
}
