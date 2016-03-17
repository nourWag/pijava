/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunisiamall.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.EventObject;
import javax.swing.AbstractAction;
import javax.swing.AbstractCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.SpinnerListModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumn;
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
                jt.setRowHeight(100);
                jt.getColumnModel().getColumn(1).setCellRenderer(new ImageRenderer());
                JScrollPane sp=new JScrollPane(jt);  
               //panel.add(sp,BorderLayout.CENTER);
                
                JTableHeader header=jt.getTableHeader();
                header.setFont(new Font("Arial", Font.BOLD|Font.ITALIC, 18));
                //header.setBackground(Color.PINK);
                header.setForeground(Color.BLACK);
                jt.setFont(new Font("Arial", Font.BOLD, 15));
                //jt.setShowHorizontalLines(false);
                jt.setShowVerticalLines(false);
                
                  DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                  centerRenderer.setHorizontalAlignment( JLabel.CENTER );
                  
                  //
      
                  
                  //
                  jt.getColumnModel().getColumn(0).setWidth(20);
                  jt.getColumnModel().getColumn(0).setMaxWidth(80);
                    jt.getColumnModel().getColumn(0).setMinWidth(80);
                    jt.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
                    jt.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
                    jt.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
                    jt.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
                     jt.getColumnModel().getColumn(5).setCellRenderer( centerRenderer );
                     
                 JPanel boutons = new JPanel();
                String iconPath=System.getProperty("user.dir")+"\\Icons\\";
                ImageIcon delIcon=new ImageIcon(iconPath+"delete.png");
                ImageIcon saveIcon=new ImageIcon(iconPath+"save.png");
                ImageIcon settingIcon=new ImageIcon(iconPath+"setting.png");
                ImageIcon payIcon=new ImageIcon(iconPath+"Paypal.png");
                JButton btdel=new JButton(new RemoveAction());
                btdel.setIcon(delIcon);
                boutons.add(btdel);
                JButton btnModif=new JButton(new ModifierAction());
                btnModif.setIcon(settingIcon);
                boutons.add(btnModif);
                 
                 
                 JButton btnsave=new JButton(new EnregistrerModifAction());
                 btnsave.setIcon(saveIcon);
                 boutons.add(btnsave);
                 boutons.add(new JButton("Payer ma commande",payIcon));
                 
                getContentPane().add(boutons,BorderLayout.SOUTH);
                
                getContentPane().add(sp,BorderLayout.CENTER);
                String[] values = new String[] { "1", "2", "3","4","5","6","7","8","9","10","11","12" };
                TableColumn col = jt.getColumnModel().getColumn(4);
                col.setCellEditor(new SpinnerEditor(values));
                
                pack();
		setTitle("Mon Panier"); //On donne un titre à l'application
		setSize(1000,600); //On donne une taille à notre fenêtre
		setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
		setResizable(false); //On interdit la redimensionnement de la fenêtre
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit à l'application de se fermer lors du clic sur la croix
                //setContentPane(buildContentPane());//On prévient notre JFrame que notre JPanel sera son content pane
                
//        TableColumn sportColumn = table.getColumnModel().getColumn(2);
//...
//JComboBox comboBox = new JComboBox();
//comboBox.addItem("1");
//comboBox.addItem("2");
//comboBox.addItem("3");
//comboBox.addItem("Speed reading");
//comboBox.addItem("Teaching high school");
//comboBox.addItem("None");
//sportColumn.setCellEditor(new DefaultCellEditor(comboBox));
                
        
        }
    
    //ici laction supprimer
    private  class RemoveAction extends AbstractAction{
         
        public RemoveAction() {
            
                super("Supprimer");
                
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
                    pandao.delete(idP,panier.getId());
                    
                    //panier.supprimer(idP);
                    
                    modele.removeProduit(selection[i]);
                    }
            };
    }
    /////
    private  class EnregistrerModifAction extends AbstractAction{
         
        public EnregistrerModifAction() {
            
                super("Enregistrer");
                
            }


        @Override
        public void actionPerformed(ActionEvent e) {
//             int[] selection = jt.getSelectedRows();
//                for(int i = selection.length - 1; i >= 0; i--)
//                    {
//                        //get the id of the m_produi
//                        
//                       int idP=Integer.parseInt(jt.getModel().getValueAt(selection[i],0).toString());
//                       int qte=Integer.parseInt(jt.getModel().getValueAt(selection[i],4).toString());
//                        System.out.println("ligne selected:"+selection[i]);
//                    int idSelected=selection[i];
//                    pandao.savePrPanier(idP,panier.getId(),qte);
//                    
//                    //panier.supprimer(idP);
//                    
//                    modele.removeProduit(selection[i]);
//                    }
            for (int i = 0; i <modele.getRowCount(); i++) {
                int idP=Integer.parseInt(jt.getModel().getValueAt(i,0).toString());
                 int qte=Integer.parseInt(jt.getModel().getValueAt(i,4).toString());
                 pandao.savePrPanier(panier.getId(),idP,qte);
                }
            };
    }
    /////
    
    
    
    private class ModifierAction extends AbstractAction
            { public ModifierAction() {
                super("Modifier la quantité");
            }

        @Override
        public void actionPerformed(ActionEvent e) {
        String qte=JOptionPane.showInputDialog("Entrer la quantité");
        jt.getModel().setValueAt(Integer.parseInt(qte),jt.getSelectedRow(),jt.getSelectedColumn());
        }
    }
    
   class SpinnerEditor extends AbstractCellEditor implements TableCellEditor {
     final JSpinner spinner = new JSpinner();

        public SpinnerEditor(String[] items) 
        {
            spinner.setModel(new SpinnerListModel(Arrays.asList(items)));
        }

        @Override
        public Object getCellEditorValue() {
            return spinner.getValue();
        }
     @Override
        public boolean isCellEditable(EventObject evt) {
        if (evt instanceof MouseEvent) {
        return ((MouseEvent) evt).getClickCount() >= 2;
        }
        return true;
        }

        @Override
        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
             spinner.setValue(value);
             return spinner;
        }
     
   } 
   class ImageRenderer extends DefaultTableCellRenderer {
  JLabel lbl = new JLabel();
    ImageIcon icon; //= new ImageIcon("C:\\Users\\sawssen\\Documents\\NetBeansProjects\\TunisiaMalll\\src\\tunisiamall\\GUI\\PanierImages\\product1.png");
  //ImageIcon icon = new ImageIcon(getClass().getResource("product1.png"));

  public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
      boolean hasFocus, int row, int column) {
    //lbl.setText((String) value);
      //System.out.println((String)value); 
      String imagePath=System.getProperty("user.dir")+"\\produit_image\\"+(String)value;
    icon= new ImageIcon(imagePath);
    lbl.setIcon(icon);
    return lbl;
  }
}

}
