package com.example.boston.gestureexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.support.v4.view.GestureDetectorCompat;

//

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,
        GestureDetector.OnDoubleTapListener{

    private  TextView kiranmessage;
    private GestureDetectorCompat kirangesture;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kiranmessage = (TextView)findViewById(R.id.kiranmessage);

        // an object of kirangesture linking to Gesture Detector as an instance
        this.kirangesture = new GestureDetectorCompat(this,this);

        kirangesture.setOnDoubleTapListener(this);
    }

////// Gestures Begining////////

    /// each return statement should be true , as it says that the event has been handled////
    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {

        kiranmessage.setText("On Single tap");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        kiranmessage.setText("On Double tap");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        kiranmessage.setText("On Doubletap event tap");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        kiranmessage.setText("On Down ");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
        kiranmessage.setText("On Show ");

    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        kiranmessage.setText("On Single tap up");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        kiranmessage.setText("On Scroll ");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        kiranmessage.setText("On Long Press");

    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        kiranmessage.setText("On Fling");
        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.kirangesture.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}
