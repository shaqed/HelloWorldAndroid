package com.example.shaked.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // We got these 2 lines automatically when we created the activity
        // We do not change this
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get references to all the views
        // Which we would like to change dynamically
        EditText editText = findViewById(R.id.editTextIn);
        Button toastButton = findViewById(R.id.toastButton);
        Button logButton = findViewById(R.id.logButton);
        Button textButton = findViewById(R.id.textButton);
        TextView changingTextView = findViewById(R.id.changedTextView);


    }


}
