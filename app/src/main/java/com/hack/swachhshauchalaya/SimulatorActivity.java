package com.hack.swachhshauchalaya;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.firebase.client.Firebase;

import java.util.HashMap;
import java.util.Map;

public class SimulatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simulator);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final Firebase myFirebaseRef = new Firebase("https://rbhack2016.firebaseio.com/simulator");
        Button button = (Button) findViewById(R.id.abnormal);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Map<String,Object> objectMap = new HashMap<String,Object>();
                objectMap.put("sensor","yes");
                myFirebaseRef.updateChildren(objectMap);
            }
        });
        Button buttonn = (Button) findViewById(R.id.normal);
        buttonn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Map<String,Object> objectMap = new HashMap<String,Object>();
                objectMap.put("sensor","no");
                myFirebaseRef.updateChildren(objectMap);
            }
        });
    }

}
