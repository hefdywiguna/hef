package com.tutorial.criscom.myapplication.model;

/**
 * Created by kris on 8/8/18. Tokopedia
 */

public class Catalog {

    private int imageId;

    private String title;

    private String description;

    public Catalog(int imageId, String title, String description) {
        this.imageId = imageId;
        this.title = title;
        this.description = description;
    }

    public int getImageId() {
        return imageId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
