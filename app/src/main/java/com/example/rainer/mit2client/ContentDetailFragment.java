package com.example.rainer.mit2client;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import Entities.Article;
import Util.AppSettings;
import butterknife.Bind;
import butterknife.ButterKnife;

public class ContentDetailFragment extends Fragment
{
    @Bind(R.id.content_detail_text)
    TextView textView_Text;
    @Bind(R.id.content_detail_title)
    TextView textView_Title;
    @Bind(R.id.content_detail_imageview)
    ImageView imageView_Image;
    @Bind(R.id.content_detail_views)
    TextView textView_Views;

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        super.onCreateView(inflater, container, savedInstanceState);
        view = inflater.inflate(R.layout.content_content_detail_page, container, false);
        ButterKnife.bind(this, view);

        initializeData();

        return view;
    }

    private void initializeData()
    {
        Article article = AppSettings.Articles.get(AppSettings.ArrayPosition);

        textView_Title.setText(article.getTitle());
        textView_Text.setText(article.getText());
        textView_Views.setText(article.getViews() + " views");
        imageView_Image.setImageDrawable(article.getImage());
    }
}
