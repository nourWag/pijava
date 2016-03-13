/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunisiamall.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import tunisiamall.IDAO.IPanierDAO;
import tunisiamall.entities.Panier;


/**
 *
 * @author sawssen
 */
public class DisplayPanier extends JFrame {
    private  ModeleJtableList modele ;
    private  Panier panier;
  
    private  IPanierDAO pandao;
    private JTable jt;
    
    public DisplayPanier(Panier panier,IPanierDAO pandao){
        super();
        this.panier=panier;
        this.pandao=pandao;
        build();
    }
    private void build(){
        
                //JPanel panel = new JPanel();
                //panel.setLayout(new FlowLayout());
                //panel.setBackground(Color.WHITE);
                
                modele=new ModeleJtableList( panier.getListPr());
                jt=new JTable(modele);
                
                JScrollPane sp=new JScrollPane(jt);  
               //panel.add(sp,BorderLayout.CENTER); 
                
                 JPanel boutons = new JPanel();
                 boutons.add(new JButton(new RemoveAction()));
 
                getContentPane().add(boutons,BorderLayout.SOUTH);
                
                getContentPane().add(sp,BorderLayout.CENTER);
                
                pack();
		setTitle("Mon Panier"); //On donne un titre à l'application
		setSize(800,400); //On donne une taille à notre fenêtre
		setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
		setResizable(false); //On interdit la redimensionnement de la fenêtre
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit à l'application de se fermer lors du clic sur la croix
                //setContentPane(buildContentPane());//On prévient notre JFrame que notre JPanel sera son content pane
        
        
        
        }
    
    //ici laction supprimer
    private  class RemoveAction extends AbstractAction{
        public RemoveAction() {
                super("supprimer");
            }

        @Override
        public void actionPerformed(ActionEvent e) {
             int[] selection = jt.getSelectedRows();
                for(int i = selection.length - 1; i >= 0; i--)
                    {
                        //get the id of the m_produi
                        
                       int idP=Integer.parseInt(jt.getModel().getValueAt(selection[i],0).toString());
                       
                        System.out.println("ligne selected:"+selection[i]);
                    int idSelected=selection[i];
                    pandao.delete(idP);
                    
                    //panier.supprimer(idP);
                    
                    modele.removeProduit(selection[i]);
                    }
            };
    }
    
}
