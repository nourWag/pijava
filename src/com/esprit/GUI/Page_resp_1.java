package com.esprit.GUI;

import javax.swing.ImageIcon;
import com.esprit.DAO.AdminDAO;
import com.esprit.DAO.BoutiqueDao;
import com.esprit.DAO.ProduitDao;
import com.esprit.DAO.packDao;
import com.esprit.IDAO.IBoutiqueDao;
import com.esprit.Util.db_connection;
import com.esprit.adapters.BoutiqueAdapter;
import com.esprit.entites.Boutique;
import com.esprit.entites.Produit;
import com.esprit.entites.image;
import com.esprit.entites.fos_user;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author pc
 */
public class Page_resp_1 extends javax.swing.JFrame {

    /**
     * Creates new form Respensable_page
     */
    Timer tm;
    int x = 0;
    Statement stm;
    ResultSet Rs;
    db_connection conn = new db_connection();
    DefaultTableModel model = new DefaultTableModel();
    EnvoieMail es = new EnvoieMail();
    //Images Path In Array
    String[] list = {
        "C:\\Users\\pc\\Desktop\\TunisiaMallPhoto\\1.jpg",//0
        "C:\\Users\\pc\\Desktop\\TunisiaMallPhoto\\2.jpg",//1
        "C:\\Users\\pc\\Desktop\\TunisiaMallPhoto\\3.jpg",//2
        "C:\\Users\\pc\\Desktop\\TunisiaMallPhoto\\4.jpg",//3
        "C:\\Users\\pc\\Desktop\\TunisiaMallPhoto\\5.jpg",//4
        "C:\\Users\\pc\\Desktop\\TunisiaMallPhoto\\6.jpg",//5
        "C:\\Users\\pc\\Desktop\\TunisiaMallPhoto\\7.jpg",//6
        "C:\\Users\\pc\\Desktop\\TunisiaMallPhoto\\8.jpg",
        "C:\\Users\\pc\\Desktop\\TunisiaMallPhoto\\9.jpg",
        "C:\\Users\\pc\\Desktop\\TunisiaMallPhoto\\10.jpg",
        "C:\\Users\\pc\\Desktop\\TunisiaMallPhoto\\11.jpg",
        "C:\\Users\\pc\\Desktop\\TunisiaMallPhoto\\12.jpg",
        "C:\\Users\\pc\\Desktop\\TunisiaMallPhoto\\13.jpg",
        "C:\\Users\\pc\\Desktop\\TunisiaMallPhoto\\14.jpg",
        "C:\\Users\\pc\\Desktop\\TunisiaMallPhoto\\15.jpg",
        "C:\\Users\\pc\\Desktop\\TunisiaMallPhoto\\16.jpg",
        "C:\\Users\\pc\\Desktop\\TunisiaMallPhoto\\17.jpg",
        "C:\\Users\\pc\\Desktop\\TunisiaMallPhoto\\18.jpg",};

