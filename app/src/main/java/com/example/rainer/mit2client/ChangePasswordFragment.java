package com.example.rainer.mit2client;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ChangePasswordFragment extends Fragment
{

    View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        super.onCreateView(inflater, container, savedInstanceState);
        view = inflater.inflate(R.layout.content_changepassword_screen, container, false);

        initializeButtons();

        return view;
    }

    private void initializeButtons()
    {
        Button changePasswordButton = (Button) view.findViewById(R.id.changepasswordscreen_changepassword_button);
        changePasswordButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                getFragmentManager().beginTransaction()
                        .replace(R.id.fragmentParentViewGroup, new LoginFragment())
                        .commit();
            }
        });
    }
}
