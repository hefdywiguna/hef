package com.tutorial.criscom.myapplication.viewholder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.tutorial.criscom.myapplication.model.Catalog;
import com.tutorial.criscom.myapplication.R;

/**
 * Created by kris on 8/8/18. Tokopedia
 */

public class CatalogViewHolder extends RecyclerView.ViewHolder {

    private ImageView catalogImage;
    private TextView title;
    private TextView description;
    private Context context;

    public CatalogViewHolder(Context context, View itemView) {
        super(itemView);
        catalogImage = itemView.findViewById(R.id.image);
        title = itemView.findViewById(R.id.title);
        description = itemView.findViewById(R.id.description);
        this.context = context;
    }

    public void bind(Catalog catalog) {
        catalogImage.setImageDrawable(context.getResources().getDrawable(catalog.getImageId()));
        title.setText(catalog.getTitle());
        description.setText(catalog.getDescription());
    }

}
