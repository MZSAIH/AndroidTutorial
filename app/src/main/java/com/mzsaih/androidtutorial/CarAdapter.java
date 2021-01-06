package com.mzsaih.androidtutorial;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public class CarAdapter extends BaseAdapter {
    private ArrayList<Car> carlist;
    private Context context;

    public CarAdapter(Context context, ArrayList<Car> carlist){
        this.context = context;
        this.carlist = carlist;
    }

    @Override
    public int getCount() {
        return carlist.size();
    }

    @Override
    public Car getItem(int i) {
        return carlist.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
