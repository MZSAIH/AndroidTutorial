package com.mzsaih.androidtutorial;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

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
    public View getView(int position, View view, ViewGroup viewGroup) {

        listItem item;
        //Bind Java code with XML elements
        if (view == null){
            item = new listItem();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.list_item_car, null, true);
            item.tv_marque = view.findViewById(R.id.marque);
            item.tv_hp     = view.findViewById(R.id.hp);
            view.setTag(item);
        }else{
            item = (listItem) view.getTag();
        }

        //Populate listitem Class with data
        item.tv_marque.setText(carlist.get(position).getMarque());
        item.tv_hp.setText(String.valueOf(carlist.get(position).getHorsePower()));

        return view;
    }

    class listItem{
        TextView tv_marque;
        TextView tv_hp;
    }
}
