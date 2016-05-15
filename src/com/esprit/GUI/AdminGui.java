/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.GUI;

import com.esprit.DAO.AdminDAO;
import static com.esprit.DAO.AdminDAO.setCin1;
import com.esprit.DAO.packDao;
import com.esprit.Util.db_connection;
import com.esprit.entites.ImageProfil;
import com.esprit.entites.image;
import com.esprit.entites.fos_user;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author snoussi
 */
public class AdminGui extends javax.swing.JFrame {

    db_connection conn = new db_connection();
    Statement stm;
    ResultSet Rs;
    DefaultTableModel model = new DefaultTableModel();
    Login n = new Login();
    public static int po;
    AdminDAO a = new AdminDAO();

    /**
     * Creates new form AdminGui
     */
    /**
     * Creates new form AdminGui
     *
     * @throws java.sql.SQLException
     */
    @SuppressWarnings("empty-statement")
    public AdminGui() throws SQLException {
        model.addColumn("cin");
        model.addColumn("nom");
        model.addColumn("prenom");
        model.addColumn("mot_de_passe");
        model.addColumn("mail");
        model.addColumn("role");

        initComponents();

        // txtid.setText(""+AdminDAO.getCin1());  
        cincompte.setText("" + AdminDAO.getCin1());
        txtno.setText(AdminDAO.getNomp());
        txtpr.setText(AdminDAO.getPrenomp());
        txtma.setText(AdminDAO.getMail());

        panelimage.setVisible(false);

        panelimage.hide();
        table_client.setVisible(false);

        table_client.hide();
        statistique.setVisible(false);

        statistique.hide();
        modifierpssword.setVisible(false);

        modifierpssword.hide();
             pack.setVisible(false);

        pack.hide();
        String nompro = a.getNomp();
      //   String affmail =   ;
        //    
        //    String affmail = n.mailprofil() ;
        //String a=  ;
        //  AdminDAO a = new AdminDAO();
        JLabel label = new JLabel("mail" + a.getMail());

// jLabelp.add(mail12);
        panel.add(label);

     //  PersonneDAO pd1= new PersonneDAO();
        // pack = new pack();
        //  int id = p.getId_pack();
            //   p.setId_pack(id.getText());
        // id.set
        //   String a = id.getText();
        //  int b = Integer.parseInt(a);
        //  if ()
        //     a.cin1
        //  int d = a.getCin1();
//               p=pd.findOne(9);
//                      Blob i1 = p.getImage();
//    BufferedInputStream bis=null;
//    try{
//            bis = new BufferedInputStream(i1.getBinaryStream());
//    }catch(SQLException ex)
//    { System.out.println("erreur");  }
//    Image img2=null;
//    try{
////    
//   img2 = ImageIO.read(bis);
//    } catch(IOException ex)
//    {   System.out.println("erruer2");
//    }
//            
//           Image img3= img2.getScaledInstance(profile.getWidth(),profile.getHeight(),Image.SCALE_SMOOTH);
//    profile.setIcon(new ImageIcon(img3));   
    ///////////////////////
        //   PersonneDAO pd= new PersonneDAO();
       // user p = new user();
        //pack p2 = new pack();
          //    if (a.vérif_img_profil(AdminDAO.getCin1()))
        // {

        // p2=a.findOne(AdminDAO.getCin1());
//  
//  
//        
//         
//        Blob i = AdminDAO.getImgprofil();
//        BufferedInputStream bis1 = null;
//        try {
//            bis1 = new BufferedInputStream(i.getBinaryStream());
//        } catch (SQLException ex) {
//            System.out.println("erreur");
//        }
//        Image img5;
//        img5 = null;
//        try {
//////    
//            img5 = ImageIO.read(bis1);
//        } catch (IOException ex) {
//            System.out.println("erruer2");
//        }
////            
//        @SuppressWarnings("null")
//        Image img7 = img5.getScaledInstance(profile.getWidth(), profile.getHeight(), Image.SCALE_SMOOTH);
//        profile.setIcon(new ImageIcon(img7));

//            if(    pd.findimg(AdminDAO.getCin1()) == false){
//                
//          
//            p2=pd.findOne(5);
//  
//         
//  Blob i = p2.getImage();
//    BufferedInputStream bis1=null;
//    try{
//            bis1 = new BufferedInputStream(i.getBinaryStream());
//    }catch(SQLException ex)
//    { System.out.println("erreur");  }
//    Image img5;
//         img5 = null;
//    try{
////    
//   img5 = ImageIO.read(bis1);
//    } catch(IOException ex)
//    {   System.out.println("erruer2");
//    }
//            
//           Image img7= img5.getScaledInstance(image_par_defaut.getWidth(),image_par_defaut.getHeight(),Image.SCALE_SMOOTH);
//    image_par_defaut.setIcon(new ImageIcon(img7));
//          
//          
//            
//          
//          
//          }
        //}
///////////////
    }

