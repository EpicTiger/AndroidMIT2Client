package com.example.rainer.mit2client;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class RegisterFragment extends Fragment
{

    View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        super.onCreateView(inflater, container, savedInstanceState);
        view = inflater.inflate(R.layout.content_register_screen, container, false);

        initializeButtons();
        initializeSpinners();

        return view;
    }

    private void initializeButtons()
    {
        Button registerButton = (Button) view.findViewById(R.id.Register_Button);
        registerButton.setOnClickListener(new View.OnClickListener()
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

    private void initializeSpinners()
    {
        Spinner userTypeSpinner = (Spinner) view.findViewById(R.id.registerscreen_usertype_spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(), R.array.user_type_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        userTypeSpinner.setAdapter(adapter);
    }
}
