/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package travelappp;
import java.awt.Component;
import java.awt.Image;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

public class Pune extends javax.swing.JFrame {

    public Pune() {
        initComponents();
    }
    String namePass;
    public Pune(String str) {
        initComponents();
        namePass = str;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        insertBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Pune");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Location", "Photo", "Review"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        insertBtn.setText("Insert");
        insertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBtnActionPerformed(evt);
            }
        });

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(insertBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 951, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(408, 408, 408)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(insertBtn))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url,username,password;
            url="jdbc:mysql://localhost:3306/travellingapp";
            username = "root";
            password = "password";
            Connection con = DriverManager.getConnection(url,username,password);
            String login = "";
            String loc = "";
            String photo = "";
            String rev = "";
            Statement st = con.createStatement();
            String pst = "select * from pune";

            ResultSet rs = st.executeQuery(pst);
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            int i = 0;
            String selectedImagePath;
            
            while(rs.next()) {

                login = rs.getString("login_id");
                loc = rs.getString("location");
                selectedImagePath = rs.getString("photo");
                rev = rs.getString("reviews");

                JLabel imageLabel = new JLabel();
                ImageIcon imageicon = new ImageIcon(selectedImagePath);
                Image img = imageicon.getImage().getScaledInstance(100,100, Image.SCALE_SMOOTH);
                imageLabel.setIcon(new ImageIcon(img));
                
                model.addRow(new Object[]{login, loc, imageLabel, rev});

              
                
                Object[] newIdentifiers = new Object[]{"login_id", "location", "photo","reviews"};
                model.setColumnIdentifiers(newIdentifiers);
                jTable1.setFillsViewportHeight(true);
                jTable1.getColumn("photo").setCellRenderer(new Pune.CellRenderer());
                
                 i++;

            }
            if (i < 1) 
            {
                JOptionPane.showMessageDialog(null, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);
            }
            if (i == 1) 
            {
                JOptionPane.showMessageDialog(null, (i + " Record Found"), "Login Success", 1);
            } 
            else 
            {

                JOptionPane.showMessageDialog(null, (i + " Records Found"), "Login Success", 1);
            }
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       home mf = new home();
                    new home(namePass).setVisible(true);
                    this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void insertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBtnActionPerformed
        insertPune mf = new insertPune();
                    new insertPune(namePass).setVisible(true);
                    this.dispose();
    }//GEN-LAST:event_insertBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Delete mf = new Delete();
                    new Delete().setVisible(true);
                    this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) 
    {        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pune().setVisible(true);
            }
        });
    }
    
    class CellRenderer implements TableCellRenderer {
 
        @Override
        public Component getTableCellRendererComponent(JTable table,
                Object value,
                boolean isSelected,
                boolean hasFocus,
                int row,
                int column) {
 
            TableColumn tb = jTable1.getColumn("photo");
            tb.setMaxWidth(200);
            tb.setMinWidth(100);
 
            jTable1.setRowHeight(200);
 
            return (Component) value;
        }
 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton insertBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
