package com.example.rainer.mit2client;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import Entities.User;
import Util.AppSettings;
import butterknife.Bind;
import butterknife.ButterKnife;

public class EditProfileFragment extends BaseFragment
{
    @Bind(R.id.profile_edit_name)
    TextView textView_Fullname;
    @Bind(R.id.profile_edit_gender)
    TextView textView_Gender;
    @Bind(R.id.profile_edit_nationality)
    TextView textView_Nationality;
    @Bind(R.id.profile_edit_date_of_birth)
    TextView textView_DateOfBirth;
    @Bind(R.id.profile_edit_political_pref)
    TextView textView_PoliticalPreference;
    @Bind(R.id.profile_edit_town)
    TextView textView_Town;
    @Bind(R.id.profile_edit_submit_edit_profile_data)
    FloatingActionButton floatingActionButton_SubmitEditProfileData;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        super.onCreateView(inflater, container, savedInstanceState, R.layout.content_profile_edit_page);
        ButterKnife.bind(this, view);

        setHasOptionsMenu(true);

        ((NavigationDrawer) getActivity()).executeViewUserProfile(AppSettings.LoggedInUserId);

        floatingActionButton_SubmitEditProfileData.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //TODO: Update Profile
                disableEditTextViews();
            }
        });

        disableEditTextViews();

        return view;

    }
    private void disableEditTextViews()
    {
        textView_Fullname.clearFocus();
        textView_Fullname.setEnabled(false);
        textView_Fullname.setInputType(InputType.TYPE_NULL);
        textView_Gender.clearFocus();
        textView_Gender.setEnabled(false);
        textView_Gender.setInputType(InputType.TYPE_NULL);
        textView_Nationality.clearFocus();
        textView_Nationality.setEnabled(false);
        textView_Nationality.setInputType(InputType.TYPE_NULL);
        textView_DateOfBirth.clearFocus();
        textView_DateOfBirth.setEnabled(false);
        textView_DateOfBirth.setInputType(InputType.TYPE_NULL);
        textView_PoliticalPreference.clearFocus();
        textView_PoliticalPreference.setEnabled(false);
        textView_PoliticalPreference.setInputType(InputType.TYPE_NULL);
        textView_Town.clearFocus();
        textView_Town.setEnabled(false);
        textView_Town.setInputType(InputType.TYPE_NULL);
        floatingActionButton_SubmitEditProfileData.clearFocus();
        floatingActionButton_SubmitEditProfileData.setEnabled(false);
        floatingActionButton_SubmitEditProfileData.setVisibility(View.GONE);
    }

    private void enableEditTextViews()
    {
        textView_Fullname.setEnabled(true);
        textView_Fullname.setInputType(InputType.TYPE_CLASS_TEXT);
        textView_Gender.setEnabled(true);
        textView_Gender.setInputType(InputType.TYPE_CLASS_TEXT);
        textView_Nationality.setEnabled(true);
        textView_Nationality.setInputType(InputType.TYPE_CLASS_TEXT);
        textView_DateOfBirth.setEnabled(true);
        textView_DateOfBirth.setInputType(InputType.TYPE_CLASS_TEXT);
        textView_PoliticalPreference.setEnabled(true);
        textView_PoliticalPreference.setInputType(InputType.TYPE_CLASS_TEXT);
        textView_Town.setEnabled(true);
        textView_Town.setInputType(InputType.TYPE_CLASS_TEXT);
        floatingActionButton_SubmitEditProfileData.setEnabled(true);
        floatingActionButton_SubmitEditProfileData.setVisibility(View.VISIBLE);
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

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater)
    {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_edit_profile, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();

        if (id == R.id.edit_profile)
        {
            enableEditTextViews();
        }

        return super.onOptionsItemSelected(item);
    }
}
