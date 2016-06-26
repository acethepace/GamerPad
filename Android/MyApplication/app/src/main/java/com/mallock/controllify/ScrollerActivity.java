package com.mallock.controllify;

import android.os.Bundle;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.VelocityTrackerCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.RelativeLayout;

public class ScrollerActivity extends AppCompatActivity {

    RelativeLayout relativeLayout;
    String TAG = getClass().getSimpleName();

    VelocityTracker mVelocityTracker = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroller);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        initializeViewVariables();
        setListeners();
    }


    private void initializeViewVariables() {
        relativeLayout = (RelativeLayout) findViewById(R.id.rl_scroll);
    }


    private void setListeners() {
        final View.OnTouchListener touchListener = new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int action = MotionEventCompat.getActionMasked(event);
                int index = event.getActionIndex();
//                int action = event.getActionMasked();
                int pointerId = event.getPointerId(index);
                switch (action) {

                    case MotionEvent.ACTION_DOWN:
                        if (mVelocityTracker == null) {
                            // Retrieve a new VelocityTracker object to watch the velocity of a motion.
                            mVelocityTracker = VelocityTracker.obtain();
                        } else {
                            // Reset the velocity tracker back to its initial state.
                            mVelocityTracker.clear();
                        }
                        // Add a user's movement to the tracker.
                        mVelocityTracker.addMovement(event);
                        break;
                    case MotionEvent.ACTION_MOVE:
                        mVelocityTracker.addMovement(event);
                        // When you want to determine the velocity, call
                        // computeCurrentVelocity(). Then call getXVelocity()
                        // and getYVelocity() to retrieve the velocity for each pointer ID.
                        mVelocityTracker.computeCurrentVelocity(1000);
                        // Log velocity of pixels per second
                        // Best practice to use VelocityTrackerCompat where possible.
                        Log.e("", "X velocity: " +
                                VelocityTrackerCompat.getXVelocity(mVelocityTracker,
                                        pointerId));
                        Log.e("", "Y velocity: " +
                                VelocityTrackerCompat.getYVelocity(mVelocityTracker,
                                        pointerId));
                        break;
                    case MotionEvent.ACTION_UP:
                    case MotionEvent.ACTION_CANCEL:
                        // Return a VelocityTracker object back to be re-used by others.
                        mVelocityTracker.recycle();
                        break;
                }
                return false;
            }
        };
        relativeLayout.setOnTouchListener(touchListener);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            // This ID represents the Home or Up button.
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
