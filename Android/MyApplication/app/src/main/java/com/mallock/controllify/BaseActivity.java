package com.mallock.controllify;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;

/**
 * Created by Akshat on 20-06-2016.
 */
public class BaseActivity extends AppCompatActivity {

    public void setToolbarChild()
    {

    }
    public void setToolbarHome()
    {

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(this.getClass().getSimpleName()," destroyed");
    }
}
