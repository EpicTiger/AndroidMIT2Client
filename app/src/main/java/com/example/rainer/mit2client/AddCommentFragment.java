package com.example.rainer.mit2client;

import android.app.Fragment;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class AddCommentFragment extends Fragment
{
    @Bind(R.id.container)
    public CoordinatorLayout container;
    @Bind(R.id.create_add_comment_button)
    FloatingActionButton floatingActionButton_AddComment;
    @Bind(R.id.create_add_comment_text)
    TextView textView_CommentText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.content_add_comment_page, container, false);

        ButterKnife.bind(this, view);

        initializeButtons();

        return view;
    }

    private void initializeButtons()
    {
        floatingActionButton_AddComment.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String comment = String.valueOf(textView_CommentText.getText());
                if (!comment.isEmpty())
                {
                    ((NavigationDrawer) getActivity()).executeAddComment(0, 0, comment);
                } else
                {
                    Util.Util.ShowSnackbarShort(container, "Comment can not be empty");
                }
            }
        });
    }
}
