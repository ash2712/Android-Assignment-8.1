package com.example.ayush.monthsascendingorder;

import android.support.constraint.solver.ArrayLinkedVariables;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;
    private ArrayList <String> dateArray;
    private ArrayAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt_asc = (Button) findViewById(R.id.bt_ascending);
        Button bt_des = (Button) findViewById(R.id.bt_descending);//button declaration

        mListView = (ListView) findViewById(R.id.myListView);//listview initialization
        dateArray = new ArrayList<>();//arrayList initialization
        dateArray.add("January");
        dateArray.add("February");
        dateArray.add("March");
        dateArray.add("April");
        dateArray.add("May");
        dateArray.add("June");
        dateArray.add("July");
        dateArray.add("August");
        dateArray.add("September");
        dateArray.add("October");
        dateArray.add("November");
        dateArray.add("December");//adds months to the arraylist

        bt_asc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Collections.sort(dateArray);//sorts the array in alphabetical order
                mAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,dateArray);
                mListView.setAdapter(mAdapter);
            }
        });

        bt_des.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Collections.sort(dateArray, Collections.reverseOrder());//sorts the array in alphabetical order then reverses it
                mAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,dateArray);
                mListView.setAdapter(mAdapter);
            }
        });
        mAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,dateArray);
        mListView.setAdapter(mAdapter);//on starting app, months will be displayed in normal order

    }

}