    public Page_resp_1() {
        super("Java SlideShow");
        initComponents();

        model.addColumn("Priorit d'affichage");
        model.addColumn("nom_pack");
        model.addColumn("photo_pack");
        AdminDAO a = new AdminDAO();

        //imageeeeeeeeeeee
        pic3.setBounds(0, 0, 500, 200);
        SetImageSize(6);
        //set a timer
        tm = new Timer(1500, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                SetImageSize(x);
                x += 1;
                if (x >= list.length) {
                    x = 0;
                }
            }
        });
        //add(pic);
        tm.start();
        //setLayout(null);
        // setSize(566, 300);
        //  getContentPane().setBackground(Color.decode("#bdb67b"));
        //  setLocationRelativeTo(null);
        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setVisible(true);
        //imageeeeeeeee

        cincompte.setText("" + AdminDAO.getCin1());
        txtno.setText(AdminDAO.getNomp());
        txtpr.setText(AdminDAO.getPrenomp());
        txtma.setText(AdminDAO.getMail());
        pack.setVisible(false);
        pack.hide();

        panel_image_deroulante.setVisible(true);
        panel_image_deroulante.show();

        p.setVisible(false);
        p.hide();

        p.setVisible(false);
        p.hide();
        es.setVisible(false);
        es.hide();

        panel_salma.setVisible(false);
        panel_salma.hide();

        panel_stat.setVisible(false);
        panel_stat.hide();
        modifierpssword.setVisible(false);

        modifierpssword.hide();
        JLabel label = new JLabel("mail" + a.getMail());
        //   p3.setVisible(false);
    }

    //create a function to resize the image 

    public void SetImageSize(int i) {
        ImageIcon icon = new ImageIcon(list[i]);
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(500, 200, Image.SCALE_SMOOTH);
        ImageIcon newImc = new ImageIcon(newImg);
        pic3.setIcon(newImc);
    }

    public void afficher1() {
        try {
            model.setRowCount(0);
            stm = conn.obtenirconnexion().createStatement();
            ResultSet res = stm.executeQuery("Select * from pack");
            while (res.next()) {
                model.addRow(new Object[]{res.getInt("id_pack"), res.getString("Nom_pack"), res.getString("photo_pack")});

            }
        } catch (SQLException e) {
            System.err.println(e);
        }

        tble.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        modifierpssword = new javax.swing.JPanel();
        txtpr = new javax.swing.JTextField();
        txtma = new javax.swing.JTextField();
        txtno = new javax.swing.JTextField();
        txtpa = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        cincompte = new javax.swing.JTextField();
        pack = new javax.swing.JPanel();
        jsupprimerp = new javax.swing.JButton();
        idimg = new javax.swing.JTextField();
        jajouter = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tble = new javax.swing.JTable();
        photo = new javax.swing.JLabel();
        Jparcourir = new javax.swing.JButton();
        jTfImage = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTfNompack = new javax.swing.JTextField();
        panel_salma = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt1_nom = new javax.swing.JTextField();
        txt2_cat = new javax.swing.JTextField();
        txt3_email = new javax.swing.JTextField();
        txt4_fax = new javax.swing.JTextField();
        txt5_num = new javax.swing.JTextField();
        txt6_desc = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt7_prom = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        boutique = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        panel_stat = new javax.swing.JPanel();
        panel_image_deroulante = new javax.swing.JPanel();
        pic3 = new javax.swing.JLabel();
        modifierprofile = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        stat_btn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        search_butn = new javax.swing.JButton();
        jTextSearch = new javax.swing.JTextField();
        p = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/modifier_compte.PNG"))); // NOI18N
        modifierpssword.add(jLabel14);
        jLabel14.setBounds(20, 30, 847, 349);

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/editer.PNG"))); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        modifierpssword.add(jButton12);
        jButton12.setBounds(30, 380, 159, 30);
        modifierpssword.add(cincompte);
        cincompte.setBounds(200, 70, 120, 20);

        jPanel1.add(modifierpssword, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 1020, 510));

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
        jsupprimerp.setBounds(560, 220, 90, 40);
        pack.add(idimg);
        idimg.setBounds(410, 210, 59, 20);

        jajouter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/ajouter.png"))); // NOI18N
        jajouter.setText("Ajouter");
        jajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jajouterActionPerformed(evt);
            }
        });
        pack.add(jajouter);
        jajouter.setBounds(380, 280, 150, 36);

        tble.setModel(new javax.swing.table.DefaultTableModel(
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
        tble.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbleMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tble);

        pack.add(jScrollPane3);
        jScrollPane3.setBounds(440, 30, 430, 120);
        pack.add(photo);
        photo.setBounds(450, 220, 110, 60);

        Jparcourir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/parcoure.PNG"))); // NOI18N
        Jparcourir.setText("Parcourir");
        Jparcourir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JparcourirActionPerformed(evt);
            }
        });
        pack.add(Jparcourir);
        Jparcourir.setBounds(170, 280, 150, 40);

        jTfImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfImageActionPerformed(evt);
            }
        });
        pack.add(jTfImage);
        jTfImage.setBounds(230, 230, 143, 32);

        jLabel11.setText("Image");
        pack.add(jLabel11);
        jLabel11.setBounds(90, 240, 86, 23);

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        pack.add(id);
        id.setBounds(220, 170, 143, 28);

        jLabel12.setText("Prioriter d'affichage");
        pack.add(jLabel12);
        jLabel12.setBounds(80, 180, 94, 14);

        jLabel13.setText("Nom Pack");
        pack.add(jLabel13);
        jLabel13.setBounds(120, 90, 70, 20);

        jTfNompack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfNompackActionPerformed(evt);
            }
        });
        pack.add(jTfNompack);
        jTfNompack.setBounds(210, 80, 143, 32);

        jPanel1.add(pack, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 1020, 510));

        panel_salma.setBackground(new java.awt.Color(255, 255, 255));
        panel_salma.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton9.setBackground(new java.awt.Color(255, 0, 0));
        jButton9.setText("Ajouter Image ");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        panel_salma.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 110, 30));

        jButton8.setBackground(new java.awt.Color(255, 102, 255));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton8.setText("Modifier");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        panel_salma.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 480, 100, 50));

        jButton7.setMaximumSize(new java.awt.Dimension(27, 27));
        jButton7.setMinimumSize(new java.awt.Dimension(27, 27));
        jButton7.setPreferredSize(new java.awt.Dimension(27, 27));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        panel_salma.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 480, 100, 49));

        jButton5.setBackground(new java.awt.Color(255, 0, 0));
        jButton5.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jButton5.setText("Modifier");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        panel_salma.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 110, 30));

        jButton4.setBackground(new java.awt.Color(255, 0, 0));
        jButton4.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jButton4.setText("Ajouter");
        jButton4.setMaximumSize(new java.awt.Dimension(27, 27));
        jButton4.setMinimumSize(new java.awt.Dimension(27, 27));
        jButton4.setPreferredSize(new java.awt.Dimension(27, 27));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panel_salma.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 100, 30));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("Nom de la boutique:");
        panel_salma.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 70, 150, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setText("catégorie:");
        panel_salma.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setText("Fax:");
        panel_salma.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel6.setText("Numéro telephone:");
        panel_salma.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 150, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel7.setText("Adresse Email:");
        panel_salma.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel8.setText("Promotion:");
        panel_salma.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel9.setText("Description:");
        panel_salma.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        txt1_nom.setBorder(null);
        panel_salma.add(txt1_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 220, 20));

        txt2_cat.setBorder(null);
        panel_salma.add(txt2_cat, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 200, 20));

        txt3_email.setBorder(null);
        panel_salma.add(txt3_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 200, 20));

        txt4_fax.setBorder(null);
        panel_salma.add(txt4_fax, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 200, 20));

        txt5_num.setBorder(null);
        txt5_num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt5_numActionPerformed(evt);
            }
        });
        panel_salma.add(txt5_num, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 220, 20));

        txt6_desc.setBorder(null);
        panel_salma.add(txt6_desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 304, 240, 20));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/delete_button2.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
        });
        panel_salma.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 270, 50, 50));

        txt7_prom.setBorder(null);
        txt7_prom.setOpaque(false);
        panel_salma.add(txt7_prom, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 200, 30));

        boutique.setModel(new BoutiqueAdapter()
        );
        boutique.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boutiqueMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(boutique);

        panel_salma.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 480, 230));

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jButton6.setText("Ajouter Image");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        panel_salma.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 380, 140, 47));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/form_behiiii.png"))); // NOI18N
        panel_salma.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 460));

        jPanel1.add(panel_salma, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 980, 470));

        panel_stat.setLayout(null);
        jPanel1.add(panel_stat, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 700, 480));

        panel_image_deroulante.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panel_image_deroulanteLayout = new javax.swing.GroupLayout(panel_image_deroulante);
        panel_image_deroulante.setLayout(panel_image_deroulanteLayout);
        panel_image_deroulanteLayout.setHorizontalGroup(
            panel_image_deroulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );
        panel_image_deroulanteLayout.setVerticalGroup(
            panel_image_deroulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic3, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
        );

        jPanel1.add(panel_image_deroulante, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 520, 380));

        modifierprofile.setBackground(new java.awt.Color(255, 0, 0));
        modifierprofile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/modifier profill.PNG"))); // NOI18N
        modifierprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierprofileActionPerformed(evt);
            }
        });
        jPanel1.add(modifierprofile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 254, 60));

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/packs.PNG"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 255, 63));

        stat_btn.setBackground(new java.awt.Color(255, 153, 255));
        stat_btn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        stat_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/stat.png"))); // NOI18N
        stat_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        stat_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                stat_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                stat_btnMouseExited(evt);
            }
        });
        stat_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stat_btnActionPerformed(evt);
            }
        });
        jPanel1.add(stat_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 255, 63));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/gerer_btn.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 255, 63));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/produit1.png"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 255, 63));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Mail_btn.png"))); // NOI18N
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 255, 63));

        search_butn.setBackground(new java.awt.Color(0, 0, 0));
        search_butn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/search-icon copie.png"))); // NOI18N
        search_butn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        search_butn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_butnActionPerformed(evt);
            }
        });
        jPanel1.add(search_butn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 20, 40, 20));

        jTextSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSearchActionPerformed(evt);
            }
        });
        jPanel1.add(jTextSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 20, 160, -1));

        p.setBackground(new java.awt.Color(204, 51, 255));

        jTable1.setModel(new BoutiqueAdapter()
        );
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout pLayout = new javax.swing.GroupLayout(p);
        p.setLayout(pLayout);
        pLayout.setHorizontalGroup(
            pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );
        pLayout.setVerticalGroup(
            pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 610, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/resp3.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1308, 666));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        ImageIcon i = new ImageIcon(getClass().getResource("/Icon/gerer2_btn.png"));
        jButton1.setIcon(i);
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        ImageIcon i = new ImageIcon(getClass().getResource("/Icon/gerer_btn.png"));
        jButton1.setIcon(i);
        // System.out.println("getClass().getResource(\"/Icon/gerer_btn.png\"");
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      Page_resp_12n es1  = new Page_resp_12n();
        //nom de la classe
        es1.setVisible(true);
        
        es1.setLocationRelativeTo(null);
        es1.setVisible(true);
        this.setVisible(false); 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        ImageIcon i = new ImageIcon(getClass().getResource("/Icon/produit2.png"));
        jButton2.setIcon(i);
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        ImageIcon i = new ImageIcon(getClass().getResource("/Icon/produit1.png"));
        jButton2.setIcon(i);
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//    Page_resp_2 es=new Page_resp_2(); //nom de la classe
//        es.setVisible(true);
//        es.setSize(1308,566);
//        es.setLocationRelativeTo(null);
//        es.setVisible(true);
//        this.setVisible(false);
        modifierpssword.setVisible(false);

        modifierpssword.hide();
        panel_image_deroulante.setVisible(false);
        p.setVisible(false);
        panel_stat.setVisible(false);
        panel_salma.setVisible(true);
        panel_salma.show();
        pack.setVisible(false);
        pack.hide();
        es.setVisible(false);
        es.hide();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        EnvoieMail es = new EnvoieMail();
        this.setVisible(true);
        es.setVisible(true);
        es.setSize(919, 546);
        es.setLocationRelativeTo(null);

        modifierpssword.setVisible(false);

        modifierpssword.hide();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        ImageIcon i = new ImageIcon(getClass().getResource("/Icon/btn_Mail_Dark.png"));
        jButton3.setIcon(i);
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        ImageIcon i = new ImageIcon(getClass().getResource("/Icon/Mail_btn.png"));
        jButton3.setIcon(i);
    }//GEN-LAST:event_jButton3MouseExited

    private void search_butnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_butnActionPerformed
        // TODO add your handling code here:
        // jTable1.setModel(new ProduitAdapter(new ProduitDao().findProduitByCouleur(jTextSearch.getText())));

        if (!jTextSearch.getText().equals("")) {

            jTable1.setModel(new BoutiqueAdapter(new BoutiqueDao().getAllByKey(jTextSearch.getText())));
            // jTable1.setModel(new BoutiqueAdapter(new BoutiqueDao().findProduitByCouleur(jTextSearch.getText())));
            //jScrollPane1.setViewportView(TablePorteur);
        } else {

            showMessageDialog(this, "Vous devez ecrire quelque chose", "Attention", JOptionPane.INFORMATION_MESSAGE);
            jTable1.setModel(new BoutiqueAdapter());
        }
        jTextSearch.setText("");
        panel_image_deroulante.setVisible(false);
        panel_salma.setVisible(false);
        panel_stat.setVisible(false);
        p.setVisible(true);
        pack.setVisible(false);
        pack.hide();
    }//GEN-LAST:event_search_butnActionPerformed

    private void jTextSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextSearchActionPerformed

    private void boutiqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boutiqueMouseClicked
