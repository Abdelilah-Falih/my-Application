package com.example.app;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Groupe {
    static  private TreeMap<String ,String> personnes = new TreeMap<>();
    //public Groupe(){};

    static public String ajouter(String cin,String nom){
        if(personnes.containsKey(cin.toUpperCase())) return "Ce CIN est Déjà dans La liste !! ";
        personnes.put(cin.toUpperCase(),nom.toUpperCase());
        return "Personne Bien Ajouter !";
    }

    static public String rechercheParCin(String cin){
        if(personnes.containsKey(cin.toUpperCase())){
            return String.format("CIN : %s|Nom : %s ",cin,personnes.get(cin.toUpperCase()));
        }
        return String.format("auccun Personne sous cin: %s",cin);
    }

    static public String rechercheParNom(String nom){
        StringBuilder pr= new StringBuilder();
        if(personnes.containsValue(nom.toUpperCase())){
            for (Map.Entry<String,String> personne:personnes.entrySet()) {
                if(personne.getValue().equals(nom.toUpperCase())) pr.append(String.format("CIN : %s|Nom : %s \n", personne.getKey(), personne.getValue()));
            }
        }else pr.append(String.format("auccun Personne sous nom : %s",nom));
        return pr.toString();
    }
    static public void afficher(){
        for (Map.Entry<String,String> personne:personnes.entrySet()) {
            System.out.println((String.format("CIN : %s|Nom : %s \n", personne.getKey(), personne.getValue())));
        }
    }
    static public boolean check(String cin){
        return personnes.containsKey(cin.toUpperCase());
    }
    static public boolean check(){
        return personnes.size()==0;
    }
    static public void modifierParCin(String cin,String nom){
        personnes.put(cin.toUpperCase(), nom.toUpperCase());
    }
    static public String supprimerParCin(String cin){
        if (personnes.containsKey(cin.toUpperCase())){
            personnes.remove(cin.toUpperCase());
            return "Bien Supprimer !";
        }
        return String.format("auccun personne sous CIN: %s pour Supprimer !!",cin);
    }
    static public String supprimerParNom(String nom){
        int c=0;
        if(personnes.containsValue(nom.toUpperCase())){
            TreeMap<String ,String> toDel= new TreeMap<>(personnes);
            for (Map.Entry<String,String> personne:toDel.entrySet()) {
                if(personne.getValue().equals(nom.toUpperCase())){
                    supprimerParCin(personne.getKey());
                    c++;
                }
            }
            return "bien Supprimer ("+c+" Personnes)";
        }
        return String.format("auccun personne sous Nom: %s pour Supprimer !!",nom);
    }
    static public String afficherCroissante(){
        StringBuffer liste = new StringBuffer();
        for (Map.Entry<String , String> personne: personnes.entrySet()) {
            liste.append(String.format("CIN : %s|Nom : %s \n", personne.getKey(), personne.getValue()));
        }
        return liste.toString();
    }
    static public String afficherDecroissante(){
        StringBuffer liste = new StringBuffer();
        TreeMap<String , String> copy = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });
        copy.putAll(personnes);
        for (Map.Entry<String , String> personne: copy.entrySet()) {
            liste.append(String.format("CIN : %s|Nom : %s \n", personne.getKey(), personne.getValue()));
        }
        return liste.toString();
    }


}
