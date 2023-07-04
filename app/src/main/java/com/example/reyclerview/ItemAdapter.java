package com.example.reyclerview;

import android.content.ClipData;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemHolder> {

    List<ItemName> newList;

    public ItemAdapter(List<ItemName> newList) {
        this.newList = newList;
    }

    @NonNull
    @Override
    public ItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_views,parent,false);
        return new ItemHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemHolder holder, int position) {
        ItemName itemName = newList.get(position);
        holder.nameTv.setText(itemName.getName());
        holder.descriptionTv.setText(itemName.getDiscription());
        holder.img.setImageResource(itemName.getImgId());
    }
    @Override
    public int getItemCount() {
        return newList.size();
    }
}
