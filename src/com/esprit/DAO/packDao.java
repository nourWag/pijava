

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.DAO;


import com.esprit.Util.db_connection;
import com.esprit.entites.image;
import com.esprit.entites.fos_user;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author macbookpro
 */
public class packDao {
    
   //  Statement ste;
      Statement stm;
    ResultSet Rs;
    Connection connexion;
     DefaultTableModel    model = new DefaultTableModel();
      db_connection conn=new db_connection();
   
    public packDao() 
    {
       
    }
      
    
    public void ajouterpacker(image cp) {
        try {
            PreparedStatement st = connexion.prepareStatement("INSERT INTO `image`( `titre`, `img`) VALUES (?,?)");

           
            st.setString(1, cp.getTitre());
            st.setBytes(2,cp.getPhoto_pack());
            st.executeUpdate();
            st.close();
        } catch (SQLException ex) {
         //   Logger.getLogger(ClientDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    public List<String> afficherpack() {
         List<String> listeCatP = new ArrayList<>();
          String requete="select titre from image ";
        try {
       
           Statement statement = connexion.createStatement();
            ResultSet rs = statement.executeQuery(requete);
      
//      String cont[] = new String[20];
     
      
      int i=0;
      while (rs.next()) 
            {   image cp = new image();
             
                cp.setTitre(rs.getString("titre"));
              String cont[]=new String[i];
               listeCatP.add(cp.getTitre());
                i++;
            }  
      return listeCatP;
               
      } 
        catch (SQLException ex) 
        {
        System.out.println("problemed'affichage");
       return null;
        }
      
    }
    
    
//    public void modifierCategorieProduit(pack cp) {
//        try {
//            PreparedStatement st = connexion.prepareStatement("UPDATE `categorie_produit` SET `nom_catP`=?,`photo_catP`=? WHERE `id_catP`=?");
//            
//           
//            st.setString(1, cp.getNom_catP());
//            st.setBytes(2, cp.getPhoto_catP());
//           
//            
//            st.executeUpdate();
//            st.close();
//        } catch (SQLException ex) {
//           // Logger.getLogger(ProduitDao.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }

    public void supprimerpack(image cp) {
        try {
            PreparedStatement st = connexion.prepareStatement("Delete from image where `id`=?");
          st.setString(1, cp.getId());
        } catch (SQLException ex) {
           // Logger.getLogger(ProduitDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   public void supprimer(String txtid) {
        try {
stm=conn.obtenirconnexion().createStatement();
ResultSet res=stm.executeQuery("Select * from image");
while(res.next()){
model.addRow(new Object[]{res.getString("id"),res.getString("titre"),res.getString("img"),
   });

}}catch(SQLException e){System.err.println(e);}
       
       
           try {
             if(JOptionPane.showConfirmDialog(null,"attention vous avez supprimer un pack,est ce que tu et sure?"
                     ,"supprimer pack",JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION)
         
            if(txtid.length() != 0){
    //   stm.executeUpdate("Delete From user");
         stm.executeUpdate("Delete From image where id = "+txtid);
             }//ca est pour recharger la list des stagiaire
            else { JOptionPane.showMessageDialog(null,"veuillez remplire le champ id !");}
        
        }catch (Exception e){JOptionPane.showMessageDialog(null,"erreur de supprimer \n"+e.getMessage());}
        // TODO add your handling code here:
   }
   
    public void modifier(String txtcin, String idimg) {
         try {
stm=conn.obtenirconnexion().createStatement();
ResultSet res=stm.executeQuery("Select * from image");
while(res.next()){
model.addRow(new Object[]{res.getString("id"),res.getString("titre"),res.getString("img"),
   });

}}catch(SQLException e){System.err.println(e);}
       
       
            try { 
            if (JOptionPane.showConfirmDialog (null,"confirmer la modification","modification",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {

                stm.executeUpdate("UPDATE image SET id='"+txtcin+"' WHERE id= "+idimg );
               //afficher ();
            } 
        } catch (Exception e){JOptionPane.showMessageDialog(null,"erreur de modifier !!!!!!!");
        System.err.println(e);}
        // TODO add your handling code here:
   }
    
    
        public void modifierprofile1(String txtcin) {
    
            
        // TODO add your handling code here:
              try { 
            if (JOptionPane.showConfirmDialog (null,"confirmer la modification","modification",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {

                stm.executeUpdate("UPDATE fos_user SET profile='"+txtcin+"' WHERE id= "+AdminDAO.getCin1() );
               //afficher ();
            } 
        } catch (Exception e){JOptionPane.showMessageDialog(null,"erreur de modifier !!!!!!!");
        System.err.println(e);}
            
            
            
   }
    

//    public List<CategorieProduit> findProdCat(int id_catP) {
//        List<CategorieProduit> listecatP = new ArrayList<>();
//        String requete = "select * from categorie_produit where id_catP = '"+id_catP+"'";
//        try {
//            Statement statement = connexion.createStatement();
//            ResultSet resultat = statement.executeQuery(requete);
//
//            while (resultat.next()) {
//                CategorieProduit cp = new CategorieProduit();
//                cp.setNom_catP(resultat.getString(1));
//                cp.setPhoto_catP(resultat.getBytes(2));
//               
//
//                listecatP.add(cp);
//            }
//            return listecatP;
//        } catch (SQLException ex) {
//            System.out.println("SQL Error: " + ex);
//            return null;
//       }
   // }
        public List<String> afficherNomCatP() {
         List<String> listeCatP = new ArrayList<>();
          String requete="select titre from image ";
        try {
       
           Statement statement = connexion.createStatement();
            ResultSet rs = statement.executeQuery(requete);
      
//      String cont[] = new String[20];
     
      
      int i=0;
      while (rs.next()) 
            {   image cp = new image();
             
                cp.setTitre(rs.getString("titre"));
              String cont[]=new String[i];
               listeCatP.add(cp.getTitre());
                i++;
            }  
      return listeCatP;
               
      } 
        catch (SQLException ex) 
        {
        System.out.println("problemed'affichage");
       return null;
        }
      
    }
        
        public image findOne(String id) {
//
            image p = new image();
        String requete = "select * from image where id =" + id;
        try {
            Statement statement = connexion.createStatement();
            ResultSet resultat = statement.executeQuery(requete);
//      //      CategorieProduitDao cpd = new CategorieProduitDao();
//          //  ClientDao cd = new ClientDao();
            while (resultat.next()) {
                p.setId(resultat.getString(1));
                p.setTitre(resultat.getString(2));
//              //  p.setCategorie(cpd.findOne(resultat.getInt(3)));
//              //  p.setMarque(resultat.getString(4));
//              //  p.setPrix(resultat.getFloat(5));
//              //  p.setDate_fin(resultat.getDate(6));
//              //  p.setEstValide(resultat.getInt(7));
//              //  p.setQuantite(resultat.getInt(8));
//               // p.setEstAchetee(resultat.getInt(9));
                p.setPhoto_pack(resultat.getBytes(3));
//               // p.setDescription(resultat.getString(11));
//            //    p.setClient(cd.findOne(resultat.getInt(12)));
            }
           return p;
       } catch (SQLException ex) {
           System.out.println("SQL Error: " + ex);
       }
            return null;
        }

   // }
//         public pack findOne(int id_pack) {
//        
//        pack cp = new pack();
//        
//        try {
//            PreparedStatement st = connexion.prepareStatement("select * from `pack` where `id_pack`=?");
//            st.setInt(1,id_pack);
//            ResultSet resultat = st.executeQuery();
//
//            while (resultat.next()) {
//                
//               
//                cp.setNom_pack(resultat.getString(1));
//                cp.setPhoto_pack(resultat.getBytes(2));
//            }
//            return cp;
//        } catch (SQLException ex) {
//            System.out.println("SQL Error: " + ex);
//            return null;
//        }
//        
//    }
    
    
    
}

    