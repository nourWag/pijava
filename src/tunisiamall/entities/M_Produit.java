/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunisiamall.entities;

/**
 *
 * @author sawssen
 */
public class M_Produit {
    private int id;
    private String reference;
    //private String marque;
    private int quantite_com;
    private float prix;
    private float prixTotal;
    private String img;

    public void setImg(String img) {
        this.img = img;
    }

    public String getImg() {
        return img;
    }

    public M_Produit() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public float getPrixTotal() {
        return prixTotal;
    }

    public int getQuantite_com() {
        return quantite_com;
    }

    public void setQuantite_com(int quantite_com) {
        this.quantite_com = quantite_com;
        this.prixTotal=quantite_com*this.prix; 
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public M_Produit(int id, String reference, int quantite_com, float prix,String img) {
        this.id = id;
        this.reference = reference;
        this.quantite_com = quantite_com;
        this.prix = prix;
        this.prixTotal=this.prix;
        this.img=img;
        
    }

    public void setPrixTotal(float prixTotal) {
        this.prixTotal = prixTotal;
    }
    

    @Override
    public String toString() {
        return "{id= "+id+" reference= "+reference+" prix = "+prix +"prix total"+prixTotal+"}";
    }
    
}