    public void afficher() {
        try {
            model.setRowCount(0);
            stm = conn.obtenirconnexion().createStatement();
            ResultSet res = stm.executeQuery("Select * from fos_user");
            while (res.next()) {
                model.addRow(new Object[]{res.getInt("id"), res.getString("Nom"), res.getString("prenom"), res.getString("password"), res.getString("email"), res.getString("roles")});

            }
        } catch (SQLException e) {
            System.err.println(e);
        }

        tble.setModel(model);
 //  deplace(1);
        //   txtid.setText(model.getValueAt (1, 0).toString());
    }

    private void deplace(int i) {
        try {
            //i represente les ligne 
//   
            txtid.setText(model.getValueAt(i, 0).toString());
// 
//       txtno.setText(model.getValueAt (i, 1).toString());
//       
//    
//   txtpr.setText(model.getValueAt (i, 2).toString());
//     txtpa.setText(model.getValueAt (i, 3).toString());
//     txtma.setText(model.getValueAt (i, 4).toString());
            txtbr1.setSelectedItem(model.getValueAt(i, 5).toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erreur de deplacement de message !!!!! " + e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pack = new javax.swing.JPanel();
        jsupprimerp = new javax.swing.JButton();
        jajouter = new javax.swing.JButton();
        idimg = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tble1 = new javax.swing.JTable();
        photo1 = new javax.swing.JLabel();
        Jparcourir = new javax.swing.JButton();
        jTfImage1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        id1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTfNompack1 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        table_client = new javax.swing.JPanel();
        txtbr1 = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        txtre = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tble = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        statistique = new javax.swing.JPanel();
        chart = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        pie = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        modifierpssword = new javax.swing.JPanel();
        txtpr = new javax.swing.JTextField();
        txtma = new javax.swing.JTextField();
        txtno = new javax.swing.JTextField();
        txtpa = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        cincompte = new javax.swing.JTextField();
        panelimage = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTfImage = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        jTfNompack = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        image_par_defaut = new javax.swing.JLabel();
        state = new javax.swing.JButton();
        profile = new javax.swing.JLabel();
        tbl_client = new javax.swing.JButton();
        modifierprofile = new javax.swing.JButton();
        photo = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabelp = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1365, 700));
        getContentPane().setLayout(null);

        pack.setBackground(new java.awt.Color(255, 255, 255));
        pack.setLayout(null);

        jsupprimerp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/supprimer_1.PNG"))); // NOI18N
        jsupprimerp.setText("Supprimer");
        jsupprimerp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsupprimerpActionPerformed(evt);
            }
        });
        pack.add(jsupprimerp);
        jsupprimerp.setBounds(460, 220, 90, 40);

        jajouter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/ajouter.png"))); // NOI18N
        jajouter.setText("Ajouter");
        jajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jajouterActionPerformed(evt);
            }
        });
        pack.add(jajouter);
        jajouter.setBounds(380, 280, 150, 36);
        pack.add(idimg);
        idimg.setBounds(460, 290, 59, 20);

        tble1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tble1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tble1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tble1);

        pack.add(jScrollPane3);
        jScrollPane3.setBounds(440, 30, 430, 120);
        pack.add(photo1);
        photo1.setBounds(450, 220, 110, 60);

        Jparcourir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/parcoure.PNG"))); // NOI18N
        Jparcourir.setText("Parcourir");
        Jparcourir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JparcourirActionPerformed(evt);
            }
        });
        pack.add(Jparcourir);
        Jparcourir.setBounds(170, 280, 150, 40);

        jTfImage1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfImage1ActionPerformed(evt);
            }
        });
        pack.add(jTfImage1);
        jTfImage1.setBounds(230, 230, 143, 32);

        jLabel11.setText("Image");
        pack.add(jLabel11);
        jLabel11.setBounds(90, 240, 86, 23);

        id1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id1ActionPerformed(evt);
            }
        });
        pack.add(id1);
        id1.setBounds(220, 170, 143, 28);

        jLabel12.setText("Prioriter d'affichage");
        pack.add(jLabel12);
        jLabel12.setBounds(80, 180, 94, 14);

        jLabel13.setText("Nom Pack");
        pack.add(jLabel13);
        jLabel13.setBounds(120, 90, 70, 20);

        jTfNompack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfNompack1ActionPerformed(evt);
            }
        });
        pack.add(jTfNompack1);
        jTfNompack1.setBounds(210, 80, 143, 32);

        jButton10.setText("jButton1");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        pack.add(jButton10);
        jButton10.setBounds(290, 390, 110, 23);

        getContentPane().add(pack);
        pack.setBounds(260, 60, 1090, 600);

        table_client.setBackground(new java.awt.Color(255, 255, 255));
        table_client.setLayout(null);

        txtbr1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        txtbr1.setForeground(new java.awt.Color(255, 0, 0));
        txtbr1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "bloquer", "responsable", "client", "admin" }));
        txtbr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbr1ActionPerformed(evt);
            }
        });
        table_client.add(txtbr1);
        txtbr1.setBounds(240, 380, 140, 30);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/bloquer_débloque.PNG"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        table_client.add(jButton3);
        jButton3.setBounds(70, 380, 150, 30);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/supprimer_1.PNG"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        table_client.add(jButton6);
        jButton6.setBounds(540, 380, 100, 30);

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/recherch.PNG"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        table_client.add(jButton7);
        jButton7.setBounds(700, 380, 110, 30);

        txtre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtreActionPerformed(evt);
            }
        });
        table_client.add(txtre);
        txtre.setBounds(880, 390, 170, 30);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("actualiser");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        table_client.add(jButton5);
        jButton5.setBounds(280, 480, 190, 30);

        tble.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(51, 153, 0)));
        tble.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        tble.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tble.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tble);

        table_client.add(jScrollPane1);
        jScrollPane1.setBounds(0, 40, 1080, 210);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/layout table.PNG"))); // NOI18N
        table_client.add(jLabel1);
        jLabel1.setBounds(0, 0, 1090, 320);

        getContentPane().add(table_client);
        table_client.setBounds(260, 60, 1090, 600);

        statistique.setBackground(new java.awt.Color(255, 255, 255));
        statistique.setLayout(null);

        chart.setBackground(new java.awt.Color(204, 255, 255));
        chart.setLayout(new java.awt.BorderLayout());
        statistique.add(chart);
        chart.setBounds(27, 80, 500, 470);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/state.PNG"))); // NOI18N
        statistique.add(jLabel10);
        jLabel10.setBounds(10, 20, 532, 552);
        statistique.add(pie);
        pie.setBounds(560, 90, 510, 380);

        jLabel3.setBackground(new java.awt.Color(255, 255, 153));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/state.PNG"))); // NOI18N
        statistique.add(jLabel3);
        jLabel3.setBounds(550, 20, 532, 552);

        getContentPane().add(statistique);
        statistique.setBounds(260, 60, 1090, 600);

        modifierpssword.setBackground(new java.awt.Color(255, 255, 255));
        modifierpssword.setLayout(null);

        txtpr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtpr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprActionPerformed(evt);
            }
        });
        modifierpssword.add(txtpr);
        txtpr.setBounds(30, 170, 800, 40);

        txtma.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmaActionPerformed(evt);
            }
        });
        modifierpssword.add(txtma);
        txtma.setBounds(30, 240, 800, 45);

        txtno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnoActionPerformed(evt);
            }
        });
        modifierpssword.add(txtno);
        txtno.setBounds(30, 100, 800, 40);

        txtpa.setText("jPasswordField1");
        txtpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpaActionPerformed(evt);
            }
        });
        modifierpssword.add(txtpa);
        txtpa.setBounds(30, 320, 800, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/modifier_compte.PNG"))); // NOI18N
        modifierpssword.add(jLabel2);
        jLabel2.setBounds(20, 30, 847, 349);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/editer.PNG"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        modifierpssword.add(jButton4);
        jButton4.setBounds(30, 380, 159, 30);
        modifierpssword.add(cincompte);
        cincompte.setBounds(200, 70, 120, 20);

        getContentPane().add(modifierpssword);
        modifierpssword.setBounds(260, 60, 1090, 600);

        panelimage.setBackground(new java.awt.Color(255, 51, 51));
        panelimage.setLayout(null);

        jButton1.setText("parcou");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelimage.add(jButton1);
        jButton1.setBounds(0, 140, 90, 30);
        panelimage.add(jTfImage);
        jTfImage.setBounds(60, 110, 160, 20);

        id.setText("ecrire votre CIN");
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        panelimage.add(id);
        id.setBounds(60, 70, 160, 30);

        jTfNompack.setText("nom");
        panelimage.add(jTfNompack);
        jTfNompack.setBounds(60, 30, 160, 30);

        jButton2.setText("enregisrer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panelimage.add(jButton2);
        jButton2.setBounds(150, 140, 90, 30);

        jButton9.setText("afficher");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        panelimage.add(jButton9);
        jButton9.setBounds(150, 140, 90, 30);
        panelimage.add(image_par_defaut);
        image_par_defaut.setBounds(0, 0, 240, 170);

        getContentPane().add(panelimage);
        panelimage.setBounds(10, 70, 240, 170);

        state.setBackground(new java.awt.Color(255, 0, 0));
        state.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/satistique.PNG"))); // NOI18N
        state.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                stateMouseReleased(evt);
            }
        });
        state.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateActionPerformed(evt);
            }
        });
        getContentPane().add(state);
        state.setBounds(0, 390, 260, 70);

        profile.setBackground(new java.awt.Color(255, 51, 0));
        profile.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(profile);
        profile.setBounds(40, 70, 190, 150);

        tbl_client.setBackground(new java.awt.Color(255, 0, 0));
        tbl_client.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/table de client.PNG"))); // NOI18N
        tbl_client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbl_clientActionPerformed(evt);
            }
        });
        getContentPane().add(tbl_client);
        tbl_client.setBounds(0, 320, 260, 70);

        modifierprofile.setBackground(new java.awt.Color(255, 0, 0));
        modifierprofile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/modifier profill.PNG"))); // NOI18N
        modifierprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierprofileActionPerformed(evt);
            }
        });
        getContentPane().add(modifierprofile);
        modifierprofile.setBounds(0, 460, 260, 70);

        photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/photo.PNG"))); // NOI18N
        photo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                photoActionPerformed(evt);
            }
        });
        getContentPane().add(photo);
        photo.setBounds(60, 250, 80, 50);

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/packs.PNG"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(0, 530, 260, 70);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/black.PNG"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 240, 230, 60);

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setForeground(new java.awt.Color(255, 255, 255));
        panel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(panel);
        panel.setBounds(1020, 20, 210, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/admin 1920.PNG"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1350, 662);
        getContentPane().add(jLabelp);
        jLabelp.setBounds(210, 44, 120, 30);

        txtid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        getContentPane().add(txtid);
        txtid.setBounds(140, 10, 120, 30);

        jButton8.setText("jButton8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(0, 0, 270, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbleMouseClicked
        try {
            int i = tble.getSelectedRow();

            deplace(i);
            //sa si quant on choisir un nom dans le tableau il va afficher sur les fieldtext
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erreur selectionne\n" + e.getMessage());
        }
    }//GEN-LAST:event_tbleMouseClicked

    private void txtbr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbr1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbr1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        AdminDAO a = new AdminDAO();

        a.modifier(txtbr1.getSelectedItem().toString(), txtid.getText());
        afficher();
        //        try {
        //            if (JOptionPane.showConfirmDialog (null,"confirmer la modification","modification",
        //                    JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
        //
        //                stm.executeUpdate("UPDATE user SET role='"+txtbr.getSelectedItem().toString()+"' WHERE cin= "+txtid.getText());
        //               afficher ();
        //            }
        //        } catch (Exception e){JOptionPane.showMessageDialog(null,"erreur de modifier !!!!!!!");
        //        System.err.println(e);}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        AdminDAO a = new AdminDAO();

        a.supprimer(txtid.getText());
        afficher();
        //        try {
        //             if(JOptionPane.showConfirmDialog(null,"attention vous avez supprimer un client,est ce que tu et sure?"
        //                     ,"supprimer client",JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION)
        //
        //            if(txtid.getText().length() != 0){
        //    //   stm.executeUpdate("Delete From user");
        //         stm.executeUpdate("Delete From user where cin = "+txtid.getText());afficher();
        //             }//ca est pour recharger la list des stagiaire
        //            else { JOptionPane.showMessageDialog(null,"veuillez remplire le champ id !");}
        //
        //        }catch (Exception e){JOptionPane.showMessageDialog(null,"erreur de supprimer \n"+e.getMessage());}
        //        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

       // adminDAO a=new adminDAO();
       // a.rechercher(txtre.getText());
        //  a.findOne(txtid.getText());
        //   int i=0;deplace(i);
        // afficher();
        try {
            model.setRowCount(0);// pour vider la list des client
            //  if(rbtn1){ //radio btn matriricule 
            // Rs = stm.executeQuery("Select * From user WHERE role = "+txtre.getText());
            //   }else {
            Rs = stm.executeQuery("Select * From fos_user WHERE id = " + txtre.getText());
            //  }
            while (Rs.next()) {

                Object[] user = {Rs.getInt(1), Rs.getString(2), Rs.getString(3), Rs.getString(4), Rs.getString(5), Rs.getString(6)};
                model.addRow(user);
            }
            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "il y a aucun client");
//      
            } else {
                int i = 0;
                deplace(i);
//          
                txtbr1.setSelectedItem(model.getValueAt(0, 5).toString());

////    
            }
        } catch (Exception e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(null, e.getMessage());
        }


    }//GEN-LAST:event_jButton7ActionPerformed

    private void txtreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtreActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        txtid.setEnabled(false);        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        afficher();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg", "gif", "png");
        chooser.addChoosableFileFilter(filter);

        int result = chooser.showSaveDialog(null);
        // chooser.showOpenDialog(null);

        File f = chooser.getSelectedFile();
        String path = f.getAbsolutePath();
        //Lpath.setIcon(ResizeImage(path));
        jTfImage.setText(path);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        FileInputStream fileInputStream = null;
        String path = jTfImage.getText();

        File file = new File(path);
        byte[] bFile = new byte[(int) file.length()];

        try {
            //convert file into array of bytes

            fileInputStream = new FileInputStream(file);
            fileInputStream.read(bFile);
            fileInputStream.close();

        } catch (IOException e) {
        }

        //  String jBottonText = groupButton1( );
        // if ( "pack".equals(jBottonText) )
        // {
        fos_user cp = new fos_user();
     //   cp.setImage(jTfImage.getText());
        // cp.setId_pac(id.getText());

        // String path = jTfImage.getText();
        File imageC = new File(path);
        BufferedImage originalImage = null;
        try {
            originalImage = ImageIO.read(imageC);
        } catch (IOException ex) {
            Logger.getLogger(fos_user.class.getName()).log(Level.SEVERE, null, ex);
        }
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            ImageIO.write(originalImage, "jpg", baos);
        } catch (IOException ex) {
            Logger.getLogger(fos_user.class.getName()).log(Level.SEVERE, null, ex);
        }
        byte[] imageInByte = baos.toByteArray();
