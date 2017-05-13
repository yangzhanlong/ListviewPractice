package com.example.user.listviewpractice;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


public class MyAdapter extends BaseAdapter{
    private MainActivity mainActivity;

    public MyAdapter(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Override
    public int getCount() {
        return 6;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView tv = new TextView(mainActivity.getApplicationContext());
        tv.setText("test" + position);
        tv.setTextColor(Color.parseColor("#000000"));
        return tv;
    }
}
