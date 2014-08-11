package com.example.minseok.swipescreenexample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class SwipeScreenExample extends Activity {
    Button testButton;
    SwipeGestureListener gestureListener;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        testButton = (Button) findViewById(R.id.test_Button);
        gestureListener = new SwipeGestureListener(SwipeScreenExample.this);
        testButton.setOnTouchListener(gestureListener);
    }
}

