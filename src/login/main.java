package login;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import guiinternal.settings;
import config.MyConnection;
import java.awt.Color;
import guiinternal.*;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 *
 * @author College-PC
 */


public class main extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public main() {
        initComponents();
       seticon();
    
    }
    
    Color dashcolor = new Color(255,153,153);
    Color headcolor = new Color (0,153,204);
    Color bodycolor = new Color (153,204,255);


    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        horizon = new javax.swing.JPanel();
        dashpane = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        dashpane2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        dashpane3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        retri = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        report = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        account = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        soldpro = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        mainclose = new javax.swing.JLabel();
        mainmini = new javax.swing.JLabel();
        despane = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(null);

        horizon.setBackground(new java.awt.Color(255, 153, 153));

        dashpane.setBackground(new java.awt.Color(255, 153, 153));
        dashpane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashpaneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashpaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashpaneMouseExited(evt);
            }
        });
        dashpane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Dashboard");
        dashpane.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 170, 20));

        dashpane2.setBackground(new java.awt.Color(255, 153, 153));
        dashpane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashpane2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashpane2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashpane2MouseExited(evt);
            }
        });
        dashpane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Dashboard");
        dashpane2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 170, 20));

        dashpane3.setBackground(new java.awt.Color(255, 153, 153));
        dashpane3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashpane3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashpane3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashpane3MouseExited(evt);
            }
        });
        dashpane3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Dashboard");
        dashpane3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 170, 20));

        dashpane2.add(dashpane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        dashpane.add(dashpane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        retri.setBackground(new java.awt.Color(255, 153, 153));
        retri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                retriMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                retriMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                retriMouseExited(evt);
            }
        });
        retri.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Userpage");
        retri.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 170, 20));

        report.setBackground(new java.awt.Color(255, 153, 153));
        report.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportMouseExited(evt);
            }
        });
        report.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("View Report");
        report.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 170, 20));

        account.setBackground(new java.awt.Color(255, 153, 153));
        account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                accountMouseExited(evt);
            }
        });
        account.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Account");
        account.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 170, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        name.setEditable(false);
        name.setBackground(new java.awt.Color(255, 153, 153));
        name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        name.setBorder(null);

        soldpro.setBackground(new java.awt.Color(255, 153, 153));
        soldpro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                soldproMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                soldproMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                soldproMouseExited(evt);
            }
        });
        soldpro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Sold Product");
        soldpro.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 170, 20));

        javax.swing.GroupLayout horizonLayout = new javax.swing.GroupLayout(horizon);
        horizon.setLayout(horizonLayout);
        horizonLayout.setHorizontalGroup(
            horizonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(horizonLayout.createSequentialGroup()
                .addGroup(horizonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(horizonLayout.createSequentialGroup()
                        .addGroup(horizonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(report, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dashpane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(account, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(retri, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, horizonLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(soldpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        horizonLayout.setVerticalGroup(
            horizonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(horizonLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(dashpane, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(report, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(retri, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(soldpro, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(account, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(horizon);
        horizon.setBounds(0, 0, 170, 500);

        header.setBackground(new java.awt.Color(0, 153, 204));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-close-window-32 (1).png"))); // NOI18N
        mainclose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mainclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maincloseMouseClicked(evt);
            }
        });
        header.add(mainclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, -1, -1));

        mainmini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-subtract-30.png"))); // NOI18N
        mainmini.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mainmini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mainminiMouseClicked(evt);
            }
        });
        header.add(mainmini, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, -1, -1));

        jPanel1.add(header);
        header.setBounds(170, 0, 820, 50);

        despane.setPreferredSize(new java.awt.Dimension(760, 420));

        javax.swing.GroupLayout despaneLayout = new javax.swing.GroupLayout(despane);
        despane.setLayout(despaneLayout);
        despaneLayout.setHorizontalGroup(
            despaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 816, Short.MAX_VALUE)
        );
        despaneLayout.setVerticalGroup(
            despaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 484, Short.MAX_VALUE)
        );

        jPanel1.add(despane);
        despane.setBounds(170, 50, 816, 484);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 982, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dashpaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpaneMouseClicked
        dashboard db = new dashboard();

        despane.add(db).setVisible(true);
    }//GEN-LAST:event_dashpaneMouseClicked

    private void dashpaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpaneMouseEntered
        dashpane.setBackground(bodycolor);
    }//GEN-LAST:event_dashpaneMouseEntered

    private void dashpaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpaneMouseExited
        dashpane.setBackground(dashcolor);
    }//GEN-LAST:event_dashpaneMouseExited

    private void retriMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retriMouseEntered
        retri.setBackground(bodycolor);
    }//GEN-LAST:event_retriMouseEntered

    private void retriMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retriMouseExited
        retri.setBackground(dashcolor);
    }//GEN-LAST:event_retriMouseExited

    private void reportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportMouseEntered
        report.setBackground(bodycolor);
    }//GEN-LAST:event_reportMouseEntered

    private void reportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportMouseExited
        report.setBackground(dashcolor);
    }//GEN-LAST:event_reportMouseExited

    private void reportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportMouseClicked
      add up = new add();
      
      despane.add(up).setVisible(true);
      
    }//GEN-LAST:event_reportMouseClicked

    private void accountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountMouseEntered
        account.setBackground(bodycolor);
    }//GEN-LAST:event_accountMouseEntered

    private void accountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountMouseExited
        account.setBackground(dashcolor);
    }//GEN-LAST:event_accountMouseExited

    private void accountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountMouseClicked
