package com.example.rainer.mit2client;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import Entities.User;
import Politics247Generated.ThriftGender;
import Util.AppSettings;
import butterknife.Bind;
import butterknife.ButterKnife;

public class EditProfileFragment extends BaseFragment
{
    @Bind(R.id.profile_edit_firstname)
    TextView textView_Firstname;
    @Bind(R.id.profile_edit_lastnameprefix)
    TextView textView_Lastnameprefix;
    @Bind(R.id.profile_edit_lastname)
    TextView textView_Lastname;
    @Bind(R.id.profile_edit_gender_spinner)
    Spinner spinner_Gender;
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

    private SimpleDateFormat dateFormatter;
    private DatePickerDialog datePickerDialog;

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState)
    {
        super.onCreateView(inflater, container, savedInstanceState, R.layout.content_profile_edit_page);
        ButterKnife.bind(this, view);
        setHasOptionsMenu(true);

        floatingActionButton_SubmitEditProfileData.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //executeProfileChange();
                disableElements();
            }
        });

        textView_DateOfBirth.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                setDateTimeField();
            }
        });

        dateFormatter = new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        ((NavigationDrawer) getActivity()).executeViewUserProfile(AppSettings.LoggedInUserId);
        return view;
    }

    private void disableElements()
    {
        disableEditText(textView_Firstname);
        disableEditText(textView_Lastnameprefix);
        disableEditText(textView_Lastname);
        disableEditText(textView_Nationality);
        disableEditText(textView_DateOfBirth);
        disableEditText(textView_PoliticalPreference);
        disableEditText(textView_Town);

        spinner_Gender.clearFocus();
        spinner_Gender.setEnabled(false);

        floatingActionButton_SubmitEditProfileData.clearFocus();
        floatingActionButton_SubmitEditProfileData.setEnabled(false);
        floatingActionButton_SubmitEditProfileData.setVisibility(View.GONE);
    }

    private void enableElements()
    {
        enableEditText(textView_Firstname);
        enableEditText(textView_Lastnameprefix);
        enableEditText(textView_Lastname);
        enableEditText(textView_Nationality);
        enableEditText(textView_DateOfBirth);
        enableEditText(textView_PoliticalPreference);
        enableEditText(textView_Town);

        spinner_Gender.clearFocus();
        spinner_Gender.setEnabled(true);

        floatingActionButton_SubmitEditProfileData.clearFocus();
        floatingActionButton_SubmitEditProfileData.setEnabled(true);
        floatingActionButton_SubmitEditProfileData.setVisibility(View.VISIBLE);
    }

    private void disableEditText(TextView textView)
    {
        textView.clearFocus();
        textView.setEnabled(false);
        textView.setInputType(InputType.TYPE_NULL);
    }

    private void enableEditText(TextView textView)
    {
        textView.clearFocus();
        textView.setEnabled(true);
        textView.setInputType(InputType.TYPE_CLASS_TEXT);
    }

    public void initializeData(User user)
    {
        textView_Firstname.setText(IsNotNull(user.getFirstname()));
        textView_Lastnameprefix.setText(IsNotNull(user.getLastnameprefix()));
        textView_Lastname.setText(IsNotNull(user.getLastname()));
        textView_Nationality.setText(IsNotNull(user.getNationality()));

        Calendar newDate = Calendar.getInstance();
        newDate.set(user.getDateOfBirthYear(), user.getDateOfBirthMonth(), user.getDateOfBirthDay());
        textView_DateOfBirth.setText(dateFormatter.format(newDate.getTime()));

        textView_PoliticalPreference.setText(IsNotNull(user.getPoliticalPreference()));
        textView_Town.setText(IsNotNull(user.getTown()));

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(), R.array.gender_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_Gender.setAdapter(adapter);
        disableElements();
    }

    private String IsNotNull(String value)
    {
        if (value != null)
            return value;
        else
            return "";
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
            enableElements();
        }

        return super.onOptionsItemSelected(item);
    }

    private void setDateTimeField()
    {
        Calendar newCalendar = Calendar.getInstance();
        int year = newCalendar.get(Calendar.YEAR);
        int month = newCalendar.get(Calendar.MONTH) + 1;
        int day = newCalendar.get(Calendar.DAY_OF_MONTH);

        datePickerDialog = new DatePickerDialog(view.getContext(), new DatePickerDialog.OnDateSetListener()
        {
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth)
            {
                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);
                textView_DateOfBirth.setText(dateFormatter.format(newDate.getTime()));
            }

        }, year, month, day);

        datePickerDialog.show();
    }

    private void executeProfileChange()
    {
        Date newDate = null;
        try
        {
            String date = String.valueOf(textView_DateOfBirth.getText()).trim();
            newDate = dateFormatter.parse(date);
        } catch (ParseException e)
        {
            e.printStackTrace();
        }

        User user = new User();
        user.setFirstname(textView_Firstname.getText().toString().trim());
        user.setLastnameprefix(textView_Lastnameprefix.getText().toString().trim());
        user.setLastname(textView_Lastname.getText().toString().trim());
        user.setGender(ThriftGender.findByValue(spinner_Gender.getSelectedItemPosition()));
        user.setNationality(textView_Nationality.getText().toString().trim());
        user.setPoliticalPreference(textView_PoliticalPreference.getText().toString().trim());
        user.setTown(textView_Town.getText().toString().trim());
        user.setDateOfBirthYear(newDate.getYear());
        user.setDateOfBirthMonth(newDate.getMonth());
        user.setDateOfBirthDay(newDate.getDay());

        ((NavigationDrawer) getActivity()).executeUpdateProfile(user);

        disableElements();
    }
}
