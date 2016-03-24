package com.example.android.portfolioapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button spotify = (Button) findViewById(R.id.spotify);
        spotify.setOnClickListener(this);

        Button scores = (Button) findViewById(R.id.scores);
        scores.setOnClickListener(this);

        Button library = (Button) findViewById(R.id.library);
        library.setOnClickListener(this);

        Button buildBigger = (Button) findViewById(R.id.buildBigger);
        buildBigger.setOnClickListener(this);

        Button bacon = (Button) findViewById(R.id.reader);
        bacon.setOnClickListener(this);

        Button capstone = (Button) findViewById(R.id.capstone);
        capstone.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.spotify:
                Toast.makeText(getApplicationContext(), "This button will launch my spotify streamer app!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.scores:
                Toast.makeText(getApplicationContext(), "This button will launch my socres app!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.library:
                Toast.makeText(getApplicationContext(), "This button will launch my library app!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.buildBigger:
                Toast.makeText(getApplicationContext(), "This button will launch my build it bigger app!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.reader:
                Toast.makeText(getApplicationContext(), "This button will launch my xyz reader app!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.capstone:
                Toast.makeText(getApplicationContext(), "This button will launch my capstone app!", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }

    }
}
