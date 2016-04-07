/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunisiamall.Test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import tunisiamall.GUI.DisplayPanier;
import tunisiamall.GUI.ModeleJtableList;
import tunisiamall.IDAO.IPanierDAO;
import tunisiamall.entities.Panier;
import tunisiamall.entities.M_Produit;
import tunisiamall.entities.Panierproduit;
import tunisiamalll.DAO.PanierDAO;
import tunisiamall.IDAO.IM_ProduitDAO;
import tunisiamall.entities.Facture;
import tunisiamall.entities.LigneFacture;
import tunisiamalll.DAO.FactureDAO;
import tunisiamalll.DAO.LigneFactureDAO;
import tunisiamalll.DAO.M_ProduitDAO;

/**
 *
 * @author sawssen
 */
public class Main {
    
    
    private static Panier pan;
    private static IPanierDAO pandao;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException {
 //Panier p=new Panier(11);
//        IPanierDAO pan=new PanierDAO();
//       pan.add(p);
//       //pan.remove(p);
//       pan.getAll();
//        Panierproduit pp=new Panierproduit();
//        IPanierproduitDAO ppdao=new PanierproduitDAO();
//        ppdao.getAll(p);
        //Stock s=new Stock(12, "type1", 3, d);
        //IStockDAO iStockDAO=new StockDAO();
        //iStockDAO.add(s);
 pan=new Panier(1,1);
 pandao=new PanierDAO();
//pan.add(12, 3, 6);
//pandao.savePrPanier(1, 1, 17);
 pan.setListPr(pandao.getAll(1));
//Facture fact=new Facture(1,123,"01/04/2016");
//FactureDAO factdao=new FactureDAO();
//factdao.addFacture(fact);
//LigneFacture lf=new LigneFacture();
//LigneFactureDAO lfdao=new LigneFactureDAO();
//lfdao.addLigneFacture(pan.getId(), fact);

            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                try {
                    //                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
                    UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                DisplayPanier f = new DisplayPanier(pan,pandao);//On crée une nouvelle instance de notre SimpleFenetre
                
                                
		f.setVisible(true);//On la rend visible
               
            
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){	
			}
		});

   
            
                
            }

  

}

    
    
    
   
        
