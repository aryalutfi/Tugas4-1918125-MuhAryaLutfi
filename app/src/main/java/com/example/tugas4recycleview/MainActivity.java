package com.example.tugas4recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter recyclerviewAdapter;
    RecyclerView.LayoutManager recyclerViewLayoutManager;
    ArrayList<KartunModel>data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        recyclerViewLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(recyclerViewLayoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

        data = new ArrayList<>();
        for (int i = 0; i < Kartun.text1.length ; i++){
            data.add(new KartunModel(
                    Kartun.text1[i],
                    Kartun.text2[i],
                    Kartun.text3[i],
                    Kartun.iconList[i]));
        }
        recyclerviewAdapter = new KartunApaterRecyclerView(data);
        recyclerView.setAdapter(recyclerviewAdapter);
    }
}