/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunisiamalll.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import tunisiamall.IDAO.IFactureDAO;
import tunisiamall.Util.MyConnexion;
import tunisiamall.entities.Facture;

/**
 *
 * @author sawssen
 */
public class FactureDAO implements IFactureDAO {
 private Connection cnx;
private PreparedStatement ps;
private Statement stm;
    public FactureDAO() {
        cnx=MyConnexion.getInstance();
    }

    @Override
    public void addFacture(Facture facture) {  
         try {
            String req = "insert into facture (num_sequentiel,date_creation) values (?,?)";
            ps = cnx.prepareStatement(req,Statement.RETURN_GENERATED_KEYS);
            stm = cnx.createStatement();
            ResultSet rs = stm.executeQuery("select max(num_sequentiel) as max_numseq from facture");
            if (rs.next()) {
            int  num_sequentiel= rs.getInt("max_numseq");
            facture.setNum_sequentiel(num_sequentiel+1);
            }
           DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy   HH:mm:ss");
            Calendar cal = Calendar.getInstance();
            String currentDate=dateFormat.format(cal.getTime()); 
            facture.setDate_creation(currentDate);
            ps.setInt(1, facture.getNum_sequentiel());
            ps.setString(2, facture.getDate_creation());
             ps.executeUpdate();
            ResultSet keys = ps.getGeneratedKeys();    
           if ( keys.next())  
           {int key = keys.getInt(1);
           facture.setId(key);
           }
           
            
        } catch (SQLException ex) {
            Logger.getLogger(FactureDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
