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
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import tunisiamall.IDAO.IPanierDAO;
import tunisiamall.Util.MyConnexion;
import tunisiamall.entities.Panier;
import tunisiamall.entities.M_Produit;

/**
 *
 * @author sawssen
 */
public class PanierDAO implements IPanierDAO {
private Connection cnx;
PreparedStatement ps;
private Statement stm;

    public PanierDAO() {
        cnx=MyConnexion.getInstance();
    }
    
     @Override
    public List <M_Produit> getAll(int id) {
        
        List<M_Produit> listeMPr = new Vector<M_Produit>();
        try {
            stm = cnx.createStatement();
            String req="select pr.id,pr.image,pp.idPr,pr.reference,pr.prix,pp.quantite from produit pr,panierproduit pp where pr.id=pp.idPr  and pp.idPan="+id;
            
            ResultSet rs =  stm.executeQuery(req);
            
            while (rs.next()) {
                M_Produit mProd = new M_Produit();
                mProd.setId(rs.getInt("idPr"));
                mProd.setReference(rs.getString("image"));
                mProd.setReference(rs.getString("reference"));
                mProd.setQuantite_com(rs.getInt("quantite"));
                mProd.setPrix(rs.getFloat("prix"));
                mProd.setPrixTotal(rs.getFloat("prix")*rs.getInt("quantite"));
                mProd.setImg(rs.getString("image"));
               listeMPr.add(mProd);
            } return listeMPr;
        } catch (SQLException ex) {
            Logger.getLogger(PanierDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    
     }
    
    
    @Override
    public void add(int idPanier,int idProduit,int qte) {
    try {
        String req="insert into panierproduit (idPr,idPan,quantite) values (?,?,?)";
        ps=cnx.prepareStatement(req);
        ps.setInt(1, idPanier);
        ps.setInt(2, idProduit);
        ps.setInt(3, qte);
        ps.executeUpdate();
        } catch (SQLException ex) {
                Logger.getLogger(PanierDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    @Override
    
    public void delete(int idSelected,int idPanier) {
    try {
        
        String req="delete from panierproduit WHERE idPr = "+idSelected+" and idPan= "+idPanier;
        ps=cnx.prepareStatement(req);
        // ps.setInt(1, p.getId());
        ps.executeUpdate();
        } catch (SQLException ex) {
                Logger.getLogger(PanierDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
//    
//    @Override
//    public Panier getPanier(int id) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    public void savePrPanier(int idPanier, int idProduit, int quantity) {
       //List<M_Produit> listeMPr = new Vector<M_Produit>();
        try {
            
            String req="update panierproduit pp set quantite="+quantity+" where pp.idPr= "+idProduit+" and pp.idPan= "+idPanier;
            System.out.println(""+req);
            ps=cnx.prepareStatement(req);
            //ResultSet rs =  ps.executeQuery(req);
            
//            while (rs.next()) {
//               M_Produit mProd = new M_Produit();
//               // mProd.setId(rs.getInt("idPr"));
//                mProd.setQuantite_com(rs.getInt("quantite"));
              ps.executeUpdate();
            
            } catch (SQLException ex) { 
        Logger.getLogger(PanierDAO.class.getName()).log(Level.SEVERE, null, ex);
    } 
        
     
    }

   
   

   
    
    
    
}
