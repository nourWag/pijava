/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunisiamall.IDAO;

import tunisiamall.entities.M_Produit;

/**
 *
 * @author sawssen
 */
public interface IM_ProduitDAO {
     public void add(M_Produit p);
    public void remove(M_Produit p);
    public M_Produit getM_Produit(int id);
    public void getAll();
}
