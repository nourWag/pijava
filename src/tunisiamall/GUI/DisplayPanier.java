/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunisiamall.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.util.Arrays;
import java.util.EventObject;
import java.util.HashMap;
import java.util.Map;
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
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import tunisiamall.IDAO.IPanierDAO;
import tunisiamall.Util.MyConnexion;
import tunisiamall.entities.Facture;
import tunisiamall.entities.Panier;
import tunisiamalll.DAO.FactureDAO;
import tunisiamalll.DAO.LigneFactureDAO;


/**
 *
 * @author sawssen
 */
public class DisplayPanier extends javax.swing.JFrame {
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
        
                JPanel panel = new JPanel();
                panel.setLayout(new BorderLayout());
                panel.setBackground(Color.WHITE);
        //setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon("C:\\\\Users\\\\sawssen\\\\Desktop\\\\ProjetYe5dem - Copie\\\\TunisiaMalll6\\\\src\\\\tunisiamall\\\\GUI\\\\tunisiamall2.jpg")));
     //setLayout(new FlowLayout());         
        //JLabel background=new JLabel(new ImageIcon("C:\\Users\\sawssen\\Desktop\\ProjetYe5dem - Copie\\TunisiaMalll6\\src\\tunisiamall\\GUI\\tunisiamall2.jpg"));
//
//        add(background);
                
                modele=new ModeleJtableList( panier.getListPr());
                jt=new JTable(modele);
                
                jt.setRowHeight(100);
                jt.getColumnModel().getColumn(1).setCellRenderer(new ImageRenderer());
                String[] values = new String[] { "1", "2", "3","4","5","6","7","8","9","10","11","12" };
                TableColumn col = jt.getColumnModel().getColumn(4);
                col.setCellEditor(new SpinnerEditor(values));
                JScrollPane sp=new JScrollPane(jt, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                
                //sp.setViewportView(jt);
               
                getContentPane().add(panel);
                panel.setSize(new Dimension(800,300)); 
                 panel.add(sp,BorderLayout.CENTER);
                //jt.setBounds(210, 190, 790, 300);     panel.add(sp,BorderLayout.CENTER);
                //panel.add(jt,BorderLayout.CENTER);
              
               panel.add(jt.getTableHeader(), BorderLayout.PAGE_START);
//              
//               panel.add(jt.getScrollableBlockIncrement());
//               panel.add(jt.getScrollableBlockIncrement(null, WIDTH, WIDTH));
//                JTableHeader header=jt.getTableHeader();
//                header.setFont(new Font("Arial", Font.BOLD, 18));
//                //header.setBackground(Color.PINK);
//                header.setForeground(Color.BLACK);
                //jt.setFont(new Font("Arial", Font.BOLD, 15));
                jt.setFont(new java.awt.Font("Arial",Font.BOLD, 12));
                //jt.setShowHorizontalLines(false);
                jt.setShowVerticalLines(false);
                jt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(51, 153, 0)));
                  DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                  centerRenderer.setHorizontalAlignment( JLabel.CENTER );
                  
                  //
//      javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
//                  jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tunisiamall/GUI/tunisiamall2.jpg"))); // NOI18N
//        jLabel1.setMaximumSize(new java.awt.Dimension(1308, 600));
//        jLabel1.setMinimumSize(new java.awt.Dimension(1308, 600));
//        jLabel1.setPreferredSize(new java.awt.Dimension(1308, 600));
//        getContentPane().add(jLabel1);
//        jLabel1.setBounds(0, 0, 1308, 566);
                 
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
                ImageIcon printIcon=new ImageIcon(iconPath+"print.png");
                
                JButton btdel=new JButton(new RemoveAction());
                btdel.setIcon(delIcon);
                boutons.add(btdel);
                
                 JButton btnsave=new JButton(new EnregistrerModifAction());
                 btnsave.setIcon(saveIcon);
                 boutons.add(btnsave);
                 //boutons.add(new JButton("Payer ma commande",payIcon));
                 
                 JButton btnimprim=new JButton(new GenererPDFAction());
                 btnimprim.setIcon(printIcon);
                 boutons.add(btnimprim);
                setLayout(new BorderLayout());
                
                panel.add(boutons,BorderLayout.SOUTH);
               
                panel.add(sp,BorderLayout.CENTER);
                                panel.setBounds(200, 130, 950, 400);

                //setLayout(new FlowLayout());
                
                
                
//                javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
//                  jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tunisiamall/GUI/tunisiamall2.jpg"))); // NOI18N
//        jLabel1.setMaximumSize(new java.awt.Dimension(1308, 600));
//        jLabel1.setMinimumSize(new java.awt.Dimension(1308, 600));
//        jLabel1.setPreferredSize(new java.awt.Dimension(1308, 600));
//        getContentPane().add(jLabel1);
//        jLabel1.setBounds(0, 0, 1308, 566);
//                getContentPane().add(sp,BorderLayout.CENTER);
//                String[] values = new String[] { "1", "2", "3","4","5","6","7","8","9","10","11","12" };
//                TableColumn col = jt.getColumnModel().getColumn(4);
//                col.setCellEditor(new SpinnerEditor(values));
                
                
                
                
                 
                
                
                
                
                
                
                
                pack();
		setTitle("Mon Panier"); //On donne un titre à l'application
		setSize(1308,500); //On donne une taille à notre fenêtre
                setSize(1308,566);
		setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
		setResizable(false); //On interdit la redimensionnement de la fenêtre
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit à l'application de se fermer lors du clic sur la croix
                //setContentPane(buildContentPane());//On prévient notre JFrame que notre JPanel sera son content pane
                

                
        
        }
    
   
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

   
   
  

    
       
     public class GenererPDFAction extends AbstractAction{ 
        public GenererPDFAction(){super("Imprimer Facture");}
         
        @Override
        public void actionPerformed(ActionEvent e) {
             // - Paramètres de connexion à la base de données
        Connection connection;
        Facture fact=new Facture();
        FactureDAO factdao=new FactureDAO();
        factdao.addFacture(fact);
        //LigneFacture lf=new LigneFacture();
        LigneFactureDAO lfdao=new LigneFactureDAO();
        lfdao.addLigneFacture(panier.getId(), fact);
        try {
            // - Connexion à la base
            connection=MyConnexion.getInstance();
            // - Chargement et compilation du rapport
            JasperDesign jasperDesign = JRXmlLoader.load("C:\\Users\\sawssen\\Documents\\facture.jrxml");
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            // - Paramètres à envoyer au rapport
            Map  parameters = new HashMap();
            parameters.put("param_idFact",fact.getId());
            // - Execution du rapport
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, connection);
            // - Création du rapport au format PDF
            JasperExportManager.exportReportToPdfFile(jasperPrint, "C:\\Users\\sawssen\\Documents\\facture.pdf");
            System.out.println("success");
        }

        catch (JRException ex) {
            System.out.println("erreur de compilation"+ ex.getMessage());
         } 

        }
    }



   
}
