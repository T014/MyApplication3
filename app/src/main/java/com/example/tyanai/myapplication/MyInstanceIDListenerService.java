package com.example.tyanai.myapplication;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;

public class MyInstanceIDListenerService extends FirebaseMessagingService{

    private static final String TAG = MyInstanceIDListenerService.class.getSimpleName();

    @Override
    public void onNewToken(String s) {
        super.onNewToken(s);
        Log.d("NEW_TOKEN",s);
    }
}