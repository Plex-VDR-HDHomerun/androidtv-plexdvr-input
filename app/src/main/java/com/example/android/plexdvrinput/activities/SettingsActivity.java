package com.example.android.plexdvrinput.activities;

import android.app.Activity;
import android.os.Bundle;

import com.example.android.plexdvrinput.R;

/**
 * Created by Nick on 1/9/2017.
 * An activity that provides settings for users to modify.
 */
public class SettingsActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_fragment);
    }
}
