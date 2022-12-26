package com.example.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class activity01 extends AppCompatActivity {
    Button btnSuivante,btnQuitter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_01);

        setTitle("Bien Venu");
        btnQuitter = findViewById(R.id.btnQuitter);
        btnQuitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
               //throw new RuntimeException();
            }
        });
        btnSuivante = findViewById(R.id.btnSuivante);
        btnSuivante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity01.this,activity02.class);
                startActivity(intent);
            }
        });
    }
}