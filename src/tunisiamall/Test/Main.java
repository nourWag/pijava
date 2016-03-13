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
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import tunisiamall.GUI.DisplayPanier;
import tunisiamall.GUI.ModeleJtableList;
import tunisiamall.IDAO.IPanierDAO;
import tunisiamall.IDAO.IPanierproduitDAO;
import tunisiamall.entities.Panier;
import tunisiamall.entities.M_Produit;
import tunisiamall.entities.Panierproduit;
import tunisiamalll.DAO.PanierDAO;
import tunisiamalll.DAO.PanierproduitDAO;
import tunisiamall.IDAO.IM_ProduitDAO;
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
    public static void main(String[] args) {
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
// pan.add(12, 3, 6);
 pan.setListPr(pandao.getAll(1));
 //System.out.println(pan.getAll(1));
 
 //Display Jtable
// List<M_Produit> data=p.getListPr();
// String[][] data2 = new String[30][4];
// String column[]={"ID","Refernce","Prix","Quantite"}; 
///// List<String> column=new Vector<String>();
// int i=0; 
//Iterator<M_Produit> iter = data.iterator(); 
//while (iter.hasNext()) { 
//    M_Produit element = iter.next(); 
//    data2[i][0]=Integer.toString(element.getId());
//    data2[i][1]=element.getReference();
//    data2[i][2]=Float.toString(element.getPrix());
//    data2[i][3]=Integer.toString(element.getQuantite_com());
//    i++; 
//} 

// column.add("id");
// column.add("Refernce");
// column.add("Prix");
// column.add("Quantite");
  
 
 
 
  //private ModeleJtableList modele = new ModeleJtableList();
                
                
                
                

               // JTable jt=new JTable(data2,column);  
                
                

                
                //jbsuppPan =new JButton(new RemoveAction());
                
 
            

                DisplayPanier f = new DisplayPanier(pan,pandao);//On crée une nouvelle instance de notre SimpleFenetre
                
                                
		f.setVisible(true);//On la rend visible
               
            
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){	
			}
		});

   
            
                
            }

  

}

    
    
    
   
        
