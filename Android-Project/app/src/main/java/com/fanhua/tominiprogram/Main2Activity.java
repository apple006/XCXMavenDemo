package com.fanhua.tominiprogram;

import android.os.Bundle;

public class Main2Activity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    protected boolean isAutoAdapter() {
        return true;
    }
}