package com.example.mijailrivera.mialbumpanini;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by MIJAIL RIVERA on 15/03/2018.
 */

public class MyAdapter extends ArrayAdapter<String> {

    String[] objects;
    Context context;

    public MyAdapter(Context context, int textViewResourceId, String[] objects) {
        super(context, textViewResourceId, objects);
        this.context = context;
        this.objects = objects;
    }


    @Override
    public View getView(int position, android.view.View convertView, android.view.ViewGroup parent) {
        TextView tv;
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            tv = (TextView)inflater.inflate(R.layout.support_simple_spinner_dropdown_item,parent,false);
        } else {
            tv = (TextView) convertView;
        }
        tv.setText(objects[position]);
        if (position % 2 == 0)
            tv.setBackgroundColor(Color.GREEN);
        else
            tv.setBackgroundColor(Color.WHITE);

        return tv;
    }
}