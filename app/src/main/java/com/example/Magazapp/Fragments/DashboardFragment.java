package com.example.Magazapp.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.Magazapp.Categories.MenswearActivity;
import com.example.Magazapp.Categories.OutdoorActivity;
import com.example.Magazapp.Categories.PersonalcareActivity;
import com.example.Magazapp.Categories.TechActivity;
import com.example.Magazapp.Categories.WomenswearActivity;
import com.example.Magazapp.R;

public class DashboardFragment extends Fragment {

    private ListView listView;
    private CardView cardView1, cardView2, cardView3, cardView4, cardView5;

    public DashboardFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);

        cardView1 = view.findViewById(R.id.categoryCard1);
        cardView2 = view.findViewById(R.id.categoryCard2);
        cardView3 = view.findViewById(R.id.categoryCard3);
        cardView4 = view.findViewById(R.id.categoryCard4);
        cardView5 = view.findViewById(R.id.categoryCard5);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), WomenswearActivity.class);
                startActivity(intent);
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MenswearActivity.class);
                startActivity(intent);
            }
        });

        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), PersonalcareActivity.class);
                startActivity(intent);
            }
        });

        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), TechActivity.class);
                startActivity(intent);
            }
        });

        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), OutdoorActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
