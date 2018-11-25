package com.example.shaked.helloworld;

import android.util.Log;
import android.view.View;

public class MyClickEvent implements View.OnClickListener {

    @Override
    public void onClick(View v) {
        Log.e("TAG", "Clicked on a button - you have moar RAM now");
    }
}
