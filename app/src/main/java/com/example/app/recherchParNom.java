package com.example.app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class recherchParNom extends AppCompatActivity {
    Button btnRechercheNom, retourChNom;
    TextView txtAfficherParNom;
    EditText txtNomRecherche;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recherch_par_nom);
        setTitle("Rechercher Par Nom");
        retourChNom = findViewById(R.id.retourChNom);
        btnRechercheNom = findViewById(R.id.btnRechercheNom);
        txtAfficherParNom = findViewById(R.id.txtAfficherParNom);
        txtNomRecherche = findViewById(R.id.txtNomRecherche);

        retourChNom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btnRechercheNom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nom = txtNomRecherche.getText().toString(),message;
                message = Groupe.rechercheParNom(nom);
                txtAfficherParNom.setText(message);
                //Groupe.afficher();
            }
        });

    }
}