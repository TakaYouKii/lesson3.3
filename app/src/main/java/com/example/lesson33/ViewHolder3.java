package com.example.lesson33;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder3 extends RecyclerView.ViewHolder {
    private TextView animals;
    public ViewHolder3(@NonNull View itemView) {
        super(itemView);
        animals = itemView.findViewById(R.id.tv_item);
    }
    public void bind(String animalName){
        animals.setText(animalName);
    }
}
