package com.example.rainer.mit2client;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.List;

import Adapters.ArticleAdapter;
import Entities.Article;
import butterknife.Bind;
import butterknife.ButterKnife;

public class HomeFragment extends BaseFragment
{

    @Bind(R.id.homescreen_listview_article)
    ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        super.onCreateView(inflater, container, savedInstanceState, R.layout.content_home_screen);
        ButterKnife.bind(this, view);

        ((NavigationDrawer) getActivity()).executeHomecontent();

        return view;
    }

    public void setAndFillListAdapter(List<Article> list)
    {
        ArticleAdapter adapter = new ArticleAdapter(getActivity(), R.layout.content_home_screen, list);
        listView.setAdapter(adapter);
    }

    public Article createArticle(long id, String title, String text, int resource, int views)
    {
        Article result = new Article();
        result.setId(id);
        result.setTitle(title);
        result.setText(text);
        result.setImage(getResources().getDrawable(resource));
        result.setViews(views);
        return result;
    }
}
