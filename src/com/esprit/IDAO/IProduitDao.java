/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.IDAO;


import com.esprit.entites.Produit;
import java.util.List;

/**
 *
 * @author Mehdi
 */
public interface IProduitDao {

    void addProduit(Produit p);

    void updateProduit(Produit p);

    void removeProduitByAdresse(String reference);

    void removeProduitById(int id);

    List<Produit> findAll();

    Produit findProduitById(int id);

    Produit findProduitByCouleur(String reference);
    List<Produit> getAllByKey(String text);

}
