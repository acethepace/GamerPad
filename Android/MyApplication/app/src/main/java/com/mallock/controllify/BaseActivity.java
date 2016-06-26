package com.mallock.controllify;


import android.app.ActionBar;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Mallock on 09-06-2016.
 */
public class BaseActivity extends AppCompatActivity {

    protected void setToolBarChild()
    {

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(
                new ColorDrawable(getResources().getColor(
                        R.color.actionbar_color)));
        actionBar.setDisplayOptions(actionBar.getDisplayOptions()
                | ActionBar.DISPLAY_HOME_AS_UP);
        actionBar.setHomeButtonEnabled(true);
        actionBar.setTitle(R.string.app_name);
        try {
            actionBar.setDisplayShowHomeEnabled(true);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        try {
            actionBar.setDisplayHomeAsUpEnabled(true);
        } catch (NullPointerException e){
            e.printStackTrace();
        }
    }

    protected void setToolbarHome()
    {
    }


}
