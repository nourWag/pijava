/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.esprit.IDAO.ILigneFactureDAO;
import com.esprit.Util.DataSource;
import com.esprit.entites.Facture;
import com.esprit.entites.LigneFacture;

/**
 *
 * @author sawssen
 */
public class LigneFactureDAO  implements ILigneFactureDAO{

    private Connection cnx;
private PreparedStatement ps;
private Statement stm;
    public LigneFactureDAO() {
        cnx=DataSource.getInstance().getConnection();
    }

    @Override
    public void addLigneFacture(int idPanier,Facture fact) {
       List<LigneFacture> listLigneF=new Vector<>();
        try {
       String req="select idPr,quantite from panierproduit where idPan="+idPanier;
       stm = cnx.createStatement();
       ResultSet rs =  stm.executeQuery(req);
       while (rs.next()) {
               LigneFacture lfact = new LigneFacture(fact.getId(),rs.getInt("idPr"),rs.getInt("quantite"));
               //System.out.println(fact.getId());
               listLigneF.add(lfact);
               //insertion dans lingefacture(table)
               String req2="insert into lignefacture(facture_id,idPr,quantite) values(?,?,?)";
//               ps=cnx.prepareStatement(req2);
               ps=cnx.prepareStatement(req2);
               ps.setInt(1, lfact.getIdFact());
               ps.setInt(2, lfact.getIdPr());
               ps.setInt(3, lfact.getQuantite());
               ps.executeUpdate();
               
                }
       fact.setListLigneF(listLigneF);
       
        } catch (SQLException ex) {
                Logger.getLogger(LigneFactureDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
    }


    
    
    
    
}
