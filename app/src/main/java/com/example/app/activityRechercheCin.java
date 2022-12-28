package com.example.app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class activityRechercheCin extends AppCompatActivity {
    Button btnRechercheCin,retourChCin;
    TextView txtAfficher;
    EditText txtCinRecherche;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recherche_cin);
        setTitle("Rechercher Par CIN");
        retourChCin = findViewById(R.id.retourChCin);
        btnRechercheCin = findViewById(R.id.btnRechercheCin);
        txtAfficher = findViewById(R.id.txtAfficher);
        txtCinRecherche = findViewById(R.id.txtCinRecherche);
        retourChCin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btnRechercheCin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cin = txtCinRecherche.getText().toString(),message;
                if(!Groupe.checkC(cin,true)){
                    Toast.makeText(activityRechercheCin.this, "veuiller saisir des valeurs valide !!", Toast.LENGTH_LONG).show();
                    return;
                }
                message = Groupe.rechercheParCin(cin);
                txtAfficher.setText(message);
                //Groupe.afficher();
            }
        });
    }
}