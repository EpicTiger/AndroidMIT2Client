package Util;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.Toast;

// <Author> Rainer Schmitt </Author>
// <StudentNo> 1235656 </StudentNo>
// <Copyright> Copyright (c) All Right Reserved <Copyright>

public final class Util
{
    public static void ShowToastShort(Context context, String message)
    {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public static void ShowToastLong(Context context, String message)
    {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}
