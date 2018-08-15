package com.tutorial.criscom.myapplication.activity;


import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.tutorial.criscom.myapplication.R;

public class DetailCatalogActivity extends Activity{

    private TextView imageDesc;
    private TextView titleTextView;
    private ImageView detailPageImage;

   protected void onCreate(@Nullable Bundle saveInstanceState){
       super.onCreate(saveInstanceState);
       setContentView(R.layout.detail_catalog);
       Bundle bundle = getIntent().getExtras();
       String title = bundle.getString("title");
       String description = bundle.getString("description");
       Integer image = bundle.getInt("image");

       imageDesc = findViewById(R.id.image_desc);
       titleTextView = findViewById(R.id.detail_title);
       detailPageImage = findViewById(R.id.detail_page_image);

       imageDesc.setText(description);
       titleTextView.setText(title);
       detailPageImage.setImageDrawable(getResources().getDrawable(image));










   }
}