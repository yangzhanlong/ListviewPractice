package com.example.user.listviewpractice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.item1, list);
        //listView.setAdapter(adapter);


        // SimpleAdapter
        List<Map<String, String>> list = new ArrayList<>();
        Map<String, String> map1 = new HashMap<>();
        map1.put("name", "test");
        map1.put("phone", "123");

        Map<String, String> map2 = new HashMap<>();
        map2.put("name", "test2");
        map2.put("phone", "456");

        Map<String, String> map3 = new HashMap<>();
        map3.put("name", "test3");
        map3.put("phone", "789");

        list.add(map1);
        list.add(map2);
        list.add(map3);

        SimpleAdapter simpleAdapter = new SimpleAdapter(this, list, R.layout.item2,
                new String[]{"name", "phone"}, new int[] {R.id.name, R.id.phone});

        listView.setAdapter(simpleAdapter);
    }
}
