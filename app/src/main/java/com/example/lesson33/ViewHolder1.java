package com.example.lesson33;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder1 extends RecyclerView.ViewHolder {


    private TextView item;
    public ViewHolder1(@NonNull View itemView) {
        super(itemView);

        item = itemView.findViewById(R.id.tv_item);

    }

    public void bind(String itemName){
        item.setText(itemName);
    }
}
