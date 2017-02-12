package com.example.kushagrakumar.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(getResources().getString(R.string.app_name));
        listView = (ListView) findViewById(R.id.listview);

        //Setting the adapter
        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(MainActivity.this , android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.Cars));

        //On click listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this , SecondActivity.class);
                intent.putExtra("Cars", listView.getItemAtPosition(i).toString());
                startActivity(intent);
            }
        });
    listView.setAdapter(mAdapter);
        /*final TextView kushagraLabel = (TextView) findViewById(R.id.textView);
        Button button = (Button) findViewById(R.id.button);
        final Example sampleClass = new Example();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sampleClass.setHello("Hello Kushagra");
                kushagraLabel.setText(sampleClass.getHello());
            }
        });*/


    }

    /*private class Example
    {
        private String hello;

        public Example()
        {
            hello = "Hello";
        }
        public void setHello(String s)
        {
            hello = s;
        }
        public String getHello()
        {
            return hello;
        }
    }*/
}
