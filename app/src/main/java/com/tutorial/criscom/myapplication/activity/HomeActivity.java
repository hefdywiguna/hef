package com.tutorial.criscom.myapplication.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import com.tutorial.criscom.myapplication.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ViewGroup guysButton = findViewById(R.id.guys);
        ViewGroup galsButton = findViewById(R.id.gals);

        guysButton.setOnClickListener(onGuysButtonClicked());
        galsButton.setOnClickListener(onGalsButtonClickedListener());
    }

    private View.OnClickListener onGuysButtonClicked() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.v("Latihan","Hari kedua - Hefdy");
            }
        };
    }

    private View.OnClickListener onGalsButtonClickedListener() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.v("Latihan","Git menyenangkan - Hefdy");
            }
        };
    }
}
