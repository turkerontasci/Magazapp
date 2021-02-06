package com.turkerontasci.Magazapp.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.turkerontasci.Magazapp.R;

public class ProfileFragment extends Fragment {

    TextView userName, userStatus;
    ImageView profileImage, statusIcon;
    String status[] = {"Geliştirici", "Standart Üye", "Gümüş Üye", "Altın Üye"};
    int selectedStatus;

    Integer statusImage[] = {
            R.drawable.dev_icon,
            R.drawable.status_star,
            R.drawable.favorite_silver,
            R.drawable.favorite_gold
    };

    private void userStatus(int selectedStatus) {

        if (selectedStatus == 0) {
            statusIcon.setImageResource(statusImage[0]);
            userStatus.setText(status[0]);
        } else if (selectedStatus == 1) {
            statusIcon.setImageResource(statusImage[1]);
            userStatus.setText(status[1]);
        } else if (selectedStatus == 2) {
            statusIcon.setImageResource(statusImage[2]);
            userStatus.setText(status[2]);
        } else if (selectedStatus == 3) {
            statusIcon.setImageResource(statusImage[3]);
            userStatus.setText(status[3]);
        }

    }

    public ProfileFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        selectedStatus = 0;

        profileImage = view.findViewById(R.id.profilePicture);
        profileImage.setImageResource(R.drawable.profilfoto);

        userName = view.findViewById(R.id.userName);
        userName.setText("Türker Öntaşçı");

        userStatus = view.findViewById(R.id.userStatus);
        statusIcon = view.findViewById(R.id.statusIcon);

        userStatus(0);

        return view;
    }


}

