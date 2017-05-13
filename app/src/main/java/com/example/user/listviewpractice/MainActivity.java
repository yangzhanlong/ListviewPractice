package com.example.user.listviewpractice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] list = new String[]{"test1", "test2", "test3", "test4"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.lv);

        // BaseAdapter
        //listView.setAdapter(new MyAdapter(this));

        // ArrayAdapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.item1, list);
        listView.setAdapter(adapter);

    }
}
