package com.mallock.controllify;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.mallock.controllify.Utils.PopupUtils;

import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnLongClick;

public class ModeChooseActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mode_choose);
        setToolbarHome();
        ButterKnife.inject(this);
    }

    @OnClick(R.id.choice_gamepad)
    public void useAsGamepad(){
        Intent i = new Intent(this, GameControllerActivity.class);
        startActivity(i);
    }

    /**
     * TODO: show popup explaining usage on long click
     */
    @OnLongClick(R.id.choice_gamepad)
    public boolean showGamePadToolTip() {
        ImageView imageView = (ImageView) findViewById(R.id.iv_gamepad);
        PopupUtils.showPopup(imageView, "Use phone as gamepad", this);
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_mode_choose, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
