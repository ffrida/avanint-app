package com.lth.fridagunnarsson.helloapp;

import android.content.DialogInterface;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

import static android.util.Half.EPSILON;


public class AccActivity extends AppCompatActivity implements SensorEventListener {

    private SensorManager mSensorManager;
    //private final Sensor mAccelerometer;
    TextView acc_text_x;
    TextView acc_text_y;
    TextView acc_text_z;
    boolean haveSensor = false, haveSensor2 = false;
    private Sensor mRotationV, mAccelerometer, mMagnetometer;
    private static final float NS2S = 1.0f / 1000000000.0f;
    private float[] deltaRotationVector = new float[4];
    private float timestamp;
    static final float ALPHA = 0.25f;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acc);
        mSensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);
        mAccelerometer = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        acc_text_x = findViewById(R.id.txt_X);
        acc_text_y = findViewById(R.id.txt_Y);
        acc_text_z = findViewById(R.id.txt_Z);
        //start();
    }



    protected void onResume() {
        super.onResume();
        mSensorManager.registerListener(this, mAccelerometer, SensorManager.SENSOR_DELAY_NORMAL);
    }

    protected void onPause() {
        super.onPause();
        mSensorManager.unregisterListener(this);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }

    @Override
    public void onSensorChanged(SensorEvent event) {

        //float axisX = event.values[0];
        //float axisY = event.values[1];
        //float axisZ = event.values[2];

        DecimalFormat df = new DecimalFormat("0.0000");


        acc_text_x.setText("X: " + df.format(event.values[0]));
        acc_text_y.setText("Y: " + df.format(event.values[1]));
        acc_text_z.setText("Z: " + df.format(event.values[2]));
    }





}

