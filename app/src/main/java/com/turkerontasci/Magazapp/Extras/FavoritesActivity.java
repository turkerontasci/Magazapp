package com.turkerontasci.Magazapp.Extras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.turkerontasci.Magazapp.R;

public class FavoritesActivity extends AppCompatActivity {

    ImageView iV1, iV2, iV3, iV4, iV5;
    TextView tv1, tv2, tv3, tv4, tv5;

    ImageView backArrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

        backArrow = findViewById(R.id.back);

        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        iV1 = findViewById(R.id.cvImage1);
        iV1.setImageResource(R.drawable.tren);
        iV1.setTag("İstasyon");
        tv1 = findViewById(R.id.cvImageName1);
        String imageName1 = (String) iV1.getTag();
        tv1.setText(imageName1);

        iV2 = findViewById(R.id.cvImage2);
        iV2.setImageResource(R.drawable.cicek);
        iV2.setTag("Çiçek");
        tv2 = findViewById(R.id.cvImageName2);
        String imageName2 = (String) iV2.getTag();
        tv2.setText(imageName2);

        iV3 = findViewById(R.id.cvImage3);
        iV3.setImageResource(R.drawable.sunset);
        iV3.setTag("Sunset");
        tv3 = findViewById(R.id.cvImageName3);
        String imageName3 = (String) iV3.getTag();
        tv3.setText(imageName3);

        iV4 = findViewById(R.id.cvImage4);
        iV4.setImageResource(R.drawable.tren);
        iV4.setTag("İstasyon");
        tv4 = findViewById(R.id.cvImageName4);
        String imageName4 = (String) iV4.getTag();
        tv4.setText(imageName4);

        iV5 = findViewById(R.id.cvImage5);
        iV5.setImageResource(R.drawable.gece);
        iV5.setTag("Gece");
        tv5 = findViewById(R.id.cvImageName5);
        String imageName5 = (String) iV5.getTag();
        tv5.setText(imageName5);
    }
}