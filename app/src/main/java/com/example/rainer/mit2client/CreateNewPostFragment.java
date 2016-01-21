package com.example.rainer.mit2client;

import android.app.Fragment;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class CreateNewPostFragment extends Fragment
{
    @Bind(R.id.create_new_post_create_post_button)
    FloatingActionButton floatingActionButton_CreatePostButton;
    @Bind(R.id.create_new_post_title)
    TextView textView_Title;
    @Bind(R.id.create_new_post_text)
    TextView textView_Text;

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
                ((NavigationDrawer) getActivity()).executeCreateContent(0, String.valueOf(textView_Title.getText()), String.valueOf(textView_Text.getText()));
            }
        });
    }
}
