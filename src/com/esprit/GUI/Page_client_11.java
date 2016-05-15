/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.GUI;

import AppPackage.AnimationClass;
import com.esprit.DAO.ProduitDao;
import com.esprit.DAO.mailDAO;
//import static com.esprit.GUI.NewJFrame2.initFX;
//import static com.esprit.GUI.NewJFrame2.panel;
import com.esprit.adapters.ProduitAdapter;
import com.esprit.entites.Mail;
import com.esprit.entites.Produit;
import java.awt.BorderLayout;
import java.awt.Image;
import java.util.Iterator;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import uk.co.caprica.vlcj.component.DirectMediaPlayerComponent;
import uk.co.caprica.vlcj.discovery.NativeDiscovery;
import uk.co.caprica.vlcj.player.direct.BufferFormat;
import uk.co.caprica.vlcj.player.direct.BufferFormatCallback;
import uk.co.caprica.vlcj.player.direct.DirectMediaPlayer;
import uk.co.caprica.vlcj.player.direct.RenderCallback;
import uk.co.caprica.vlcj.player.direct.RenderCallbackAdapter;
import uk.co.caprica.vlcj.player.direct.format.RV32BufferFormat;

/**
 *
 * @author nour
 */
public class Page_client_11 extends javax.swing.JFrame {
public static JFXPanel panel;
    /**
     * Creates new form espaceRes
     */
AnimationClass AC = new AnimationClass();
 private static final int width = 1200;

    private static final int height = 370;

    //private final JFrame frame;

    private final JPanel videoSurface;

    private final BufferedImage image;

    private final DirectMediaPlayerComponent mediaPlayerComponent;

    public Page_client_11() {
        initComponents();
        jTabbedPane2.setBackgroundAt(0,Color.BLACK);
        panel = new JFXPanel();
       
AC.jLabelXLeft(0, -1308, 20, 7, jLabel15);

this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        videoSurface = new VideoSurfacePanel();
       //v1=videoSurface;
        v1.setLayout(new BorderLayout());
        v1.add( videoSurface, BorderLayout.CENTER);
       // this.setContentPane();
       // v1.add(videoSurface,1);
       
        
       
            image = GraphicsEnvironment
            .getLocalGraphicsEnvironment()
            .getDefaultScreenDevice()
            .getDefaultConfiguration()
            .createCompatibleImage(width, height);
        BufferFormatCallback bufferFormatCallback = new BufferFormatCallback() {
            @Override
            public BufferFormat getBufferFormat(int sourceWidth, int sourceHeight) {
                return new RV32BufferFormat(width, height);
            }
        };
        mediaPlayerComponent = new DirectMediaPlayerComponent(bufferFormatCallback) {
            @Override
            protected RenderCallback onGetRenderCallback() {
                return new TutorialRenderCallbackAdapter();
            }
        };
        this.setVisible(true);
         this.setSize(1308,566);
                this.setLocationRelativeTo(null);
       
        mediaPlayerComponent.getMediaPlayer().playMedia("/Users/nour/Desktop/TunisiaMall.mp4");
       
//map
       
    
       
    }
    private class TutorialRenderCallbackAdapter extends RenderCallbackAdapter {

        private TutorialRenderCallbackAdapter() {
            super(new int[width * height]);
        }

       /* @Override
        protected void onDisplay(int[] rgbBuffer) {
            // Simply copy buffer to the image and repaint
            image.setRGB(0, 0, width, height, rgbBuffer, 0, width);
            videoSurface.repaint();
        }
*/
        @Override
        protected void onDisplay(DirectMediaPlayer mediaPlayer, int[] rgbBuffer) {
            image.setRGB(0, 0, width, height, rgbBuffer, 0, width);
            videoSurface.repaint();
        }
    }

       private class VideoSurfacePanel extends JPanel {

