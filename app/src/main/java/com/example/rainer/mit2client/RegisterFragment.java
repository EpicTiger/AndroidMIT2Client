package com.example.rainer.mit2client;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import Politics247Generated.ThriftUserType;
import Util.AppSettings;
import butterknife.Bind;
import butterknife.ButterKnife;

// <Author> Rainer Schmitt </Author>
// <StudentNo> 1235656 </StudentNo>
// <Copyright> Copyright (c) All Right Reserved <Copyright>

public class RegisterFragment extends BaseFragment
{
    @Bind(R.id.registerscreen_email_address)
    TextView textView_Email;
    @Bind(R.id.registerscreen_password)
    TextView textView_Password;
    @Bind(R.id.registerscreen_usertype_spinner)
    Spinner spinner_UserType;
    @Bind(R.id.registerscreen_button_register)
    Button button_Register;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        super.onCreateView(inflater, container, savedInstanceState, R.layout.content_register_screen);
        ButterKnife.bind(this, view);

        initializeButtons();
        initializeSpinners();

        return view;
    }

    private void initializeButtons()
    {
        button_Register.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if (AppSettings.UseServers)
                {
                    String email = (textView_Email.getText().toString().trim().toLowerCase());
                    String password = (textView_Password.getText().toString().trim());
                    ThriftUserType userType = ThriftUserType.findByValue(spinner_UserType.getSelectedItemPosition());

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

                    ((LoginActivity) getActivity()).executeRegistration(email, password, userType);
                } else
                {
                }
            }

        });
    }

    private void initializeSpinners()
    {
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(), R.array.user_type_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_UserType.setAdapter(adapter);
    }
}
