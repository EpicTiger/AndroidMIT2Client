package com.example.rainer.mit2client;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import Entities.User;
import Util.AppSettings;
import butterknife.Bind;
import butterknife.ButterKnife;

public class ProfileFragment extends BaseFragment
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
    TextView textView_PoliticalPreference;
    @Bind(R.id.profilescreen_textview_town)
    TextView textView_Town;
    @Bind(R.id.profilescreen_subcribe_button)
    Button button_Subscribe;

    User user;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        super.onCreateView(inflater, container, savedInstanceState, R.layout.content_profile_page);
        ButterKnife.bind(this, view);

        user = AppSettings.Users.get(AppSettings.UserArrayPosition);
        ((NavigationDrawer) getActivity()).executeViewUserProfile(user.getUserId());

        button_Subscribe.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ((NavigationDrawer) getActivity()).executeAddSubscription(AppSettings.LoggedInUserId, user.getUserId());
            }
        });

        return view;
    }

    public void initializeData(User user)
    {
        textView_Fullname.setText(String.format("%s %s %s", user.getFirstname(), user.getLastnameprefix(), user.getLastname()));
        textView_Gender.setText(user.getGender());
        textView_Nationality.setText(user.getNationality());
        textView_DateOfBirth.setText(user.getDateOfBirth());
        textView_PoliticalPreference.setText(user.getPoliticalPreference());
        textView_Town.setText(user.getTown());
    }
}
