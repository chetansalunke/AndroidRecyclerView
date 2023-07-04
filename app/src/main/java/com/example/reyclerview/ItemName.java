package com.example.reyclerview;

import android.widget.ImageView;

public class ItemName {
    String name;
    String discription;
    int imgId;

    public ItemName(String name, String discription, int imgId) {
        this.name = name;
        this.discription = discription;
        this.imgId = imgId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
}
