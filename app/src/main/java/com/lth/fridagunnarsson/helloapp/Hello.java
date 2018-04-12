package com.lth.fridagunnarsson.helloapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class Hello extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
    }

    public void sendToAcc(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, AccActivity.class);
        startActivity(intent);
    }

    public void sendToCompass(View view) {
        Intent intent = new Intent(this, CompassActivity.class);
        startActivity(intent);

    }
}