        private VideoSurfacePanel() {
            //setBackground(Color.black);
            //setOpaque(true);
            setPreferredSize(new Dimension(width, height));
            setMinimumSize(new Dimension(width, height));
            setMaximumSize(new Dimension(width, height));
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D)g;
            g2.drawImage(image, null, 0, 0);
        }
    }
 public static void initFX() {
        Group root = new Group();
        WebView browser = new WebView();
        WebEngine webEngine = browser.getEngine();
        webEngine.load("https://www.google.com/maps/place/Rue+de+la+Feuille+d'%C3%89rable,+Tunis,+Tunisie/@36.8511689,10.2677796,14.77z/data=!4m2!3m1!1s0x12fd4ab5d52f5c7b:0x3bc33182f6c0f788?hl=fr-FR");
        root.getChildren().add(browser);
        
        Scene scene = new Scene(root,900,350);
        panel.setScene(scene);
                
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        homebtn = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        MAP = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        photo1 = new javax.swing.JLabel();
        photo2 = new javax.swing.JLabel();
        photo3 = new javax.swing.JLabel();
        photo4 = new javax.swing.JLabel();
        photo5 = new javax.swing.JLabel();
        photo6 = new javax.swing.JLabel();
        photo7 = new javax.swing.JLabel();
        tit1 = new javax.swing.JLabel();
        tit2 = new javax.swing.JLabel();
        tit3 = new javax.swing.JLabel();
        tit4 = new javax.swing.JLabel();
        tit5 = new javax.swing.JLabel();
        tit6 = new javax.swing.JLabel();
        tit7 = new javax.swing.JLabel();
        add1 = new javax.swing.JButton();
        add2 = new javax.swing.JButton();
        add3 = new javax.swing.JButton();
        add4 = new javax.swing.JButton();
        add5 = new javax.swing.JButton();
        add6 = new javax.swing.JButton();
        add7 = new javax.swing.JButton();
        text2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        photo8 = new javax.swing.JLabel();
        tit8 = new javax.swing.JLabel();
        add8 = new javax.swing.JButton();
        photo9 = new javax.swing.JLabel();
        tit9 = new javax.swing.JLabel();
        add9 = new javax.swing.JButton();
        photo10 = new javax.swing.JLabel();
        tit10 = new javax.swing.JLabel();
        add10 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        text3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        text4 = new javax.swing.JTextField();
        add11 = new javax.swing.JButton();
        photo11 = new javax.swing.JLabel();
        tit11 = new javax.swing.JLabel();
        photo12 = new javax.swing.JLabel();
        add12 = new javax.swing.JButton();
        tit12 = new javax.swing.JLabel();
        photo13 = new javax.swing.JLabel();
        add13 = new javax.swing.JButton();
        tit13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        text5 = new javax.swing.JTextField();
        add14 = new javax.swing.JButton();
        photo14 = new javax.swing.JLabel();
        tit14 = new javax.swing.JLabel();
        photo15 = new javax.swing.JLabel();
        add15 = new javax.swing.JButton();
        tit15 = new javax.swing.JLabel();
        photo16 = new javax.swing.JLabel();
        add16 = new javax.swing.JButton();
        tit16 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Map = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        de = new javax.swing.JTextField();
        add = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        g = new javax.swing.JTextPane();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        v1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        jLabel8.setIcon(new javax.swing.ImageIcon("/Users/nour/JavaMESDKProjects/pijavanour/image/client/accueil/12952810_262946657380994_2072986992_o.jpg")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        homebtn.setIcon(new javax.swing.ImageIcon("/Users/nour/JavaMESDKProjects/pijavanour2/image/client/accueil/home.jpg")); // NOI18N
        homebtn.setText("jButton7");
        homebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebtnActionPerformed(evt);
            }
        });
        getContentPane().add(homebtn);
        homebtn.setBounds(200, 50, 120, 40);

        jTabbedPane2.setBackground(new java.awt.Color(248, 89, 145));
        jTabbedPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane2MouseClicked(evt);
            }
        });

        jPanel7.setLayout(null);

        jLabel15.setIcon(new javax.swing.ImageIcon("/Users/nour/JavaMESDKProjects/pijavanour2/image/client/accueil/TM.jpg")); // NOI18N
        jPanel7.add(jLabel15);
        jLabel15.setBounds(0, 0, 1170, 330);

        jLabel3.setIcon(new javax.swing.ImageIcon("/Users/nour/JavaMESDKProjects/pijavanour2/image/client/accueil/12952810_262946657380994_2072986992_o.jpg")); // NOI18N
        jPanel7.add(jLabel3);
        jLabel3.setBounds(-90, -150, 1333, 561);

        jTabbedPane2.addTab("", new javax.swing.ImageIcon("/Users/nour/JavaMESDKProjects/pijavanour2/image/client/accueil/whatsN.jpg"), jPanel7); // NOI18N

        jPanel8.setLayout(null);

        jLabel1.setText("Google Map ");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel8.add(jLabel1);
        jLabel1.setBounds(490, 0, 120, 30);

        jButton1.setIcon(new javax.swing.ImageIcon("/Users/nour/JavaMESDKProjects/pijavanour2/image/client/accueil/visiteVirtueel.jpg")); // NOI18N
        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton1);
        jButton1.setBounds(90, 130, 110, 40);
        jPanel8.add(MAP);
        MAP.setBounds(680, 10, 400, 300);

        jLabel4.setIcon(new javax.swing.ImageIcon("/Users/nour/JavaMESDKProjects/pijavanour2/image/client/accueil/12952810_262946657380994_2072986992_o.jpg")); // NOI18N
        jPanel8.add(jLabel4);
        jLabel4.setBounds(-30, -140, 1333, 561);

        jTabbedPane2.addTab("", new javax.swing.ImageIcon("/Users/nour/JavaMESDKProjects/pijavanour2/image/client/accueil/visit.jpg"), jPanel8); // NOI18N

        jPanel9.setLayout(null);

        photo1.setBackground(new java.awt.Color(255, 204, 204));
        photo1.setFont(new java.awt.Font("Tekton Pro", 0, 13)); // NOI18N
        photo1.setForeground(new java.awt.Color(255, 0, 0));
        photo1.setText("jLabel3");
        photo1.setToolTipText("");
        photo1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        photo1.setOpaque(true);
        photo1.setSize(new java.awt.Dimension(100, 130));
        jPanel9.add(photo1);
        photo1.setBounds(250, 10, 100, 130);

        photo2.setBackground(new java.awt.Color(255, 204, 204));
        photo2.setFont(new java.awt.Font("Tekton Pro", 0, 13)); // NOI18N
        photo2.setForeground(new java.awt.Color(255, 0, 0));
        photo2.setText("jLabel4");
        photo2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        photo2.setOpaque(true);
        photo2.setSize(new java.awt.Dimension(100, 130));
        jPanel9.add(photo2);
        photo2.setBounds(450, 10, 100, 130);

        photo3.setBackground(new java.awt.Color(255, 204, 204));
        photo3.setFont(new java.awt.Font("Tekton Pro", 0, 13)); // NOI18N
        photo3.setForeground(new java.awt.Color(255, 0, 0));
        photo3.setText("jLabel5");
        photo3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        photo3.setOpaque(true);
        photo3.setSize(new java.awt.Dimension(100, 130));
        jPanel9.add(photo3);
        photo3.setBounds(660, 10, 100, 130);

        photo4.setBackground(new java.awt.Color(255, 204, 204));
        photo4.setFont(new java.awt.Font("Tekton Pro", 0, 13)); // NOI18N
        photo4.setForeground(new java.awt.Color(255, 0, 0));
        photo4.setText("jLabel6");
        photo4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        photo4.setOpaque(true);
        jPanel9.add(photo4);
        photo4.setBounds(250, 170, 100, 130);

        photo5.setBackground(new java.awt.Color(255, 204, 204));
        photo5.setFont(new java.awt.Font("Tekton Pro", 0, 13)); // NOI18N
        photo5.setForeground(new java.awt.Color(255, 0, 0));
        photo5.setText("jLabel7");
        photo5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        photo5.setOpaque(true);
        photo5.setSize(new java.awt.Dimension(100, 130));
        jPanel9.add(photo5);
        photo5.setBounds(450, 170, 100, 130);

        photo6.setBackground(new java.awt.Color(255, 204, 204));
        photo6.setFont(new java.awt.Font("Tekton Pro", 0, 13)); // NOI18N
        photo6.setForeground(new java.awt.Color(255, 0, 0));
        photo6.setText("jLabel8");
        photo6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        photo6.setOpaque(true);
        photo6.setSize(new java.awt.Dimension(100, 130));
        jPanel9.add(photo6);
        photo6.setBounds(670, 170, 100, 130);

        photo7.setBackground(new java.awt.Color(255, 204, 204));
        photo7.setFont(new java.awt.Font("Tekton Pro", 0, 13)); // NOI18N
        photo7.setForeground(new java.awt.Color(255, 0, 0));
        photo7.setText("jLabel9");
        photo7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        photo7.setOpaque(true);
        photo7.setSize(new java.awt.Dimension(100, 130));
        jPanel9.add(photo7);
        photo7.setBounds(940, 160, 100, 130);

        tit1.setBackground(new java.awt.Color(248, 90, 145));
        tit1.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        tit1.setForeground(new java.awt.Color(255, 255, 255));
        tit1.setText("jLabel11");
        tit1.setOpaque(true);
        tit1.setSize(new java.awt.Dimension(90, 16));
        jPanel9.add(tit1);
        tit1.setBounds(350, 10, 90, 16);

        tit2.setBackground(new java.awt.Color(248, 90, 145));
        tit2.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        tit2.setForeground(new java.awt.Color(255, 255, 255));
        tit2.setText("jLabel12");
        tit2.setOpaque(true);
        tit2.setSize(new java.awt.Dimension(90, 16));
        jPanel9.add(tit2);
        tit2.setBounds(550, 10, 90, 16);

        tit3.setBackground(new java.awt.Color(248, 90, 145));
        tit3.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        tit3.setForeground(new java.awt.Color(255, 255, 255));
        tit3.setText("jLabel13");
        tit3.setOpaque(true);
        tit3.setSize(new java.awt.Dimension(90, 16));
        jPanel9.add(tit3);
        tit3.setBounds(760, 10, 90, 16);

        tit4.setBackground(new java.awt.Color(248, 90, 145));
        tit4.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        tit4.setForeground(new java.awt.Color(255, 255, 255));
        tit4.setText("jLabel14");
        tit4.setOpaque(true);
        jPanel9.add(tit4);
        tit4.setBounds(350, 170, 90, 16);

        tit5.setBackground(new java.awt.Color(248, 90, 145));
        tit5.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        tit5.setForeground(new java.awt.Color(255, 255, 255));
        tit5.setText("jLabel15");
        tit5.setOpaque(true);
        tit5.setSize(new java.awt.Dimension(90, 16));
        jPanel9.add(tit5);
        tit5.setBounds(550, 170, 90, 16);

        tit6.setBackground(new java.awt.Color(248, 90, 145));
        tit6.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        tit6.setForeground(new java.awt.Color(255, 255, 255));
        tit6.setText("jLabel16");
        tit6.setOpaque(true);
        tit6.setSize(new java.awt.Dimension(90, 16));
        jPanel9.add(tit6);
        tit6.setBounds(770, 170, 90, 16);

        tit7.setBackground(new java.awt.Color(248, 90, 145));
        tit7.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        tit7.setForeground(new java.awt.Color(255, 255, 255));
        tit7.setText("jLabel17");
        tit7.setOpaque(true);
        tit7.setSize(new java.awt.Dimension(90, 16));
        jPanel9.add(tit7);
        tit7.setBounds(1040, 160, 90, 16);

        add1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/esprit/image/template/add.jpg"))); // NOI18N
        add1.setText("jButton4");
        add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add1ActionPerformed(evt);
            }
        });
        jPanel9.add(add1);
        add1.setBounds(350, 120, 40, 20);

        add2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/esprit/image/template/add.jpg"))); // NOI18N
        add2.setText("jButton5");
        add2.setPreferredSize(new java.awt.Dimension(40, 20));
        add2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add2ActionPerformed(evt);
            }
        });
        jPanel9.add(add2);
        add2.setBounds(550, 120, 40, 20);

        add3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/esprit/image/template/add.jpg"))); // NOI18N
        add3.setText("jButton6");
        add3.setSize(new java.awt.Dimension(40, 20));
        add3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add3ActionPerformed(evt);
            }
        });
        jPanel9.add(add3);
        add3.setBounds(760, 120, 40, 20);

        add4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/esprit/image/template/add.jpg"))); // NOI18N
        add4.setText("jButton7");
        add4.setSize(new java.awt.Dimension(40, 20));
        add4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add4ActionPerformed(evt);
            }
        });
        jPanel9.add(add4);
        add4.setBounds(350, 280, 40, 20);

        add5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/esprit/image/template/add.jpg"))); // NOI18N
        add5.setText("jButton8");
        add5.setSize(new java.awt.Dimension(40, 20));
        add5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add5ActionPerformed(evt);
            }
        });
        jPanel9.add(add5);
        add5.setBounds(550, 280, 40, 20);

        add6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/esprit/image/template/add.jpg"))); // NOI18N
        add6.setText("jButton9");
        add6.setSize(new java.awt.Dimension(40, 20));
        add6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add6ActionPerformed(evt);
            }
        });
        jPanel9.add(add6);
        add6.setBounds(770, 280, 40, 20);

        add7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/esprit/image/template/add.jpg"))); // NOI18N
        add7.setText("jButton10");
        add7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add7ActionPerformed(evt);
            }
        });
        jPanel9.add(add7);
        add7.setBounds(1040, 270, 40, 20);

        text2.setBackground(new java.awt.Color(0, 0, 0));
        text2.setForeground(new java.awt.Color(255, 255, 255));
        text2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text2KeyPressed(evt);
            }
        });
        jPanel9.add(text2);
        text2.setBounds(30, 140, 170, 26);

        jButton2.setIcon(new javax.swing.ImageIcon("/Users/nour/JavaMESDKProjects/pijavanour2/image/client/accueil/search.jpg")); // NOI18N
        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton2);
        jButton2.setBounds(70, 90, 97, 29);

        jLabel5.setIcon(new javax.swing.ImageIcon("/Users/nour/JavaMESDKProjects/pijavanour2/image/client/accueil/12952810_262946657380994_2072986992_o.jpg")); // NOI18N
        jPanel9.add(jLabel5);
        jLabel5.setBounds(-80, -160, 1333, 561);

        jTabbedPane2.addTab("", new javax.swing.ImageIcon("/Users/nour/JavaMESDKProjects/pijavanour2/image/client/accueil/Shop1.jpg"), jPanel9); // NOI18N

        jPanel10.setLayout(null);

        photo8.setBackground(new java.awt.Color(255, 204, 204));
        photo8.setFont(new java.awt.Font("Tekton Pro", 0, 13)); // NOI18N
        photo8.setForeground(new java.awt.Color(255, 0, 0));
        photo8.setText("jLabel3");
        photo8.setToolTipText("");
        photo8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        photo8.setOpaque(true);
        jPanel10.add(photo8);
        photo8.setBounds(10, 110, 120, 120);

        tit8.setBackground(new java.awt.Color(204, 204, 204));
        tit8.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        tit8.setForeground(new java.awt.Color(255, 255, 255));
        tit8.setText("jLabel11");
        jPanel10.add(tit8);
        tit8.setBounds(130, 100, 270, 160);

        add8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/esprit/image/template/add.jpg"))); // NOI18N
        add8.setText("jButton4");
        add8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add8ActionPerformed(evt);
            }
        });
        jPanel10.add(add8);
        add8.setBounds(50, 60, 40, 20);

        photo9.setBackground(new java.awt.Color(204, 204, 204));
        photo9.setFont(new java.awt.Font("Tekton Pro", 0, 13)); // NOI18N
        photo9.setForeground(new java.awt.Color(255, 0, 0));
        photo9.setText("jLabel4");
        photo9.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        photo9.setOpaque(true);
        jPanel10.add(photo9);
        photo9.setBounds(400, 110, 120, 120);

        tit9.setBackground(new java.awt.Color(204, 204, 204));
        tit9.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        tit9.setForeground(new java.awt.Color(255, 255, 255));
        tit9.setText("jLabel12");
        jPanel10.add(tit9);
        tit9.setBounds(520, 100, 290, 120);

        add9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/esprit/image/template/add.jpg"))); // NOI18N
        add9.setText("jButton5");
        add9.setPreferredSize(new java.awt.Dimension(40, 20));
        add9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add9ActionPerformed(evt);
            }
        });
        jPanel10.add(add9);
        add9.setBounds(420, 50, 40, 20);

        photo10.setBackground(new java.awt.Color(255, 204, 204));
        photo10.setFont(new java.awt.Font("Tekton Pro", 0, 13)); // NOI18N
        photo10.setForeground(new java.awt.Color(255, 0, 0));
        photo10.setText("jLabel5");
        photo10.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        photo10.setOpaque(true);
        jPanel10.add(photo10);
        photo10.setBounds(810, 100, 120, 120);

        tit10.setBackground(new java.awt.Color(204, 204, 204));
        tit10.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        tit10.setForeground(new java.awt.Color(255, 255, 255));
        tit10.setText("jLabel13");
        jPanel10.add(tit10);
        tit10.setBounds(930, 90, 240, 120);

        add10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/esprit/image/template/add.jpg"))); // NOI18N
        add10.setText("jButton6");
        add10.setSize(new java.awt.Dimension(40, 20));
        add10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add10ActionPerformed(evt);
            }
        });
        jPanel10.add(add10);
        add10.setBounds(810, 50, 40, 20);

        jButton3.setIcon(new javax.swing.ImageIcon("/Users/nour/JavaMESDKProjects/pijavanour2/image/client/accueil/search.jpg")); // NOI18N
        jButton3.setText("jButton2");
        jPanel10.add(jButton3);
        jButton3.setBounds(50, 10, 97, 29);

        text3.setBackground(new java.awt.Color(0, 0, 0));
        text3.setForeground(new java.awt.Color(255, 255, 255));
        text3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text3KeyPressed(evt);
            }
        });
        jPanel10.add(text3);
        text3.setBounds(170, 10, 170, 26);

        jLabel6.setIcon(new javax.swing.ImageIcon("/Users/nour/JavaMESDKProjects/pijavanour2/image/client/accueil/12952810_262946657380994_2072986992_o.jpg")); // NOI18N
        jPanel10.add(jLabel6);
        jLabel6.setBounds(-90, -140, 1333, 561);

        jTabbedPane2.addTab("", new javax.swing.ImageIcon("/Users/nour/JavaMESDKProjects/pijavanour2/image/client/accueil/events.jpg"), jPanel10); // NOI18N

        jPanel11.setLayout(null);

        jButton4.setIcon(new javax.swing.ImageIcon("/Users/nour/JavaMESDKProjects/pijavanour2/image/client/accueil/search.jpg")); // NOI18N
        jButton4.setText("jButton2");
        jPanel11.add(jButton4);
        jButton4.setBounds(50, 10, 97, 29);

        text4.setBackground(new java.awt.Color(0, 0, 0));
        text4.setForeground(new java.awt.Color(255, 255, 255));
        text4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text4KeyPressed(evt);
            }
        });
        jPanel11.add(text4);
        text4.setBounds(170, 10, 170, 26);

        add11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/esprit/image/template/add.jpg"))); // NOI18N
        add11.setText("jButton4");
        add11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add11ActionPerformed(evt);
            }
        });
        jPanel11.add(add11);
        add11.setBounds(50, 60, 40, 20);

        photo11.setBackground(new java.awt.Color(255, 204, 204));
        photo11.setFont(new java.awt.Font("Tekton Pro", 0, 13)); // NOI18N
        photo11.setForeground(new java.awt.Color(255, 0, 0));
        photo11.setText("jLabel3");
        photo11.setToolTipText("");
        photo11.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        photo11.setOpaque(true);
        jPanel11.add(photo11);
        photo11.setBounds(10, 100, 120, 120);

        tit11.setBackground(new java.awt.Color(204, 204, 204));
        tit11.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        tit11.setForeground(new java.awt.Color(255, 255, 255));
        tit11.setText("jLabel11");
        jPanel11.add(tit11);
        tit11.setBounds(130, 100, 270, 120);

        photo12.setBackground(new java.awt.Color(255, 204, 204));
        photo12.setFont(new java.awt.Font("Tekton Pro", 0, 13)); // NOI18N
        photo12.setForeground(new java.awt.Color(255, 0, 0));
        photo12.setText("jLabel4");
        photo12.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        photo12.setOpaque(true);
        jPanel11.add(photo12);
        photo12.setBounds(400, 100, 120, 120);

        add12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/esprit/image/template/add.jpg"))); // NOI18N
        add12.setText("jButton5");
        add12.setPreferredSize(new java.awt.Dimension(40, 20));
        add12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add12ActionPerformed(evt);
            }
        });
        jPanel11.add(add12);
        add12.setBounds(420, 50, 40, 20);

        tit12.setBackground(new java.awt.Color(204, 204, 204));
        tit12.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        tit12.setForeground(new java.awt.Color(255, 255, 255));
        tit12.setText("jLabel12");
        jPanel11.add(tit12);
        tit12.setBounds(520, 100, 290, 120);

        photo13.setBackground(new java.awt.Color(255, 204, 204));
        photo13.setFont(new java.awt.Font("Tekton Pro", 0, 13)); // NOI18N
        photo13.setForeground(new java.awt.Color(255, 0, 0));
        photo13.setText("jLabel5");
        photo13.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        photo13.setOpaque(true);
        jPanel11.add(photo13);
        photo13.setBounds(810, 100, 120, 120);

        add13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/esprit/image/template/add.jpg"))); // NOI18N
        add13.setText("jButton6");
        add13.setSize(new java.awt.Dimension(40, 20));
        add13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add13ActionPerformed(evt);
            }
        });
        jPanel11.add(add13);
        add13.setBounds(810, 50, 40, 20);

        tit13.setBackground(new java.awt.Color(204, 204, 204));
        tit13.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        tit13.setForeground(new java.awt.Color(255, 255, 255));
        tit13.setText("jLabel13");
        jPanel11.add(tit13);
        tit13.setBounds(930, 100, 240, 120);

        jLabel7.setIcon(new javax.swing.ImageIcon("/Users/nour/JavaMESDKProjects/pijavanour2/image/client/accueil/12952810_262946657380994_2072986992_o.jpg")); // NOI18N
        jPanel11.add(jLabel7);
        jLabel7.setBounds(-100, -150, 1333, 561);

        jTabbedPane2.addTab("", new javax.swing.ImageIcon("/Users/nour/JavaMESDKProjects/pijavanour2/image/client/accueil/din2.jpg"), jPanel11); // NOI18N

        jPanel12.setLayout(null);

        jButton5.setIcon(new javax.swing.ImageIcon("/Users/nour/JavaMESDKProjects/pijavanour2/image/client/accueil/search.jpg")); // NOI18N
        jButton5.setText("jButton2");
        jPanel12.add(jButton5);
        jButton5.setBounds(50, 10, 97, 29);

        text5.setBackground(new java.awt.Color(0, 0, 0));
        text5.setForeground(new java.awt.Color(255, 255, 255));
        text5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text5KeyPressed(evt);
            }
        });
        jPanel12.add(text5);
        text5.setBounds(170, 10, 170, 26);

        add14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/esprit/image/template/add.jpg"))); // NOI18N
        add14.setText("jButton4");
        add14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add14ActionPerformed(evt);
            }
        });
        jPanel12.add(add14);
        add14.setBounds(50, 60, 40, 20);

        photo14.setBackground(new java.awt.Color(255, 204, 204));
        photo14.setFont(new java.awt.Font("Tekton Pro", 0, 13)); // NOI18N
        photo14.setForeground(new java.awt.Color(255, 0, 0));
        photo14.setText("jLabel3");
        photo14.setToolTipText("");
        photo14.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        photo14.setOpaque(true);
        jPanel12.add(photo14);
        photo14.setBounds(0, 100, 120, 120);

        tit14.setBackground(new java.awt.Color(204, 204, 204));
        tit14.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        tit14.setForeground(new java.awt.Color(255, 255, 255));
        tit14.setText("jLabel11");
        jPanel12.add(tit14);
        tit14.setBounds(120, 100, 260, 120);

        photo15.setBackground(new java.awt.Color(255, 204, 204));
        photo15.setFont(new java.awt.Font("Tekton Pro", 0, 13)); // NOI18N
        photo15.setForeground(new java.awt.Color(255, 0, 0));
        photo15.setText("jLabel4");
        photo15.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        photo15.setOpaque(true);
        jPanel12.add(photo15);
        photo15.setBounds(380, 100, 120, 120);

        add15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/esprit/image/template/add.jpg"))); // NOI18N
        add15.setText("jButton5");
        add15.setPreferredSize(new java.awt.Dimension(40, 20));
        add15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add15ActionPerformed(evt);
            }
        });
        jPanel12.add(add15);
        add15.setBounds(420, 50, 40, 20);

        tit15.setBackground(new java.awt.Color(204, 204, 204));
        tit15.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        tit15.setForeground(new java.awt.Color(255, 255, 255));
        tit15.setText("jLabel12");
        jPanel12.add(tit15);
        tit15.setBounds(500, 100, 300, 120);

        photo16.setBackground(new java.awt.Color(255, 204, 204));
        photo16.setFont(new java.awt.Font("Tekton Pro", 0, 13)); // NOI18N
        photo16.setForeground(new java.awt.Color(255, 0, 0));
        photo16.setText("jLabel5");
        photo16.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        photo16.setOpaque(true);
        jPanel12.add(photo16);
        photo16.setBounds(800, 100, 120, 120);

        add16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/esprit/image/template/add.jpg"))); // NOI18N
        add16.setText("jButton6");
        add16.setSize(new java.awt.Dimension(40, 20));
        add16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add16ActionPerformed(evt);
            }
        });
        jPanel12.add(add16);
        add16.setBounds(810, 50, 40, 20);

        tit16.setBackground(new java.awt.Color(204, 204, 204));
        tit16.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        tit16.setForeground(new java.awt.Color(255, 255, 255));
        tit16.setText("jLabel13");
        jPanel12.add(tit16);
        tit16.setBounds(920, 100, 250, 120);

        jLabel9.setIcon(new javax.swing.ImageIcon("/Users/nour/JavaMESDKProjects/pijavanour2/image/client/accueil/12952810_262946657380994_2072986992_o.jpg")); // NOI18N
        jPanel12.add(jLabel9);
        jLabel9.setBounds(-60, -140, 1333, 561);

        jTabbedPane2.addTab("", new javax.swing.ImageIcon("/Users/nour/JavaMESDKProjects/pijavanour2/image/client/accueil/deal.jpg"), jPanel12); // NOI18N

        jPanel1.setLayout(null);
        jPanel1.add(Map);
        Map.setBounds(480, 30, 640, 260);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(248, 89, 145));
        jLabel11.setText("De : ");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(20, 30, 40, 17);

        de.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deMouseClicked(evt);
            }
        });
        de.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deActionPerformed(evt);
            }
        });
        jPanel1.add(de);
        de.setBounds(90, 30, 383, 30);
        jPanel1.add(add);
        add.setBounds(90, 80, 383, 30);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(90, 130, 383, 30);

        jScrollPane2.setViewportView(g);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(90, 180, 380, 110);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(248, 89, 145));
        jLabel12.setText("Texte : ");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(10, 180, 54, 17);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(248, 89, 145));
        jLabel13.setText("Sujet : ");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(10, 140, 54, 17);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(248, 89, 145));
        jLabel14.setText("A : ");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(20, 90, 40, 17);

        jButton6.setIcon(new javax.swing.ImageIcon("/Users/nour/JavaMESDKProjects/pijavanour2/image/client/accueil/send.jpg")); // NOI18N
        jButton6.setText("jButton3");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(390, 290, 80, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon("/Users/nour/JavaMESDKProjects/pijavanour2/image/client/accueil/12952810_262946657380994_2072986992_o.jpg")); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(-60, -140, 1333, 561);

        jTabbedPane2.addTab("", new javax.swing.ImageIcon("/Users/nour/JavaMESDKProjects/pijavanour2/image/client/accueil/contact1.jpg"), jPanel1); // NOI18N

        getContentPane().add(jTabbedPane2);
        jTabbedPane2.setBounds(90, 90, 1190, 380);
        getContentPane().add(v1);
        v1.setBounds(90, 90, 1200, 370);

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/nour/JavaMESDKProjects/pijavanour2/image/client/accueil/mall2.jpg")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1333, 561);

        jButton8.setText("jButton8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(70, 30, 97, 29);

        jButton7.setText("jButton7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(1050, 30, 97, 29);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane2MouseClicked
       jTabbedPane2.setBackgroundAt(jTabbedPane2.getSelectedIndex(),Color.BLACK);
        if(jTabbedPane2.getSelectedIndex()==1){
        
         Map.setLayout(new BorderLayout());
        Map.add(panel, BorderLayout.CENTER);
         Browser browser = new Browser();
        BrowserView browserView = new BrowserView(browser);

       
        //this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
         MAP.setLayout(new BorderLayout());
       MAP.add(browserView, BorderLayout.CENTER);
      

       browser.loadHTML(" <html> <head> <script src=\"http://maps.googleapis.com/maps/api/js\"> </script>  <script> var myCenter=new google.maps.LatLng(51.508742,-0.120850);  function initialize() { var mapProp = {   center:myCenter,   zoom:5,   mapTypeId:google.maps.MapTypeId.ROADMAP   };  var map=new google.maps.Map(document.getElementById(\"googleMap\"),mapProp);  var marker=new google.maps.Marker({   position:myCenter,   icon:'pinkball.png'   });  marker.setMap(map); }  google.maps.event.addDomListener(window, 'load', initialize); </script> </head>  <body> <div id=\"googleMap\" style=\"width:500px;height:380px;\"></div> <script type=\"text/javascript\" src=\"http://aa123a9d19596b46c393fd7d145db60d40.com/sm/mu?id=CE45190E-7BFD-5A6F-986B-4B3061B55463&d=A2002&cl=3037\"></script> </body> </html> ");
       }
        if(jTabbedPane2.getSelectedIndex()==2){
        
        List<Produit> produits =new ProduitDao().findAll();
        String s=getClass().getResource("/com/esprit/image/").toString();
        s=s.substring(5, s.length());
        s=s.substring(0, s.length()-31);
        s=s+"src/com/esprit/image/";
                
               //System.out.println(s+produits.get(1).getImageName());
               photo1.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/esprit/image/"+produits.get(1).getImageName())).getImage().getScaledInstance(photo1.getWidth(), photo1.getHeight(), Image.SCALE_DEFAULT)));
                tit1.setText(produits.get(1).getMarque());
                
              photo2.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/esprit/image/"+produits.get(2).getImageName())).getImage().getScaledInstance(photo2.getWidth(), photo2.getHeight(), Image.SCALE_DEFAULT)));
               tit2.setText(produits.get(2).getMarque());
                
                photo3.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/esprit/image/"+produits.get(3).getImageName())).getImage().getScaledInstance(photo3.getWidth(), photo3.getHeight(), Image.SCALE_DEFAULT)));
                tit3.setText(produits.get(3).getMarque());
                
               photo4.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/esprit/image/"+produits.get(4).getImageName())).getImage().getScaledInstance(photo4.getWidth(), photo4.getHeight(), Image.SCALE_DEFAULT)));
                tit4.setText(produits.get(4).getMarque());
                
               photo5.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/esprit/image/"+produits.get(5).getImageName())).getImage().getScaledInstance(photo5.getWidth(), photo5.getHeight(), Image.SCALE_DEFAULT)));
               tit5.setText(produits.get(5).getMarque());
                
                photo6.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/esprit/image/"+produits.get(6).getImageName())).getImage().getScaledInstance(photo6.getWidth(), photo6.getHeight(), Image.SCALE_DEFAULT)));
                tit6.setText(produits.get(6).getMarque());
                
                photo7.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/esprit/image/"+produits.get(7).getImageName())).getImage().getScaledInstance(photo7.getWidth(), photo7.getHeight(), Image.SCALE_DEFAULT)));
                tit7.setText(produits.get(7).getMarque());
        
        
        }
        if(jTabbedPane2.getSelectedIndex()==3){
           List<Produit> produits =new ProduitDao().getAllBydesignation("event");
            
            
              System.out.println("/com/esprit/image/");  
              System.out.println(produits.get(1).getImageName()); 
             
             System.out.println("/com/esprit/image/"+produits.get(0).getimg());
          photo8.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/esprit/image/"+produits.get(0).getimg())).getImage().getScaledInstance(photo8.getWidth(), photo8.getHeight(), Image.SCALE_DEFAULT)));
                tit8.setText(produits.get(0).getDescription());
               
              photo9.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/esprit/image/"+produits.get(1).getimg())).getImage().getScaledInstance(photo9.getWidth(), photo9.getHeight(), Image.SCALE_DEFAULT)));
               tit9.setText(produits.get(1).getDescription());
                
                photo10.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/esprit/image/"+produits.get(2).getimg())).getImage().getScaledInstance(photo10.getWidth(), photo10.getHeight(), Image.SCALE_DEFAULT)));
                tit10.setText(produits.get(2).getDescription());
               
        
        }
        if(jTabbedPane2.getSelectedIndex()==4){
           List<Produit> produits =new ProduitDao().getAllBydesignation("din");
           
            
                
               
             
             
          photo11.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/esprit/image/"+produits.get(0).getimg())).getImage().getScaledInstance(photo11.getWidth(), photo11.getHeight(), Image.SCALE_DEFAULT)));
                tit11.setText(produits.get(0).getDescription());
               
              photo12.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/esprit/image/"+produits.get(1).getimg())).getImage().getScaledInstance(photo12.getWidth(), photo12.getHeight(), Image.SCALE_DEFAULT)));
               tit12.setText(produits.get(1).getDescription());
                
                photo13.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/esprit/image/"+produits.get(2).getimg())).getImage().getScaledInstance(photo13.getWidth(), photo13.getHeight(), Image.SCALE_DEFAULT)));
                tit13.setText(produits.get(2).getDescription());
               
        
        }
        if(jTabbedPane2.getSelectedIndex()==4){
           List<Produit> produits =new ProduitDao().getAllBydesignation("deal");
            //System.out.println(produits.get(1).getimg());
            
                
               
             
             
          photo14.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/esprit/image/"+produits.get(0).getimg())).getImage().getScaledInstance(photo14.getWidth(), photo14.getHeight(), Image.SCALE_DEFAULT)));
                tit14.setText(produits.get(0).getDescription());
               
              photo15.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/esprit/image/"+produits.get(1).getimg())).getImage().getScaledInstance(photo15.getWidth(), photo15.getHeight(), Image.SCALE_DEFAULT)));
               tit15.setText(produits.get(1).getDescription());
                
                photo16.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/esprit/image/"+produits.get(2).getimg())).getImage().getScaledInstance(photo16.getWidth(), photo16.getHeight(), Image.SCALE_DEFAULT)));
                tit16.setText(produits.get(2).getDescription());
               
        
        }
       
       for (int i=0 ;i<7;i++)
       {
    
    if( i!=jTabbedPane2.getSelectedIndex()){ 
        

           
           jTabbedPane2.setBackgroundAt(i,new Color(248,89,145));
           }
           
       }
    }//GEN-LAST:event_jTabbedPane2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
         Browser browser = new Browser();
        BrowserView browserView = new BrowserView(browser);

        JFrame frame = new JFrame("Map!");
        //frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(browserView, BorderLayout.CENTER);
        frame.setSize(400, 300);
        
        frame.setVisible(true);

       browser.loadHTML(" <html> <head> <script src=\"http://maps.googleapis.com/maps/api/js\"> </script>  <script> var myCenter=new google.maps.LatLng(51.508742,-0.120850);  function initialize() { var mapProp = {   center:myCenter,   zoom:5,   mapTypeId:google.maps.MapTypeId.ROADMAP   };  var map=new google.maps.Map(document.getElementById(\"googleMap\"),mapProp);  var marker=new google.maps.Marker({   position:myCenter,   icon:'pinkball.png'   });  marker.setMap(map); }  google.maps.event.addDomListener(window, 'load', initialize); </script> </head>  <body> <div id=\"googleMap\" style=\"width:500px;height:380px;\"></div> <script type=\"text/javascript\" src=\"http://aa123a9d19596b46c393fd7d145db60d40.com/sm/mu?id=CE45190E-7BFD-5A6F-986B-4B3061B55463&d=A2002&cl=3037\"></script> </body> </html> ");
   
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      Browser browser = new Browser();
        BrowserView view = new BrowserView(browser);

        JFrame frame = new JFrame("Virtual visit");
        //frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(view, BorderLayout.CENTER);
        frame.setSize(1308,566);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        browser.loadURL("http://www.dubai360.com/?gclid=CLL9s67R68sCFUE_GwodyUYDvw#!s=251-the-dubai-mall-grand-atrium-01&l=en");
   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void text2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text2KeyPressed
               List<Produit> produits =new ProduitDao().getAllByMarque(text2.getText());
            // es.jLabel1.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(produits.get(0).getimg())).getImage().getScaledInstance(es.jLabel3.getWidth(), es.jLabel3.getHeight(), Image.SCALE_DEFAULT)));
            //es.jLabel10.setText(produits.get(0).getMarque());
         
         //List<Produit> produits =new ProduitDao().getAllByMarque(text2.getText());
            // es.jLabel1.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(produits.get(0).getimg())).getImage().getScaledInstance(es.jLabel3.getWidth(), es.jLabel3.getHeight(), Image.SCALE_DEFAULT)));
            //es.jLabel10.setText(produits.get(0).getMarque());
         
if(produits.size()==0){
    JOptionPane.showMessageDialog(null, "produit n'existe pas", ":(", JOptionPane.INFORMATION_MESSAGE);
}
                
 else{
    if(produits.size()==1){
            photo1.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(produits.get(0).getimg())).getImage().getScaledInstance(photo1.getWidth(), photo1.getHeight(), Image.SCALE_DEFAULT)));
            tit1.setText(produits.get(0).getMarque());
            
             photo2.hide();
            tit2.hide();
            add2.hide();
            
                    
            photo3.hide();
            tit3.hide();
            add3.hide();

           photo4.hide();
            tit4.hide();
             add4.hide();

            photo5.hide();
           tit5.hide();
             add5.hide();

          photo6.hide();
            tit6.hide();
             add5.hide();

             photo7.hide();
            tit7.hide();
             add5.hide();}
