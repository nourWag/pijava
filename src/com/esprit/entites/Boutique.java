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
    private String Fax;
    private String numero_telephone;
    private String Email;
    private String promotion;
    private String Description;
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

    public Boutique(int id, String nom, String categorie, String Fax, String numero_telephone, String Email, String promotion, String Description) {
        this.id = id;
        this.nom = nom;
        this.categorie = categorie;
        this.Fax = Fax;
        this.numero_telephone = numero_telephone;
        this.Email = Email;
        this.promotion = promotion;
        this.Description = Description;
    }

 
public Boutique(String nom, String categorie, String Fax, String numero_telephone, String Email, String promotion) {
        this.nom = nom;
        this.categorie = categorie;
        this.Fax = Fax;
        this.numero_telephone = numero_telephone;
        this.Email = Email;
        this.promotion = promotion;
    }
    @Override
    public String toString() {
        return "Boutique{" + "id=" + id + ", nom=" + nom + ", categorie=" + categorie + ", Fax=" + Fax + ", numero_telephone=" + numero_telephone + ", Email=" + Email + ", promotion=" + promotion + '}';
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

    public String getFax() {
        return Fax;
    }

    public void setFax(String Fax) {
        this.Fax = Fax;
    }

    public String getNumero_telephone() {
        return numero_telephone;
    }

    public void setNumero_telephone(String numero_telephone) {
        this.numero_telephone = numero_telephone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPromotion() {
        return promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
  
    
}
