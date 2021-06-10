package com.example.gitemptyactivitytemplatesettingsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceFragmentCompat.OnPreferenceStartFragmentCallback;
import androidx.preference.Preference;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements PreferenceFragmentCompat.OnPreferenceStartFragmentCallback{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.settingsFragmentContainerView,new SettingsFragment())
                .commit();
    }

    @Override
    public boolean onPreferenceStartFragment(PreferenceFragmentCompat caller, Preference pref){
        final Bundle args = pref.getExtras();
        final Fragment fragment = getSupportFragmentManager().getFragmentFactory().instantiate(
          getClassLoader(),
          pref.getFragment()
        );
        fragment.setArguments(args);
        fragment.setTargetFragment(caller,0);

        getSupportFragmentManager().beginTransaction().replace(R.id.settingsFragmentContainerView,fragment)
                .addToBackStack(null)
                .commit();
        return true;
    }
}