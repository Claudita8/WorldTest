package com.example.worldtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import java.util.Objects;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.red)));

        Button startFranceTestButton = findViewById(R.id.franceTestButton);
        startFranceTestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FranceActivity.class);
                startActivity(intent);
            }
        });


        Button startItalyTestButton = findViewById(R.id.italyTestButton);
        startItalyTestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ItalyActivity.class);
                startActivity(intent);
            }
        });

        Button startRomaniaTestButton = findViewById(R.id.romaniaTestButton);
        startRomaniaTestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RomaniaActivity.class);
                startActivity(intent);
            }
        });
    }
}