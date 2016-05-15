/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lenovo
 */
public class MyConnexion {
    private static Connection cnx;

    public static PreparedStatement prepareStatement(String requete) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String url="jdbc:mysql://localhost:3306/bdtunisiamall";
    private String user="root";
    private String pwd="";

    
    
    private MyConnexion() {
        try {
            cnx=DriverManager.getConnection(url, user, pwd);
        } catch (SQLException ex) {
            Logger.getLogger(MyConnexion.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur"+ex.getMessage());
        }
    }
    
   public static Connection getInstance()
   {if (cnx==null) new MyConnexion();
   return cnx;
   }
    
}
