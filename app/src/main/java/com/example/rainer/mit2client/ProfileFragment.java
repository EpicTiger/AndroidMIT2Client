package com.example.rainer.mit2client;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ProfileFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.content_profile_page, container, false);
    }

//    private void initializeData() {
//
//        TextView fullname = (TextView) findViewById(R.id.profilescreen_textview_fullname);
//        TextView gender = (TextView) findViewById(R.id.profilescreen_textview_gender);
//        TextView nationality = (TextView) findViewById(R.id.profilescreen_textview_nationality);
//        TextView dateofbirth = (TextView) findViewById(R.id.profilescreen_textview_dateofbirth);
//        TextView politicalpreference = (TextView) findViewById(R.id.profilescreen_textview_politicalpreference);
//        TextView town = (TextView) findViewById(R.id.profilescreen_textview_town);
//
//        fullname.setText(User.Fullname);
//        gender.setText(User.Gender);
//        nationality.setText(User.Nationality);
//        dateofbirth.setText(User.DateOfBirth);
//        politicalpreference.setText(User.PoliticalPreference);
//        town.setText(User.Town);
//    }
}
