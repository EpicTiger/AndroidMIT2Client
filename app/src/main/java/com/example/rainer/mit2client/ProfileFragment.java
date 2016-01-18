package com.example.rainer.mit2client;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import Entities.User;
import butterknife.Bind;
import butterknife.ButterKnife;

public class ProfileFragment extends Fragment
{
    @Bind(R.id.profilescreen_textview_fullname)
    TextView textView_Fullname;
    @Bind(R.id.profilescreen_textview_gender)
    TextView textView_Gender;
    @Bind(R.id.profilescreen_textview_nationality)
    TextView textView_Nationality;
    @Bind(R.id.profilescreen_textview_dateofbirth)
    TextView textView_DateOfBirth;
    @Bind(R.id.profilescreen_textview_politicalpreference)
    TextView textView_PoliticalPrefeence;
    @Bind(R.id.profilescreen_textview_town)
    TextView textView_Town;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.content_profile_page, container, false);
        ButterKnife.bind(this, view);

        initializeData();
        return view;
    }

    private void initializeData()
    {
        textView_Fullname.setText(User.Fullname);
        textView_Gender.setText(User.Gender);
        textView_Nationality.setText(User.Nationality);
        textView_DateOfBirth.setText(User.DateOfBirth);
        textView_PoliticalPrefeence.setText(User.PoliticalPreference);
        textView_Town.setText(User.Town);
    }
}
