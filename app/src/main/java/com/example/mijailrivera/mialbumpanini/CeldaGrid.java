package com.example.mijailrivera.mialbumpanini;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;


public class CeldaGrid extends FrameLayout {
    private TextView tvCelda;

    public CeldaGrid(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.fragment_celda_grid, this);
        tvCelda = (TextView) getRootView().findViewById(R.id.tvCelda);
    }

    public void display(String text, boolean isSelected) {
        tvCelda.setText(text);
        display(isSelected);
    }

    public void display(boolean isSelected) {
        tvCelda.setBackgroundResource(isSelected ? R.drawable.green_square : R.drawable.gray_square);
    }
}
