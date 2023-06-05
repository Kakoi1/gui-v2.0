/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiinternal;

import config.PasswordHasher;
import config.dbconnect;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import myapp.login;
import myapp.main;

/**
 *
 * @author College-PC
 */
public class Updateuser extends javax.swing.JInternalFrame {
public String destination = "";
    File selectedFile;
    public String oldpath;
    String path;
    public String nm;
    /**
     * Creates new form Updateuser
     */
    public Updateuser() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
         BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
         bi.setNorthPane(null);
    }
Color headcolor = new Color(153,204,255 );
    Color bodycolor = new Color(0,153,204);
    
     public void imageUpdater(String existingFilePath, String newFilePath){
        File existingFile = new File(existingFilePath);
        if (existingFile.exists()) {
            String parentDirectory = existingFile.getParent();
            File newFile = new File(newFilePath);
            String newFileName = newFile.getName();
            File updatedFile = new File(parentDirectory, newFileName);
            existingFile.delete();
            try {
                Files.copy(newFile.toPath(), updatedFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Image updated successfully.");
            } catch (IOException e) {
                System.out.println("Error occurred while updating the image: ");
            }
        } else {
            try{
                Files.copy(selectedFile.toPath(), new File(destination).toPath(), StandardCopyOption.REPLACE_EXISTING);
            }catch(IOException e){
                System.out.println("Error on update!");
            }
        }
   }
    
        public static int getHeightFromWidth(String imagePath, int desiredWidth) {
        try {
            // Read the image file
            File imageFile = new File(imagePath);
            BufferedImage image = ImageIO.read(imageFile);
            
            // Get the original width and height of the image
            int originalWidth = image.getWidth();
            int originalHeight = image.getHeight();
            
            // Calculate the new height based on the desired width and the aspect ratio
            int newHeight = (int) ((double) desiredWidth / originalWidth * originalHeight);
            
            return newHeight;
        } catch (IOException ex) {
            System.out.println("No image found!");
        }
        
        return -1;
    }
    
    
public  ImageIcon ResizeImage(String ImagePath, byte[] pic, JLabel label) {
    ImageIcon MyImage = null;
        if(ImagePath !=null){
            MyImage = new ImageIcon(ImagePath);
        }else{
            MyImage = new ImageIcon(pic);
        }
        
    int newHeight = getHeightFromWidth(ImagePath, label.getWidth());

    Image img = MyImage.getImage();
    Image newImg = img.getScaledInstance(label.getWidth(), newHeight, Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(newImg);
    return image;
}

public int FileExistenceChecker(String path){
        File file = new File(path);
        String fileName = file.getName();
        
        Path filePath = Paths.get("src/forImages", fileName);
        boolean fileExists = Files.exists(filePath);
        
        if (fileExists) {
            return 1;
        } else {
            return 0;
        }
    
    }
public void close(){
   settings up = new settings();
       JDesktopPane pane = getDesktopPane();
          pane.add(up);
          up.setVisible(true);
//    main m = new main();
this.dispose();

}
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        photo = new javax.swing.JLabel();
        Browse = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        c_name1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        c_name = new javax.swing.JTextField();
        c_cont = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        c_add1 = new javax.swing.JTextField();
        update = new javax.swing.JPanel();
        calcel = new javax.swing.JLabel();
        update1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 153, 153));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 153, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        photo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-administrator-male-100.png"))); // NOI18N
        photo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                photoMouseClicked(evt);
            }
        });
        jPanel3.add(photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 150, 110));

        Browse.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        Browse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Browse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BrowseMouseClicked(evt);
            }
        });
        jPanel3.add(Browse, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 150, 20));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 150, 160));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setText("Account Settings");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 30));

        c_name1.setEditable(false);
        c_name1.setBackground(new java.awt.Color(153, 204, 255));
        c_name1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        c_name1.setBorder(null);
        c_name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_name1ActionPerformed(evt);
            }
        });
        jPanel1.add(c_name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 150, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, -1));

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel10.setText("Contact info:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 100, 30));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel5.setText("Name:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 100, 30));

        c_name.setBackground(new java.awt.Color(153, 204, 255));
        c_name.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        c_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c_name.setBorder(null);
        c_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_nameActionPerformed(evt);
            }
        });
        jPanel2.add(c_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 200, 30));

        c_cont.setBackground(new java.awt.Color(153, 204, 255));
        c_cont.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        c_cont.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c_cont.setBorder(null);
        c_cont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_contActionPerformed(evt);
            }
        });
        jPanel2.add(c_cont, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 200, 30));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel2.setText("Location:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 100, 30));

        c_add1.setBackground(new java.awt.Color(153, 204, 255));
        c_add1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        c_add1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c_add1.setBorder(null);
        jPanel2.add(c_add1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 200, 30));

        update.setBackground(new java.awt.Color(153, 204, 255));
        update.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateMouseExited(evt);
            }
        });

        calcel.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        calcel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        calcel.setText("Cancel");

        javax.swing.GroupLayout updateLayout = new javax.swing.GroupLayout(update);
        update.setLayout(updateLayout);
        updateLayout.setHorizontalGroup(
            updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(calcel, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addContainerGap())
        );
        updateLayout.setVerticalGroup(
            updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(calcel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, 110, 50));

        update1.setBackground(new java.awt.Color(153, 204, 255));
        update1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        update1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                update1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                update1MouseExited(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Save");

        javax.swing.GroupLayout update1Layout = new javax.swing.GroupLayout(update1);
        update1.setLayout(update1Layout);
        update1Layout.setHorizontalGroup(
            update1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, update1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addContainerGap())
        );
        update1Layout.setVerticalGroup(
            update1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(update1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(update1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 211, 120, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 810, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void photoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_photoMouseClicked
       JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                
                
                
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    try {
                        selectedFile = fileChooser.getSelectedFile();
                        destination = "src/forImages/" + selectedFile.getName();
                        path  = selectedFile.getAbsolutePath();
                        
                        
                        if(FileExistenceChecker(path) == 1){
                          JOptionPane.showMessageDialog(null, "File Already Exist, Rename or Choose another!");
                            destination = "";
                            path="";
                        }else{
                            photo.setIcon(ResizeImage(path, null,photo ));
                            System.out.println(""+destination);
                            Browse.setVisible(true);
                            Browse.setText("REMOVE");
                        }
                    } catch (Exception ex) {
                        System.out.println("File Error!");
                    }
                }
    }//GEN-LAST:event_photoMouseClicked

    private void c_contActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_contActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_contActionPerformed

    private void c_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_nameActionPerformed

    private void c_name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_name1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_name1ActionPerformed

    private void BrowseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BrowseMouseClicked
         Browse.setVisible(false);
ImageIcon imageIcon = new ImageIcon("src/icons/add.png");
        photo.setIcon(imageIcon);

        destination = "";
        path="";
    }//GEN-LAST:event_BrowseMouseClicked

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
  close();
    }//GEN-LAST:event_updateMouseClicked

    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
        update.setBackground(bodycolor);
    }//GEN-LAST:event_updateMouseEntered

    private void updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseExited
        update.setBackground(headcolor);
    }//GEN-LAST:event_updateMouseExited

    private void update1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update1MouseClicked
        main m =new main();
        dbconnect dbc = new dbconnect();
      
        
      
            try {
//                  ResultSet rs = dbc.getData("SELECT * FROM `tbl_costumer` WHERE `c_username`='"+c_username.getText()+"'");
                   
//        else if(rs.next()){
//            JOptionPane.showMessageDialog(null, "Username "+c_username.getText()+" Already exist");
//        } 
                   

                String sql = "UPDATE `tbl_costumer` SET `c_name`=?,`c_contact_no.`=?,`c_address`=?,`c_image`=? WHERE `c_username`='"+nm+"'";
                PreparedStatement pst = dbc.connection.prepareStatement(sql);
                pst.setString(1, c_name.getText());
                pst.setString(2, c_cont.getText());
                pst.setString(3, c_add1.getText());
                
                pst.setString(4,destination);
                pst.execute();
                
                close();
                imageUpdater(oldpath, path);
                
                File existingFile = new File(oldpath);
                if (existingFile.exists()) {
                    existingFile.delete();
                }
                JOptionPane.showMessageDialog(null, "Successfully Updated!");
        
            } catch (SQLException ex) {
                Logger.getLogger(Updateuser.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }//GEN-LAST:event_update1MouseClicked

    private void update1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update1MouseEntered
        update1.setBackground(bodycolor);
    }//GEN-LAST:event_update1MouseEntered

    private void update1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update1MouseExited
        update1.setBackground(headcolor);
    }//GEN-LAST:event_update1MouseExited

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked

    }//GEN-LAST:event_jPanel3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Browse;
    public javax.swing.JTextField c_add1;
    public javax.swing.JTextField c_cont;
    public javax.swing.JTextField c_name;
    public javax.swing.JTextField c_name1;
    private javax.swing.JLabel calcel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JLabel photo;
    private javax.swing.JPanel update;
    private javax.swing.JPanel update1;
    // End of variables declaration//GEN-END:variables
}
