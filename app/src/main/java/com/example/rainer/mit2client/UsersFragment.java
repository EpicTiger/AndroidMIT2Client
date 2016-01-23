package com.example.rainer.mit2client;

import android.app.Fragment;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import Adapters.ArticleAdapter;
import Adapters.UserAdapter;
import Entities.Article;
import Entities.User;
import Util.AppSettings;
import butterknife.Bind;
import butterknife.ButterKnife;

public class UsersFragment extends BaseFragment
{
    private List<User> users;
    @Bind(R.id.homescreen_listview_article)
    ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        super.onCreateView(inflater, container, savedInstanceState, R.layout.content_home_screen);
        ButterKnife.bind(this, view);

        List<User> list = inititalizeItemList();
        setAndFillListAdapter(list);
        return view;
    }

    private List<User> inititalizeItemList()
    {
        users = new ArrayList<>();

        createUser("Wiel", "van den", "Kruiwagen");
        createUser("Piet", "van den", "Kruiwagen");
        createUser("Debug", "", "User");

        AppSettings.Users = users;
        return users;
    }

    private void setAndFillListAdapter(List<User> list)
    {
        UserAdapter adapter = new UserAdapter(getActivity(), R.layout.content_users_screen, list);
        listView.setAdapter(adapter);
    }

    private void createUser(String firstname, String lastnameprefix, String lastname)
    {
        User user = new User();
        user.setFirstname(firstname);
        user.setLastnameprefix(lastnameprefix);
        user.setLastname(lastname);
        users.add(user);
    }
}
