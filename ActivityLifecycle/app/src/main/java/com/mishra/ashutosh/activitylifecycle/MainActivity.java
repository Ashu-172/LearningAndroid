package com.mishra.ashutosh.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Life cycle Event: ","In OnCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Life cycle Event: ","In OnStart");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Life cycle Event: ","In OnRestart");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Life cycle Event: ","In OnDestroy");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Life cycle Event: ","In OnStop");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Life cycle Event: ","In OnPause");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Life cycle Event: ","In OnResume");

    }
}
