package Entities;

import android.graphics.drawable.Drawable;

// <Author> Rainer Schmitt </Author>
// <StudentNo> 1235656 </StudentNo>
// <Copyright> Copyright (c) All Right Reserved <Copyright>

public class Article
{
    private long Id;
    private String Title;
    private String Text;
    private Drawable Image;
    private int Views;

    public int getViews()
    {
        return Views;
    }

    public void setViews(int views)
    {
        Views = views;
    }

    public String getTitle()
    {
        return Title;
    }

    public void setTitle(String title)
    {
        Title = title;
    }

    public String getText()
    {
        return Text;
    }

    public void setText(String text)
    {
        Text = text;
    }

    public Drawable getImage()
    {
        return Image;
    }

    public void setImage(Drawable image)
    {
        Image = image;
    }

    public long getId()
    {
        return Id;
    }

    public void setId(long id)
    {
        Id = id;
    }
}
