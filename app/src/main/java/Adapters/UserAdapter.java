package Adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.rainer.mit2client.ProfileFragment;
import com.example.rainer.mit2client.R;

import java.util.List;

import Entities.User;
import Util.AppSettings;

public class UserAdapter extends ArrayAdapter<User>
{
    private final Context context;
    private List<User> objects;

    public UserAdapter(Context context, int resource, List<User> objects)
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
            v = vi.inflate(R.layout.content_users_screen_list_item, null);
        }

        User user = getItem(position);

        if (user != null)
        {

            android.support.v7.widget.CardView card = (android.support.v7.widget.CardView) v.findViewById(R.id.usersscreen_listview_item_card);
            if (card != null)
            {
                card.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        AppSettings.UserArrayPosition = position;

                        ((Activity) context)
                                .getFragmentManager().beginTransaction().replace(R.id.fragmentParentViewGroup, new ProfileFragment(), String.valueOf(R.string.nav_drawer_fragment_profile))
                                .addToBackStack(String.valueOf(R.string.nav_drawer_fragment_profile)).commit();
                    }
                });
            }

            TextView name = (TextView) v.findViewById(R.id.usersscreen_listview_user_item_name);

            if (name != null)
            {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(user.getFirstname());
                stringBuilder.append(" ");
                if (user.getLastnameprefix() != "" && user.getLastnameprefix() != "null")
                {
                    stringBuilder.append(user.getLastnameprefix());
                    stringBuilder.append(" ");
                }
                stringBuilder.append(user.getLastname());

                name.setText(stringBuilder.toString());
            }
        }

        return v;
    }

}
