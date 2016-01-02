package com.example.rainer.mit2client;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import Entities.Article;
import Util.AppSettings;

public class ContentDetailFragment extends Fragment{

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        view = inflater.inflate(R.layout.content_content_detail_page, container, false);

        initializeData(view);

        return view;
    }

    private void initializeData(View view) {

        TextView title = (TextView) view.findViewById(R.id.content_detail_title);
        TextView text = (TextView) view.findViewById(R.id.content_detail_text);

        Article article = AppSettings.Articles.get(AppSettings.ArrayPosition);

        title.setText(article.getTitle());
        text.setText(article.getText());
    }
}
