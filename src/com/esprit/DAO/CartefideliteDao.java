/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.DAO;
import com.esprit.IDAO.ICartefideliteDAO;
import com.esprit.Util.MyConnexion;
import com.esprit.entites.Cartefidelite;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author lenovo
 */
public class CartefideliteDao implements ICartefideliteDAO {
Connection connection;
    PreparedStatement pst;
    ResultSet rs;
     public CartefideliteDao() {
                connection =(MyConnexion.getInstance());
   }
    
    @Override
    public void insertCartefidelite(Cartefidelite carte) {
        
       
        try {
            String req="insert into cartefidelite (nombrePointFidele,dateCreationCarteFidelite) values(?,?)";
            pst=connection.prepareStatement(req);
            pst.setInt(1, carte.getNombrePointFidele());
            pst.setDate(2, (java.sql.Date) (java.util.Date) carte.getDateCreationCarteFidelite());
              pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CartefideliteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   

   @Override
    public void updateCartefidelite(Cartefidelite carte) {
         String req2= "update cartefidelite set idCarteFidelite=?,nombrePointFidele=?,dateCreationCarteFidelite=? where idCarteFidelite=?";

       try {
           
            pst=connection.prepareStatement(req2);
            pst.setInt(1,carte.getIdCarteFidelite());
            pst.setInt(2,carte.getNombrePointFidele());
            pst.setDate(3, (java.sql.Date) carte.getDateCreationCarteFidelite());

            pst.setInt(4,carte.getIdCarteFidelite());
            pst.executeUpdate();
           
            System.out.println("la carte was updated successfully!");
            
        } catch (SQLException ex) {
            Logger.getLogger(CartefideliteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deleteCartefidelite(Cartefidelite carte) {
                    String req3= "delete from cartefidelite where idCarteFidelite=?";

        try {
            pst=connection.prepareStatement(req3);
            pst.setInt(1,carte.getIdCarteFidelite());
            int executeUpdate = pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CartefideliteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<Cartefidelite> DisplayAllCartefidelite() {
        String req2="select * from cartefidelite";
        List<Cartefidelite> cartes;
    cartes = new ArrayList<>();
        
        try {
            pst=connection.prepareStatement(req2);
            rs=pst.executeQuery();
            
            while(rs.next()){
                Cartefidelite CF;
                CF = new Cartefidelite(rs.getInt("idCarteFidelite"),rs.getInt("nombrePointFidele"),rs.getDate("dateCreationCarteFidelite"));
               cartes.add(CF);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CartefideliteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(cartes);
    return (ArrayList<Cartefidelite>) cartes;
    }

    /**
     *
     * @param idCarteFidelite
     * @return
     */
    @Override
    public Cartefidelite findCarteFideliteByIdCarteFidelite(int idCarteFidelite) {
    String req;
    req = req="select * from cartefidelite where  idCarteFidelite= "+"'"+idCarteFidelite+"'";
       
       try {
            pst=connection.prepareStatement(req);
            rs=pst.executeQuery();
           if( rs.next())
           {
            Cartefidelite carte=new Cartefidelite(rs.getInt("idCarteFidelite"),rs.getInt("nombrePointFidele"),rs.getDate("dateCreationCarteFidelite"));
       return carte;
           }
           else
           {
               
               return null;}
           } catch (SQLException ex) {
            Logger.getLogger(CartefideliteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
       return null; 
    }
    
    
    public int calculNombreClient(){
        String requete = "SELECT count(*) FROM user WHERE role=? ";
        int nombreClient = 0;
        try {
            PreparedStatement statement = MyConnexion.prepareStatement(requete);
              statement.setString(1, "client");
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
               nombreClient=rs.getInt(1);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return nombreClient;
    }
           public int calculNombreResponsable(){
               String  responsable ;             
        String requete = "SELECT count(*) FROM cartefidelite WHERE =?";
        int nombreClient = 0;
        try {
            PreparedStatement statement = MyConnexion.prepareStatement(requete);
            statement.setString(1, "responsable");
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
               nombreClient=rs.getInt(1);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return nombreClient;
    }
       }

    //@Override
    //public void deleteCartefidelite(Cartefidelite Cartefidelite) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }

    //@Override
    //public void DisplayAllCartefidelite() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }

    //@Override
    //public Cartefidelite findCarteFideliteByIdCarteFidelite(int idCarteFidelite) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }

//}