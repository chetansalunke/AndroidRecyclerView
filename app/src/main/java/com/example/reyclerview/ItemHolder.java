package com.example.reyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemHolder extends RecyclerView.ViewHolder {
    TextView nameTv;
    TextView descriptionTv;
    ImageView img;
    public ItemHolder(@NonNull View itemView) {
        super(itemView);
        this.nameTv = itemView.findViewById(R.id.nameTextView);
        this.descriptionTv = itemView.findViewById(R.id.disriptionTextView);
        this.img = itemView.findViewById(R.id.image_view);

    }
}
