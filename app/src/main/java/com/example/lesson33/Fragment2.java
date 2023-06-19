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


public class Fragment2 extends Fragment {

    private RecyclerView recyclerView2;
    private ArrayList<String> studentList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_2, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView2 = requireActivity().findViewById(R.id.rv2);
        loadData();
        Adapter2 adapter2 = new Adapter2(studentList);
        recyclerView2.setAdapter(adapter2);
    }

    private void loadData() {
        studentList.add("Абдылдаев  Бекназар Жумабекович");
        studentList.add("Айтназаров Улукбек Жылдызбекович");
        studentList.add("Акылбеков Арсланбек Алиевич");
        studentList.add("Арстанбеков Мирлан Муратбекович");
        studentList.add("Акунов Жыргалбек Бактыбекович");
        studentList.add("Аскарбекова Нурай Аскарбековна");
        studentList.add("Гудажанов Нур-Ислам Мусаевич");
        studentList.add("Гудажанов Нур-Ислам Мусаевич");
        studentList.add("Казыбек уулу Арлен");
        studentList.add("Сайдинов Калыбай Болотович");
        studentList.add("Рахманали уулу Азамат");
        studentList.add("Саитов Мухлис Шухратович");
        studentList.add("Самарцев Никита Олегович");
        studentList.add("Сапарбек уулу Цезарь");
        studentList.add("Талипов Арлен Жаныбекович");
        studentList.add("Турдуматов Нурэлес Маратович");
        studentList.add("Турумов Мырзабек Онолбекович");
        studentList.add("Черемушкин Владислав Павлович");
        studentList.add("Элчибеков Максатбек Абдыганиеич");
        studentList.add("Эрмек кызы Зирек");
        studentList.add("Карагулов Абай Нурдинович");
        studentList.add("Кожошова Алия Бактыбековна");
        studentList.add("Кокотаев  Айдарбек Мирланбекович");
        studentList.add("Кубатов Сыймык Талантович");
        studentList.add("Майрамбек уулу Исламидин");
        studentList.add("Маматов  Бактыбек Тешебаевич");
        studentList.add("Насирдин уулу  Нур-Мухаммад");
        studentList.add("Панпанзов Нурсултан Ибрагимович");
    }
}