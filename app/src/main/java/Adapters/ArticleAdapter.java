package Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.rainer.mit2client.R;

import java.util.List;

import Entities.Article;

/**
 * Created by Rainer on 5-12-2015.
 */
public class ArticleAdapter extends ArrayAdapter<Article> {


    public ArticleAdapter(Context context, int resource, List<Article> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (v == null) {

            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.content_home_screen_list_item, null);
        }

        Article article = getItem(position);

        if (article != null) {

            TextView title = (TextView) v.findViewById(R.id.homescreen_listview_artical_item_title);

            if (title != null) {
                title.setText(article.getTitle());
            }

            TextView text = (TextView) v.findViewById(R.id.homescreen_listview_artical_item_text);

            if (text != null) {
                text.setText(article.getText());
            }
        }

        return v;
    }

}