//        cp.setPhoto_profile(imageInByte);

            // pack cpd = new pack();
        //   AdminDAO r = new AdminDAO();
        // r.ajouterimgProfile(cp);
        //  r.ajouterpacker(cp);
        packDao ab = new packDao();

        ab.modifierprofile1(jTfImage.getText());

        JOptionPane.showMessageDialog(null, "pack ajouter", "Information", JOptionPane.INFORMATION_MESSAGE);
            //   }

        panelimage.setVisible(false);

        panelimage.hide();

        profile.setVisible(false);

        profile.show();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprActionPerformed

    private void txtmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmaActionPerformed

    private void txtnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnoActionPerformed

    private void txtpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpaActionPerformed

    private void stateMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stateMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_stateMouseReleased

    private void stateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateActionPerformed
// profile() ;
        table_client.setVisible(false);

        table_client.hide();
        statistique.setVisible(false);

        statistique.show();
        modifierpssword.setVisible(false);

        modifierpssword.hide();

        AdminDAO cdao = new AdminDAO();
        //  ResponsablePatisserieDAO rpdao = new ResponsablePatisserieDAO();
        DefaultCategoryDataset barChartData = new DefaultCategoryDataset();
        barChartData.setValue(cdao.calculNombreClient(), "Nombre des utilisateurs", "Clients");
        barChartData.setValue(cdao.calculNombreResponsable(), "Nombre des utilisateurs", "Responsables Boutique");

        JFreeChart barChart = ChartFactory.createBarChart3D("Statistiques des membres", "Type", "Nombre des utilisateurs", barChartData, PlotOrientation.VERTICAL, rootPaneCheckingEnabled, rootPaneCheckingEnabled, rootPaneCheckingEnabled);
        CategoryPlot barchrt = barChart.getCategoryPlot();
        barchrt.setRangeGridlinePaint(Color.ORANGE);
        ChartPanel barPanel = new ChartPanel(barChart);
        chart.removeAll();
        chart.add(barPanel, BorderLayout.CENTER);
        chart.validate();
               // AdminDAO  cdao = new AdminDAO();
        //  ResponsablePatisserieDAO rpdao = new ResponsablePatisserieDAO();
