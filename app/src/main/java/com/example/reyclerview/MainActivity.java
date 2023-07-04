package com.example.reyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<ItemName> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


       list = new ArrayList<ItemName>();
       list.add(new ItemName("Chetan","He is great personality",R.drawable.student));
        list.add(new ItemName("Chetan","He is great personality",R.drawable.student));
        list.add(new ItemName("Chetan","He is great personality",R.drawable.student));
        list.add(new ItemName("Chetan","He is great personality",R.drawable.student));
        list.add(new ItemName("Chetan","He is great personality",R.drawable.student));
        list.add(new ItemName("Chetan","He is great personality",R.drawable.student));
        list.add(new ItemName("Chetan","He is great personality",R.drawable.student));
        list.add(new ItemName("Chetan","He is great personality",R.drawable.student));
        list.add(new ItemName("Chetan","He is great personality",R.drawable.student));
        list.add(new ItemName("Chetan","He is great personality",R.drawable.student));
        list.add(new ItemName("Chetan","He is great personality",R.drawable.student));
        list.add(new ItemName("Chetan","He is great personality",R.drawable.student));
        list.add(new ItemName("Chetan","He is great personality",R.drawable.student));
        list.add(new ItemName("Chetan","He is great personality",R.drawable.student));
        list.add(new ItemName("Chetan","He is great personality",R.drawable.student));
        list.add(new ItemName("Chetan","He is great personality",R.drawable.student));
        list.add(new ItemName("Chetan","He is great personality",R.drawable.student));
        list.add(new ItemName("Chetan","He is great personality",R.drawable.student));



        ItemAdapter itemAdapter = new ItemAdapter(list);
        recyclerView.setAdapter(itemAdapter);


    }


}