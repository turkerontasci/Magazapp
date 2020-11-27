package com.example.deneme.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;

import com.example.deneme.R;

import java.util.ArrayList;
import java.util.List;

public class DashboardFragment extends Fragment {

    private ListView listView;

    public DashboardFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);

        ArrayList<String> kategoriAdi = new ArrayList<>();

        kategoriAdi.add("Kadın Giyim");
        kategoriAdi.add("Erkek Giyim");
        kategoriAdi.add("Aksesuar");
        kategoriAdi.add("Makyaj");
        kategoriAdi.add("Elektronik");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, kategoriAdi);

        ListView listView = (ListView) view.findViewById(R.id.listView);

        listView.setAdapter(adapter);



        return view;
    }



}
