package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        findViewById(R.id.greetings).setOnClickListener(this);
        findViewById(R.id.places).setOnClickListener(this);
        findViewById(R.id.colors).setOnClickListener(this);
        findViewById(R.id.seasons).setOnClickListener(this);
        findViewById(R.id.activities).setOnClickListener(this);
        
          @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.greetings:
                startActivity(new Intent(this, GreetingsActivity.class));
                break;
            case R.id.places:
                startActivity(new Intent(this, PlacesActivity.class));
                break;
            case R.id.colors:
                startActivity(new Intent(this, ColorsActivity.class));
                break;
            case R.id.seasons:
                startActivity(new Intent(this, SeasonsActivity.class));
                break;
            case R.id.activities:
                startActivity(new Intent(this, ActivitiesActivity.class));
                break;
        }

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
    }
}
