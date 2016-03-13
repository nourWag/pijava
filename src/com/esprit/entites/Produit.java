/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.entites;

/**
 *
 * @author nour
 */
public class Produit {
    private int id; //
    private String description;//
    private String reference;//
    private String designation;
    private String taille;
    private boolean etat;
    private float prixdachat;
    private String marque;
    private float prixvente;
    private int note;
    private int NbreV=0;
    private String disponible;
    private String couleur;//
    private String img;
    private int quantit;

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getQuantit() {
        return quantit;
    }

    public void setQuantit(int quantit) {
        this.quantit = quantit;
    }

    public Produit(String description, String reference, String designation, String taille, boolean etat, float prixdachat, String marque, float prixvente, String disponible, String couleur, String size, String $img) {
        
        this.description = description;
        this.reference = reference;
        this.designation = designation;
        this.taille = taille;
        this.etat = etat;
        this.prixdachat = prixdachat;
        this.marque = marque;
        this.prixvente = prixvente;
        this.disponible = disponible;
        this.couleur = couleur;
        
        this.img = $img;
    }

    public Produit() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getTaille() {
        return taille;
    }

    public void setTaille(String taille) {
        this.taille = taille;
    }

    public boolean isEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }

    public float getPrixdachat() {
        return prixdachat;
    }

    public void setPrixdachat(float prixdachat) {
        this.prixdachat = prixdachat;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public float getPrixvente() {
        return prixvente;
    }

    public void setPrixvente(float prixvente) {
        this.prixvente = prixvente;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public int getNbreV() {
        return NbreV;
    }

    public void setNbreV(int NbreV) {
        this.NbreV = NbreV;
    }

    public String getDisponible() {
        return disponible;
    }

    public void setDisponible(String disponible) {
        this.disponible = disponible;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    

    public String getimg() {
        return img;
    }

    public void setimg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Produit{" + "id=" + id + ", description=" + description + ", reference=" + reference + ", designation=" + designation + ", taille=" + taille + ", etat=" + etat + ", prixdachat=" + prixdachat + ", marque=" + marque + ", prixvente=" + prixvente + ", note=" + note + ", NbreV=" + NbreV + ", disponible=" + disponible + ", couleur=" + couleur +", img=" + img + '}';
    }
    
    
}
