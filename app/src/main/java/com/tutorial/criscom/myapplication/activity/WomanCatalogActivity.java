package com.tutorial.criscom.myapplication.activity;

import com.tutorial.criscom.myapplication.R;
import com.tutorial.criscom.myapplication.activity.CatalogActivity;
import com.tutorial.criscom.myapplication.model.Catalog;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kris on 8/8/18. Tokopedia
 */

public class WomanCatalogActivity extends CatalogActivity {
    @Override
    protected List<Catalog> catalogList() {
        List<Catalog> catalogList = new ArrayList<>();
        catalogList.add(new Catalog(R.drawable.ic_woman_hairstyle_1, "Alexandretta", "A good hairstyle for women"));
        catalogList.add(new Catalog(R.drawable.ic_woman_hairstyle_2, "Hagia Sophia", "Another good hairstyle for women"));
        catalogList.add(new Catalog(R.drawable.ic_woman_hairstyle_3, "Ikonia", "Also a good hairstyle for women"));
        catalogList.add(new Catalog(R.drawable.ic_woman_hairstyle_4, "Arthemis", "Special hairstyle for women"));
        catalogList.add(new Catalog(R.drawable.ic_woman_hairstyle_5, "Atheniai", "My personal favorite hairstyle for women"));
        catalogList.add(new Catalog(R.drawable.ic_woman_hairstyle_6, "Sicilia", "Recommended hairstyle for women"));
        return catalogList;
    }
}
