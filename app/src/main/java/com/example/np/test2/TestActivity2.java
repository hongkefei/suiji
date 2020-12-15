package com.example.np.test2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.np.R;
import com.example.np.mainpage.TypeAdapter;

import java.util.ArrayList;
import java.util.List;

public class TestActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);

        RecyclerView recyclerView = findViewById(R.id.my_list);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add(i + 1 + "");
        }
        TypeAdapter adapter = new TypeAdapter(this, list, false);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}
