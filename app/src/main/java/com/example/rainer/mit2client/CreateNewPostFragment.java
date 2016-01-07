package com.example.rainer.mit2client;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CreateNewPostFragment extends Fragment
{

    View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        super.onCreateView(inflater, container, savedInstanceState);
        view = inflater.inflate(R.layout.content_create_new_post_page, container, false);
        initializeButtons();
        return view;
    }

    private void initializeButtons()
    {
        FloatingActionButton createPostButton = (FloatingActionButton) view.findViewById(R.id.create_new_post_create_post_button);
        createPostButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view.findViewById(R.id.create_new_post_view_container);
                Snackbar.make(coordinatorLayout, R.string.ContentCreated, Snackbar.LENGTH_LONG).show();
            }
        });
    }

}
