package com.example.app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class activityAjouter extends AppCompatActivity {

    Button ajouter,retourAJ;
    EditText txtCin,txtNom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajouter);
        setTitle("Ajouter");
        retourAJ = findViewById(R.id.retourAJ);
        retourAJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        ajouter = findViewById(R.id.ajouter);
        ajouter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cin,nom,message;
                txtCin = findViewById(R.id.txtCin);
                txtNom = findViewById(R.id.txtNom);
                cin = txtCin.getText().toString();
                nom = txtNom.getText().toString();
                if(!Groupe.checkC(nom,false)||!Groupe.checkC(cin,true)){
                    Toast.makeText(activityAjouter.this, "veuiller saisir des valeurs valide !!", Toast.LENGTH_LONG).show();
                    return;
                }
                message = Groupe.ajouter(cin,nom);
                Toast.makeText(activityAjouter.this, message, Toast.LENGTH_LONG).show();
            }
        });
    }
}