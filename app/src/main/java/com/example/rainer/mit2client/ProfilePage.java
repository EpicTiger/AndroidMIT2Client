package com.example.rainer.mit2client;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class ProfilePage extends BaseView {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);

        initializeToolbar();
    }

    private void initializeToolbar(){
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
