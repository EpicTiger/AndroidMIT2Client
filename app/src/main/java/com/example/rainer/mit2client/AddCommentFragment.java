package com.example.rainer.mit2client;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class AddCommentFragment extends BaseFragment
{
    @Bind(R.id.create_add_comment_button)
    FloatingActionButton floatingActionButton_AddComment;
    @Bind(R.id.create_add_comment_text)
    TextView textView_CommentText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        super.onCreateView(inflater, container, savedInstanceState, R.layout.content_add_comment_page);
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
                    ((NavigationDrawer) getActivity()).executeAddComment(0, comment);
                } else
                {
                    showSnackbarShort("Comment can not be empty");
                }
            }
        });
    }
}