//             DefaultCategoryDataset barChartData = new DefaultCategoryDataset();
//        barChartData.setValue(cdao.calculNombreClient(), "Nombre des utilisateurs", "Clients");
//        barChartData.setValue(cdao.calculNombreResponsable(), "Nombre des utilisateurs", "Responsables Boutique");
//
//        JFreeChart barChart = ChartFactory.createBarChart3D("Statistiques des membres", "Type", "Nombre des utilisateurs", barChartData, PlotOrientation.VERTICAL, rootPaneCheckingEnabled, rootPaneCheckingEnabled, rootPaneCheckingEnabled);
//        CategoryPlot barchrt = barChart.getCategoryPlot();
//        barchrt.setRangeGridlinePaint(Color.ORANGE);
//        ChartPanel barPanel = new ChartPanel(barChart);
//        jPanel2.removeAll();
//        jPanel2.add(barPanel, BorderLayout.CENTER);
//        jPanel2.validate();
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        pieDataset.setValue("Clients", cdao.calculNombreClient());

        pieDataset.setValue("Responsables Boutique", cdao.calculNombreResponsable());

        JFreeChart chart = ChartFactory.createPieChart("Pie chart", pieDataset, true, true, true);
        PiePlot P = (PiePlot) chart.getPlot();
//           P.setForegroundAlpha(TOP_ALIGNMENT);
        // ChartFrame frame = new ChartFrame("Pie chart", chart);
        //// frame.setVisible(true);
        // frame.setSize(600,700);
        ChartPanel piePanel = new ChartPanel(chart);
        pie.removeAll();
        pie.add(piePanel, BorderLayout.CENTER);
        pie.validate();


    }//GEN-LAST:event_stateActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
