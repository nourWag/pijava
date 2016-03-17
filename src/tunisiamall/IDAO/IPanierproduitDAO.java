/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunisiamall.IDAO;

import tunisiamall.entities.Panier;
import tunisiamall.entities.Panierproduit;

/**
 *
 * @author sawssen
 */
public interface IPanierproduitDAO  {
        public void add(Panierproduit p);
    public void remove(Panierproduit p);
    public void getAll(Panier pan);
}
