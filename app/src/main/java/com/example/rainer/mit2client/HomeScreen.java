package com.example.rainer.mit2client;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import Entities.User;

public class HomeScreen extends BaseView {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        initializeToolbar();
        initializeNavigationDrawer(toolbar);
        setupDebugUser();
        initializeData();
    }

    private void initializeToolbar(){
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    private void initializeData() {

        TextView fullname = (TextView) findViewById(R.id.homescreen_textview_fullname);

        fullname.setText(User.Fullname);
    }

    private void setupDebugUser(){
        User.Username = "Debuguser";
        User.Fullname = "Debug User";
        User.Gender = "Male";
        User.PoliticalPreference = "N/A";
        User.Nationality = "Dutch";
        User.DateOfBirth = "1 - 1 - 1970";
        User.Town = "Amsterdam";
    }
}
