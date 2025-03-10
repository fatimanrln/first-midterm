package com.example.firstmidterm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FirstActivity extends AppCompatActivity {
    TextView tvHobby;
    Button btnNext, btnInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        tvHobby = findViewById(R.id.tvHobby);
        btnNext = findViewById(R.id.btnNext);
        btnInfo = findViewById(R.id.btnInfo);

        tvHobby.setText("Я люблю танцевать");

        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
            startActivity(intent);
        });

        btnInfo.setOnClickListener(v -> tvHobby.setText("Это мое любимое хобби!"));
    }
}
