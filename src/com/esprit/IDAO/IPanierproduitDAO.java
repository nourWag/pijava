/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.IDAO;

import java.sql.ResultSet;
import com.esprit.entites.Panier;
import com.esprit.entites.Panierproduit;

/**
 *
 * @author sawssen
 */
public interface IPanierproduitDAO  {
    public void add(Panierproduit p);
    public void remove(Panierproduit p);
    public void getAll(Panier pan);
    public ResultSet statProduits(int idPanier);
    public int calculerQuantiteGlobale(int idPanier);
}
