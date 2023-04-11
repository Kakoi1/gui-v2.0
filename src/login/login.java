package login;


import config.MyConnection;
import config.dbconnect;
import guiinternal.settings;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author College-PC
 */
public class login extends javax.swing.JFrame {
  
   main m = new main();
   settings set = new settings();
    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        setSize(689, 455);
        seticon();
       panels.setBackground(new Color(255,255,255,50));
       username.setBackground(new Color(0,0,0,0));
       password.setBackground(new Color (0,0,0,0));
    }
Color hover = new Color (255,153,153);
Color exit = new Color (153,204,255);





    Border empty = BorderFactory.createEmptyBorder();
    void buttonBorderAnimation(JPanel panel){
        
        panel.setBackground(hover);
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));
        
    }
    
    void buttonDefaultColor(JPanel panel){
        panel.setBackground(exit);
        panel.setBorder(empty);
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
        panel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        logclose = new javax.swing.JLabel();
        mini = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        login = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cancel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        create = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        panels = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(682, 396));
        setUndecorated(true);

        panel1.setBackground(new java.awt.Color(0, 153, 204));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/aqua.png"))); // NOI18N
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/coolest.jpg"))); // NOI18N
        panel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 460));

        panel2.setBackground(new java.awt.Color(255, 153, 153));
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-close-window-32 (1).png"))); // NOI18N
        logclose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logcloseMouseClicked(evt);
            }
        });
        panel2.add(logclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        mini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-subtract-30.png"))); // NOI18N
        mini.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miniMouseClicked(evt);
            }
        });
        panel2.add(mini, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        username.setBackground(new java.awt.Color(255, 153, 153));
        username.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        username.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 13))); // NOI18N
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        panel2.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 220, 50));

        login.setBackground(new java.awt.Color(153, 204, 255));
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Log in");

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                .addContainerGap())
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panel2.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        cancel.setBackground(new java.awt.Color(153, 204, 255));
        cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Exit");

        javax.swing.GroupLayout cancelLayout = new javax.swing.GroupLayout(cancel);
        cancel.setLayout(cancelLayout);
        cancelLayout.setHorizontalGroup(
            cancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cancelLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        cancelLayout.setVerticalGroup(
            cancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panel2.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 80, -1));

        password.setBackground(new java.awt.Color(255, 153, 153));
        password.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        password.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        panel2.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 220, 50));

        create.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        create.setText("Create Account");
        create.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        create.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                createMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                createMouseExited(evt);
            }
        });
        panel2.add(create, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/kisspng-seed-flower-dark-helmet-vimeo-medical-cannabis-ocean-logo-5b1723af957123.4894901515282431196121.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        panel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -20, -1, -1));

        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/icons8-show-password-32.png"))); // NOI18N
        show.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                showMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                showMouseExited(evt);
            }
        });
        panel2.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, -1));

        panels.setLayout(null);
        panel2.add(panels, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 280, 270));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseEntered
         buttonBorderAnimation(login);
    }//GEN-LAST:event_loginMouseEntered

    private void loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseExited
       buttonDefaultColor(login);
    }//GEN-LAST:event_loginMouseExited

    private void cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseEntered
         buttonBorderAnimation(cancel);
    }//GEN-LAST:event_cancelMouseEntered

    private void cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseExited
        buttonDefaultColor(cancel);
    }//GEN-LAST:event_cancelMouseExited

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
main m = new main();
dbconnect dbc = new dbconnect();
 String uname = username.getText();
 String pass = String.valueOf(password.getPassword());
 

 int num=dbc.loginData("SELECT * FROM `tbl_costumer` WHERE `c_username`=? AND `c_password`=?",uname,pass);

if(num==1){
     JOptionPane.showMessageDialog(null, "login Successfully!");
     dbc.infoData("SELECT `c_name`, `c_contact_no.`, `c_address` FROM `tbl_costumer` WHERE `c_username`=?",uname);
     
      this.dispose();
      m.setVisible(true);
//      m.despane.add(set).setVisible(true);
}
else{
     JOptionPane.showMessageDialog(null, "Incorrect Username Or Password", "Login Failed", 2);
}


//          main m = new main();
//        PreparedStatement ps;
//        ResultSet rs;
//        String uname = username.getText();
//        String pass = String.valueOf(password.getPassword());
//        
//
//           String query = "SELECT `c_name`, `c_contact_no.`, `c_address` FROM `tbl_costumer` WHERE `c_username`=? AND `c_password`=?";
//        try {
//            ps = MyConnection.getConnection().prepareStatement(query);
//            
//            ps.setString(1, uname);
//            ps.setString(2, pass);          
//            rs = ps.executeQuery();
//
//            if(rs.next())
//            {
//                 this.dispose();
//              m.setVisible(true);
//                m.despane.add(set).setVisible(true);
//             
//                set.c_name.setText(rs.getString("c_name"));
//
//               set.c_cont.setText(rs.getString("c_contact_no."));
//
//               set.c_add.setText(rs.getString("c_address"));
//
//             
//            }
//            else{
//                    JOptionPane.showMessageDialog(null, "Incorrect Username Or Password", "Login Failed", 2);
//                }
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
    }//GEN-LAST:event_loginMouseClicked

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
     int a =JOptionPane.showConfirmDialog(null, "Confirm Exit?");
     if(a==JOptionPane.YES_OPTION){
         System.exit(a);
     }
    }//GEN-LAST:event_cancelMouseClicked

    private void logcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logcloseMouseClicked
         int a =JOptionPane.showConfirmDialog(null, "Confirm Exit?");
     if(a==JOptionPane.YES_OPTION){
         System.exit(a);
     }
    }//GEN-LAST:event_logcloseMouseClicked

    private void miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_miniMouseClicked

    private void createMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createMouseEntered
    create.setForeground(Color.BLUE);
    }//GEN-LAST:event_createMouseEntered

    private void createMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createMouseExited
    create.setForeground(Color.BLACK);
    }//GEN-LAST:event_createMouseExited

    private void createMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createMouseClicked
    register reg = new register();
    
    reg.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_createMouseClicked

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked
    
      
    }//GEN-LAST:event_showMouseClicked

    private void showMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseEntered
    
       
            password.setEchoChar((char) 0);
           
      
    }//GEN-LAST:event_showMouseEntered

    private void showMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseExited
       password.setEchoChar('*');
    }//GEN-LAST:event_showMouseExited

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel cancel;
    private javax.swing.JLabel create;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel logclose;
    private javax.swing.JPanel login;
    private javax.swing.JLabel mini;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panels;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel show;
    public javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

    private void seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/fish.png")));
        setTitle("Aqua Life");
    }
}
