package com.example.rainer.mit2client;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import AsyncClasses.LoginThriftClass;
import Politics247Generated.LoginData;


public class LoginActivity extends AppCompatActivity implements FragmentManager.OnBackStackChangedListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        ExecuteThrift();

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

    private void ExecuteThrift()
    {
        LoginData loginData = new LoginData();
        loginData.setEmail("dwahkdwa");
        loginData.setPassword("dawdwa");

    new LoginThriftClass().execute(loginData);
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

