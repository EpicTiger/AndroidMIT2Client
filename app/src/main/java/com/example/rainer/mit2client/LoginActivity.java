package com.example.rainer.mit2client;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import AsyncClasses.LoginThriftClass;
import AsyncClasses.PasswordChangeThriftClass;
import AsyncClasses.RegistrationThriftClass;
import Politics247Generated.LoginData;
import Politics247Generated.PasswordChangeData;
import Politics247Generated.RegistrationData;
import Politics247Generated.UserType;


public class LoginActivity extends AppCompatActivity implements FragmentManager.OnBackStackChangedListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        getFragmentManager().addOnBackStackChangedListener(this);

        if (savedInstanceState == null)
        {
            getFragmentManager()
                    .beginTransaction()
                    .add(R.id.fragmentParentViewGroup, new LoginFragment())
                    .commit();
        }
    }

    public void executeLogin(String email, String password)
    {
        LoginData loginData = new LoginData();
        loginData.setEmail(email);
        loginData.setPassword(password);

        new LoginThriftClass().execute(loginData);
    }

    public void executeRegistration(String email, String password, UserType userType)
    {
        RegistrationData registrationData = new RegistrationData();
        registrationData.setEmailAddress(email);
        registrationData.setPassword(password);
        registrationData.setUserType(userType);

        new RegistrationThriftClass().execute(registrationData);
    }

    public void executeRegistration(String email, String oldPassword, String newPassword, String confirmPassword)
    {
        PasswordChangeData passwordChangeData = new PasswordChangeData();
        passwordChangeData.setOldPassword(oldPassword);
        passwordChangeData.setNewPassword(newPassword);

        new PasswordChangeThriftClass().execute(passwordChangeData);
    }

    @Override
    public void onBackPressed()
    {
        int count = getFragmentManager().getBackStackEntryCount();

        if (count == 0)
        {
            super.onBackPressed();
        } else
        {
            getFragmentManager().popBackStack();
        }
    }

    @Override
    public void onBackStackChanged()
    {
        Log.v("FragmentManager", "Changefragment");
    }
}

