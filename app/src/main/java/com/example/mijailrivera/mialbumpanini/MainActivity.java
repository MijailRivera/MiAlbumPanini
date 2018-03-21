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

    private GridView gridView;

    private ArrayList<String> selectedStrings;
    //static final String[] numbers = new String[680];
    private static final String[] numbers = new String[]{
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K",
            "L", "M", "N", "O", "P", "Q", "R", "S", "T",
            "U", "V", "W", "X", "Y", "Z"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* for(int i = 0; i< 680; i++){
            numbers[i] = ""+(i+1);
        }*/
        selectedStrings = new ArrayList<>();
        gridView = (GridView) findViewById(R.id.gridview);

        //MyAdapter adapter = new MyAdapter(this, R.layout.support_simple_spinner_dropdown_item, numbers);
        final GridViewAdapter adapter = new GridViewAdapter(numbers, this);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                int selectedIndex = adapter.selectedPositions.indexOf(position);

                if (selectedIndex > -1) {
                    adapter.selectedPositions.remove(selectedIndex);
                    ((CeldaGrid) v).display(false);
                    selectedStrings.remove((String) parent.getItemAtPosition(position));
                } else {
                    adapter.selectedPositions.add(position);
                    ((CeldaGrid) v).display(true);
                    selectedStrings.add((String) parent.getItemAtPosition(position));
                }
                Toast.makeText(getApplicationContext(), "" + (position+1), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
