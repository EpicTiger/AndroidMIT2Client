package com.example.rainer.mit2client;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import Entities.Article;
import Util.AppSettings;
import butterknife.Bind;
import butterknife.ButterKnife;

// <Author> Rainer Schmitt </Author>
// <StudentNo> 1235656 </StudentNo>
// <Copyright> Copyright (c) All Right Reserved <Copyright>

public class ContentDetailFragment extends BaseFragment
{
    @Bind(R.id.content_detail_title)
    TextView textView_Title;
    @Bind(R.id.content_detail_text)
    TextView textView_Text;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        super.onCreateView(inflater, container, savedInstanceState, R.layout.content_content_detail_page);
        ButterKnife.bind(this, view);
        initializeData();

        return view;
    }

    private void initializeData()
    {
        Article article = AppSettings.Articles.get(AppSettings.ArticleArrayPosition);

        textView_Title.setText(article.getTitle());
        textView_Text.setText(article.getText());

    }
}
