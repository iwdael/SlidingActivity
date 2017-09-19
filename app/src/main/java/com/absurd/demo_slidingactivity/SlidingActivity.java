package com.absurd.demo_slidingactivity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;

import com.absurd.slidingactivity.SwipeBackLayout;

/**
 * Author: mr-absurd
 * Github: http://github.com/mr-absurd
 * Data: 2017/9/19.
 */

public class SlidingActivity extends Activity {
    protected SwipeBackLayout layout;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        layout = new SwipeBackLayout(this);
        layout.setShadowDrawable(R.drawable.slidingactivity_shadow_left);
        layout.attachToActivity(this);
    }
}
