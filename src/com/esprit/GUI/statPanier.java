/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import com.esprit.DAO.PanierproduitDAO;


/**
 *
 * @author sawssen
 */
public class statPanier extends javax.swing.JFrame {
   
    /**
     * Creates new form statPanier
     */
    public statPanier() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1308, 600));
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Statistiques Pie");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(390, 490, 140, 29);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Staistiques Bar");
        jButton2.setActionCommand("staistiques ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(580, 490, 136, 29);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanel7);
        jPanel7.setBounds(200, 150, 740, 330);

        jLabel1.setMaximumSize(new java.awt.Dimension(1308, 600));
        jLabel1.setMinimumSize(new java.awt.Dimension(1308, 600));
        jLabel1.setPreferredSize(new java.awt.Dimension(1308, 600));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1308, 566);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      PanierproduitDAO  prdao = new PanierproduitDAO();
         DefaultPieDataset pieDataset = new DefaultPieDataset();
         ResultSet rspr=prdao.statProduits(1);
          int qtg=prdao.calculerQuantiteGlobale(1);
        try {
            while(rspr.next())
            pieDataset.setValue(rspr.getString("designation"),(rspr.getInt("quantite")*100)/qtg );
        } catch (SQLException ex) {
            Logger.getLogger(statPanier.class.getName()).log(Level.SEVERE, null, ex);
        }
       
         
         
           JFreeChart chart= ChartFactory.createPieChart("Quantité de chaque produit dans mon panier", pieDataset, true, true, true);
           PiePlot P=(PiePlot)chart.getPlot();
//           P.setForegroundAlpha(TOP_ALIGNMENT);
//           ChartFrame frame = new ChartFrame("Statistiques panier", chart);
//           frame.setVisible(true);
//           frame.setSize(600,700);
           ChartPanel piePanel = new ChartPanel(chart);
            jPanel7.removeAll();   
         jPanel7.add(piePanel);
        jPanel7.validate();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       PanierproduitDAO  prdao = new PanierproduitDAO();
    ResultSet rspr=prdao.statProduits(1);
             DefaultCategoryDataset barChartData = new DefaultCategoryDataset();
        try {
            while(rspr.next()){
                barChartData.setValue(rspr.getInt("quantite"),"",rspr.getString("designation"));}
        } catch (SQLException ex) {
            Logger.getLogger(statPanier.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        JFreeChart barChart = ChartFactory.createBarChart3D("Quantité de chaque produit dans mon panier", "Produit", "Quantité", barChartData, PlotOrientation.VERTICAL, rootPaneCheckingEnabled, rootPaneCheckingEnabled, rootPaneCheckingEnabled);
        CategoryPlot barchrt = barChart.getCategoryPlot();
        barchrt.setRangeGridlinePaint(Color.ORANGE);
         ChartPanel barPanel = new ChartPanel(barChart);
        //ChartPanel barPanel = new ChartPanel(barChart);
                
        //frame.setVisible(true);
        //ChartFrame frame = new ChartFrame("Statistiques panier", barChart);
          // frame.setVisible(true);
           //frame.setSize(600,700);

     jPanel7.removeAll();   
     jPanel7.add(barPanel, BorderLayout.CENTER);
     jPanel7.validate();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(statPanier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(statPanier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(statPanier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(statPanier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new statPanier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}
