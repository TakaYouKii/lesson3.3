package com.example.lesson33;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter3 extends RecyclerView.Adapter<ViewHolder3> {

    private ArrayList<String> zooList;

    public Adapter3(ArrayList<String> zooList) {
        this.zooList = zooList;
    }

    @NonNull
    @Override
    public ViewHolder3 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder3(LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder3 holder, int position) {
        holder.bind(zooList.get(position));
    }

    @Override
    public int getItemCount() {
        return zooList.size();
    }
}
