package com.example.app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class activityModifiation extends AppCompatActivity {

    Button btnModifier,retourModification;
    EditText txtCinModification,txtNomModification;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modifiation);
        setTitle("Modification Par Cin");
        btnModifier = findViewById(R.id.btnModifier);
        retourModification = findViewById(R.id.retourModification);
        txtCinModification = findViewById(R.id.txtCinModification);
        txtNomModification = findViewById(R.id.txtNomModification);
        retourModification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });
        btnModifier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg,cin,nom;
                cin = txtCinModification.getText().toString();
                nom = txtNomModification.getText().toString();
                if(!Groupe.checkC(nom,false)||!Groupe.checkC(cin,true)){
                    Toast.makeText(activityModifiation.this, "veuiller saisir des valeurs valide !!", Toast.LENGTH_LONG).show();
                    return;
                }
                if(Groupe.check(cin)){
                    Groupe.modifierParCin(cin,nom);
                    msg = "Bien Modiffier !";
                }else msg=String.format("auccun Personne sous le cin : %s",cin);
                Toast.makeText(activityModifiation.this,msg, Toast.LENGTH_LONG).show();
            }
        });

    }
}