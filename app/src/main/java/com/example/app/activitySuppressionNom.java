package com.example.app;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class activitySuppressionNom extends AppCompatActivity {

    Button btnSupprimerNom, retourSupprimerNom;
    EditText txtNomSupprimer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suppression_nom);
        setTitle("Suppession Par Nom");

        btnSupprimerNom = findViewById(R.id.btnSupprimerNom);
        retourSupprimerNom = findViewById(R.id.retourSupprimerNom);
        txtNomSupprimer = findViewById(R.id.txtNomSupprimer);

        retourSupprimerNom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnSupprimerNom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg,nom;
                nom = txtNomSupprimer.getText().toString();
                if(!Groupe.checkC(nom,false)){
                    Toast.makeText(activitySuppressionNom.this, "veuiller saisir des valeurs valide !!", Toast.LENGTH_LONG).show();
                    return;
                }
                msg = Groupe.supprimerParNom(nom);
                Toast.makeText(activitySuppressionNom.this, msg, Toast.LENGTH_SHORT).show();
            }
        });
    }
}