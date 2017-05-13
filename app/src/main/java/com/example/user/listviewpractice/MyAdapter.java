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
        return 1000;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    // convertView: 历史缓存对象
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView tv;
        if (convertView == null) {
            tv = new TextView(mainActivity.getApplicationContext());
        } else {
            tv = (TextView) convertView;
        }
        tv.setText("test" + position);
        tv.setTextColor(Color.parseColor("#000000"));
        return tv;
    }
}
