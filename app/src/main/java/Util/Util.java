package Util;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.Toast;

public final class Util
{
    public static void ShowSnackbarShort(View view, String message)
    {
        Snackbar.make(view, message, Snackbar.LENGTH_SHORT).show();
    }

    public static void ShowSnackbarLong(View view, String message)
    {
        Snackbar.make(view, message, Snackbar.LENGTH_LONG).show();
    }

    public static void ShowToastShort(Context context, String message)
    {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public static void ShowToastLong(Context context, String message)
    {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}
