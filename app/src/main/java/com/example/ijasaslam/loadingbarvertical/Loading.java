package com.example.ijasaslam.loadingbarvertical;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

public class Loading extends LinearLayout {

    private LinearLayout linearLayout;

    public Loading(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.activity_loading, this);

    }

    public Loading(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Loading(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public Loading(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    private void init(){
    }
}