//        int row=boutique.getSelectedRow();
//        String Table_click1=boutique.getModel().getValueAt(row, 0).toString();
//        String Table_click2=boutique.getModel().getValueAt(row, 1).toString();
//        String Table_click3=boutique.getModel().getValueAt(row, 2).toString();
//        String Table_click4=boutique.getModel().getValueAt(row, 3).toString();
//        String Table_click5=boutique.getModel().getValueAt(row, 4).toString();
//        String Table_click6=boutique.getModel().getValueAt(row, 5).toString();
//        String Table_click7=boutique.getModel().getValueAt(row, 6).toString();
//        String Table_click8=boutique.getModel().getValueAt(row, 7).toString();
//        // System.out.println(Table_click1+""+Table_click2+""+Table_click3);
//        IBoutiqueDao p=new BoutiqueDao();
//        //        int Table_click5=Integer.parseInt(produit.getModel().getValueAt(row,5).toString());
//        //        //categ.setText(String.valueOf(p.findById2(Table_click5)));
//        //         jLabel7.setText(String.valueOf(p.findById2(Table_click5)));
//        //jTextField1.setText(Table_click1);
//        txt1_nom.setText(Table_click2);
//        txt2_cat.setText(Table_click3);
//        txt3_email.setText(Table_click4);
//        txt4_fax.setText(Table_click5);
//        txt5_num.setText(Table_click6);
//        
//        txt7_prom.setText(Table_click7);
//        txt6_desc.setText(Table_click8);

        txt1_nom.setText(boutique.getValueAt(boutique.getSelectedRow(), 1).toString());
        txt2_cat.setText(boutique.getValueAt(boutique.getSelectedRow(), 2).toString());
        // c1.setText(boutique.getValueAt(boutique.getSelectedRow(), 3).toString());
        Boutique produit = new BoutiqueDao().findById(Integer.parseInt(boutique.getValueAt(boutique.getSelectedRow(), 0).toString()));
        //txt1_nom.setText(produit.getNom());
        txt3_email.setText(produit.getEmail());
        // txt4_fax.setText(produit.isEtat()+"");
        txt4_fax.setText(produit.getFax() + "");
        txt5_num.setText(produit.getNumero_telephone() + "");
        txt6_desc.setText(produit.getDescription() + "");
        txt7_prom.setText(produit.getPromotion() + "");


    }//GEN-LAST:event_boutiqueMouseClicked

    private void txt5_numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt5_numActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt5_numActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Boutique depot = new Boutique();
        depot.setNom(txt1_nom.getText());
        depot.setCategorie(txt2_cat.getText());
        depot.setFax(txt7_prom.getText());
        depot.setNumero_telephone(txt3_email.getText());
        depot.setEmail(txt4_fax.getText());
        depot.setPromotion(txt5_num.getText());
        depot.setDescription(txt6_desc.getText());
        BoutiqueDao depotDao = new BoutiqueDao();
        depotDao.insert(depot);

        boutique.setModel(new BoutiqueAdapter());
        // new Page_resp_2().setVisible(true);
        JOptionPane.showMessageDialog(null, "Boutique ajoutte avec succ�s ", "", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Boutique depot = new Boutique();
        depot.setId(Integer.parseInt(boutique.getValueAt(boutique.getSelectedRow(), 0).toString()));
        depot.setNom(txt1_nom.getText());
        depot.setCategorie(txt2_cat.getText());
        depot.setFax(txt4_fax.getText());
        depot.setNumero_telephone(txt5_num.getText());
        depot.setEmail(txt3_email.getText());
        depot.setPromotion(txt7_prom.getText());
        depot.setDescription(txt6_desc.getText());
        System.out.println(depot);
        BoutiqueDao depotDao = new BoutiqueDao();
        depotDao.update1(depot);
        boutique.setModel(new BoutiqueAdapter());
        // new Page_resp_2().setVisible(true);
        JOptionPane.showMessageDialog(null, "Boutique ajoutte avec succ�s ", "", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Boutique depot = new Boutique();
        depot.setNom(txt1_nom.getText());
        depot.setCategorie(txt2_cat.getText());
        depot.setFax(txt7_prom.getText());
        depot.setNumero_telephone(txt3_email.getText());
        depot.setEmail(txt4_fax.getText());
        depot.setPromotion(txt5_num.getText());
        depot.setDescription(txt6_desc.getText());
        BoutiqueDao depotDao = new BoutiqueDao();
        depotDao.insert(depot);
        //   new Page_resp_21().setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Boutique depot = new Boutique();
        depot.setId(Integer.parseInt(boutique.getValueAt(boutique.getSelectedRow(), 0).toString()));
        depot.setNom(txt1_nom.getText());
        depot.setCategorie(txt2_cat.getText());
        depot.setFax(txt7_prom.getText());
        depot.setNumero_telephone(txt3_email.getText());
        depot.setEmail(txt4_fax.getText());
        depot.setPromotion(txt5_num.getText());
        depot.setDescription(txt6_desc.getText());
        System.out.println(depot);
        BoutiqueDao depotDao = new BoutiqueDao();
        depotDao.update1(depot);
        //new Page_resp_21().setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void stat_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stat_btnActionPerformed
        es.setVisible(false);
        es.hide();
        modifierpssword.setVisible(false);

        modifierpssword.hide();
        try {
            DefaultPieDataset PieDataset = new DefaultPieDataset();
            ProduitDao md = new ProduitDao();
            List<Produit> moyens = new Vector<>();
            moyens = md.getProduitsGroupByStock2();

            for (int i = 0; i < moyens.size(); i++) {
                // System.out.println(moyens.get(i).getCategories1());
              //sala7 stat salma   PieDataset.setValue(moyens.get(i).getCategories1().getNom(), md.count(moyens.get(i).getCategories1().getId()));
            }
            JFreeChart chart = ChartFactory.createPieChart3D("R�partition des boutiques selon nombre de Produit", PieDataset, true, true, true);
            chart.setBackgroundPaint((new Color(0xFFFFFF)));//********

            PiePlot p = (PiePlot) chart.getPlot();
            p.setBackgroundPaint((new Color(0xFFE4C4)));//************
            //p.setForegroundAlpha(TOP_ALIGNMENT);

            ChartPanel frame = new ChartPanel(chart);
            frame.setVisible(true);
            frame.setSize(700, 480);
            panel_stat.add(frame);

        } catch (SQLException ex) {
            Logger.getLogger(fos_user.class.getName()).log(Level.SEVERE, null, ex);
        }
        panel_image_deroulante.setVisible(false);
        p.setVisible(false);
        panel_salma.setVisible(false);
        panel_stat.setVisible(true);
        pack.setVisible(false);
        pack.hide();
        es.setVisible(false);
        es.hide();
    }//GEN-LAST:event_stat_btnActionPerformed

    private void stat_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stat_btnMouseEntered
        ImageIcon i = new ImageIcon(getClass().getResource("/Icon/stat2.png"));
        stat_btn.setIcon(i);        // TODO add your handling code here:
    }//GEN-LAST:event_stat_btnMouseEntered

    private void stat_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stat_btnMouseExited
        ImageIcon i = new ImageIcon(getClass().getResource("/Icon/stat.png"));
        stat_btn.setIcon(i);// TODO add your handling code here:
    }//GEN-LAST:event_stat_btnMouseExited

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
    AjouterImages image = new AjouterImages();
    image.setVisible(true);
    image.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        BoutiqueDao agdao = new BoutiqueDao();
        new BoutiqueDao().removeById(Integer.parseInt(boutique.getValueAt(boutique.getSelectedRow(), 0).toString()));
        boutique.setModel(new BoutiqueAdapter());
        JOptionPane.showMessageDialog(null, "Boutique supprime avec succe ", "", JOptionPane.INFORMATION_MESSAGE);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        pack.setVisible(false);
        pack.show();
        es.setVisible(false);
        es.hide();
        p.setVisible(false);
        p.hide();
        modifierpssword.setVisible(false);
        modifierpssword.hide();
        panel_salma.setVisible(false);
        panel_salma.hide();
        panel_stat.setVisible(false);
        panel_stat.hide();

        try {
            model.setRowCount(0);
            stm = conn.obtenirconnexion().createStatement();
            ResultSet res = stm.executeQuery("Select * from pack");
            while (res.next()) {
                model.addRow(new Object[]{res.getInt("id_pack"), res.getString("Nom_pack"), res.getString("photo_pack")});

            }
        } catch (SQLException e) {
            System.err.println(e);
        }

        tble.setModel(model);

    }//GEN-LAST:event_jButton11ActionPerformed

    private void jsupprimerpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsupprimerpActionPerformed

        packDao a = new packDao();

        a.supprimer(id.getText());
        afficher1();
        ////  packDao pa = new packDao();
        //  pack cp = new pack();
        //  pa.supprimerpack(cp);

        JOptionPane.showMessageDialog(null, "pack Supprim�e", "Information", JOptionPane.INFORMATION_MESSAGE);
        afficher1();
    }//GEN-LAST:event_jsupprimerpActionPerformed

    private void jajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jajouterActionPerformed
        //a verifierr
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
        image cp = new image();
        cp.setTitre(jTfNompack.getText());
        cp.setId(id.getText());

        //  String path = jTfImage.getText();
        File imageC = new File(path);
        BufferedImage originalImage = null;
        try {
            originalImage = ImageIO.read(imageC);
        } catch (IOException ex) {
            Logger.getLogger(image.class.getName()).log(Level.SEVERE, null, ex);
        }
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            ImageIO.write(originalImage, "jpg", baos);
        } catch (IOException ex) {
            Logger.getLogger(image.class.getName()).log(Level.SEVERE, null, ex);
        }
        byte[] imageInByte = baos.toByteArray();
        cp.setPhoto_pack(imageInByte);

        //  pack cpd = new pack();
        AdminDAO r = new AdminDAO();
        r.ajouterpacker(cp);
        //  cpd.ajouterpacker(cp);

        JOptionPane.showMessageDialog(null, "pack ajouter", "Information", JOptionPane.INFORMATION_MESSAGE);
        //   }
        afficher1();
    }//GEN-LAST:event_jajouterActionPerformed

    private void tbleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbleMouseClicked
        try {
            int i = tble.getSelectedRow();

            deplace(i);
            //sa si quant on choisir un nom dans le tableau il va afficher sur les fieldtext
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erreur selectionne\n" + e.getMessage());

        }
    }//GEN-LAST:event_tbleMouseClicked

    private void JparcourirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JparcourirActionPerformed
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
    }//GEN-LAST:event_JparcourirActionPerformed

    private void jTfImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfImageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfImageActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void jTfNompackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfNompackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfNompackActionPerformed

    private void modifierprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierprofileActionPerformed
        pack.setVisible(false);
        pack.show();
        es.setVisible(false);
        es.hide();
        p.setVisible(false);
        p.hide();
        modifierpssword.setVisible(false);
        modifierpssword.show();
        panel_salma.setVisible(false);
        panel_salma.hide();
        panel_stat.setVisible(false);
        panel_stat.hide();
        // TODO add your handling code here:
        //  AdminDAO k = new AdminDAO();
        // JLabel label = new JLabel("mail"+a.getMail());
        /// jLabelp.add(mail12);
        // panel.add(label);
        //  txtpa.set;

    }//GEN-LAST:event_modifierprofileActionPerformed

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

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        //  JLabel label = new JLabel("vtre CIN :" +AdminDAO.getCin1());

        // jLabelp.add(mail12);
        // panel.add(label);
        AdminDAO a = new AdminDAO();

        //
        a.modifiercompte(txtno.getText(), txtpr.getText(), txtma.getText(), txtpa.getText(), cincompte.getText());
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        //        Boutique depot = new Boutique();
        //        BoutiqueDao depotDao = new BoutiqueDao();
        //        depotDao.delete(jTextField1.getText());

