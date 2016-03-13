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

    public int getQuantite_com() {
        return quantite_com;
    }

    public void setQuantite_com(int quantite_com) {
        this.quantite_com = quantite_com;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public M_Produit(int id, String reference, int quantite_com, float prix) {
        this.id = id;
        this.reference = reference;
        this.quantite_com = quantite_com;
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "{id= "+id+" reference= "+reference+" prix = "+prix +"}";
    }
    
}
