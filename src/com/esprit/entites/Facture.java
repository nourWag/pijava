/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.entites;

import java.util.List;
import java.util.Vector;

/**
 *
 * @author sawssen
 */
public class Facture {
    private int id;
    private int num_sequentiel;
    private String date_creation;
 List<LigneFacture> listLigneF=new Vector<>();

    public Facture() {
    }

    public Facture(int num_sequentiel, String date_creation) {
        this.num_sequentiel = num_sequentiel;
        this.date_creation = date_creation;
    }

    public List<LigneFacture> getListLigneF() {
        return listLigneF;
    }

    public void setListLigneF(List<LigneFacture> listLigneF) {
        this.listLigneF = listLigneF;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNum_sequentiel() {
        return num_sequentiel;
    }

    public void setNum_sequentiel(int num_sequentiel) {
        this.num_sequentiel = num_sequentiel;
    }

    public String getDate_creation() {
        return date_creation;
    }

    public void setDate_creation(String date_creation) {
        this.date_creation = date_creation;
    }

    public Facture(int id, int num_sequentiel, String date_creation) {
        this.id = id;
        this.num_sequentiel = num_sequentiel;
        this.date_creation = date_creation;
    }
    
    
}
