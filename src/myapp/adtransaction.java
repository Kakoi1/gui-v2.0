/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp;

import config.dbconnect;
import guiinternal.costumer;
import guiinternal.soldProduct;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author College-PC
 */
public class adtransaction extends javax.swing.JFrame {

    /**
     * Creates new form adtransaction
     */
    public adtransaction() {
        initComponents();
        labels.setVisible(false);
    }
public String unm;
public String actions;
public String klee="";
    
    public void close(){   
        this.dispose();
        main m = new main();
        m.setVisible(true);
        soldProduct up = new soldProduct();
        m.despane.add(up).setVisible(true);
        m.name.setText(unm);
        up.report = unm;
}
    
    public void dis(){
        if(klee.equals("Complete")){
            
            jComboBox1.setVisible(false);
            save.setVisible(false);
            jLabel6.setVisible(false);
            adfish.setVisible(false);
            labels.setVisible(true);
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

        fna = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        save = new javax.swing.JPanel();
        save1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        date = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        delete3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        fip = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        bid = new javax.swing.JTextField();
        bna = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        bad = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        adfish = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        labels = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fna.setBackground(new java.awt.Color(0, 153, 204));
        fna.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        fna.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Transactio id:");
        fna.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 80, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Fish name :");
        fna.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 70, 30));

        name.setEditable(false);
        name.setBackground(new java.awt.Color(204, 204, 204));
        name.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fna.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 190, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Fish Price :");
        fna.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 80, 30));

        id.setEditable(false);
        id.setBackground(new java.awt.Color(204, 204, 204));
        id.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        fna.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 90, 30));

        save.setBackground(new java.awt.Color(255, 153, 153));
        save.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                saveMouseExited(evt);
            }
        });
        save.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        save1.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        save1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        save1.setText("Save");
        save.add(save1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 30));

        fna.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 540, 70, 30));

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel3.setLayout(null);

        date.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        date.setText("     ");
        jPanel3.add(date);
        date.setBounds(360, 10, 110, 30);

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel12.setText("Date :");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(290, 10, 60, 30);

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel17.setText("Transactions");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(10, 10, 290, 30);

        fna.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 60));

        delete3.setBackground(new java.awt.Color(255, 153, 153));
        delete3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        delete3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                delete3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                delete3MouseExited(evt);
            }
        });
        delete3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Cancel");
        delete3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 30));

        fna.add(delete3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, 70, 30));

        fip.setEditable(false);
        fip.setBackground(new java.awt.Color(204, 204, 204));
        fip.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        fip.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fip.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fna.add(fip, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 190, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Buyer ID :");
        fna.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 90, 30));

        bid.setEditable(false);
        bid.setBackground(new java.awt.Color(204, 204, 204));
        bid.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fna.add(bid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 190, 30));

        bna.setEditable(false);
        bna.setBackground(new java.awt.Color(204, 204, 204));
        bna.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bna.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bna.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fna.add(bna, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 190, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Name:");
        fna.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 60, 30));

        bad.setEditable(false);
        bad.setBackground(new java.awt.Color(204, 204, 204));
        bad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fna.add(bad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 190, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Transation Status :");
        fna.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 120, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Fish code :");
        fna.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 90, 30));

        fid.setEditable(false);
        fid.setBackground(new java.awt.Color(204, 204, 204));
        fid.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        fid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fna.add(fid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 190, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-add-30 (1).png"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        fna.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, -1, 30));

        adfish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-add-30 (1).png"))); // NOI18N
        adfish.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        adfish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adfishMouseClicked(evt);
            }
        });
        fna.add(adfish, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Approved", "Complete", " " }));
        fna.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 190, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Address :");
        fna.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 80, 30));

        labels.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        labels.setText("Transactions Complete");
        fna.add(labels, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 210, 30));

        getContentPane().add(fna, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Color bodycolor = new Color(153,204,255);
    Color headcolor = new Color(255,153,153);
    Color hover = new Color(0,153,204);
    
    
    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
        dbconnect dbc = new dbconnect();
        if(actions.equals("Update")){
            int num = dbc.updateData("UPDATE `tbl_soldproduct` SET `f_code`='"+fid.getText()
                    +"',`u_id`='"+bid.getText()+"',`sp_status`='"+jComboBox1.getSelectedItem()+"' WHERE `sp_id`='"+id.getText()+"'");

            if(num == 0){

            }else{
                JOptionPane.showMessageDialog(null, "Updated Successfully!");
                close();
                
            }

        }else if(actions.equals("Add")){

            if(fid.getText().isEmpty()||bid.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "All field must be inputed!! ");
                
            }
            else{
                dbc.insertData("INSERT INTO tbl_soldproduct (`f_code`, `u_id`, sp_date,`sp_status`) "

                    + "VALUES ('"+fid.getText()+"', '"+bid.getText()+"', CURDATE() ,'Pending')");
                JOptionPane.showMessageDialog(null,"Successfull added");

                close();
            }

        }
    }//GEN-LAST:event_saveMouseClicked

    private void saveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseEntered
        save.setBackground(bodycolor);
    }//GEN-LAST:event_saveMouseEntered

    private void saveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseExited
        save.setBackground(headcolor);
    }//GEN-LAST:event_saveMouseExited

    private void delete3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete3MouseClicked
       close();
    }//GEN-LAST:event_delete3MouseClicked

    private void delete3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete3MouseEntered
        delete3.setBackground(bodycolor);
    }//GEN-LAST:event_delete3MouseEntered

    private void delete3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete3MouseExited
        delete3.setBackground(headcolor);
    }//GEN-LAST:event_delete3MouseExited

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void adfishMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adfishMouseClicked
    
        tblpro fish = new tblpro();
        fish.buyid=bid.getText();
        fish.bname = bna.getText();
        fish.baddr = bad.getText();
        fish.lavel = save1.getText();
        fish.yawa = actions;
        fish.usern=unm;
        fish.ids=id.getText();
        this.dispose();
        fish.setVisible(true);
    }//GEN-LAST:event_adfishMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
     tblus fish = new tblus();
        fish.proid=fid.getText();
        fish.fname = name.getText();
        fish.fpri = fip.getText();
        fish.lavel = save1.getText();
        fish.yawa = actions;
        fish.usern=unm;
         fish.ids=id.getText();
         this.dispose();
        fish.setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
      dis();
    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(adtransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adtransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adtransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adtransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adtransaction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adfish;
    public javax.swing.JTextField bad;
    public javax.swing.JTextField bid;
    public javax.swing.JTextField bna;
    public javax.swing.JLabel date;
    private javax.swing.JPanel delete3;
    public javax.swing.JTextField fid;
    public javax.swing.JTextField fip;
    private javax.swing.JPanel fna;
    public javax.swing.JTextField id;
    public javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labels;
    public javax.swing.JTextField name;
    private javax.swing.JPanel save;
    public javax.swing.JLabel save1;
    // End of variables declaration//GEN-END:variables
}