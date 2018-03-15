package com.example.mijailrivera.mialbumpanini;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    static final String[] numbers = new String[680];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(int i = 0; i< 680; i++){
            numbers[i] = ""+(i+1);
        }
        gridView = (GridView) findViewById(R.id.gridview);

        MyAdapter adapter = new MyAdapter(this, R.layout.support_simple_spinner_dropdown_item, numbers);

        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(getApplicationContext(), "" + (position+1), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
