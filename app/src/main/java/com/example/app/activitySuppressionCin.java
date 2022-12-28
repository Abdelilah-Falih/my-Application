package com.example.app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class activitySuppressionCin extends AppCompatActivity {

    Button btnSupprimerCin,retourSupprimerCin;
    EditText txtCinSupprimer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suppression_cin);
        setTitle("Suppession Par Cin");

        btnSupprimerCin = findViewById(R.id.btnSupprimerCin);
        retourSupprimerCin = findViewById(R.id.retourSupprimerCin);
        txtCinSupprimer = findViewById(R.id.txtCinSupprimer);

        retourSupprimerCin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnSupprimerCin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg,cin;
                cin = txtCinSupprimer.getText().toString();
                if(!Groupe.checkC(cin,true)){
                    Toast.makeText(activitySuppressionCin.this, "veuiller saisir des valeurs valide !!", Toast.LENGTH_LONG).show();
                    return;
                }
                msg = Groupe.supprimerParCin(cin);
                Toast.makeText(activitySuppressionCin.this, msg, Toast.LENGTH_SHORT).show();
            }
        });
    }
}