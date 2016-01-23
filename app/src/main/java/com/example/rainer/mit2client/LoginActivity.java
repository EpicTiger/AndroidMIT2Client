package com.example.rainer.mit2client;

import android.app.FragmentManager;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import AsyncClasses.LoginAsyncResponse;
import AsyncClasses.LoginThriftClass;
import AsyncClasses.PasswordChangeThriftClass;
import AsyncClasses.RegistrationThriftClass;
import Politics247Generated.LoginData;
import Politics247Generated.LoginResult;
import Politics247Generated.PasswordChangeData;
import Politics247Generated.PasswordChangeResult;
import Politics247Generated.RegistrationData;
import Politics247Generated.RegistrationResult;
import Politics247Generated.ThriftUserType;


public class LoginActivity extends AppCompatActivity implements FragmentManager.OnBackStackChangedListener, LoginAsyncResponse
{
    private ProgressDialog loginProgressDialog;

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
                    .addToBackStack(String.valueOf(R.string.nav_drawer_fragment_login))
                    .commit();
        }
    }

    public void executeLogin(String email, String password)
    {
//        loginProgressDialog = new ProgressDialog(getApplicationContext());
//        loginProgressDialog.setMessage("Logging in...");
//        loginProgressDialog.setCancelable(false);
//        loginProgressDialog.show();

        LoginData loginData = new LoginData();
        loginData.setEmail(email);
        loginData.setPassword(password);

        LoginThriftClass loginThriftClass = new LoginThriftClass();
        loginThriftClass.delegate = this;
        loginThriftClass.execute(loginData);
    }

    public void executeRegistration(String email, String password, ThriftUserType userType)
    {
        RegistrationData registrationData = new RegistrationData();
        registrationData.setEmailAddress(email);
        registrationData.setPassword(password);
        registrationData.setUserType(userType);

        RegistrationThriftClass registrationThriftClass = new RegistrationThriftClass();
        registrationThriftClass.delegate = this;
        registrationThriftClass.execute(registrationData);
    }

    public void executePasswordChange(String email, String oldPassword, String newPassword)
    {
        PasswordChangeData passwordChangeData = new PasswordChangeData();
        passwordChangeData.setEmail(email);
        passwordChangeData.setOldPassword(oldPassword);
        passwordChangeData.setNewPassword(newPassword);

        PasswordChangeThriftClass passwordChangeThriftClass = new PasswordChangeThriftClass();
        passwordChangeThriftClass.delegate = this;
        passwordChangeThriftClass.execute(passwordChangeData);
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

    @Override
    public void loginProcessFinish(LoginResult result)
    {
        //loginProgressDialog.dismiss();
        if (result != null)
        {
            gotoHomeSreen();
        } else
        {

        }
    }

    @Override
    public void registrationProcessFinish(RegistrationResult result)
    {
        if (result == null)
        {
            return;
        }

        if (result.isRegistrationSuccessful)
        {
            super.onBackPressed();
            Toast.makeText(this, "Registration successful", Toast.LENGTH_LONG).show();
        } else
        {
            if (!result.isEmailValid)
            {
                Toast.makeText(this, "This is not a valid e-mail address", Toast.LENGTH_LONG).show();
            } else if (!result.isIsPasswordValid())
            {
                Toast.makeText(this, "This is not a valid password", Toast.LENGTH_LONG).show();
            }
        }
    }

    @Override
    public void passwordChangedProcessFinish(PasswordChangeResult result)
    {
        if (result != null)
        {
            Toast.makeText(this, "Password Change Success", Toast.LENGTH_SHORT).show();
        } else
        {
            Toast.makeText(this, "Password Change Error", Toast.LENGTH_SHORT).show();
        }
    }

    private void gotoHomeSreen()
    {
        Intent intent = new Intent(this, NavigationDrawer.class);
        startActivity(intent);
    }
}