//        BoutiqueDao agdao = new BoutiqueDao();
//        new BoutiqueDao().removeById(Integer.parseInt(boutique.getValueAt(boutique.getSelectedRow(), 0).toString()));
//        boutique.setModel(new BoutiqueAdapter());
//        JOptionPane.showMessageDialog(null, "Boutique supprim�e avec succ?s ", "", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton6ActionPerformed
    private void deplace(int i) {
        try {     //i represente les ligne 
//   
            id.setText(model.getValueAt(i, 0).toString());
// 
//       txtno.setText(model.getValueAt (i, 1).toString());
//       
//    
            jTfNompack.setText(model.getValueAt(i, 1).toString());
            jTfImage.setText(model.getValueAt(i, 2).toString());
            idimg.setText(model.getValueAt(i, 0).toString());
//     txtma.setText(model.getValueAt (i, 4).toString());
            //txtbr.setSelectedItem(model.getValueAt(i,5).toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erreur de deplacement de message !!!!! " + e.getMessage());
        }
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
            java.util.logging.Logger.getLogger(Page_resp_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Page_resp_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Page_resp_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Page_resp_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Page_resp_1 es = new Page_resp_1();
                es.setSize(1308, 666);
                es.setLocationRelativeTo(null);
                es.setVisible(true);
//                Projet1 pr = new Projet1();
//            pr.setVisible(true);
//            pr.setSize(780,400);
//            pr.setLocationRelativeTo(null);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jparcourir;
    private javax.swing.JTable boutique;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cincompte;
    private javax.swing.JTextField id;
    private javax.swing.JTextField idimg;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
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
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextSearch;
    private javax.swing.JTextField jTfImage;
    private javax.swing.JTextField jTfNompack;
    private javax.swing.JButton jajouter;
    private javax.swing.JButton jsupprimerp;
    private javax.swing.JButton modifierprofile;
    private javax.swing.JPanel modifierpssword;
    private javax.swing.JPanel p;
    private javax.swing.JPanel pack;
    private javax.swing.JPanel panel_image_deroulante;
    private javax.swing.JPanel panel_salma;
    private javax.swing.JPanel panel_stat;
    private javax.swing.JLabel photo;
    private javax.swing.JLabel pic3;
    private javax.swing.JButton search_butn;
    private javax.swing.JButton stat_btn;
    private javax.swing.JTable tble;
    private javax.swing.JTextField txt1_nom;
    private javax.swing.JTextField txt2_cat;
    private javax.swing.JTextField txt3_email;
    private javax.swing.JTextField txt4_fax;
    private javax.swing.JTextField txt5_num;
    private javax.swing.JTextField txt6_desc;
    private javax.swing.JTextField txt7_prom;
    private javax.swing.JTextField txtma;
    private javax.swing.JTextField txtno;
    private javax.swing.JPasswordField txtpa;
    private javax.swing.JTextField txtpr;
    // End of variables declaration//GEN-END:variables
}
