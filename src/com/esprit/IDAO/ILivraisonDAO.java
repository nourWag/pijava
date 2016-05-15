/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.IDAO;


import com.esprit.entites.liraisonf;
import java.util.List;

/**
 *
 * @author lenovo
 */
public interface ILivraisonDAO {
     void insertLivraison(liraisonf l);
    void deleteLivraison(String nom);
    List<liraisonf > DisplayAlllivraison();
    void updatelivraison( liraisonf lf, int id);
    public liraisonf getliraisonfByNom(String nom);
     public liraisonf rechercherliraisonfById(int id);
      public liraisonf afficherliraisonf(int id);
}
