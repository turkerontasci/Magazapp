package com.example.Magazapp.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.Magazapp.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class NotificationFragment extends Fragment {

    public ListView listViewNot;


    public NotificationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_notification, container, false);

        ArrayList<String> bildirimAdi = new ArrayList<>();

        bildirimAdi.add("Bildirim 1");
        bildirimAdi.add("Bildirim 2");

        bildirimAdi.add("Bildirim 1");
        bildirimAdi.add("Bildirim 2");

        bildirimAdi.add("Bildirim 1");
        bildirimAdi.add("Bildirim 2");

        bildirimAdi.add("Bildirim 1");
        bildirimAdi.add("Bildirim 2");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(),android.R.layout.simple_list_item_1, bildirimAdi);

        ListView listViewNot = (ListView) view.findViewById(R.id.listViewNot);

        listViewNot.setAdapter(adapter);


        // Inflate the layout for this fragment
        return view;
    }

}
