package com.mallock.controllify;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.DragEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;

public class ScrollerActivity extends AppCompatActivity {

    RelativeLayout relativeLayout;

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
        relativeLayout.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {
//                if(event.)
                    return false;
            }
        });
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
