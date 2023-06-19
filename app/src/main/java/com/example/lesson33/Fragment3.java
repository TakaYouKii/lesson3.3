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


public class Fragment3 extends Fragment {

    private RecyclerView recyclerView3;
    private ArrayList<String> ZooList = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_3, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView3 = requireActivity().findViewById(R.id.rv3);
        loadData();
        Adapter3 adapter3 = new Adapter3(ZooList);
        recyclerView3.setAdapter(adapter3);

    }

    private void loadData() {
        ZooList.add("Dog");
        ZooList.add("Cat");
        ZooList.add("Fish");
        ZooList.add("Fox");
        ZooList.add("Dack");
        ZooList.add("Horse");
        ZooList.add("Monkey");
        ZooList.add("Wolf");
        ZooList.add("Tiger");
        ZooList.add("Cow");
        ZooList.add("Giraffe");
        ZooList.add("Rabbit");
        ZooList.add("Penguin");
        ZooList.add("Dolphin");
        ZooList.add("Bear");
        ZooList.add("Lion");
        ZooList.add("Elephant");
        ZooList.add("Owl");
        ZooList.add("Утка");

    }


}