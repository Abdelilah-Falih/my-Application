package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activityAfficherDecroissante extends AppCompatActivity {

    Button retourAfficherDecroissante;
    TextView txtAfficherDecroissante;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afficher_decroissante);
        setTitle("Affichege Decroissante");
        retourAfficherDecroissante =findViewById(R.id.retourAfficherDecroissante);
        txtAfficherDecroissante =findViewById(R.id.txtAfficherDecroissante);
        retourAfficherDecroissante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        txtAfficherDecroissante.setText(Groupe.afficherDecroissante());

    }
}