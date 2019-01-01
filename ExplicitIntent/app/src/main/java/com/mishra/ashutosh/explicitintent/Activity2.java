package com.mishra.ashutosh.explicitintent;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView tvAct2;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        tvAct2 = findViewById(R.id.tvAct2);

        String name = getIntent().getStringExtra("Name");
        tvAct2.setText(name+ getString(R.string.welcomeText));
    }
}
