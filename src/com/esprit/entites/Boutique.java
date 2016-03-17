/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.entites;

/**
 *
 * @author hp
 */
public class Boutique {
  private int id;
 private  String nom ;
  private String categorie;

    public Boutique() {
    }

    public Boutique(int id, String nom, String categorie) {
        this.id = id;
        this.nom = nom;
        this.categorie = categorie;
    }

    public Boutique(int id) {
        this.id = id;
    }

    public Boutique(String nom, String categorie) {
        this.nom = nom;
        this.categorie = categorie;
    }

    @Override
    public String toString() {
        return "Boutique{" + "id=" + id + ", nom=" + nom + ", categorie=" + categorie + '}';
    }
  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }
  
    
}
