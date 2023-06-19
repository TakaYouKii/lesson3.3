package com.example.lesson33;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class Fragment1 extends Fragment {
    private RecyclerView recyclerView;
    private ArrayList<String> itemList = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_1, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = requireActivity().findViewById(R.id.rv1);
        loadData();
        Adapter1 adapter1 = new Adapter1(itemList);
        recyclerView.setAdapter(adapter1);

    }

    private void loadData() {
        itemList.add("Lapsha");
        itemList.add("Pasta");
        itemList.add("Oromo");
        itemList.add("spagetti");
        itemList.add("Plov");
        itemList.add("Sup");
        itemList.add("Manty");
        itemList.add("Ganfan");
        itemList.add("Lagman");
        itemList.add("Sushi");
        itemList.add("Kasha");
        itemList.add("Alcohol");
        itemList.add("Ris");
        itemList.add("Bif");
        itemList.add("Car");
        itemList.add("telephon");
        itemList.add("ladno");
        itemList.add("Barsik");
        itemList.add("Egor");
    }
}