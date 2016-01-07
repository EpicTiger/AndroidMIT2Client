package com.example.rainer.mit2client;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import Entities.User;

public class ProfileFragment extends Fragment
{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.content_profile_page, container, false);
        initializeData(view);
        return view;
    }

    private void initializeData(View view)
    {

        TextView fullname = (TextView) view.findViewById(R.id.profilescreen_textview_fullname);
        TextView gender = (TextView) view.findViewById(R.id.profilescreen_textview_gender);
        TextView nationality = (TextView) view.findViewById(R.id.profilescreen_textview_nationality);
        TextView dateofbirth = (TextView) view.findViewById(R.id.profilescreen_textview_dateofbirth);
        TextView politicalpreference = (TextView) view.findViewById(R.id.profilescreen_textview_politicalpreference);
        TextView town = (TextView) view.findViewById(R.id.profilescreen_textview_town);

        fullname.setText(User.Fullname);
        gender.setText(User.Gender);
        nationality.setText(User.Nationality);
        dateofbirth.setText(User.DateOfBirth);
        politicalpreference.setText(User.PoliticalPreference);
        town.setText(User.Town);
    }
}
