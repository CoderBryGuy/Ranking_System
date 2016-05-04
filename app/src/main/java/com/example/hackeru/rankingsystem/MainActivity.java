package com.example.hackeru.rankingsystem;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

    LinearLayout ratings;
    CheckBox star;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratings = (LinearLayout)findViewById(R.id.ratings);

        for (int i = 1; i < 5; i++) {
            star = (CheckBox)ratings.findViewWithTag(String.valueOf(i));
            star.setOnClickListener(starsListener);
        }

    }

    private View.OnClickListener starsListener =
            new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   int tag = Integer.valueOf((String)v.getTag());

                    for (int i = 1; i <= tag; i++) {
                        star = (CheckBox)ratings.findViewWithTag((String.valueOf(i)));
                        star.setChecked(true);
                    }
                    for(int i = tag + 1; i<=5;i++)
                    {
                        star = (CheckBox)ratings.findViewWithTag(String.valueOf(i));
                        star.setChecked(false);
                    }
                }
            };
}
