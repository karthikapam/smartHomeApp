package com.example.smarthomeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

public class Devices extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devices);

        Switch switch1 = findViewById(R.id.s1);
        switch1.setChecked(true);

        switch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toggle the state of the switch
                switch1.setChecked(switch1.isChecked());
            }
        });
        Switch switch2 = findViewById(R.id.s2);
        switch2.setChecked(true);

        switch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toggle the state of the switch
                switch2.setChecked(switch2.isChecked());
            }
        });
        Switch switch7 = findViewById(R.id.s7);
        switch7.setChecked(true);

        switch7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toggle the state of the switch
                switch7.setChecked(switch7.isChecked());
            }
        });

        Switch switch11 = findViewById(R.id.s11);
        switch7.setChecked(true);

        switch11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toggle the state of the switch
                switch11.setChecked(switch11.isChecked());
            }
        });

        Switch switch12 = findViewById(R.id.s12);
        switch12.setChecked(true);

        switch12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toggle the state of the switch
                switch12.setChecked(switch12.isChecked());
            }
        });

    }


}