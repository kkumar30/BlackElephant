package com.example.kushagrakumar.myapplication;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {

    Toolbar mtoolbar;
    ImageView CarImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mtoolbar = (Toolbar) findViewById(R.id.toolbar1);
        CarImage = (ImageView) findViewById(R.id.imageView);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            mtoolbar.setTitle(bundle.getString("Cars"));

            if (mtoolbar.getTitle().toString().equalsIgnoreCase("Model S")) {
                CarImage.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.s));
            }
            else if(mtoolbar.getTitle().toString().equalsIgnoreCase("Model 3"))
            {
                CarImage.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.three));
            }
            else if (mtoolbar.getTitle().toString().equalsIgnoreCase("Model X"))
                CarImage.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.x));
            }
            /*else if (mtoolbar.getTitle().toString().equalsIgnoreCase("Model Y")){
            CarImage.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.y));
            }*/

    }
}
