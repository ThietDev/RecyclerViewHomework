package com.example.recyclerviewhomework;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvNumber = findViewById(R.id.recyclerView);
        rvNumber.setLayoutManager(new LinearLayoutManager((this)));

        final NumberAdapter numberAdapter = new NumberAdapter();
        rvNumber.setAdapter(numberAdapter);

        List<Integer> numbers = new ArrayList<Integer>();

        int i = 0;
        while (numbers.size()<=100)
        {
            numbers.add(i);
            i++;
        }
        numberAdapter.numbers = numbers;
    }
}