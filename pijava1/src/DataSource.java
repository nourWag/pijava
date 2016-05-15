/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cherni Mohamed
 */
public class DataSource {
    private String url;
    private String login;
    private String password;
    
    private Connection connection;
    public static  DataSource instance;

    private DataSource() {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(new File("configuration.properties")));
            url=properties.getProperty("url");
            login=properties.getProperty("login");
            password=properties.getProperty("password");
            connection=DriverManager.getConnection(url, login, password);
            System.out.println("Connexion etablie");
            
           
            
            
       
        
    }   catch (FileNotFoundException ex) {
            Logger.getLogger(DataSource.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DataSource.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DataSource.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
}
    
    public  Connection getConnection(){
        return connection;
    }
    
    public static DataSource getInstance(){
        if(instance==null){
            instance= new DataSource();
        }
        return instance;
        
    }
}

