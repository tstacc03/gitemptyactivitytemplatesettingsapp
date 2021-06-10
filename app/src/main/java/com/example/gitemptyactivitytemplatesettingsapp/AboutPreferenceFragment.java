package com.example.gitemptyactivitytemplatesettingsapp;

import android.os.Bundle;
import androidx.preference.PreferenceFragmentCompat;


import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class AboutPreferenceFragment extends PreferenceFragmentCompat {

    public AboutPreferenceFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        // Inflate the layout for this fragment
        setPreferencesFromResource(R.xml.preference_about,rootKey);
    }
}