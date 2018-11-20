package com.example.shaked.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("Jared", "Hello world im from log");
        Toast.makeText(this, "Hello world im toast", Toast.LENGTH_LONG).show();

//        findViewById("jamesText"); // NO!!!!

        // Access the XML tag (TextView) by the id



        TextView tv = findViewById(R.id.jamesText);

        tv.setText("Changed from Java");
    }
}
