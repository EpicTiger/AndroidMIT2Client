package Adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rainer.mit2client.AddCommentFragment;
import com.example.rainer.mit2client.ContentDetailFragment;
import com.example.rainer.mit2client.NavigationDrawer;
import com.example.rainer.mit2client.R;

import java.util.List;

import Entities.Article;
import Util.AppSettings;

// <Author> Rainer Schmitt </Author>
// <StudentNo> 1235656 </StudentNo>
// <Copyright> Copyright (c) All Right Reserved <Copyright>

public class ArticleAdapter extends ArrayAdapter<Article>
{
    private final Context context;
    private List<Article> objects;

    public ArticleAdapter(Context context, int resource, List<Article> objects)
    {
        super(context, resource, objects);
        this.context = context;
        this.objects = objects;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent)
    {

        View v = convertView;

        if (v == null)
        {

            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.content_home_screen_list_item, null);
        }

        AppSettings.Articles = objects;

        Article article = getItem(position);

        if (article != null)
        {

            android.support.v7.widget.CardView card = (android.support.v7.widget.CardView) v.findViewById(R.id.homescreen_listview_artical_item_card);
            if (card != null)
            {
                card.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        AppSettings.ArticleArrayPosition = position;

                        ((Activity) context)
                                .getFragmentManager().beginTransaction()
                                .replace(R.id.fragmentParentViewGroup, new ContentDetailFragment(), String.valueOf(R.string.nav_drawer_fragment_content_detail))
                                .addToBackStack(String.valueOf(R.string.nav_drawer_fragment_content_detail))
                                .commit();
                    }
                });
            }

            Button likeButton = (Button) v.findViewById(R.id.homescreen_listview_artical_item_like_button);
            if (likeButton != null)
            {
                likeButton.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Article article = objects.get(position);

                        ((NavigationDrawer) getContext()).executeAddRating((int) article.getId(), 1.0);
                    }
                });
            }

            Button dislikeButton = (Button) v.findViewById(R.id.homescreen_listview_artical_item_dislike_button);
            if (dislikeButton != null)
            {
                dislikeButton.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Article article = objects.get(position);

                        ((NavigationDrawer) getContext()).executeAddRating((int) article.getId(), 0.0);
                    }
                });
            }

            Button commentButton = (Button) v.findViewById(R.id.homescreen_listview_artical_item_comment_button);
            if (commentButton != null)
            {
                commentButton.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        ((Activity) context)
                                .getFragmentManager().beginTransaction()
                                .replace(R.id.fragmentParentViewGroup, new AddCommentFragment(), String.valueOf(R.string.nav_drawer_fragment_add_comment))
                                .addToBackStack(String.valueOf(R.string.nav_drawer_fragment_add_comment))
                                .commit();
                    }
                });
            }

            ImageView image = (ImageView) v.findViewById(R.id.homescreen_listview_artical_item_imageview);
            if (image != null)
            {
                image.setImageDrawable(article.getImage());
            }

            TextView title = (TextView) v.findViewById(R.id.homescreen_listview_artical_item_title);

            if (title != null)
            {
                title.setText(article.getTitle());
            }

            TextView text = (TextView) v.findViewById(R.id.homescreen_listview_artical_item_text);

            if (text != null)
            {
                text.setText(article.getText());
            }

            TextView views = (TextView) v.findViewById(R.id.homescreen_listview_artical_item_views);

            if (views != null)
            {
                views.setText(article.getViews() + " views");
            }
        }

        return v;
    }

}
