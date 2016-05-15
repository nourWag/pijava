
package com.esprit.entites;

import java.sql.Date;

/**
 *
 * @author nour
 */
public class Produit {
    private int id; //
    private String description;//
    private String reference;//
    private String designation;
    private String size; 
    private float prixdachat;
    private String marque;
    private float prixvente;
    private int note;
    private int NbreV=0;
    private String disponible;
    private String couleur;//
    private String 	imageName;
    private int quantite;
    private int boutique_id;
     private Date updatedAt ;
     private String categories;
     private float prixancien;
     private String 	solde;
     private String 	year;

    public Produit(int id, String description, String reference, String designation, String size, float prixdachat, String marque, float prixvente, int note, String disponible, String couleur, String imageName, int quantite, int boutique_id, Date updatedAt, String categories, float prixancien, String solde, String year) {
        this.id = id;
        this.description = description;
        this.reference = reference;
        this.designation = designation;
        this.size = size;
        this.prixdachat = prixdachat;
        this.marque = marque;
        this.prixvente = prixvente;
        this.note = note;
        this.disponible = disponible;
        this.couleur = couleur;
        this.imageName = imageName;
        this.quantite = quantite;
        this.boutique_id = boutique_id;
        this.updatedAt = updatedAt;
        this.categories = categories;
        this.prixancien = prixancien;
        this.solde = solde;
        this.year = year;
    }

   public  Produit(int id,String designation, String categorie, String couleur, String reference, int note , String solde, String size){
   this.id = id;
        this.categories=categorie;
        this.reference = reference;
        this.designation = designation;
        this.size = size;
        
        this.note = note;
        
        this.couleur = couleur;
       
        this.solde = solde;
      
   }
       

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public int getBoutique_id() {
        return boutique_id;
    }

    public void setBoutique_id(int boutique_id) {
        this.boutique_id = boutique_id;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public float getPrixancien() {
        return prixancien;
    }

    public void setPrixancien(float prixancien) {
        this.prixancien = prixancien;
    }

    public String getSolde() {
        return solde;
    }

    public void setSolde(String solde) {
        this.solde = solde;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
     

    public String getCategories1() {
        return categories;
    }

    public void setCategories1(String categories1) {
        this.categories = categories1;
    }
    

    public int getBoutique() {
        return boutique_id;
    }

    public void setBoutique(int Boutique) {
        this.boutique_id = Boutique;
    }
    

    public String getImg() {
        return imageName;
    }

    public void setImg(String img) {
        this.imageName = img;
    }

    public int getQuantit() {
        return quantite;
    }

    public void setQuantit(int quantit) {
        this.quantite = quantit;
    }

    public Produit(String description, String reference, String designation, String taille, String etat, float prixdachat, String marque, float prixvente, String disponible, String couleur, String size, String $img) {
        
        this.description = description;
        this.reference = reference;
        this.designation = designation;
        this.size = taille;
        this.disponible = etat;
        this.prixdachat = prixdachat;
        this.marque = marque;
        this.prixvente = prixvente;
        this.disponible = disponible;
        this.couleur = couleur;
        
        this.imageName = $img;
    }

    public Produit(int id, String description, String reference, String designation, String taille, String etat, float prixdachat, String marque, float prixvente, int note, String disponible, String couleur, String img, int quantit, int Boutique, String categories1) {
        this.id = id;
        this.description = description;
        this.reference = reference;
        this.designation = designation;
        this.size = taille;
        this.disponible = etat;
        this.prixdachat = prixdachat;
        this.marque = marque;
        this.prixvente = prixvente;
        this.note = note;
        this.disponible = disponible;
        this.couleur = couleur;
        this.imageName = img;
        this.quantite = quantit;
        this.boutique_id = Boutique;
        this.categories = categories1;
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
        return size;
    }

    public void setTaille(String taille) {
        this.size = taille;
    }

    public String isEtat() {
        return disponible;
    }

    public void setEtat(String etat) {
        this.disponible = etat;
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
        return imageName;
    }

    public void setimg(String img) {
        this.imageName = img;
    }

    @Override
    public String toString() {
        return "Produit{" + "id=" + id + ", description=" + description + ", reference=" + reference + ", designation=" + designation + ", taille=" + size + ", etat=" + disponible + ", prixdachat=" + prixdachat + ", marque=" + marque + ", prixvente=" + prixvente + ", note=" + note + ", NbreV=" + NbreV + ", disponible=" + disponible + ", couleur=" + couleur +", img=" + imageName + '}';
    }
    
    
}

