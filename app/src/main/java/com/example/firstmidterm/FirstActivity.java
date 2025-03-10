package com.example.firstmidterm;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class FirstActivity extends AppCompatActivity {
    Button btnDance, btnReading, btnBaking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        btnDance = findViewById(R.id.btnDance);
        btnReading = findViewById(R.id.btnReading);
        btnBaking = findViewById(R.id.btnBaking);

        btnDance.setOnClickListener(v -> {
            Intent intent = new Intent(FirstActivity.this, DanceActivity.class);
            startActivity(intent);
        });

        btnReading.setOnClickListener(v -> {
            Intent intent = new Intent(FirstActivity.this, ReadingActivity.class);
            startActivity(intent);
        });

        btnBaking.setOnClickListener(v -> {
            Intent intent = new Intent(FirstActivity.this, BakingActivity.class);
            startActivity(intent);
        });
    }
}
