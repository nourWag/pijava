/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunisiamall.IDAO;

import java.util.List;
import tunisiamall.entities.M_Produit;
import tunisiamall.entities.Panier;

/**
 *
 * @author sawssen
 */
public interface IPanierDAO {
    public void add(int idPanier,int idProduit,int qte);
   public void delete(int idSelected);
//    public Panier getPanier(int id);
    public List <M_Produit> getAll(int id);
    
}
