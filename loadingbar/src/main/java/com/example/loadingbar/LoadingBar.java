package com.example.loadingbar;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

public class LoadingBar extends LinearLayout {

    private LinearLayout linearLayout;

    public LoadingBar(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.activity_loading_bar, this);

    }

    public LoadingBar(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public LoadingBar(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public LoadingBar(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    private void init(){
    }
}
