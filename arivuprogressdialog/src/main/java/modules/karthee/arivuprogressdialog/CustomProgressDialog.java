package modules.karthee.arivuprogressdialog;

import android.content.Context;
import android.widget.ProgressBar;

/**
 * Created by Karthee on 25/01/16.
 */
public class CustomProgressDialog extends android.app.ProgressDialog {


    public CustomProgressDialog(Context context, String message) {
        super(context);
        setMessage(message);


        setIndeterminate(false);
        // pDialog.setMax(100);
        setProgressStyle(android.app.ProgressDialog.STYLE_SPINNER);


        setCancelable(false);


        show();
    }

    public CustomProgressDialog(Context context, String message, int color) {
        super(context);
        setMessage(message);


        setIndeterminate(false);
        // pDialog.setMax(100);
        setProgressStyle(android.app.ProgressDialog.STYLE_SPINNER);


        setCancelable(false);
        ProgressBar spinner = new ProgressBar(
                                                     context,
                                                     null,
                                                     android.R.attr.progressBarStyle);

        spinner.getIndeterminateDrawable().setColorFilter(context
                                                                  .getResources().getColor(color), android
                                                                                                           .graphics
                                                                                                           .PorterDuff.Mode.MULTIPLY);

        show();
    }
}
