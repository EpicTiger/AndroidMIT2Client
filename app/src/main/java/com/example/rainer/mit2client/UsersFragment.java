package com.example.rainer.mit2client;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.List;

import Adapters.UserAdapter;
import Entities.User;
import Util.AppSettings;
import butterknife.Bind;
import butterknife.ButterKnife;

// <Author> Rainer Schmitt </Author>
// <StudentNo> 1235656 </StudentNo>
// <Copyright> Copyright (c) All Right Reserved <Copyright>

public class UsersFragment extends BaseFragment
{
    @Bind(R.id.homescreen_listview_article)
    ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        super.onCreateView(inflater, container, savedInstanceState, R.layout.content_home_screen);
        ButterKnife.bind(this, view);

        ((NavigationDrawer)getActivity()).executeSearchUser(AppSettings.SearchQuery);

        return view;
    }

    public void setAndFillListAdapter(List<User> list)
    {
        UserAdapter adapter = new UserAdapter(getActivity(), R.layout.content_users_screen, list);
        listView.setAdapter(adapter);
    }
}
