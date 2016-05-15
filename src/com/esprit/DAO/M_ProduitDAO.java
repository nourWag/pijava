/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import com.esprit.IDAO.IM_ProduitDAO;
import com.esprit.Util.DataSource;
import com.esprit.entites.M_Produit;

/**
 *
 * @author sawssen
 */
public class M_ProduitDAO implements IM_ProduitDAO {
private Connection cnx;
private PreparedStatement ps;
private Statement stm;

    public M_ProduitDAO() {
        cnx=DataSource.getInstance().getConnection();
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
