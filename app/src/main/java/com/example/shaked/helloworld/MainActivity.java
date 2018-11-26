package com.example.shaked.helloworld;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    // By default, these fields are null since they are not primitives
    private EditText editText; // = null
    private TextView changingTextView; // = null

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // We got these 2 lines automatically when we created the activity
        // We do not change this
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get references to all the views
        // Which we would like to change dynamically

        // Change the "global" variables (the fields "editText" and "changingTextView")
        // So that they will be accessed from different methods of the MainActivity class
        editText = findViewById(R.id.editTextIn);
        changingTextView = findViewById(R.id.changedTextView);

        // Here we're defining a method-local variable that is NOT accessible
        // from outside of the onCreate() method
        // But in our case, we don't care about that so we leave it like this
        Button textButton = findViewById(R.id.textButton);
        Button logButton = findViewById(R.id.logButton);
        Button toastButton = findViewById(R.id.toastButton);

        // "this" refers to the MainActivity object currently in use
        // the object's data-type is "MainActivity", but:
        // since it implement the View.OnClickListener, it can also be thought of
        // as an OnClickListener because it has the onClick() method overwritten
        toastButton.setOnClickListener(this);
        logButton.setOnClickListener(this);
        textButton.setOnClickListener(this);


    }


    // If you get an error here, it's probably because you didn't implement the
    // OnClickListener interface in your MainActivity
    // When this method is being called, an argument is provided to us
    // which is the reference the object being clicked on.
    @Override
    public void onClick(View jacobsView) {

        // Check out the view being clicked on's id
        int viewsId = jacobsView.getId();

        // Get the text the EditText contains inside it as a string
        // This is similar to what we saw in JavaScript's .value property
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
            // If you reached here - a view that you didn't though about
            // when you wrote the conditions above was triggering this onClick
            // Find it what this view is and how come it got here

            // In this particular code example, the chunk of code will never be reached
        }
    }
}
