package com.tutorial.criscom.myapplication.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tutorial.criscom.myapplication.model.Catalog;
import com.tutorial.criscom.myapplication.viewholder.CatalogViewHolder;
import com.tutorial.criscom.myapplication.R;

import java.util.List;

/**
 * Created by kris on 8/7/18. Tokopedia
 */

public class CatalogAdapter extends RecyclerView.Adapter<CatalogViewHolder>{

    private List<Catalog> catalogs;

    public CatalogAdapter(List<Catalog> catalogs) {
        this.catalogs = catalogs;
    }

    @NonNull
    @Override
    public CatalogViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext()).inflate(R.layout.list_adapter, parent, false);
        return new CatalogViewHolder(parent.getContext(), view);
    }

    @Override
    public void onBindViewHolder(@NonNull CatalogViewHolder holder, int position) {
        holder.bind(catalogs.get(position));
    }

    @Override
    public int getItemCount() {
        return catalogs.size();
    }

}
