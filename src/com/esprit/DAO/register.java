/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.esprit.DAO;


import com.esprit.IDAO.IadminDAO;
import com.esprit.IDAO.Iregister;
import com.esprit.Util.db_connection;
import java.awt.Image;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author snoussi
 */

    public class register extends Iregister{

    private Connection cnx;
     Statement stm;
       db_connection conn=new db_connection();
       DefaultTableModel model = new DefaultTableModel();
         
        
   public register() {
     
        cnx= db_connection.getInstance();
   }
   
   
      public static String md5(char [] c) {
      try{
            MessageDigest digs = MessageDigest.getInstance("MD5");
            digs.update(( new String(c)).getBytes("UTF8"));
            String str = new String(digs.digest());
          return str ;
      }catch (Exception ex){
          return "";}
      }
   public  void ajouter (String txtid,String txtno,String txtpr,String txtpa,String txtma ) throws ClassNotFoundException{
            
       
        try {
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
stm=conn.obtenirconnexion().createStatement();
ResultSet Rs=stm.executeQuery("Select * from fos_user");
while(Rs.next()){
model.addRow(new Object[]{Rs.getString("id"),Rs.getString("nom"),Rs.getString("prenom"),
   Rs.getString("password"),Rs.getString("email")});

}
}catch(SQLException e){System.err.println(e);}
   
   int  cin= Integer.parseInt(txtid);
        String nom=txtno;
        String prenom=txtpr;
        String mot_de_passe =txtpa;
        String mail=txtma;
        
        //Image m1=new Im();
      //   String role=txtrole.getSelectedItem().toString();
        String requete="INSERT INTO `fos_user`(`id`,  `email`, `password`,  `nom`, `prenom`) VALUES ("+cin+",'"+mail+"','"+mot_de_passe+"','"+nom+"','"+prenom+"')" ;
       try{
        stm.executeUpdate(requete);
JOptionPane.showMessageDialog(null,"vous avez bien inscrit");
//nom.equals("") ;
///txtpr.equals("");txtpa.equals("");txtma.equals("");
//afficher();

        
        }catch(Exception ex){
             System.out.println("erreur lors de la mise a jour?   " + ex.getMessage());
        }
       
   }
    
}
    

