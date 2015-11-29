package com.example.rainer.mit2client;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import Entities.User;

public class ProfilePage extends BaseView {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);

        initializeToolbar();
        initializeData();
    }

    private void initializeToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void initializeData() {

        TextView fullname = (TextView) findViewById(R.id.profilescreen_textview_fullname);
        TextView gender = (TextView) findViewById(R.id.profilescreen_textview_gender);
        TextView nationality = (TextView) findViewById(R.id.profilescreen_textview_nationality);
        TextView dateofbirth = (TextView) findViewById(R.id.profilescreen_textview_dateofbirth);
        TextView politicalpreference = (TextView) findViewById(R.id.profilescreen_textview_politicalpreference);
        TextView town = (TextView) findViewById(R.id.profilescreen_textview_town);

        fullname.setText(User.Fullname);
        gender.setText(User.Gender);
        nationality.setText(User.Nationality);
        dateofbirth.setText(User.DateOfBirth);
        politicalpreference.setText(User.PoliticalPreference);
        town.setText(User.Town);
    }
}