settings set = new settings();
despane.add(set).setVisible(true);
 
    }//GEN-LAST:event_accountMouseClicked

    private void maincloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maincloseMouseClicked
          int a =JOptionPane.showConfirmDialog(null, "Confirm Exit?");
     if(a==JOptionPane.YES_OPTION){
         System.exit(a);
     }
    }//GEN-LAST:event_maincloseMouseClicked

    private void mainminiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainminiMouseClicked
    setState(ICONIFIED);
    }//GEN-LAST:event_mainminiMouseClicked

    private void retriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retriMouseClicked
    costumer cos = new costumer();
    despane.add(cos).setVisible(true);
    }//GEN-LAST:event_retriMouseClicked

    private void soldproMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_soldproMouseClicked
    soldProduct sp =new soldProduct();
    despane.add(sp).setVisible(true);
    }//GEN-LAST:event_soldproMouseClicked

    private void soldproMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_soldproMouseEntered
          soldpro.setBackground(bodycolor);
    }//GEN-LAST:event_soldproMouseEntered

    private void soldproMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_soldproMouseExited
        soldpro.setBackground(dashcolor);
    }//GEN-LAST:event_soldproMouseExited

    private void dashpane3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpane3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_dashpane3MouseClicked

    private void dashpane3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpane3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_dashpane3MouseEntered

    private void dashpane3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpane3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_dashpane3MouseExited

    private void dashpane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpane2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_dashpane2MouseClicked

    private void dashpane2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpane2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_dashpane2MouseEntered

    private void dashpane2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpane2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_dashpane2MouseExited

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel account;
    private javax.swing.JPanel dashpane;
    private javax.swing.JPanel dashpane2;
    private javax.swing.JPanel dashpane3;
    public javax.swing.JDesktopPane despane;
    private javax.swing.JPanel header;
    private javax.swing.JPanel horizon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mainclose;
    private javax.swing.JLabel mainmini;
    public javax.swing.JTextField name;
    private javax.swing.JPanel report;
    private javax.swing.JPanel retri;
    private javax.swing.JPanel soldpro;
    // End of variables declaration//GEN-END:variables

    private void seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/fish.png")));
        setTitle("Aqua Life");
    }

   
}
