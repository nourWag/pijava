package com.esprit.DAO;



import com.esprit.Util.MyConnexion;
import com.esprit.entites.liraisonf;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class livraisonfDAO {
    private Connection cnx;
    liraisonf lf;

    public livraisonfDAO() {
        cnx=MyConnexion.getInstance();
    }

    
     public void insertLivraison(liraisonf l) {
        String requete = "INSERT INTO `liraisonf`(`nom`, `prenom`, `adresse`, `telephone`) VALUES "
                + " (?,?,?,?)";

        try {
            PreparedStatement ps=cnx.prepareStatement(requete);
             ps.setString(1, l.getNom());
             ps.setString(2, l.getPrenom());
            ps.setString(3, l.getAdresse());
            ps.setString(4, l.getTelephone());
              

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(livraisonfDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("validee");
    }
     
 public void deleteLivraison(String nom) {
        String requete = "DELETE FROM `liraisonf` WHERE nom=?";

        try {
            PreparedStatement ps = cnx.prepareStatement(requete);
            ps.setString(1, nom);
            ps.executeUpdate();
            System.out.println("livraison Supprimee");
        } catch (SQLException ex) {
            //Logger.getLogger(AnnonceDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
    }
 
       public List<liraisonf > DisplayAlllivraison() {
 List<liraisonf> listliraisonf = new ArrayList<liraisonf>();

        String requete = "SELECT  `nom`, `prenom`, `adresse`, `telephone` FROM `liraisonf` ";
        try {
            Statement statement = cnx.createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {
                liraisonf add = new liraisonf();
             /*   ps.setString(1, p.getNom());
            ps.setString(2, p.getPrenom());
            ps.setInt(3, p.getAge());
            ps.setInt(4, p.getCIN());
            ps.setString(5, p.getPhoto());
            ps.setString(6, p.getDatenaiss());
            ps.setString(7, p.getLogin());
            ps.setString(8, p.getPassword());
            ps.setString(9, p.getPseudo());*/
//                add.setId(resultat.getInt(1));
                add.setNom(resultat.getString(1));
                add.setPrenom(resultat.getString(2));
                add.setAdresse(resultat.getString(3));
                 add.setTelephone(resultat.getString(4));

                listliraisonf.add(add);
                
            }
            return listliraisonf;
         } catch (SQLException ex) {
            Logger.getLogger(livraisonfDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des Propriétés " + ex.getMessage());
            return null;
        }    }
       
// public List <liraisonf > findliraisonByAdresse(String adresse) throws SQLException {
//            
//            String req="select * from `liraisonf` where adresse like ?  ";
//             List<liraisonf> L= new ArrayList<>();
//            PreparedStatement  pst=cnx.prepareStatement(req);
//             pst.setString(1,adresse + "%");
//            ResultSet rst=pst.executeQuery();
//              while(rst.next())
//    {
//                    int id=rst.getInt(1);
//                    String Nom=rst.getString(3);
//                    String Prenom = rst.getString(4);
//                    String adr = rst.getString(5);
//                    String telephone = rst.getString(6);
//                    
//
//    liraisonf  lf =  new liraisonf(Nom, Prenom , adr, telephone);
//    System.out.println(lf.toString());
//    L.add(lf);
//    }
//    return L;
//    
//    }
    public void updatelivraison( liraisonf lf, int id) {
        String requete = "UPDATE `liraisonf` SET `adresse`=? WHERE nom=?";
        try {
            PreparedStatement ps = cnx.prepareStatement(requete);
            ps.setString(1,lf.getAdresse());
            ps.setString(2,lf.getNom());
            
            

            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
        }
    }
    
    public liraisonf getliraisonfByNom(String nom){
             try {
                  
                  String req = "SELECT * FROM liraisonf where  Nom='"+nom+"'";
                  Statement st = MyConnexion.createStatement();
                  ResultSet rs = st.executeQuery(req);
                 
                   lf = new liraisonf();
              while (rs.next()) {
//            lf.setId(rs.getInt("id"));
            lf.setNom(rs.getString("Nom"));
            lf.setPrenom(rs.getString("prenom"));
            lf.setAdresse(rs.getString("adresse"));
           lf.setTelephone(rs.getString("telephone"));
          
//              
                      
                     }
              
                  } catch (SQLException ex) {
                      Logger.getLogger(livraisonfDAO.class.getName()).log(Level.SEVERE, null, ex);
                  }
                  
             
 return lf;  
    }

        

    
    public liraisonf rechercherliraisonfById(int id) {
        String requete = "SELECT * FROM `liraisonf` where id=?";

        try {
            PreparedStatement ps = cnx.prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            liraisonf add = new liraisonf();
            while (resultat.next()) {
                   add.setNom(resultat.getString(2));
                add.setPrenom(resultat.getString(3));
              
                add.setAdresse(resultat.getString(4));
                 add.setTelephone(resultat.getString(5));


               
//                off.setPublication(res.getBoolean(15));
//                off.setNoteMoy(res.getFloat(16));
            }
            return add;
        } catch (SQLException ex) {
            System.out.println("Echec de retrouver cette livraison" + ex.getMessage());
            ex.printStackTrace();
            return null;
        }
    }
    
        public liraisonf afficherliraisonf(int id) {
            
         try {
                   String req = "SELECT * FROM liraisonf  where id="+id;
                       java.sql.Statement st = MyConnexion.createStatement();
             java.sql.ResultSet rs = st.executeQuery(req);
             lf = new liraisonf();
             while (rs.next()) {
//                lf.setId(rs.getInt("id"));
                lf.setNom(rs.getString("nom"));
                 lf.setPrenom(rs.getString("prenom"));
                            lf.setAdresse(rs.getString("adresse"));
                             lf.setTelephone(rs.getString("telephone"));
//                            lf.setId_owner(cDao.afficherPersonne(rs.getInt("id_owner")));
                  // a.setNom(rs.getString("Nom de la propriété"));
                   
                    
           

              
             }} catch (SQLException ex) {
             Logger.getLogger(liraisonf.class.getName()).log(Level.SEVERE, null, ex);
         }return lf;
     }
}
