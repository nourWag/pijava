/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunisiamall.IDAO;

import tunisiamall.entities.Facture;
import tunisiamall.entities.LigneFacture;

/**
 *
 * @author sawssen
 */
public interface ILigneFactureDAO {
    void addLigneFacture(int idPanier,Facture fact);
    
}
