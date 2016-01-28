package com.example.rainer.mit2client;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;

// <Author> Rainer Schmitt </Author>
// <StudentNo> 1235656 </StudentNo>
// <Copyright> Copyright (c) All Right Reserved <Copyright>

public class BaseFragment extends Fragment
{
    @Bind(R.id.container)
    protected CoordinatorLayout container;

    protected View view;

    @Nullable
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState, int resource)
    {
        super.onCreateView(inflater, container, savedInstanceState);
        view = inflater.inflate(resource, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    protected void showSnackbarShort(String message)
    {
        Snackbar.make(container, message, Snackbar.LENGTH_LONG).show();
    }

    protected void showSnackbarLong(String message)
    {
        Snackbar.make(container, message, Snackbar.LENGTH_LONG).show();
    }

    protected void showToastShort(Context context, String message)
    {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    protected void showToastLong(Context context, String message)
    {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}
