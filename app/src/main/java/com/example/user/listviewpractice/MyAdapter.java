package com.example.user.listviewpractice;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;


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

    // convertView: 历史缓存对象
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        if (convertView == null) {
            view = View.inflate(mainActivity.getApplicationContext(), R.layout.item, null);
        } else {
            view = convertView;
        }
        return  view;
    }
}
