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
public class Produit {
    private int id;
    private String reference;
    private float prix;

    public Produit(int id, String reference, float prix) {
        this.id = id;
        this.reference = reference;
        this.prix = prix;
    }

    public Produit() {
    }

    public Produit(int id, String reference) {
        this.id = id;
        this.reference = reference;
    }

    public float getPrix() {
        return prix;
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

    public void setPrix(float prix) {
        this.prix = prix;
    }
    
    
}
