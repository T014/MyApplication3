package com.example.tyanai.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.firebase.messaging.FirebaseMessaging;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("NEW_TOKEN","aaaaaaaaaaaaaa");

        //Push通知の購読開始
        FirebaseMessaging.getInstance().subscribeToTopic("mytopic");

        //購読解除
        FirebaseMessaging.getInstance().unsubscribeFromTopic("mytopic");
    }
}
