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
            //创建新的view对象   可以通过打气筒把一个布局资源转换成一个view对象
            //resource 就是 我们定义的布局文件

            //[一☆☆☆☆]获取打气筒服务
            view = View.inflate(mainActivity.getApplicationContext(), R.layout.item, null);

            //[二☆☆☆☆]获取打气筒服务
            //view = LayoutInflater.from(mainActivity.getApplicationContext()).inflate(R.layout.item, null);

            //[三☆☆☆☆]获取打气筒服务
            //LayoutInflater layoutInflater = (LayoutInflater) mainActivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            //layoutInflater.inflate(R.layout.item, null);
        } else {
            view = convertView;
        }
        return  view;
    }
}
