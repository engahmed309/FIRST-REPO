/*package com.example.shapesarea2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class myAdapter extends BaseAdapter {
    Context context;
    ArrayList<String>data;
    public  myAdapter(Context c, ArrayList<String>data){
this.context=c;
this.data=data;



    }
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v =  view;
        if (v==null){
           v= LayoutInflater.from(context).inflate(android.R.layout.simple_list_item_1,null, false);
        }
        TextView tv =v.findViewById(android.R.id.text1);
        String name = data.get(i);
        tv.setText(name);
        return v;

    }
}*/
