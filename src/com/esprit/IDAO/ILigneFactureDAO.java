/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.IDAO;

import com.esprit.entites.Facture;
import com.esprit.entites.LigneFacture;

/**
 *
 * @author sawssen
 */
public interface ILigneFactureDAO {
    void addLigneFacture(int idPanier,Facture fact);
    
}
