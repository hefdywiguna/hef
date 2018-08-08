package com.tutorial.criscom.myapplication.activity;

import com.tutorial.criscom.myapplication.R;
import com.tutorial.criscom.myapplication.activity.CatalogActivity;
import com.tutorial.criscom.myapplication.model.Catalog;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kris on 8/8/18. Tokopedia
 */

public class ManCatalogActivity extends CatalogActivity {
    @Override
    protected List<Catalog> catalogList() {
        List<Catalog> catalogList = new ArrayList<>();
        catalogList.add(new Catalog(R.drawable.ic_man_hairstyle_1, "Cantabrian", "A good hairstyle"));
        catalogList.add(new Catalog(R.drawable.ic_man_hairstyle_2, "Cypriot", "Another good hairstyle"));
        catalogList.add(new Catalog(R.drawable.ic_man_hairstyle_3, "Caucasus", "Also a good hairstyle"));
        catalogList.add(new Catalog(R.drawable.ic_man_hairstyle_4, "Picardie", "Special hairstyle"));
        catalogList.add(new Catalog(R.drawable.ic_man_hairstyle_5, "Salamanca", "My personal favorite hairstyle"));
        catalogList.add(new Catalog(R.drawable.ic_man_hairstyle_6, "Albany", "Recommended hairstyle"));
        return catalogList;
    }
}
