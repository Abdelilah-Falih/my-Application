package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activityAfficherCroissante extends AppCompatActivity {

    Button retourAfficherCroissante;
    TextView txtAfficherCroissante;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afficher_croissante);
        setTitle("Affichege Croissante");
        retourAfficherCroissante =findViewById(R.id.retourAfficherCroissante);
        txtAfficherCroissante =findViewById(R.id.txtAfficherCroissante);
        retourAfficherCroissante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        txtAfficherCroissante.setText(Groupe.afficherCroissante());

    }
}