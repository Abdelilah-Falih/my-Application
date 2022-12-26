package com.example.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class activity02 extends AppCompatActivity {

    Button btnAjouter,rechercheCin,rechercheNom,modificationCin,suppressionCin,suppressionNom,afficherCinCroissant,afficherCinDecroissant,btnRetour;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_02);
        btnAjouter = findViewById(R.id.btnAjouter);
        rechercheNom = findViewById(R.id.rechercheNom);
        rechercheCin = findViewById(R.id.rechercheCin);
        btnRetour = findViewById(R.id.btnRetour);
        modificationCin = findViewById(R.id.modificationCin);
        suppressionCin = findViewById(R.id.suppressionCin);
        suppressionNom = findViewById(R.id.suppressionNom);
        afficherCinCroissant = findViewById(R.id.afficherCinCroissant);
        afficherCinDecroissant = findViewById(R.id.afficherCinDecroissant);
        btnRetour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btnAjouter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity02.this,activityAjouter.class);
                startActivity(intent);
            }
        });
        rechercheCin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Groupe.check()){
                    Toast.makeText(activity02.this, "auccun Personne dans La liste ! ", Toast.LENGTH_LONG).show();
                    return;
                }
                Intent intent = new Intent(activity02.this,activityRechercheCin.class);
                startActivity(intent);
            }
        });
        rechercheNom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Groupe.check()){
                    Toast.makeText(activity02.this, "auccun Personne dans La liste ! ", Toast.LENGTH_LONG).show();
                    return;
                }
                Intent intent2 = new Intent(activity02.this, recherchParNom.class);
                startActivity(intent2);
            }
        });
        modificationCin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Groupe.check()){
                    Toast.makeText(activity02.this, "auccun Personne dans La liste ! ", Toast.LENGTH_LONG).show();
                    return;
                }
                Intent intent = new Intent(activity02.this,activityModifiation.class);
                startActivity(intent);
            }
        });
        suppressionCin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Groupe.check()){
                    Toast.makeText(activity02.this, "auccun Personne dans La liste ! ", Toast.LENGTH_LONG).show();
                    return;
                }
                Intent intent = new Intent(activity02.this,activitySuppressionCin.class);
                startActivity(intent);
            }
        });
        suppressionNom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Groupe.check()){
                    Toast.makeText(activity02.this, "auccun Personne dans La liste ! ", Toast.LENGTH_LONG).show();
                    return;
                }
                Intent intent = new Intent(activity02.this,activitySuppressionNom.class);
                startActivity(intent);
            }
        });
        afficherCinCroissant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Groupe.check()){
                    Toast.makeText(activity02.this, "auccun Personne dans La liste ! ", Toast.LENGTH_LONG).show();
                    return;
                }
                Intent intent = new Intent(activity02.this,activityAfficherCroissante.class);
                startActivity(intent);
            }
        });
        afficherCinDecroissant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Groupe.check()){
                    Toast.makeText(activity02.this, "auccun Personne dans La liste ! ", Toast.LENGTH_LONG).show();
                    return;
                }
                Intent intent = new Intent(activity02.this,activityAfficherDecroissante.class);
                startActivity(intent);
            }
        });



    }
}