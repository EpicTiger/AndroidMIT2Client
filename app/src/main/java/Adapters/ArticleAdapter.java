package Adapters;

import android.app.Activity;
import android.content.Context;
import android.text.method.CharacterPickerDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rainer.mit2client.ContentDetailFragment;
import com.example.rainer.mit2client.R;

import java.util.List;

import Entities.Article;
import Util.AppSettings;

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

        View view = convertView;

        if (view == null)
        {

            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            view = vi.inflate(R.layout.content_home_screen_list_item, null);
        }

        Article article = getItem(position);

        if (article != null)
        {

            android.support.v7.widget.CardView card = (android.support.v7.widget.CardView) view.findViewById(R.id.homescreen_listview_artical_item_card);
            if (card != null)
            {
                card.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        AppSettings.ArrayPosition = position;

                        ((Activity) context)
                                .getFragmentManager().beginTransaction().replace(R.id.fragmentParentViewGroup, new ContentDetailFragment())
                                .addToBackStack("Content Detail").commit();
                    }
                });
            }

            Button likeButton = (Button) view.findViewById(R.id.homescreen_listview_artical_item_like_button);
            if (likeButton != null)
            {
                likeButton.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {

                    }
                });
            }

            Button dislikeButton = (Button) view.findViewById(R.id.homescreen_listview_artical_item_dislike_button);
            if (dislikeButton != null)
            {
                dislikeButton.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {

                    }
                });
            }

            Button commentButton = (Button) view.findViewById(R.id.homescreen_listview_artical_item_comment_button);
            if (commentButton != null)
            {
                commentButton.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {

                    }
                });
            }

            ImageView image = (ImageView) view.findViewById(R.id.homescreen_listview_artical_item_imageview);
            if (image != null)
            {
                image.setImageDrawable(article.getImage());
            }

            TextView title = (TextView) view.findViewById(R.id.homescreen_listview_artical_item_title);

            if (title != null)
            {
                title.setText(article.getTitle());
            }

            TextView text = (TextView) view.findViewById(R.id.homescreen_listview_artical_item_text);

            if (text != null)
            {
                text.setText(article.getText());
            }

            TextView views = (TextView) view.findViewById(R.id.homescreen_listview_artical_item_views);

            if (views != null)
            {
                views.setText(article.getViews() + " views");
            }
        }

        return view;
    }

}
