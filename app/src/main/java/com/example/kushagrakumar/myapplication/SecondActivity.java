package com.example.kushagrakumar.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    Toolbar mtoolbar;
    ImageView CarImage;
    RatingBar carRating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mtoolbar = (Toolbar) findViewById(R.id.toolbar1);
        CarImage = (ImageView) findViewById(R.id.imageView);
        carRating = (RatingBar) findViewById(R.id.ratingBar);
        Button button = (Button) findViewById(R.id.button2);


        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            mtoolbar.setTitle(bundle.getString("Cars"));

            if (mtoolbar.getTitle().toString().equalsIgnoreCase("Model S")) {
                CarImage.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.s));
            } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("Model 3")) {
                CarImage.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.three));
            } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("Model X")) {
                CarImage.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.x));
            } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("Model Y")) {
                CarImage.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.y));
            }

        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //To cshow the map view of the location of the car
                Intent intentSecondary = new Intent(SecondActivity.this, MapsActivity.class);
                startActivity(intentSecondary);
                /*Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("http://maps.google.com/maps?daddr=42.5666,-71.945")); //Removed Starting address saddr=20.344,34.34&
                        //Cureent Destination Geo at Leicester
                startActivity(intent);*/


                /**
                 *Use code below for directly putting the address query
                 * Can be used for later stages
                 */
                /*Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("google.navigation:q=an+address+city"));*/

            }
        });



        carRating.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
               //Toast.makeText(SecondActivity.this, String.valueOf(rating), Toast.LENGTH_LONG).show(); //for displaying value of stars
            }
        });






    }
}
