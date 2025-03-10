package com.example.firstmidterm;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    TextView tvMoreInfo;
    Button btnBack, btnChangeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvMoreInfo = findViewById(R.id.tvMoreInfo);
        btnBack = findViewById(R.id.btnBack);
        btnChangeText = findViewById(R.id.btnChangeText);

        tvMoreInfo.setText("Танцы помогают мне расслабиться.");

        btnBack.setOnClickListener(v -> finish());

        btnChangeText.setOnClickListener(v -> tvMoreInfo.setText("Это делает меня счастливым!"));
    }
}
