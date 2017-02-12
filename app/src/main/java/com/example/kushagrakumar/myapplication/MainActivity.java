package com.example.kushagrakumar.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView kushagraLabel = (TextView) findViewById(R.id.textView);

        Button button = (Button) findViewById(R.id.button);

        final Example sampleClass = new Example();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sampleClass.setHello("Hello Kushagra");
                kushagraLabel.setText(sampleClass.getHello());
            }
        });
    }

    private class Example
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
    }
}
