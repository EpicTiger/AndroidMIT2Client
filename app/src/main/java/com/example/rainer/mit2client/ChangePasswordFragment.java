package com.example.rainer.mit2client;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import Util.AppSettings;
import butterknife.Bind;
import butterknife.ButterKnife;

public class ChangePasswordFragment extends BaseFragment
{
    @Bind(R.id.changepasswordscreen_changepassword_button)
    Button button_ChangePassword;
    @Bind(R.id.changepasswordscreen_email_address)
    TextView textView_Email;
    @Bind(R.id.changepasswordscreen_old_password)
    TextView textView_OldPassword;
    @Bind(R.id.changepasswordscreen_first_password)
    TextView textView_NewPassword;
    @Bind(R.id.changepasswordscreen_confirm_password)
    TextView textView_ConfirmPassword;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        super.onCreateView(inflater, container, savedInstanceState, R.layout.content_changepassword_screen);
        ButterKnife.bind(this, view);

        initializeButtons();

        return view;
    }

    private void initializeButtons()
    {
        button_ChangePassword.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if (AppSettings.UseServers)
                {
                    String email = (textView_Email.getText().toString().trim().toLowerCase());
                    String oldPassword = (textView_OldPassword.getText().toString().trim());
                    String newPassword = (textView_NewPassword.getText().toString().trim());
                    String confirmPassword = (textView_ConfirmPassword.getText().toString().trim());

                    if (newPassword.equals(confirmPassword))
                    {
                        ((LoginActivity) getActivity()).executePasswordChange(email, oldPassword, newPassword);
                    } else
                    {
                        showSnackbarLong("The new passwords don't match");
                    }
                } else
                {
                    getActivity().onBackPressed();
                }
            }
        });
    }
}
