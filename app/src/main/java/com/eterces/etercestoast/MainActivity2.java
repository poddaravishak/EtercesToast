package com.eterces.etercestoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.eterces.EtsToast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        // Initialize the EtsToast library with the application context
        EtsToast.init(getApplicationContext());
    }

    public void showCustomToast(View view) {

        int customImageResource = R.drawable.ic_launcher_background;
        String customMessage = "Your custom message";
        EtsToast.showCustomToast(customMessage, customImageResource);
    }
}