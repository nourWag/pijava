/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.entites;

/**
 *
 * @author sawssen
 */
public class Panierproduit {
    private int idPr;
    private int idPan;
    private int quantite ;

    public Panierproduit() {
    }

    public Panierproduit(int idPr, int idPan,int quantite) {
        this.idPr = idPr;
        this.idPan = idPan;
        this.quantite = quantite;
    }

    

    public int getIdPr() {
        return idPr;
    }

    public void setIdPr(int idPr) {
        this.idPr = idPr;
    }

    public int getIdPan() {
        return idPan;
    }

    public void setIdPan(int idPan) {
        this.idPan = idPan;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    
}
