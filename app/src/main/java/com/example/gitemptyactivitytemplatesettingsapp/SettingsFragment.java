package com.example.gitemptyactivitytemplatesettingsapp;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SettingsFragment extends PreferenceFragmentCompat{


    public SettingsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey){
        setPreferencesFromResource(R.xml.my_settings,rootKey);

    }

}