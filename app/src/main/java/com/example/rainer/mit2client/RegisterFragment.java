package com.example.rainer.mit2client;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import Politics247Generated.ThriftUserType;
import butterknife.Bind;
import butterknife.ButterKnife;

public class RegisterFragment extends Fragment
{
    @Bind(R.id.registerscreen_email_address)
    TextView textView_Email;
    @Bind(R.id.registerscreen_password)
    TextView textView_Password;
    @Bind(R.id.registerscreen_usertype_spinner)
    Spinner spinner_UserType;
    @Bind(R.id.registerscreen_button_register)
    Button button_Register;

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        super.onCreateView(inflater, container, savedInstanceState);
        view = inflater.inflate(R.layout.content_register_screen, container, false);
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
                String email = (textView_Email.getText().toString().trim());
                String password = (textView_Password.getText().toString().trim());
                ThriftUserType userType = ThriftUserType.findByValue(spinner_UserType.getSelectedItemPosition());

                ((LoginActivity) getActivity()).executeRegistration(email, password, userType);
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
