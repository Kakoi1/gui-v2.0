/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guiinternal;
import java.awt.Color;
import javax.swing.plaf.basic.BasicInternalFrameUI;
/**
 *
 * @author College-PC
 */
public class dashboard extends javax.swing.JInternalFrame {

    /** Creates new form dashboard */
    public dashboard() {
        initComponents();
        
         this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
         BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
         bi.setNorthPane(null);
    }

    Color headcolor = new Color(0,153,204);
    Color bodycolor = new Color(153,204,255);
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        manage = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        setting = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3);
        jPanel3.setBounds(630, 0, 120, 160);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setText("Aquatic life Recording Application");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 290, 30);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel2.setText("Additional System Description");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 40, 200, 30);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 160));

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));
        jPanel2.setLayout(null);

        manage.setBackground(new java.awt.Color(0, 153, 204));
        manage.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        manage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                manageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                manageMouseExited(evt);
            }
        });
        manage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(153, 204, 255));
        jLabel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        manage.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 21, 112, -1));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Manage User");
        manage.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 127, 112, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-admin-settings-male-100.png"))); // NOI18N
        manage.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 110, 110));

        jPanel2.add(manage);
        manage.setBounds(100, 40, 160, 160);

        setting.setBackground(new java.awt.Color(0, 153, 204));
        setting.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setting.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingMouseExited(evt);
            }
        });
        setting.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Settings");
        setting.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 127, 112, -1));
        setting.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 21, 112, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-services-100.png"))); // NOI18N
        setting.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 21, 112, 100));

        jPanel2.add(setting);
        setting.setBounds(530, 40, 160, 160);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 810, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void manageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageMouseEntered
        manage.setBackground(bodycolor);
    }//GEN-LAST:event_manageMouseEntered

    private void manageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageMouseExited
        manage.setBackground(headcolor);
    }//GEN-LAST:event_manageMouseExited

    private void settingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingMouseEntered
        setting.setBackground(bodycolor);
    }//GEN-LAST:event_settingMouseEntered

    private void settingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingMouseExited
        setting.setBackground(headcolor);
    }//GEN-LAST:event_settingMouseExited

    private void manageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageMouseClicked
    
    
    
    }//GEN-LAST:event_manageMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel manage;
    private javax.swing.JPanel setting;
    // End of variables declaration//GEN-END:variables

}