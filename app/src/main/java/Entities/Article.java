package Entities;

/**
 * Created by Rainer on 5-12-2015.
 */
public class Article {

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

    private String Title;
    private String Text;

}
