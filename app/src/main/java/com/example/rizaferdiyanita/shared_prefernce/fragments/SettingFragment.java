package com.example.rizaferdiyanita.shared_prefernce.fragments;

import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;

import com.example.rizaferdiyanita.shared_prefernce.R;

public class SettingFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle bundle, String s) {
        addPreferencesFromResource(R.xml.preference);
    }
}
