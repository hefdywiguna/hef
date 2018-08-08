package com.tutorial.criscom.myapplication.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.tutorial.criscom.myapplication.R;
import com.tutorial.criscom.myapplication.adapter.CatalogAdapter;
import com.tutorial.criscom.myapplication.model.Catalog;

import java.util.List;

/**
 * Created by kris on 8/8/18. Tokopedia
 */

public abstract class CatalogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.catalog_activity);
        RecyclerView hairstyleList = findViewById(R.id.hairstyle_list);
        hairstyleList.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        hairstyleList.setAdapter(new CatalogAdapter(catalogList()));
    }

    protected abstract List<Catalog> catalogList();

}
