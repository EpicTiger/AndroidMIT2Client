package com.example.rainer.mit2client;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import Entities.User;

public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.content_home_screen, container, false);
        initializeData(view);
        return view;
    }

    private void initializeData(View view) {

        TextView fullname = (TextView) view.findViewById(R.id.homescreen_textview_fullname);

        fullname.setText(User.Fullname);
    }
}
