package com.example.rainer.mit2client;

import android.app.FragmentManager;
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
import Util.AppSettings;


public class LoginActivity extends AppCompatActivity implements FragmentManager.OnBackStackChangedListener, LoginAsyncResponse
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
                    .add(R.id.fragmentParentViewGroup, new LoginFragment(), String.valueOf(R.string.nav_drawer_fragment_login))
                    .addToBackStack(String.valueOf(R.string.nav_drawer_fragment_login))
                    .commit();
        }
    }

    public void executeLogin(String email, String password)
    {
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
        registrationData.setFirstname("");
        registrationData.setLastname("");

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

        if (count == 1)
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
        LoginFragment fragment = (LoginFragment) getFragmentManager().findFragmentByTag(String.valueOf(R.string.nav_drawer_fragment_login));

        if (fragment != null)
        {
            if (result != null)
            {
                if (result.isLoginSuccessful)
                {
                    AppSettings.LoggedInUserId = result.userId;
                    gotoHomeSreen();
                } else
                {
                    fragment.showSnackbarLong("Credentials are invalid");
                }
            } else
            {
                fragment.showSnackbarLong("Could not connect to server");
            }
        }
    }

    @Override
    public void registrationProcessFinish(RegistrationResult result)
    {
        RegisterFragment fragment = (RegisterFragment) getFragmentManager().findFragmentByTag(String.valueOf(R.string.nav_drawer_fragment_register));
        LoginFragment loginFragment = (LoginFragment) getFragmentManager().findFragmentByTag(String.valueOf(R.string.nav_drawer_fragment_login));

        if (fragment != null)
        {
            if (result != null)
            {
                if (result.isRegistrationSuccessful)
                {
                    onBackPressed();
                    loginFragment.showSnackbarShort("Registration successful");
                } else
                {
                    if (!result.isEmailValid)
                    {
                        fragment.showSnackbarLong("This is not a valid e-mail address");
                    } else if (!result.isIsPasswordValid())
                    {
                        fragment.showSnackbarLong("Password is not valid.");
                    }
                }
            }
            else
            {
                fragment.showSnackbarLong("Could not connect to server");
            }
        }
    }

    @Override
    public void passwordChangedProcessFinish(PasswordChangeResult result)
    {
        ChangePasswordFragment fragment = (ChangePasswordFragment) getFragmentManager().findFragmentByTag(String.valueOf(R.string.nav_drawer_fragment_change_password));
        LoginFragment loginFragment = (LoginFragment) getFragmentManager().findFragmentByTag(String.valueOf(R.string.nav_drawer_fragment_login));

        if (fragment != null)
        {
            if (result != null)
            {
                if (result.isPasswordChangeSuccessful)
                {
                    onBackPressed();
                    loginFragment.showSnackbarShort("Password successfully updated");
                } else if (!result.isEmailValid || !result.isOldPasswordValid)
                {
                    fragment.showSnackbarLong("Credentials are invalid");
                } else if (result.isNewPasswordValid)
                {
                    fragment.showSnackbarLong("New password is not valid.");
                }
            } else
            {
                fragment.showSnackbarLong("Could not connect to server");
            }
        }
    }

    private void gotoHomeSreen()
    {
        Intent intent = new Intent(this, NavigationDrawer.class);
        startActivity(intent);
    }
}

