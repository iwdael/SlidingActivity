package com.hacknife.demo_slidingactivity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.hacknife.slidingactivity.SwipeBackLayout;


public class BaseActivity extends Activity {
    protected SwipeBackLayout layout;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        layout = new SwipeBackLayout(this);
        layout.setShadowDrawable(R.drawable.slidingactivity_shadow_left);
        layout.attachToActivity(this);
    }
}
