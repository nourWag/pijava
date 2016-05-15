/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.DAO;


import com.esprit.IDAO.IProduitDao;
import com.esprit.Util.DataSource;

import com.esprit.entites.Boutique;
import com.esprit.entites.Produit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nour
 */
public class ProduitDao implements IProduitDao {

    private Connection connection;

    public ProduitDao() {
        connection = DataSource.getInstance().getConnection();
    }

    @Override
    public void addProduit(Produit p) {
        try {
            String req = "insert into produit ( `description`, `reference`, `couleur`, `designation`, `taille`, `etat`, `prixdachat`, `marque`, `prixvente`, `disponible`, `img`, `quantit`) values (?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(req);
             ps.setString(2, p.getReference());
           ps.setString(1,p.getDescription());
                
                ps.setString(3,p.getCouleur());
                ps.setString(4,p.getDesignation());
                ps.setString(5,p.getTaille());
                ps.setString(6,p.isEtat());
                ps.setFloat(7,p.getPrixdachat());
                ps.setString(8,p.getMarque());
                ps.setFloat(9,p.getPrixvente());
               
                ps.setString(10,p.getDisponible());
                ps.setString(11,p.getimg());
                ps.setInt(12,p.getQuantit());
             
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProduitDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void updateProduit(Produit p) {
        String requete ="UPDATE `produit` SET `description`=?,`reference`=?,`couleur`=?,`designation`=?,`taille`=?,`etat`=?,`prixdachat`=?,`marque`=?,`prixvente`=?,`disponible`=?,`img`=?,`quantit`=? WHERE id=?";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setString(2, p.getReference());
            ps.setInt(13, p.getId());
           ps.setString(1,p.getDescription());
                
                ps.setString(3,p.getCouleur());
                ps.setString(4,p.getDesignation());
                ps.setString(5,p.getTaille());
                ps.setString(6,p.isEtat());
                ps.setFloat(7,p.getPrixdachat());
                ps.setString(8,p.getMarque());
                ps.setFloat(9,p.getPrixvente());
               
                ps.setString(10,p.getDisponible());
                ps.setString(11,p.getimg());
                ps.setInt(12,p.getQuantit());
                
            ps.executeUpdate();
            System.out.println("Mise Ă  jour effectuĂ©e avec succĂ¨s");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise Ă  jour " + ex.getMessage());
        }
    }

    @Override
    public void removeProduitById(int id) {
        String requete = "delete from produit where id=?";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Produit supprimĂ©");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
    }

    @Override
    public void removeProduitByAdresse(String reference) {
        String requete = "delete from produit where reference=?";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setString(1, reference);
            ps.executeUpdate();
            System.out.println("Pays supprimĂ©e");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
    }

    @Override
    public Produit findProduitById(int id) {
        Produit p = new Produit();
        String requete = "select * from produit where id=?";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                p.setId(resultat.getInt(1));
                p.setDescription(resultat.getString(2));
                p.setReference(resultat.getString(3));
                p.setCouleur(resultat.getString(14));
                p.setDesignation(resultat.getString(4));
                p.setSize(resultat.getString(15));
                //p.setEtat(resultat.getString(7));
                p.setPrixdachat(resultat.getFloat(6));
                p.setMarque(resultat.getString(7));
                p.setPrixvente(resultat.getFloat(8));
                p.setNote(resultat.getInt(10));
                p.setNbreV(resultat.getInt(11));
                p.setDisponible(resultat.getString(12));
                p.setimg(resultat.getString(16));
                p.setQuantit(resultat.getInt(9));
                
                
                
                
            }
            return p;

        } catch (SQLException ex) {
            System.out.println("erreur lors de la recherche du Produit " + ex.getMessage());
            return null;
        }
    }

    @Override
    public Produit findProduitByCouleur(String couleur) {
        Produit depot = new Produit();
        String requete = "select * from produit where couleur=?";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setString(1, couleur);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                depot.setId(resultat.getInt(1));
                depot.setCouleur(resultat.getString(2));
            }
            return depot;

        } catch (SQLException ex) {
            System.out.println("erreur lors de la recherche du Produit " + ex.getMessage());
            return null;
        }
    }

    @Override
    public List<Produit> findAll() {
        List<Produit> listedepots = new ArrayList<>();
        String requete = "select * from produit";
        try {
            Statement statement = connection
                    .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {
                Produit p = new Produit();
              p.setId(resultat.getInt(1));
                p.setDescription(resultat.getString(2));
                p.setReference(resultat.getString(3));
                p.setCouleur(resultat.getString(14));
                p.setDesignation(resultat.getString(4));
                p.setSize(resultat.getString(15));
                p.setDisponible(resultat.getString(13));
                p.setPrixdachat(resultat.getFloat(6));
                p.setMarque(resultat.getString(7));
                p.setPrixvente(resultat.getFloat(8));
                p.setNote(resultat.getInt(10));
                p.setNbreV(resultat.getInt(11));
                p.setDisponible(resultat.getString(12));
                p.setimg(resultat.getString(16));
                p.setQuantit(resultat.getInt(9));
                listedepots.add(p);
            }
            return listedepots;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des Produits " + ex.getMessage());
            return null;
        }}
    @Override
         public List<Produit> getAllByKey(String text) {
        String requete = "select * from produit where (marque LIKE '%" + text + "%' or designation LIKE '%" + text + "%' or reference LIKE '%" + text + "%')";
        List<Produit> listeagentskey = new ArrayList<Produit>();

        try {
            Statement statement = connection
                    .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                Produit pr = new Produit();

                pr.setId(resultat.getInt(1));
                pr.setDescription(resultat.getString(2));
                pr.setCouleur(resultat.getString(4));
                pr.setReference(resultat.getString(3));
               

                listeagentskey.add(pr);
            }
            return listeagentskey;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des produits " + ex.getMessage());
            return null;
        }

    }
      public  List<Produit> getAllByMarque(String text){
        String requete = "select * from produit where (marque LIKE '%" + text + "%' or designation LIKE '%" + text + "%' or reference LIKE '%" + text + "%')";
        List<Produit> listeagentskey = new ArrayList<Produit>();

        try {
            Statement statement = connection
                    .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                Produit p = new Produit();

                p.setId(resultat.getInt(1));
                p.setDescription(resultat.getString(2));
                p.setReference(resultat.getString(3));
                p.setCouleur(resultat.getString(4));
                p.setDesignation(resultat.getString(5));
                p.setTaille(resultat.getString(6));
                p.setEtat(resultat.getString(7));
                p.setPrixdachat(resultat.getFloat(8));
                p.setMarque(resultat.getString(9));
                p.setPrixvente(resultat.getFloat(10));
                p.setNote(resultat.getInt(11));
                p.setNbreV(resultat.getInt(12));
                p.setDisponible(resultat.getString(13));
                p.setimg(resultat.getString(14));
                p.setQuantit(resultat.getInt(15));
               

                listeagentskey.add(p);
            }
            return listeagentskey;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des produits " + ex.getMessage());
            return null;
        }

    } 

    @Override
    public List<Produit> getAllByCategorie(String text) {

    String requete = "select * from produit where idb = (select id from Boutique where (categorie LIKE '%" + text + "%' ))";
        List<Produit> listeagentskey = new ArrayList<Produit>();

        try {
            Statement statement = connection
                    .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                Produit p = new Produit();

                p.setId(resultat.getInt(1));
                p.setDescription(resultat.getString(2));
                p.setReference(resultat.getString(3));
                p.setCouleur(resultat.getString(4));
                p.setDesignation(resultat.getString(5));
                p.setTaille(resultat.getString(6));
                p.setEtat(resultat.getString(7));
                p.setPrixdachat(resultat.getFloat(8));
                p.setMarque(resultat.getString(9));
                p.setPrixvente(resultat.getFloat(10));
                p.setNote(resultat.getInt(11));
                p.setNbreV(resultat.getInt(12));
                p.setDisponible(resultat.getString(13));
                p.setimg(resultat.getString(14));
                p.setQuantit(resultat.getInt(15));
               

                listeagentskey.add(p);
            }
            return listeagentskey;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des produits " + ex.getMessage());
            return null;
        }

    }

    @Override
    public List<Produit> getAllBydesignation(String text) {
       String requete = "select * from produit where (categorie LIKE '%" + text + "%' )";
        List<Produit> listeagentskey = new ArrayList<Produit>();

        try {
            Statement statement = connection
                    .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                Produit p = new Produit();

                p.setId(resultat.getInt(1));
                p.setDescription(resultat.getString(2));
                p.setReference(resultat.getString(3));
                p.setCouleur(resultat.getString(14));
                p.setDesignation(resultat.getString(4));
                p.setSize(resultat.getString(15));
                //p.setEtat(resultat.getString(7));
                p.setPrixdachat(resultat.getFloat(6));
                p.setMarque(resultat.getString(7));
                p.setPrixvente(resultat.getFloat(8));
                p.setNote(resultat.getInt(10));
                p.setNbreV(resultat.getInt(11));
                p.setDisponible(resultat.getString(12));
                p.setimg(resultat.getString(16));
                p.setQuantit(resultat.getInt(9));
               

                listeagentskey.add(p);
            }
            
            System.out.println(listeagentskey.size());
            return listeagentskey;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des produits " + ex.getMessage());
            return null;
        }
    }
      public List<Produit> getProduitsGroupByStock() throws SQLException{
        String req = "select * from produit group by numBoutique_id";
         Statement statement = connection
                    .createStatement();
            ResultSet resultat = statement.executeQuery(req);

        List<Produit> moyens = new Vector<>();
       // StockDao TMD = new StockDao();
        BoutiqueDao TMD =new BoutiqueDao();

        while (resultat.next()) {

            Boutique tm = TMD.getStockKemil(resultat.getInt("numBoutique_id"));
          //  Boutique b=bdao.findById("numBoutique_id");
            
//Produit h =new Produit(resultat.getInt("id"),resultat.getString("nomProduit"),resultat.getString("marque"),resultat.getFloat("prix") ,resultat.getInt("ptFidelite"),resultat.getInt("numBoutique_id"),tm);
         //   Produit moyenn = new Produit(resultat.getInt("id"), resultat.getString("nomProduit"), tm);
         //   moyens.add(h);
        }
        return moyens;
    }

   
    

   


      // API STATISTIQUE salma
        public List<Produit> getProduitsGroupByStock2() throws SQLException{
        String req = "select * from produit group by boutique_id";
        Statement statement = connection.createStatement();
        ResultSet resultat = statement.executeQuery(req);
        List<Produit> moyens = new Vector<>();
        BoutiqueDao TMD =new BoutiqueDao();

        while (resultat.next()) {
        Boutique tm = TMD.getStockKemil(resultat.getInt("boutique_id"));
        //Produit h =new Produit(resultat.getInt("id"),resultat.getString("description"),resultat.getString("reference"),resultat.getString("designation") ,resultat.getString("size"),resultat.getString("disponible"), resultat.getFloat("prixdachat"), resultat.getString("marque") ,resultat.getFloat("prixvente"),resultat.getInt("note"), resultat.getString("disponible"), resultat.getString("couleur"), resultat.getString("imageName"),resultat.getInt("quantite"), resultat.getInt("boutique_id"), tm);
         //   moyens.add(h);
        }
        return moyens;
    }

   
      //API STATISTIQUE  
      public int count(int id) throws SQLException{
       String req = "select COUNT(*) as nb_moyen from produit where boutique_id=?";
          PreparedStatement ps = connection.prepareStatement(req);
            ps.setInt(1,id);
            ResultSet resultat = ps.executeQuery();
        resultat.next();
        int nb_moyen = resultat.getInt("nb_moyen");
        
        return nb_moyen;
    }
      //fin api stat salma

      
      
      
      
      
       // API STATISTIQUE nour
        public List<Produit> getProduitsGroupByStocknour() throws SQLException{
        String req = "select * from produit group by categorie";
        Statement statement = connection.createStatement();
        ResultSet resultat = statement.executeQuery(req);
        List<Produit> moyens = new Vector<>();
        ProduitDao TMD =new ProduitDao();

        while (resultat.next()) {
        //String tm = TMD.getStockqunrité(resultat.getString("categorie"));
        Produit h =new Produit(resultat.getInt("id"),resultat.getString("description"),resultat.getString("reference"),resultat.getString("designation") ,resultat.getString("size"),resultat.getString("disponible"), resultat.getFloat("prixdachat"), resultat.getString("marque") ,resultat.getFloat("prixvente"),resultat.getInt("note"), resultat.getString("disponible"), resultat.getString("couleur"), resultat.getString("imageName"),resultat.getInt("quantite"), resultat.getInt("boutique_id"),resultat.getString("categorie"));
            moyens.add(h);
        }
        return moyens;
    }

   
      //API STATISTIQUE  
      public int countnour(int id) throws SQLException{
       String req = "select COUNT(*) as nb_moyen from produit where categorie=?";
          PreparedStatement ps = connection.prepareStatement(req);
            ps.setInt(1,id);
            ResultSet resultat = ps.executeQuery();
        resultat.next();
        int nb_moyen = resultat.getInt("nb_moyen");
        
        return nb_moyen;
    }
      
              
      
    }

   