//  JLabel label = new JLabel("vtre CIN :" +AdminDAO.getCin1());

// jLabelp.add(mail12);
        // panel.add(label);
        AdminDAO a = new AdminDAO();

        //
        a.modifiercompte(txtno.getText(), txtpr.getText(), txtma.getText(), txtpa.getText(), cincompte.getText());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void modifierprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierprofileActionPerformed
        table_client.setVisible(false);

        table_client.hide();
        statistique.setVisible(false);

        statistique.hide();
        modifierpssword.setVisible(false);

        modifierpssword.show();
              pack.setVisible(false);

        pack.hide();

// TODO add your handling code here:
        //  AdminDAO k = new AdminDAO();
        // JLabel label = new JLabel("mail"+a.getMail());
 /// jLabelp.add(mail12);
        // panel.add(label);
             //  txtpa.set;

    }//GEN-LAST:event_modifierprofileActionPerformed

    private void tbl_clientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbl_clientActionPerformed
        // TODO add your handling code here:
        // profile() ;
        afficher();
        table_client.setVisible(false);

        table_client.show();
        statistique.setVisible(false);

        statistique.hide();
        modifierpssword.setVisible(false);

        modifierpssword.hide();
              pack.setVisible(false);

        pack.hide();


    }//GEN-LAST:event_tbl_clientActionPerformed

    private void photoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_photoActionPerformed
        // TODO add your handling code here:

        panelimage.setVisible(false);

        panelimage.show();

    }//GEN-LAST:event_photoActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:

       //  profile() ;

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        jButton9.setVisible(false);

        jButton9.hide();
