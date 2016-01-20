package com.example.rainer.mit2client;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class LoginFragment extends Fragment
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

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        super.onCreateView(inflater, container, savedInstanceState);
        view = inflater.inflate(R.layout.content_login_screen, container, false);
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
//                String email = (textView_Email.getText().toString().trim());
//                String password = (textView_Password.getText().toString().trim());
//
//                ((LoginActivity)getActivity()).executeLogin(email, password);

                //((LoginActivity)getActivity()).executeLogin(email, password);

                gotoHomeSreen();
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
