package com.example.minseok.swipescreenexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SwipeScreenExample extends Activity {
    Button testButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        testButton = (Button) findViewById(R.id.test_Button);
        testButton.setOnTouchListener(gestureListener);
    }

    View.OnTouchListener gestureListener = new SwipeGestureListener()
    {
        public boolean onSwipeRight() {
            return false;
        }

        public boolean onSwipeLeft() {
            return false;
        }

        public boolean onSwipeTop() {
            return false;
        }

        public boolean onSwipeBottom() {
            return false;
        }
    };
}

