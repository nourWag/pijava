/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.entites;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author sawssen
 */
public class Panier {
    private int id;
    private int idUser;
    List<M_Produit> listPr=new Vector<>();

    public Panier(int id) {
        this.id = id;
    }

    public Panier() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Panier(int id, int idUser) {
        this.id = id;
        this.idUser = idUser;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public List<M_Produit> getListPr() {
        return listPr;
    }

    public void setListPr(List<M_Produit> listPr) {
        this.listPr = listPr;
    }


  public void supprimer(int ids){  
    for (Iterator<M_Produit> iter = listPr.listIterator(); iter.hasNext(); )
    {
        M_Produit a = iter.next();
        if (a.getId()==ids) 
        {
            iter.remove();
        }
    }
  }


        
}
