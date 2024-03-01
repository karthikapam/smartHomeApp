package com.example.smarthomeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView elecCard,devCard,securityCard,settingCard,asstCard,waterCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        elecCard = findViewById(R.id.elecCard);
        devCard=findViewById(R.id.devCard);
        securityCard = findViewById(R.id.securityCard);
        settingCard = findViewById(R.id.settingCard);
        asstCard = findViewById(R.id.asstCard);
        waterCard = findViewById(R.id.waterCard);




        elecCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Electricity.class);
                startActivity(intent);
            }
        });

        devCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Devices.class);
                startActivity(intent);
            }
        });
        securityCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Security.class);
                startActivity(intent);
            }
        });
        settingCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Setting.class);
                startActivity(intent);
            }
        });

        asstCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Assistant.class);
                startActivity(intent);
            }
        });
        waterCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Water.class);
                startActivity(intent);
            }
        });
    }
}