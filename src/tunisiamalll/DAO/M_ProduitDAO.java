/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunisiamalll.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import tunisiamall.IDAO.IM_ProduitDAO;
import tunisiamall.Util.MyConnexion;
import tunisiamall.entities.M_Produit;

/**
 *
 * @author sawssen
 */
public class M_ProduitDAO implements IM_ProduitDAO {
private Connection cnx;
private PreparedStatement ps;
private Statement stm;

    public M_ProduitDAO() {
        cnx=MyConnexion.getInstance();
    }

    @Override
    public void add(M_Produit p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(M_Produit p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public M_Produit getM_Produit(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
