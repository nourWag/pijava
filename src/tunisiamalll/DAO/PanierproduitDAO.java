/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunisiamalll.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import tunisiamall.IDAO.IPanierproduitDAO;
import tunisiamall.Util.MyConnexion;
import tunisiamall.entities.Panier;

import tunisiamall.entities.Panierproduit;

/**
 *
 * @author sawssen
 */
public class PanierproduitDAO implements IPanierproduitDAO {
private Connection cnx;
PreparedStatement ps;
private Statement stm;

    public PanierproduitDAO() {
        cnx=MyConnexion.getInstance();
    }

    @Override
    public void add(Panierproduit pp) {
       try {
       
        String req="select id,id from produit pr,panier pan where pr.id==pp.idPr and pan.id==pp.idPan";
        
        ps=cnx.prepareStatement(req);
      //   ps.setInt(1, p.getId());
     ps.executeUpdate();
        } catch (SQLException ex) {
                Logger.getLogger(PanierDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

   /* @Override
    public void remove(Panierproduit p) {
        try {
        String req="delete from panier WHERE id = ?";
        ps=cnx.prepareStatement(req);
         ps.setInt(1, p.getId());
        ps.executeUpdate();
        } catch (SQLException ex) {
                Logger.getLogger(PanierDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
    }*/

    @Override
    public void getAll(Panier pan) {
        List<String> listp=new ArrayList<String>();
        try {
            stm = cnx.createStatement();
            //ResultSet rs =  stm.executeQuery("SELECT id from panier pan ,id,reference from produit p where ");
                  // String req="insert into depot (id,adress) values (?,?)";

            ResultSet rs =  stm.executeQuery("select pr.id,pp.idPr,pr.reference from produit pr,panierproduit pp where pr.id=pp.idPr  and pp.idPan=1");
          //stm.setInt(1,1);
           // ps.setInt(1, pan.getId());
            while (rs.next()) {                
                //System.out.println(rs.getInt("id"));
               // System.out.println(rs.getString("id")+" ref= "+rs.getString("reference"));
                listp.add(rs.getString("id"));
                listp.add(rs.getString("reference"));
                //System.out.println(rs.getString("reference"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PanierDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }

    @Override
    public void remove(Panierproduit pp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//
//    @Override
//    public void getAll() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
