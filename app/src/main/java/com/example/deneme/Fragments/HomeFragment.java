package com.example.deneme.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.example.deneme.R;
import com.example.deneme.SecondActivity;


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

        final ImageView imageView1 = (ImageView) view.findViewById(R.id.cvPhoto);
        imageView1.setImageResource(R.drawable.tren);
        imageView1.setTag("İstasyon");
        final ImageView imageView2 = (ImageView) view.findViewById(R.id.cvPhoto2);
        imageView2.setImageResource(R.drawable.cicek);
        imageView2.setTag("Çiçek");
        final ImageView imageView3 = (ImageView) view.findViewById(R.id.cvPhoto3);
        imageView3.setImageResource(R.drawable.sunset);
        imageView3.setTag("Sunset");
        final ImageView imageView4 = (ImageView) view.findViewById(R.id.cvPhoto4);
        imageView4.setImageResource(R.drawable.gece);
        imageView4.setTag("Gece");
        final ImageView imageView5 = (ImageView) view.findViewById(R.id.cvPhoto5);
        imageView5.setImageResource(R.drawable.tren);
        imageView5.setTag("İstasyon");
        final ImageView imageView6 = (ImageView) view.findViewById(R.id.cvPhoto6);
        imageView6.setImageResource(R.drawable.cicek);
        imageView6.setTag("Çiçek");
        final ImageView imageView7 = (ImageView) view.findViewById(R.id.cvPhoto7);
        imageView7.setImageResource(R.drawable.sunset);
        imageView7.setTag("Sunset");
        final ImageView imageView8 = (ImageView) view.findViewById(R.id.cvPhoto8);
        imageView8.setImageResource(R.drawable.gece);
        imageView8.setTag("Gece");

        imageView1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                return false;
            }
        });

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getActivity(), SecondActivity.class);
                String imageName = (String) imageView1.getTag();
                i.putExtra("resourceInt", R.drawable.tren);
                i.putExtra("resourceName", imageName);
                startActivity(i);
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), SecondActivity.class);
                String imageName = (String) imageView2.getTag();
                i.putExtra("resourceInt", R.drawable.cicek);
                i.putExtra("resourceName", imageName);
                startActivity(i);
            }
        });

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), SecondActivity.class);
                String imageName = (String) imageView3.getTag();
                i.putExtra("resourceInt", R.drawable.sunset);
                i.putExtra("resourceName", imageName);
                startActivity(i);
            }
        });

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), SecondActivity.class);
                String imageName = (String) imageView4.getTag();
                i.putExtra("resourceInt", R.drawable.gece);
                i.putExtra("resourceName", imageName);
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