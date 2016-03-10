/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.DAO;


import com.esprit.IDAO.IProduitDao;
import com.esprit.Util.DataSource;
import com.esprit.entites.Produit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mehdi
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
                ps.setBoolean(6,p.isEtat());
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
                ps.setBoolean(6,p.isEtat());
                ps.setFloat(7,p.getPrixdachat());
                ps.setString(8,p.getMarque());
                ps.setFloat(9,p.getPrixvente());
               
                ps.setString(10,p.getDisponible());
                ps.setString(11,p.getimg());
                ps.setInt(12,p.getQuantit());
                
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
        }
    }

    @Override
    public void removeProduitById(int id) {
        String requete = "delete from produit where id=?";
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
    public void removeProduitByAdresse(String reference) {
        String requete = "delete from produit where reference=?";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setString(1, reference);
            ps.executeUpdate();
            System.out.println("Pays supprimée");
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
                p.setCouleur(resultat.getString(4));
                p.setDesignation(resultat.getString(5));
                p.setTaille(resultat.getString(6));
                p.setEtat(resultat.getBoolean(7));
                p.setPrixdachat(resultat.getFloat(8));
                p.setMarque(resultat.getString(9));
                p.setPrixvente(resultat.getFloat(10));
                p.setNote(resultat.getInt(11));
                p.setNbreV(resultat.getInt(12));
                p.setDisponible(resultat.getString(13));
                p.setimg(resultat.getString(14));
                p.setQuantit(resultat.getInt(15));
                
                
                
                
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
                Produit depot = new Produit();
                depot.setId(resultat.getInt(1));
                depot.setDescription(resultat.getString(2));
                depot.setReference(resultat.getString(3));               
                depot.setCouleur(resultat.getString(4));
                listedepots.add(depot);
            }
            return listedepots;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des Produits " + ex.getMessage());
            return null;
        }}
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
        
    }

   

