package com.eterces;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.eterces.etstoast.R;

public class EtsToast {

    private static Context context;

    // Initialize the EtsTost library with the application context
    public static void init(Context appContext) {
        context = appContext;
    }

    public static void showCustomToast(String message, int iconResId) {
        showToast(message, iconResId);
    }

    private static void showToast(String message, int iconResId) {
        if (context == null) {
            throw new IllegalStateException("EtsTost library is not initialized. Call EtsTost.init(context) in your application.");
        }

        LayoutInflater inflater = LayoutInflater.from(context);
        View layout = inflater.inflate(R.layout.custom_toast, null);

        ImageView icon = layout.findViewById(R.id.toast_icon);
        icon.setImageResource(iconResId);

        TextView text = layout.findViewById(R.id.toast_text);
        text.setText(message);

        Toast toast = new Toast(context);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }

}