//        fos_user p = new fos_user();
//
////        p=a.findOne(AdminDAO.getCin1());
////        Blob i = p.getProfile();
//        BufferedInputStream bis1 = null;
//        try {
//            bis1 = new BufferedInputStream(i.getBinaryStream());
//        } catch (SQLException ex) {
//            System.out.println("erreur");
//        }
//        Image img5;
//        img5 = null;
//        try {
////    
//            img5 = ImageIO.read(bis1);
//        } catch (IOException ex) {
//            System.out.println("erruer2");
//        }
//
//        Image img7 = img5.getScaledInstance(profile.getWidth(), profile.getHeight(), Image.SCALE_SMOOTH);
//        profile.setIcon(new ImageIcon(img7));

// TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        pack.setVisible(false);

        pack.show();

      table_client.setVisible(false);

        table_client.hide();
        statistique.setVisible(false);

        statistique.hide();
        modifierpssword.setVisible(false);

        modifierpssword.hide();

   model.setRowCount(0);
    
    try {
   model.setRowCount(0);
    
stm=conn.obtenirconnexion().createStatement();
ResultSet res=stm.executeQuery("Select * from image");
while(res.next()){
model.addRow(new Object[]{res.getInt("id"),res.getString("titre"),res.getString("img")});

}
}catch(SQLException e){System.err.println(e);}

