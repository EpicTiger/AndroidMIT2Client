package com.example.rainer.mit2client;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class LoginFragment extends Fragment
{

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        super.onCreateView(inflater, container, savedInstanceState);
        view = inflater.inflate(R.layout.content_login_screen, container, false);

        initializeButtons();

        return view;
    }

    private void initializeButtons()
    {
        final Button loginButton = (Button) view.findViewById(R.id.loginscreen_login_button);
        loginButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                gotoHomeSreen();
            }
        });

        Button registerButton = (Button) view.findViewById(R.id.loginscreen_register_button);
        registerButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                gotoRegisterScreen();
            }
        });

        Button changePasswordButton = (Button) view.findViewById(R.id.loginscreen_changepassword_button);
        changePasswordButton.setOnClickListener(new View.OnClickListener()
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
                .replace(R.id.fragmentParentViewGroup, new RegisterFragment())
                .addToBackStack("Register fragment")
                .commit();
    }

    private void gotoChangePasswordScreen()
    {
        getFragmentManager().beginTransaction()
                .replace(R.id.fragmentParentViewGroup, new ChangePasswordFragment())
                .addToBackStack("Change Password fragment")
                .commit();
    }
}
