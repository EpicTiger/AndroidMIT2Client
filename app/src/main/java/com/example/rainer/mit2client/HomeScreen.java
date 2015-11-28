package com.example.rainer.mit2client;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class HomeScreen extends BaseView {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        initializeToolbar();
        initializeNavigationDrawer(toolbar);
    }

    private void initializeToolbar(){
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
}
