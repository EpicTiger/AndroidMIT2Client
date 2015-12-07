package Entities;

import android.graphics.drawable.Drawable;

/**
 * Created by Rainer on 5-12-2015.
 */
public class Article {

    private String Title;
    private String Text;
    private Drawable Image;
    private int Views;

    public int getViews() {
        return Views;
    }

    public void setViews(int views) {
        Views = views;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public Drawable getImage() {
        return Image;
    }

    public void setImage(Drawable image) {
        Image = image;
    }


}
