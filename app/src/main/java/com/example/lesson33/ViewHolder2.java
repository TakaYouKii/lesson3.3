package com.example.lesson33;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder2 extends RecyclerView.ViewHolder {

    private TextView student;
    public ViewHolder2(@NonNull View itemView) {
        super(itemView);
        student = itemView.findViewById(R.id.tv_item);
    }

    public void bind(String itemName){
        student.setText(itemName);
    }
}
