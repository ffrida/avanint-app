package com.lth.fridagunnarsson.helloapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class Hello extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
    }

    public void sendToAcc(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, AccActivity.class);
        //EditText editText1 = (EditText) findViewById(R.id.editText1);
        //String message = editText1.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void sendToCompass(View view) {
        Intent intent = new Intent(this, CompassActivity.class);
        //EditText editText2 = (EditText) findViewById(R.id.editText2);
        //String message = editText2.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }
}
