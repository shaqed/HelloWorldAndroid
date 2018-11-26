package com.example.shaked.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText; // = null
    private TextView changingTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // We got these 2 lines automatically when we created the activity
        // We do not change this
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get references to all the views
        // Which we would like to change dynamically
        editText = findViewById(R.id.editTextIn);
        Button toastButton = findViewById(R.id.toastButton);
        Button logButton = findViewById(R.id.logButton);
        Button textButton = findViewById(R.id.textButton);
        changingTextView = findViewById(R.id.changedTextView);

        toastButton.setOnClickListener(this);
        logButton.setOnClickListener(this);
        textButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View jacobsView) {
        int viewsId = jacobsView.getId();
        String textFromEditText = editText.getText().toString();

        if (viewsId == R.id.toastButton) {
            // do code for toast
            Toast.makeText(this, textFromEditText, Toast.LENGTH_SHORT).show();
        } else if (viewsId == R.id.logButton) {
            // You should do a log
            Log.e("TAG", textFromEditText);
        } else if (viewsId == R.id.textButton) {
            // Let's change the text view

            // setText() changes the text of the TextView
            // Based on the string given to the method
            changingTextView.setText(textFromEditText);


        } else {
            // default,
            // If you reached here - you made a mistake

        }
    }
}