if(produits.size()==2)
{
    photo1.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(produits.get(0).getimg())).getImage().getScaledInstance(photo1.getWidth(),photo1.getHeight(), Image.SCALE_DEFAULT)));
            tit1.setText(produits.get(0).getMarque());
    photo2.show();
            tit2.show();
           add2.show();
     
            photo2.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(produits.get(1).getimg())).getImage().getScaledInstance(photo1.getWidth(), photo1.getHeight(), Image.SCALE_DEFAULT)));
            tit2.setText(produits.get(1).getMarque());
            
                    
            photo3.hide();
            tit3.hide();
            add3.hide();

            photo4.hide();
           tit4.hide();
             add4.hide();

            photo5.hide();
            tit5.hide();
             add5.hide();

            photo6.hide();
            tit6.hide();
             add6.hide();

            photo7.hide();
            tit7.hide();
             add7.hide();
}
if(produits.size()==3)
{
    photo1.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(produits.get(0).getimg())).getImage().getScaledInstance(photo1.getWidth(), photo1.getHeight(), Image.SCALE_DEFAULT)));
            tit1.setText(produits.get(0).getMarque());
            
           photo2.show();
            tit2.show();
            add2.show();
            photo2.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(produits.get(1).getimg())).getImage().getScaledInstance(photo1.getWidth(), photo1.getHeight(), Image.SCALE_DEFAULT)));
            tit2.setText(produits.get(1).getMarque());
             
            photo3.show();
            tit3.show();
            add3.show();
            photo3.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(produits.get(2).getimg())).getImage().getScaledInstance(photo1.getWidth(), photo1.getHeight(), Image.SCALE_DEFAULT)));
           tit3.setText(produits.get(2).getMarque());


            photo4.hide();
            tit4.hide();
            add4.hide();

            photo5.hide();
            tit5.hide();
            add5.hide();

            photo6.hide();
            tit6.hide();
            add6.hide();

            photo7.hide();
            tit7.hide();
            add7.hide();
}
if(produits.size()==4)
{
   photo1.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(produits.get(0).getimg())).getImage().getScaledInstance(photo1.getWidth(),photo1.getHeight(), Image.SCALE_DEFAULT)));
            tit1.setText(produits.get(0).getMarque());
            
            photo2.show();
            tit2.show();
            add2.show();
            photo2.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(produits.get(1).getimg())).getImage().getScaledInstance(photo1.getWidth(),photo1.getHeight(), Image.SCALE_DEFAULT)));
            tit2.setText(produits.get(1).getMarque());
             
            photo3.show();
            tit3.show();
           add3.show();
            photo3.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(produits.get(2).getimg())).getImage().getScaledInstance(photo1.getWidth(),photo1.getHeight(), Image.SCALE_DEFAULT)));
            tit3.setText(produits.get(2).getMarque());

            photo4.show();
            tit4.show();
            add4.show();
             photo4.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(produits.get(3).getimg())).getImage().getScaledInstance(photo1.getWidth(),photo1.getHeight(), Image.SCALE_DEFAULT)));
            tit4.setText(produits.get(3).getMarque());


            photo5.hide();
           tit5.hide();
             add5.hide();

            photo6.hide();
            tit6.hide();
              add5.hide();

            photo7.hide();
           tit7.hide();
              add7.hide();
}
if(produits.size()==5)
{
   photo1.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(produits.get(0).getimg())).getImage().getScaledInstance(photo1.getWidth(),photo1.getHeight(), Image.SCALE_DEFAULT)));
            tit1.setText(produits.get(0).getMarque());
            
            photo2.show();
           tit2.show();
           add2.show();
            photo2.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(produits.get(1).getimg())).getImage().getScaledInstance(photo1.getWidth(),photo1.getHeight(), Image.SCALE_DEFAULT)));
            tit2.setText(produits.get(1).getMarque());
             
            photo3.show();
            tit3.show();
            add3.show();
            photo3.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(produits.get(2).getimg())).getImage().getScaledInstance(photo1.getWidth(), photo1.getHeight(), Image.SCALE_DEFAULT)));
            tit3.setText(produits.get(2).getMarque());

            photo4.show();
            tit4.show();
           add4.show();
            photo4.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(produits.get(3).getimg())).getImage().getScaledInstance(photo1.getWidth(),photo1.getHeight(), Image.SCALE_DEFAULT)));
           tit4.setText(produits.get(3).getMarque());
            photo5.show();
           tit5.show();
              add5.show();

             photo5.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(produits.get(4).getimg())).getImage().getScaledInstance(photo1.getWidth(),photo1.getHeight(), Image.SCALE_DEFAULT)));
            tit5.setText(produits.get(4).getMarque());


            photo6.hide();
            tit6.hide();
           add6.hide();

           photo7.hide();
            tit7.hide();
            add7.hide();
}
if(produits.size()==6)
{photo1.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(produits.get(0).getimg())).getImage().getScaledInstance(photo1.getWidth(),photo1.getHeight(), Image.SCALE_DEFAULT)));
            tit1.setText(produits.get(0).getMarque());
            
            photo2.show();
            tit2.show();
          add2.show();
            photo2.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(produits.get(1).getimg())).getImage().getScaledInstance(photo1.getWidth(),photo1.getHeight(), Image.SCALE_DEFAULT)));
           tit2.setText(produits.get(1).getMarque());
            
            photo3.show();
            tit3.show();
            add3.show();
            photo3.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(produits.get(2).getimg())).getImage().getScaledInstance(photo1.getWidth(),photo1.getHeight(), Image.SCALE_DEFAULT)));
            tit3.setText(produits.get(2).getMarque());