tble.setModel(model);

        ////table catP
        //      List<String> listeCatP = new ArrayList<>();
        //     DefaultTableModel mod= (DefaultTableModel)jTablepack.getModel();
        //     packDao catpdao = new packDao();
        //     listeCatP= catpdao.afficherNomCatP();
        ////    listeCatP= catpdao.afficherNomCatP();
        //    int x = listeCatP.size();
        //    for (int i=1;i<=x;i++)
        //    {
            //
            //    mod.addRow(new Object[] {listeCatP});
            //    }
        //    System.out.println(listeCatP);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jsupprimerpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsupprimerpActionPerformed

        packDao a=new packDao();

        a.supprimer(id.getText());
        afficher1();
        ////  packDao pa = new packDao();
        //  pack cp = new pack();
        //  pa.supprimerpack(cp);

        JOptionPane.showMessageDialog(null, "pack Supprim�e", "Information",JOptionPane.INFORMATION_MESSAGE );
        afficher1();
    }//GEN-LAST:event_jsupprimerpActionPerformed

    private void jajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jajouterActionPerformed
        //a verifierr
        FileInputStream fileInputStream=null;
        String path = jTfImage.getText();

        File file = new File(path);
        byte[] bFile = new byte[(int) file.length()];

        try {
            //convert file into array of bytes

            fileInputStream = new FileInputStream(file);
            fileInputStream.read(bFile);
            fileInputStream.close();

        }catch(IOException e){
        }

        //  String jBottonText = groupButton1( );

        // if ( "pack".equals(jBottonText) )
        // {
            image cp = new image();
            cp.setTitre(jTfNompack.getText());
            cp.setId(id.getText());

            //  String path = jTfImage.getText();
            File imageC=new File(path);
            BufferedImage originalImage = null;
            try {
                originalImage = ImageIO.read(imageC);
            } catch (IOException ex) {
                Logger.getLogger(image.class.getName()).log(Level.SEVERE, null, ex);
            }
            ByteArrayOutputStream baos=new ByteArrayOutputStream();
            try {
                ImageIO.write(originalImage, "jpg", baos );
            } catch (IOException ex) {
                Logger.getLogger(image.class.getName()).log(Level.SEVERE, null, ex);
            }
            byte[] imageInByte=baos.toByteArray();
            cp.setPhoto_pack(imageInByte);

            //  pack cpd = new pack();
            AdminDAO r = new AdminDAO();
            r.ajouterpacker(cp);
            //  cpd.ajouterpacker(cp);

            JOptionPane.showMessageDialog(null, "pack ajouter", "Information",JOptionPane.INFORMATION_MESSAGE );
            //   }
        afficher1();
    }//GEN-LAST:event_jajouterActionPerformed

    private void tble1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tble1MouseClicked
        try {  int i=tble.getSelectedRow();

            deplace(i);
            //sa si quant on choisir un nom dans le tableau il va afficher sur les fieldtext
        }
        catch (Exception e){JOptionPane.showMessageDialog(null,"erreur selectionne\n"+e.getMessage());

        }
    }//GEN-LAST:event_tble1MouseClicked

    private void JparcourirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JparcourirActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg","gif","png");
        chooser.addChoosableFileFilter(filter);

        int result = chooser.showSaveDialog(null);
        // chooser.showOpenDialog(null);

        File f = chooser.getSelectedFile();
        String path=f.getAbsolutePath();
        //Lpath.setIcon(ResizeImage(path));
        jTfImage.setText(path);
    }//GEN-LAST:event_JparcourirActionPerformed

    private void jTfImage1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfImage1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfImage1ActionPerformed

    private void id1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id1ActionPerformed

    private void jTfNompack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfNompack1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfNompack1ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        packDao a=new packDao();

        a.modifier(id.getText(), idimg.getText());
        afficher1();

    }//GEN-LAST:event_jButton10ActionPerformed
       public void afficher1(){
    try {
   model.setRowCount(0);
    
stm=conn.obtenirconnexion().createStatement();
ResultSet res=stm.executeQuery("Select * from image");
while(res.next()){
model.addRow(new Object[]{res.getInt("id"),res.getString("titre"),res.getString("img")});

}
}catch(SQLException e){System.err.println(e);}

tble.setModel(model);
       }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
                UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");

            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                try {
                    new AdminGui().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(afficher_pack.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jparcourir;
    private javax.swing.JPanel chart;
    private javax.swing.JTextField cincompte;
    private javax.swing.JTextField id;
    private javax.swing.JTextField id1;
    private javax.swing.JTextField idimg;
    private javax.swing.JLabel image_par_defaut;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelp;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTfImage;
    private javax.swing.JTextField jTfImage1;
    private javax.swing.JTextField jTfNompack;
    private javax.swing.JTextField jTfNompack1;
    private javax.swing.JButton jajouter;
    private javax.swing.JButton jsupprimerp;
    private javax.swing.JButton modifierprofile;
    private javax.swing.JPanel modifierpssword;
    private javax.swing.JPanel pack;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelimage;
    private javax.swing.JButton photo;
    private javax.swing.JLabel photo1;
    private javax.swing.JPanel pie;
    private javax.swing.JLabel profile;
    private javax.swing.JButton state;
    private javax.swing.JPanel statistique;
    private javax.swing.JPanel table_client;
    private javax.swing.JButton tbl_client;
    private javax.swing.JTable tble;
    private javax.swing.JTable tble1;
    private javax.swing.JComboBox txtbr1;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtma;
    private javax.swing.JTextField txtno;
    private javax.swing.JPasswordField txtpa;
    private javax.swing.JTextField txtpr;
    private javax.swing.JTextField txtre;
    // End of variables declaration//GEN-END:variables
}
