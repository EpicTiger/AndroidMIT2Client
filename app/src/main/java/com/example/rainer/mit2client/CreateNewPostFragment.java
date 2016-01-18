package com.example.rainer.mit2client;

import android.app.Fragment;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.Bind;
import butterknife.ButterKnife;

public class CreateNewPostFragment extends Fragment
{
    @Bind(R.id.create_new_post_create_post_button)
    FloatingActionButton floatingActionButton_CreatePostButton;

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        super.onCreateView(inflater, container, savedInstanceState);
        view = inflater.inflate(R.layout.content_create_new_post_page, container, false);
        ButterKnife.bind(this, view);

        initializeButtons();
        return view;
    }

    private void initializeButtons()
    {
        floatingActionButton_CreatePostButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Util.Util.ShowSnackbarLong(view, getString(R.string.ContentCreated));
            }
        });
    }
}
