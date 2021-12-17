/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package travelappp;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class Update extends javax.swing.JFrame {

    public Update() 
    {
        initComponents();
    }
    
    String namePass;
    int idpass;
    String selectedImagePath;
    String login ;
    String loc ;
    String photo ;
    String rev ;
    String add;
    String uname;
    
    Update(int idpass1, String namePass1, String loc,String add1, String selectedImagePath1, String rev,String uname1) 
    {
        initComponents();
        jTextField2.setText(loc);
        jLabel7.setText(namePass1);
        jTextField4.setText(rev);
        namePass =namePass1;
        selectedImagePath = selectedImagePath1;
        idpass = idpass1;
        add = add1;
        uname = uname1;
        
        ImageIcon ii = new ImageIcon(selectedImagePath);
        Image image = ii.getImage().getScaledInstance(jLabelImage.getWidth(), jLabelImage.getHeight(), Image.SCALE_SMOOTH);
        jLabelImage.setIcon(new ImageIcon(image));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabelImage = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Location:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 82, -1, -1));

        jLabel3.setText("Photo:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 118, -1, -1));

        jLabel4.setText("Review :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 158, -1, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 76, 213, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 155, 213, -1));

        jButton1.setBackground(new java.awt.Color(205, 194, 254));
        jButton1.setText("Update Values");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 342, -1, -1));

        jButton2.setBackground(new java.awt.Color(205, 194, 254));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 342, -1, -1));

        jButton3.setBackground(new java.awt.Color(205, 194, 254));
        jButton3.setText("Browse");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 114, -1, -1));
        getContentPane().add(jLabelImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 193, 186, 138));

        jLabel8.setText("Logged-In as :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 11, -1, -1));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 11, 57, 14));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/travelappp/Insert And Update.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try 
        {
                Class.forName("com.mysql.jdbc.Driver");
                String url,username,password;
                url="jdbc:mysql://localhost:3306/travellingapp";
                username = "root";
                password = "password";
                Connection con = DriverManager.getConnection(url,username,password);
                Statement st = con.createStatement();

                String locUpdated = jTextField2.getText();
                String revUpdated = jTextField4.getText();

                PreparedStatement ps=null;

                ps= con.prepareStatement("UPDATE "+add+" SET location =?, reviews =?, photo =? WHERE ID = ?");
                ps.setString(1,locUpdated);
                ps.setString(2,revUpdated);
                ps.setString(3,selectedImagePath);     
                ps.setInt(4,idpass);  
                ps.executeUpdate();

                JOptionPane.showMessageDialog(null,"Updated Successfully!");

                if(add.equalsIgnoreCase("mumbai"))
                {
                    Mumbai mf = new Mumbai();
                    new Mumbai(namePass).setVisible(true);
                    this.dispose();
                }
                if(add.equalsIgnoreCase("pune"))
                {
                    Pune mf = new Pune();
                    new Pune(namePass).setVisible(true);
                    this.dispose();
                }
                if(add.equalsIgnoreCase("bangalore"))
                {
                    Bangalore mf = new Bangalore();
                    new Bangalore(namePass).setVisible(true);
                    this.dispose();
                }         
            
        }        
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        home mf = new home();
                    new home(namePass).setVisible(true);
                    this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JFileChooser browseImageFile = new JFileChooser("C:\\Users\\Public\\Pictures\\Sample Pictures");
        //Filter image extensions
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES", "png", "jpg", "jpeg");
        browseImageFile.addChoosableFileFilter(fnef);
        int showOpenDialogue = browseImageFile.showOpenDialog(null);
 
        if (showOpenDialogue == JFileChooser.APPROVE_OPTION) {
            File selectedImageFile = browseImageFile.getSelectedFile();
            selectedImagePath = selectedImageFile.getAbsolutePath();
            JOptionPane.showMessageDialog(null, selectedImagePath);
            ImageIcon ii = new ImageIcon(selectedImagePath);
            Image image = ii.getImage().getScaledInstance(jLabelImage.getWidth(), jLabelImage.getHeight(), Image.SCALE_SMOOTH);
 
            jLabelImage.setIcon(new ImageIcon(image));
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelImage;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
