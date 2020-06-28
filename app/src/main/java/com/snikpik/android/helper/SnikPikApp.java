package com.snikpik.android.helper;

import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;

public class SnikPikApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);

    }
}