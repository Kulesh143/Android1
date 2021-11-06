package com.example.myfirstapp;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ListViewActivity extends AppCompatActivity {
private ListView listView;
private String []options={
        "Kulesh",
        "Alex",
        "Harry",
        "Kal El",
        "Kulesh1",
        "Alex1",
        "Harry1",
        "Kal El1",
        "Kulesh2",
        "Alex2",
        "Harry2",
        "Kal El2",
        "Kulesh3",
        "Alex3",
        "Harry3",
        "Kal El3",
        "Kulesh4",
        "Alex4",
        "Harry4",
        "Kal El4"
};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);
        listView=findViewById(R.id.listview);
        ArrayAdapter<String>arrayAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,options);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(ListViewActivity.this, options[position],
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
