/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.esprit.GUI;
import com.esprit.DAO.AdminDAO;

import com.esprit.Util.db_connection;
import com.esprit.entites.image;
import java.awt.Image;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author snoussi
 */
public class afficher_pack extends javax.swing.JFrame {

    /**
     * Creates new form afficher_pack
     */
     image p= new image();
        image p1= new image();
            image p2= new image();
                image p3= new image();
        db_connection conn=new db_connection();
         AdminDAO a=new AdminDAO();
           AdminDAO a1=new AdminDAO();
         
          Statement stm;
    public afficher_pack() throws SQLException{ //throws SQLException, IOException {

      
        
        
        initComponents();
                 img12.setVisible(false);

     img12.hide();
              img1.setVisible(false);

     img1.hide();
              img13.setVisible(false);

     img13.hide();
      boutan3.setVisible(false);

     boutan3.hide();
        bouton4.setVisible(false);
     bouton4.hide();
    
     Button5.setVisible(false);
     Button5.hide();
     
     Button6.setVisible(false);
     Button6.hide();
       
 
     
     //////////////////////
//    PersonneDAO pd= new PersonneDAO();
//    PersonneDAO pd1= new PersonneDAO();
//    p=pd.findOne(7);
//    p1=pd1.findOne(2);  
//    /////////////////
//    Blob i1 = p.getImage();
//    BufferedInputStream bis=null;
//    try{
//            bis = new BufferedInputStream(i1.getBinaryStream());
//    }catch(SQLException ex)
//    { System.out.println("erreur");  }
//    Image img2=null;
//    try{
//    
//    img2 = ImageIO.read(bis);
//    } catch(IOException ex)
//    {   System.out.println("erruer2");
//    }
//            
//            Image img3= img2.getScaledInstance(img1.getWidth(),img1.getHeight(),Image.SCALE_SMOOTH);
//    img1.setIcon(new ImageIcon(img3));
//    p=pd.findOne(7);
//    //Ta_Desc.setText(p.getDescription());
//   // tf_l.setText(p.getDescription());
//    
//    /////////////
//    
//    Blob i2 = p1.getImage();
//    BufferedInputStream bis1=null;
//    try{
//            bis1 = new BufferedInputStream(i2.getBinaryStream());
//    }catch(SQLException ex)
//    { System.out.println("erreur");  }
//     Image im1=null;
//    try{
//    
//            im1 = ImageIO.read(bis1);
//    } catch(IOException ex)
//    {   System.out.println("erruer2");
//    }
//            
//            Image im2= im1.getScaledInstance(img12.getWidth(),img12.getHeight(),Image.SCALE_SMOOTH);
//    img12.setIcon(new ImageIcon(im2));
//    
//        
           //  image p= new image();
            //   pack p1= new pack();
           //  stm=conn.obtenirconnexion().createStatement();
//ResultSet res=stm.executeQuery("SELECT * FROM pack");
   //  String nom = res.getString("nom_pack");

     //  PersonneDAO pd= new PersonneDAO();
     //  PersonneDAO pd1= new PersonneDAO();
      // pack = new pack();
     //  int id = p.getId_pack();
        p=a1.findOne(1);
          //int id2 = p1.getId_pack(44);
            p1=a.findOne(2);
             p2=a.findOne(3);
              p3=a.findOne(4);
             //  p4=pd.findOne(2);
            /////////////
            Blob i1 = p.getImg();
    BufferedInputStream bis=null;
    try{
            bis = new BufferedInputStream(i1.getBinaryStream());
    }catch(SQLException ex)
    { System.out.println("erreur");  }
    Image img2=null;
    try{
//    
   img2 = ImageIO.read(bis);
    } catch(IOException ex)
    {   System.out.println("erruer2");
    }
            
           Image img3= img2.getScaledInstance(img14.getWidth(),img14.getHeight(),Image.SCALE_SMOOTH);
    img14.setIcon(new ImageIcon(img3));
   // p=pd.findOne(44);
    
    ////////////////
    
    
//    mounhna tabda 
     Blob i = p1.getImg();
    BufferedInputStream bis1=null;
    try{
            bis1 = new BufferedInputStream(i.getBinaryStream());
    }catch(SQLException ex)
    { System.out.println("erreur");  }
    Image img5;
         img5 = null;
    try{
//    
   img5 = ImageIO.read(bis1);
    } catch(IOException ex)
    {   System.out.println("erruer2");
    }
            
           Image img7= img5.getScaledInstance(img12.getWidth(),img12.getHeight(),Image.SCALE_SMOOTH);
    img12.setIcon(new ImageIcon(img7));
    /////////////////
                Blob i2 = p2.getImg();
    BufferedInputStream bis2=null;
    try{
            bis2 = new BufferedInputStream(i2.getBinaryStream());
    }catch(SQLException ex)
    { System.out.println("erreur");  }
    Image img6=null;
    try{
//    
   img6 = ImageIO.read(bis2);
    } catch(IOException ex)
    {   System.out.println("erruer2");
    }
            
           Image img8= img6.getScaledInstance(img1.getWidth(),img1.getHeight(),Image.SCALE_SMOOTH);
    img1.setIcon(new ImageIcon(img8));
    ///////////////////////////////////
    
    
                    Blob i3 = p3.getImg();
    BufferedInputStream bis3=null;
    try{
            bis3 = new BufferedInputStream(i2.getBinaryStream());
    }catch(SQLException ex)
    { System.out.println("erreur");  }
    Image img9=null;
    try{
//    
   img9 = ImageIO.read(bis3);
    } catch(IOException ex)
    {   System.out.println("erruer2");
    }
            
           Image img10= img9.getScaledInstance(img13.getWidth(),img13.getHeight(),Image.SCALE_SMOOTH);
    img13.setIcon(new ImageIcon(img10));
    
    
    
//    toufa 
   // p=pd.findOne(44);
  //  p1=pd.findOne(44);
///////////////////////////////////////////
//    
//           Blob i2 = p1.getImage();
//    BufferedInputStream bis1=null;
//    try{
//            bis1 = new BufferedInputStream(i2.getBinaryStream());
//    }catch(SQLException ex)
//    { System.out.println("erreur");  }
//     Image im1=null;
//   try{
////    
//            im1 = ImageIO.read(bis1);
//    } catch(IOException ex)
//    {   System.out.println("erruer2");
//   }
//           
//            Image im2= im1.getScaledInstance(img14.getWidth(),img14.getHeight(),Image.SCALE_SMOOTH);
//    img14.setIcon(new ImageIcon(im2));
//    p=pd.findOne(2);
//    
//    Blob i2 = p1.getPhoto_pack();
//    BufferedInputStream bis1=null;
//    try{
//            bis1 = new BufferedInputStream(i2.getBinaryStream());
//    }catch(SQLException ex)
//    { System.out.println("erreur");  }
//     Image im1=null;
//    try{
//    
//            im1 = ImageIO.read(bis1);
//    } catch(IOException ex)
//    {   System.out.println("erruer2");
//    }
//            
//            Image im2= im1.getScaledInstance(im.getWidth(),im.getHeight(),Image.SCALE_SMOOTH);
//    im.setIcon(new ImageIcon(im2));
//      p=pd.findOne(2);
//    
    
    
    
    
    
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        img1 = new javax.swing.JLabel();
        img14 = new javax.swing.JLabel();
        img12 = new javax.swing.JLabel();
        img13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        boutan1 = new javax.swing.JButton();
        bouton2 = new javax.swing.JButton();
        boutan3 = new javax.swing.JButton();
        bouton4 = new javax.swing.JButton();
        Button5 = new javax.swing.JButton();
        Button6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1347, 634));
        getContentPane().setLayout(null);

        img1.setBackground(new java.awt.Color(255, 255, 0));
        img1.setForeground(new java.awt.Color(153, 255, 0));
        getContentPane().add(img1);
        img1.setBounds(410, 290, 540, 210);

        img14.setBackground(new java.awt.Color(255, 255, 153));
        getContentPane().add(img14);
        img14.setBounds(410, 290, 540, 210);
        getContentPane().add(img12);
        img12.setBounds(410, 290, 540, 210);
        getContentPane().add(img13);
        img13.setBounds(410, 290, 540, 210);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/pack boutan 2.PNG"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(320, 360, 0, 0);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/pack bouton 1.PNG"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(970, 360, 0, 0);

        boutan1.setText("jButton1");
        boutan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutan1ActionPerformed(evt);
            }
        });
        getContentPane().add(boutan1);
        boutan1.setBounds(970, 380, 60, 30);

        bouton2.setText("jButton2");
        bouton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouton2ActionPerformed(evt);
            }
        });
        getContentPane().add(bouton2);
        bouton2.setBounds(323, 380, 50, 23);

        boutan3.setText("jButton3");
        boutan3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutan3ActionPerformed(evt);
            }
        });
        getContentPane().add(boutan3);
        boutan3.setBounds(970, 380, 50, 30);

        bouton4.setText("jButton4");
        bouton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouton4ActionPerformed(evt);
            }
        });
        getContentPane().add(bouton4);
        bouton4.setBounds(323, 380, 50, 23);

        Button5.setText("Button5");
        Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });
        getContentPane().add(Button5);
        Button5.setBounds(970, 383, 50, 30);

        Button6.setText("jButton6");
        Button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });
        getContentPane().add(Button6);
        Button6.setBounds(323, 380, 50, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/layout 19.PNG"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 0, 0);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boutan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutan1ActionPerformed
        // TODO add your handling code here:
               img14.setVisible(false);

     img14.hide();
            img12.setVisible(false);
               
       img12.show(); 
          boutan1.setVisible(false);

     boutan1.hide();
        boutan3.setVisible(false);

     boutan3.show();
    
        
    }//GEN-LAST:event_boutan1ActionPerformed

    private void bouton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouton2ActionPerformed
        // TODO add your handling code here:
               img14.setVisible(false);
               
       img14.show(); 
       img12.setVisible(false);
       img12.hide();
          boutan3.setVisible(false);

     boutan3.hide();
         boutan1.setVisible(false);

     boutan1.show();
     
        
    }//GEN-LAST:event_bouton2ActionPerformed

    private void boutan3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutan3ActionPerformed
        // TODO add your handling code here:
               img12.setVisible(false);
               
       img12.hide(); 
                   img1.setVisible(false);
               
       img1.show(); 
          boutan3.setVisible(false);

     boutan3.hide();
        Button5.setVisible(false);

     Button5.show();
         bouton2.setVisible(false);

     bouton2.hide();
        bouton4.setVisible(false);

     bouton4.show();
        
    }//GEN-LAST:event_boutan3ActionPerformed

    private void bouton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouton4ActionPerformed
        // TODO add your handling code here:
                    img1.setVisible(false);
               
       img1.hide(); 
              img12.setVisible(false);
               
       img12.show();
           Button5.setVisible(false);

     Button5.hide();
          bouton4.setVisible(false);

     bouton4.hide();
    
          boutan3.setVisible(false);

     boutan3.show();
          bouton2.setVisible(false);

     bouton2.show();
       
        
    }//GEN-LAST:event_bouton4ActionPerformed

    private void Button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button6ActionPerformed
        // TODO add your handling code here:
                 img13.setVisible(false);
               
       img13.hide(); 
                   img1.setVisible(false);
               
       img1.show(); 
           Button6.setVisible(false);

     Button6.hide();
            Button5.setVisible(false);

     Button5.hide();
         boutan3.setVisible(false);

     boutan3.show();
     
         bouton4.setVisible(false);

     bouton4.show();
    }//GEN-LAST:event_Button6ActionPerformed

    private void Button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button5ActionPerformed
        // TODO add your handling code here:
                 img1.setVisible(false);
               
       img1.hide(); 
                   img13.setVisible(false);
               
       img13.show(); 
         Button6.setVisible(false);

     Button6.show();
            bouton4.setVisible(false);

     bouton4.hide();
        
        
    }//GEN-LAST:event_Button5ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(afficher_pack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(afficher_pack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(afficher_pack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(afficher_pack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
           
                try {
                    new afficher_pack().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(afficher_pack.class.getName()).log(Level.SEVERE, null, ex);
                }
                } 
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button5;
    private javax.swing.JButton Button6;
    private javax.swing.JButton boutan1;
    private javax.swing.JButton boutan3;
    private javax.swing.JButton bouton2;
    private javax.swing.JButton bouton4;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img12;
    private javax.swing.JLabel img13;
    private javax.swing.JLabel img14;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
