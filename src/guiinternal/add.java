/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiinternal;
import config.dbconnect;
import java.awt.Color;
import java.sql.ResultSet;

import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import login.addfish;
import login.delete;
import login.main;
import login.update;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author College-PC
 */
public class add extends javax.swing.JInternalFrame {

  
    public add() {
        initComponents();
        
        displaydata();
        
         this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
         BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
         bi.setNorthPane(null);
         
        
        search.setOpaque(false);
        search.setBackground(new Color(0,0,0,0));
        
    }
    public void displaydata(){
        try{
     dbconnect db = new dbconnect();
     
     ResultSet rs = db.getData("SELECT * FROM tbl_fish");
     
     table.setModel(DbUtils.resultSetToTableModel(rs));
        
        }catch(SQLException ex){
            
            System.out.println("Error"+ex);
        } 
        
    }
    
    Color bodycolor = new Color(153,204,255);
    Color headcolor = new Color(255,153,153);
    Color hover = new Color(0,153,204);
    
    
    
//    public String action;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ads = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        update = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        discard = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        delete1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ads.setBackground(new java.awt.Color(255, 153, 153));
        ads.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ads.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ads.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adsMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Add");

        javax.swing.GroupLayout adsLayout = new javax.swing.GroupLayout(ads);
        ads.setLayout(adsLayout);
        adsLayout.setHorizontalGroup(
            adsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        adsLayout.setVerticalGroup(
            adsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adsLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(ads, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 70, 30));

        update.setBackground(new java.awt.Color(255, 153, 153));
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

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Edit");

        javax.swing.GroupLayout updateLayout = new javax.swing.GroupLayout(update);
        update.setLayout(updateLayout);
        updateLayout.setHorizontalGroup(
            updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        updateLayout.setVerticalGroup(
            updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 70, 30));

        discard.setBackground(new java.awt.Color(255, 153, 153));
        discard.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        discard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        discard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                discardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                discardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                discardMouseExited(evt);
            }
        });
        discard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Search");
        discard.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 30));

        jPanel2.add(discard, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 90, 70, 30));

        search.setBackground(new java.awt.Color(0, 153, 204));
        search.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        search.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchMouseExited(evt);
            }
        });
        jPanel2.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 160, 30));

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(255, 153, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel4);
        jPanel4.setBounds(660, 0, 120, 60);

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel11.setText("Fish Details");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(10, 10, 290, 30);

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 60));

        jScrollPane1.setViewportView(table);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 150, 810, 290));

        delete1.setBackground(new java.awt.Color(255, 153, 153));
        delete1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        delete1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                delete1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                delete1MouseExited(evt);
            }
        });
        delete1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Delete");
        delete1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 30));

        jPanel2.add(delete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 70, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void discardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_discardMouseExited
        discard.setBackground(headcolor);
    }//GEN-LAST:event_discardMouseExited

    private void discardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_discardMouseEntered
        discard.setBackground(bodycolor);
    }//GEN-LAST:event_discardMouseEntered

    private void discardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_discardMouseClicked
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        TableRowSorter<DefaultTableModel> obj  = new TableRowSorter<>(model);
        table.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(search.getText()));       
    }//GEN-LAST:event_discardMouseClicked

    private void updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseExited
        update.setBackground(headcolor);
    }//GEN-LAST:event_updateMouseExited

    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
        update.setBackground(bodycolor);
    }//GEN-LAST:event_updateMouseEntered

    private void adsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adsMouseExited
        ads.setBackground(headcolor);
    }//GEN-LAST:event_adsMouseExited

    private void adsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adsMouseEntered
        ads.setBackground(bodycolor);
    }//GEN-LAST:event_adsMouseEntered

    private void searchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseEntered
      
    }//GEN-LAST:event_searchMouseEntered

    private void searchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseExited
     
    }//GEN-LAST:event_searchMouseExited

    private void adsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adsMouseClicked
        JFrame mainJFrame = (JFrame)SwingUtilities.getWindowAncestor(this);
       mainJFrame.dispose();
    addfish af = new addfish();
    af.action = "Add";
    af.save1.setText("Save");
   af.setVisible(true);
    
   
    }//GEN-LAST:event_adsMouseClicked

    private void delete1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete1MouseEntered
    delete1.setBackground(bodycolor);
    }//GEN-LAST:event_delete1MouseEntered

    private void delete1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete1MouseExited
     delete1.setBackground(headcolor);
    }//GEN-LAST:event_delete1MouseExited

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
     int rowIndex = table.getSelectedRow();
     if (rowIndex<0){
         
         JOptionPane.showMessageDialog(null, "Plese select an item");
         
     }
     else{
         TableModel model = table.getModel();
         addfish up = new addfish();
         up.id.setText(""+model.getValueAt(rowIndex, 0));
         up.fish.setText(""+model.getValueAt(rowIndex, 1));
         up.box.setSelectedItem(""+model.getValueAt(rowIndex, 2).toString());
         up.quan.setText(""+model.getValueAt(rowIndex, 3));
         up.pri.setText(""+model.getValueAt(rowIndex, 4));
         up.action = "Edit";
         up.save1.setText("Update");
             JFrame mainJFrame = (JFrame)SwingUtilities.getWindowAncestor(this);
       mainJFrame.dispose();
        up.setVisible(true);
         
     }

    }//GEN-LAST:event_updateMouseClicked

    private void delete1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete1MouseClicked
int rowIndex = table.getSelectedRow();
       
       
       if(rowIndex < 0){
           JOptionPane.showMessageDialog(null, "Please select a data first");
       }else{
            TableModel model = table.getModel();
            Object value = model.getValueAt(rowIndex, 0);
            String id = value.toString();
             int a=JOptionPane.showConfirmDialog(null,"Are you sure to delete id "+id);  
                    if(a==JOptionPane.YES_OPTION){  
                            dbconnect dbc = new dbconnect();
                            int f_id = Integer.parseInt(id);
                            dbc.deleteData(f_id,"tbl_fish","f_code");
                            displaydata();
         
                    }    
       
       }
    

    }//GEN-LAST:event_delete1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ads;
    private javax.swing.JPanel delete1;
    private javax.swing.JPanel discard;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField search;
    private javax.swing.JTable table;
    private javax.swing.JPanel update;
    // End of variables declaration//GEN-END:variables
}
