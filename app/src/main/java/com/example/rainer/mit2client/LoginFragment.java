package com.example.rainer.mit2client;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import Util.AppSettings;
import butterknife.Bind;
import butterknife.ButterKnife;

// <Author> Rainer Schmitt </Author>
// <StudentNo> 1235656 </StudentNo>
// <Copyright> Copyright (c) All Right Reserved <Copyright>

public class LoginFragment extends BaseFragment
{
    @Bind(R.id.loginscreen_register_button)
    Button button_Register;
    @Bind(R.id.loginscreen_login_button)
    Button button_Login;
    @Bind(R.id.loginscreen_changepassword_button)
    Button button_ChangePassword;
    @Bind(R.id.loginscreen_email_address)
    TextView textView_Email;
    @Bind(R.id.loginscreen_password)
    TextView textView_Password;

    ViewGroup container;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        super.onCreateView(inflater, container, savedInstanceState, R.layout.content_login_screen);
        ButterKnife.bind(this, view);

        initializeButtons();

        return view;
    }

    private void initializeButtons()
    {
        button_Login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if (AppSettings.UseServers)
                {
                    String email = (textView_Email.getText().toString().trim());
                    String password = (textView_Password.getText().toString().trim());

                    if (email.isEmpty())
                    {
                        showSnackbarShort("E-mail can not be empty");
                        return;
                    }
                    if (password.isEmpty())
                    {
                        showSnackbarShort("Password can not be empty");
                        return;
                    }

                    AppSettings.Email = email;
                    AppSettings.Password = password;
                    ((LoginActivity) getActivity()).executeLogin(email, password);
                } else
                {
                    gotoHomeSreen();
                }
            }
        });

        button_Register.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                gotoRegisterScreen();
            }
        });

        button_ChangePassword.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                gotoChangePasswordScreen();
            }
        });
    }

    private void gotoHomeSreen()
    {
        Intent intent = new Intent(getActivity(), NavigationDrawer.class);
        startActivity(intent);
    }

    private void gotoRegisterScreen()
    {
        getFragmentManager().beginTransaction()
                .replace(R.id.fragmentParentViewGroup, new RegisterFragment(), String.valueOf(R.string.nav_drawer_fragment_register))
                .addToBackStack(String.valueOf(R.string.nav_drawer_fragment_register))
                .commit();
    }

    private void gotoChangePasswordScreen()
    {
        getFragmentManager().beginTransaction()
                .replace(R.id.fragmentParentViewGroup, new ChangePasswordFragment(), String.valueOf(R.string.nav_drawer_fragment_change_password))
                .addToBackStack(String.valueOf(R.string.nav_drawer_fragment_change_password))
                .commit();
    }
}
