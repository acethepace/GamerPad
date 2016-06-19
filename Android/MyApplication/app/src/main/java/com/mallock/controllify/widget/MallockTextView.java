package com.mallock.controllify.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;

import com.mallock.controllify.R;

/**
 * Created by Akshat on 20-06-2016.
 */
public class MallockTextView extends TextView {
    Context context;

    public MallockTextView(Context context) {
        super(context);
        this.context=context;
    }

    public MallockTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context=context;
    }

    public MallockTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context=context;
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public MallockTextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.context=context;
    }

    public void init()
    {
        Typeface tf = Typeface.createFromAsset(context.getAssets(),
                "fonts/Walkway_Black.ttf");
        setTypeface(tf);
        this.setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimensionPixelSize(R.dimen.txt_size));
    }

}
