package com.example.shaked.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MyClickEvent myClickEvent = new MyClickEvent();

        Button b1 = findViewById(R.id.click1);
        Button b2 = findViewById(R.id.click2);


        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.click1) {
            Toast.makeText(this, "Click 1", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.click2) {
            Toast.makeText(this, "Click2: " + counter, Toast.LENGTH_SHORT).show();
            counter++;

        }
    }
}
