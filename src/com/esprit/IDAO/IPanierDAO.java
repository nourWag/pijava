/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.IDAO;

import java.util.List;
import com.esprit.entites.M_Produit;
import com.esprit.entites.Panier;

/**
 *
 * @author sawssen
 */
public interface IPanierDAO {
    public void add(int idPanier,int idProduit,int qte);
   public void delete(int idSelected,int idPanier);
//    public Panier getPanier(int id);
    public List <M_Produit> getAll(int id);
    public void savePrPanier(int idPanier,int idProduit,int quantity);
    
}
