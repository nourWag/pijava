package com.esprit.IDAO;
import com.esprit.entites.Boutique;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import technique.DataSource;

/**
 *
 * @author hp
 */
public class BoutiqueDao implements IDao<Boutique>{
 private static Connection connection;
    private PreparedStatement pst;

    public BoutiqueDao() {
         connection=  DataSource.getInstance().getConnection();
    }
    
    @Override
    public void insert(Boutique t) {
         String req="insert into boutique (nom,categorie,Fax,numero_telephone,Email,promotion) values (?,?,?,?,?,?)";
        try {
            pst=connection.prepareStatement(req);
            pst.setString(1, t.getNom());
            pst.setString(2, t.getCategorie());
            pst.setString(3, t.getFax());
            pst.setString(4, t.getFax());
            pst.setString(5, t.getNumero_telephone());
            pst.setString(6, t.getPromotion());
            
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BoutiqueDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void update(Boutique t) {
          String requete = "update Boutique set nom=? , categorie=? where Id=?";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
             ps.setInt(3, t.getId());
            ps.setString(1, t.getNom());
            ps.setString(2, t.getCategorie());
           
            ps.executeUpdate();
            System.out.println("Mise a  jour effectuee avec succées");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise �?  jour " + ex.getMessage());
        }

    }


    @Override
    public void delete(Boutique t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
       public void delete(String nom) {
        String requete = "delete from boutique where nom=?";
        try {
             pst = connection.prepareStatement(requete);
            pst.setString(1, nom);
            pst.executeUpdate();
            System.out.println("Suppression effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        } 
       }
       
       
    @Override
    public List<Boutique> displayAll() {
     
               List<Boutique> listedepots = new ArrayList<>();
        String requete = "select * from Boutique";
        try {
            Statement statement = connection
                    .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            BoutiqueDao depotDAO = new BoutiqueDao();
            while (resultat.next()) {
                Boutique stock = new Boutique();
                stock.setId(resultat.getInt(1));
                stock.setNom(resultat.getString(2));
                stock.setCategorie(resultat.getString(3));
                stock.setFax(resultat.getString(4));
                stock.setNumero_telephone(resultat.getString(5));
                stock.setEmail(resultat.getString(6));
                stock.setPromotion(resultat.getString(7));
                listedepots.add(stock);
//                System.out.println(listedepots);
            }
            return listedepots;
            
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des stocks " + ex.getMessage());
            return null;
        } 
    
    }

    @Override
    public Boutique findById(int id) {
        Boutique depot = new Boutique();
        String requete = "select * from boutique where id=?";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                depot.setId(resultat.getInt(1));
                depot.setNom(resultat.getString(2));
                 depot.setCategorie(resultat.getString(3));
                 System.out.println("er"+depot);
            }
            return depot;

        } catch (SQLException ex) {
            System.out.println("erreur lors de la recherche du depot " + ex.getMessage());
            return null;
        }
    
    }

    public List<Boutique> getAllByKey(String text) {
        String requete = "select * from boutique where (nom LIKE '%" + text + "%')";
        List<Boutique> listeagentskey = new ArrayList<Boutique>();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                Boutique pr = new Boutique();

                pr.setId(resultat.getInt(1));
                pr.setNom(resultat.getString(2));
                pr.setCategorie(resultat.getString(3));
                pr.setFax(resultat.getString(4));
                pr.setNumero_telephone(resultat.getString(5));
                pr.setEmail(resultat.getString(6));
                pr.setPromotion(resultat.getString(7));
                listeagentskey.add(pr);
            }
            return listeagentskey;
        } catch (SQLException ex) {
            System.out.println("" + ex.getMessage());
            return null;
        }
}


    @Override
    public void removeById(int id) {
              String requete = "delete from boutique where id=?";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Produit supprimé");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
    }

    @Override
    public void update1(Boutique t) {
                  String requete = "update Boutique set nom=? , categorie=?, Fax=?, numero_telephone=?, Email=? ,promotion=? where Id=?";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
             
            ps.setString(1, t.getNom());
            ps.setString(2, t.getCategorie());
            ps.setString(3, t.getFax());
            ps.setString(4, t.getNumero_telephone());
            ps.setString(5, t.getEmail());
            ps.setString(6, t.getPromotion());
            ps.setInt(7, t.getId());
           
            ps.executeUpdate();
            System.out.println("Mise �?  jour effectu�?©e avec succ�?¨s");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise �?  jour " + ex.getMessage());
        }
        
    }
  
    }