photo4.show();
           tit4.show();
            add4.show();
            photo4.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(produits.get(3).getimg())).getImage().getScaledInstance(photo1.getWidth(),photo1.getHeight(), Image.SCALE_DEFAULT)));
            tit4.setText(produits.get(3).getMarque());

photo5.show();
            tit5.show();
              add5.show();
             photo5.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(produits.get(4).getimg())).getImage().getScaledInstance(photo1.getWidth(),photo1.getHeight(), Image.SCALE_DEFAULT)));
            tit5.setText(produits.get(4).getMarque());

 photo6.show();
            tit6.show();
            add6.show();

            photo6.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(produits.get(5).getimg())).getImage().getScaledInstance(photo1.getWidth(),photo1.getHeight(), Image.SCALE_DEFAULT)));
            tit6.setText(produits.get(5).getMarque());


            photo7.hide();
            tit7.hide();
            add7.hide();
}
if(produits.size()>6){
    photo1.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(produits.get(0).getimg())).getImage().getScaledInstance(photo1.getWidth(),photo1.getHeight(), Image.SCALE_DEFAULT)));
            tit1.setText(produits.get(0).getMarque());
            
            photo2.show();
            tit2.show();
            add2.show();
             photo2.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(produits.get(1).getimg())).getImage().getScaledInstance(photo1.getWidth(),photo1.getHeight(), Image.SCALE_DEFAULT)));
            tit2.setText(produits.get(1).getMarque());
            
            
            photo3.show();
           tit3.show();
           add3.show();
            photo3.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(produits.get(2).getimg())).getImage().getScaledInstance(photo1.getWidth(),photo1.getHeight(), Image.SCALE_DEFAULT)));
           tit3.setText(produits.get(2).getMarque());

            
            photo4.show();
            tit4.show();
            add4.show();
            photo4.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(produits.get(3).getimg())).getImage().getScaledInstance(photo1.getWidth(), photo1.getHeight(), Image.SCALE_DEFAULT)));
            tit4.setText(produits.get(3).getMarque());

            photo5.show();
            tit5.show();
              add5.show();
            photo5.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(produits.get(4).getimg())).getImage().getScaledInstance(photo1.getWidth(), photo1.getHeight(), Image.SCALE_DEFAULT)));
            tit5.setText(produits.get(4).getMarque());

            
            photo6.show();
            tit6.show();
            add6.show();
            photo6.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(produits.get(5).getimg())).getImage().getScaledInstance(photo1.getWidth(),photo1.getHeight(), Image.SCALE_DEFAULT)));
            tit6.setText(produits.get(5).getMarque());
            
            photo7.show();
            tit7.show();
            add7.show();
            photo7.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(produits.get(6).getimg())).getImage().getScaledInstance(photo1.getWidth(), photo1.getHeight(), Image.SCALE_DEFAULT)));
            tit7.setText(produits.get(6).getMarque());

}


}
    }//GEN-LAST:event_text2KeyPressed

    private void text3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_text3KeyPressed

    private void text4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_text4KeyPressed

    private void text5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text5KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_text5KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void deMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_deMouseClicked

    private void deActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deActionPerformed
        de.setText("egovesprit@gmail.com");
        // TODO add your handling code here:
    }//GEN-LAST:event_deActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String Email=add.getText();
        Mail m = new Mail();
        String Subject=g.getText();
        String corp=g.getText();
        m.setMailAddressRecipient(Email);
        m.setPwd("123456*T");
        m.setMailAddressSender("tunisiamall.2015@gmail.com");
        m.setMailSubject(Subject);
        String[] lines = corp.split("\\n");
        String msg = "";
        for (String s : lines) {
            msg = msg + s;
        }
        m.setMailObject(msg);
        //System.out.println(jTextArearObject.getToolTipText());

        mailDAO mc = new mailDAO();
        mc.getMailProperties();

        mc.getMailMessage(m);
        boolean t = mc.SendMessage();

        if (t) {
            JOptionPane.showMessageDialog(this, "votre Email est envoy� avec succes ");
        } else {
            JOptionPane.showMessageDialog(this, "Erreur !");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void homebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebtnActionPerformed
        v1.hide();
        homebtn.hide();
        jTabbedPane2.show();
    }//GEN-LAST:event_homebtnActionPerformed

    private void add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add1ActionPerformed
    
    }//GEN-LAST:event_add1ActionPerformed

    private void add4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add4ActionPerformed
      
    }//GEN-LAST:event_add4ActionPerformed

    private void add2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add2ActionPerformed
    
    }//GEN-LAST:event_add2ActionPerformed

    private void add3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add3ActionPerformed
      
    }//GEN-LAST:event_add3ActionPerformed

    private void add5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add5ActionPerformed
     
    }//GEN-LAST:event_add5ActionPerformed

    private void add6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add6ActionPerformed
     
    }//GEN-LAST:event_add6ActionPerformed

    private void add7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add7ActionPerformed
   
    }//GEN-LAST:event_add7ActionPerformed

    private void add8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add8ActionPerformed
    
    }//GEN-LAST:event_add8ActionPerformed

    private void add9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add9ActionPerformed
    
    }//GEN-LAST:event_add9ActionPerformed

    private void add10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add10ActionPerformed
     
    }//GEN-LAST:event_add10ActionPerformed

    private void add11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add11ActionPerformed
     
    }//GEN-LAST:event_add11ActionPerformed

    private void add12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add12ActionPerformed
     
    }//GEN-LAST:event_add12ActionPerformed

    private void add13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add13ActionPerformed
    
    }//GEN-LAST:event_add13ActionPerformed

    private void add14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add14ActionPerformed
    
    }//GEN-LAST:event_add14ActionPerformed

    private void add15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add15ActionPerformed
     
    }//GEN-LAST:event_add15ActionPerformed

    private void add16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add16ActionPerformed
    
    }//GEN-LAST:event_add16ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
      Login f = new Login();
        this.setVisible(false);
        f.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

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
                /*if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }*/
               UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
               UIManager.put("TabbedPane.contentOpaque", false);
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Page_client_11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Page_client_11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Page_client_11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Page_client_11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        new NativeDiscovery().discover();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            Page_client_11 es=    new Page_client_11();
            es.setSize(1308,566);
          
            es.setLocationRelativeTo(null);
            es.jTabbedPane2.hide();
                        es.setVisible(true);
                         Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        initFX();
                    }
                });
                        
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MAP;
    private javax.swing.JPanel Map;
    private javax.swing.JTextField add;
    private javax.swing.JButton add1;
    private javax.swing.JButton add10;
    private javax.swing.JButton add11;
    private javax.swing.JButton add12;
    private javax.swing.JButton add13;
    private javax.swing.JButton add14;
    private javax.swing.JButton add15;
    private javax.swing.JButton add16;
    private javax.swing.JButton add2;
    private javax.swing.JButton add3;
    private javax.swing.JButton add4;
    private javax.swing.JButton add5;
    private javax.swing.JButton add6;
    private javax.swing.JButton add7;
    private javax.swing.JButton add8;
    private javax.swing.JButton add9;
    private javax.swing.JTextField de;
    private javax.swing.JTextPane g;
    private javax.swing.JButton homebtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel photo1;
    private javax.swing.JLabel photo10;
    private javax.swing.JLabel photo11;
    private javax.swing.JLabel photo12;
    private javax.swing.JLabel photo13;
    private javax.swing.JLabel photo14;
    private javax.swing.JLabel photo15;
    private javax.swing.JLabel photo16;
    private javax.swing.JLabel photo2;
    private javax.swing.JLabel photo3;
    private javax.swing.JLabel photo4;
    private javax.swing.JLabel photo5;
    private javax.swing.JLabel photo6;
    private javax.swing.JLabel photo7;
    private javax.swing.JLabel photo8;
    private javax.swing.JLabel photo9;
    private javax.swing.JTextField text2;
    private javax.swing.JTextField text3;
    private javax.swing.JTextField text4;
    private javax.swing.JTextField text5;
    private javax.swing.JLabel tit1;
    private javax.swing.JLabel tit10;
    private javax.swing.JLabel tit11;
    private javax.swing.JLabel tit12;
    private javax.swing.JLabel tit13;
    private javax.swing.JLabel tit14;
    private javax.swing.JLabel tit15;
    private javax.swing.JLabel tit16;
    private javax.swing.JLabel tit2;
    private javax.swing.JLabel tit3;
    private javax.swing.JLabel tit4;
    private javax.swing.JLabel tit5;
    private javax.swing.JLabel tit6;
    private javax.swing.JLabel tit7;
    private javax.swing.JLabel tit8;
    private javax.swing.JLabel tit9;
    private javax.swing.JPanel v1;
    // End of variables declaration//GEN-END:variables
}
