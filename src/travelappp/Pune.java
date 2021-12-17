/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package travelappp;
import java.awt.Component;
import java.awt.Image;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

public class Pune extends javax.swing.JFrame {

    public Pune() {
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
    int passOfID;
    public Pune(String str) {
        initComponents();
        namePass = str;
    }
            int id;
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
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Pune");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Username", "Location", "Photo", "Review"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton2.setBackground(new java.awt.Color(205, 194, 254));
        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(205, 194, 254));
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        insertBtn.setBackground(new java.awt.Color(205, 194, 254));
        insertBtn.setText("Insert");
        insertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBtnActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(205, 194, 254));
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(205, 194, 254));
        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1270, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(441, 441, 441)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton1)
                            .addComponent(jButton4)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(insertBtn))
                .addContainerGap())
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
                id = rs.getInt("ID");

                JLabel imageLabel = new JLabel();
                ImageIcon imageicon = new ImageIcon(selectedImagePath);
                Image img = imageicon.getImage().getScaledInstance(400,400, Image.SCALE_SMOOTH);
                imageLabel.setIcon(new ImageIcon(img));
                
                model.addRow(new Object[]{id,login, loc, imageLabel, rev});

              
                
                Object[] newIdentifiers = new Object[]{"ID","Username", "Location", "Photo","Review"};
                model.setColumnIdentifiers(newIdentifiers);
                jTable1.setFillsViewportHeight(true);
                jTable1.getColumn("Photo").setCellRenderer(new Pune.CellRenderer());
                
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
                    new insertPune(namePass,id).setVisible(true);
                    this.dispose();
    }//GEN-LAST:event_insertBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            int selectedRow = jTable1.getSelectedRow();
            int idpass = (int) jTable1.getValueAt(selectedRow,0); 
            String uname = (String) jTable1.getValueAt(selectedRow,1);
            Class.forName("com.mysql.jdbc.Driver");
            String url,username,password;
            url="jdbc:mysql://localhost:3306/travellingapp";
            username = "root";
            password = "password";
            Connection con = DriverManager.getConnection(url,username,password);
            
            if(uname.equalsIgnoreCase(namePass))
            {
                int deleteItem;
                deleteItem = JOptionPane.showConfirmDialog(null,"Are you sure you want to delete this item?","Warning",JOptionPane.YES_NO_OPTION);
                if(deleteItem == JOptionPane.YES_OPTION)
                {
                    String del = "delete from pune where ID='"+idpass+"'";
                    Statement stm = con.createStatement();
                    stm.execute(del);
                    JOptionPane.showMessageDialog(null, "Record Deleted", "Delete Success", 1);
                    Pune mf = new Pune();
                    new Pune(namePass).setVisible(true);
                    this.dispose();
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "You can only delete you own posts", "Delete Failed", 1);
            }
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       int selectedRow = jTable1.getSelectedRow();
        idpass = (int) jTable1.getValueAt(selectedRow,0);
        String loc ="pune";
        String add = (String) jTable1.getValueAt(selectedRow,2);
        String uname = (String) jTable1.getValueAt(selectedRow,1);
        String rev = (String) jTable1.getValueAt(selectedRow,4);
        String path="";
        if(uname.equalsIgnoreCase(namePass))
        {
            try 
            {
                Class.forName("com.mysql.jdbc.Driver");
                String url,username,password;
                url="jdbc:mysql://localhost:3306/travellingapp";
                username = "root";
                password = "password";
                Connection con = DriverManager.getConnection(url,username,password);
                Statement st = con.createStatement();

                String atmt = "SELECT * FROM pune where ID = "+idpass;
                ResultSet rs = st.executeQuery(atmt);               
                while(rs.next())
                {
                    path = rs.getString("photo");
                    
                }
                          
            } 
            catch (Exception ex) 
            {
                //Logger.getLogger(Mumbai.class.getName()).log(Level.SEVERE, null, ex);
            }
            //JOptionPane.showMessageDialog(null,"You can only update your own posts."+path);
            Update mf = new Update(); 
            new Update(idpass,namePass,add,loc,path,rev,uname).setVisible(true);
            this.dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"You can only update your own posts.");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
 
            TableColumn tb = jTable1.getColumn("Photo");
            tb.setMaxWidth(400);
            tb.setMinWidth(400);
 
            jTable1.setRowHeight(400);
 
            return (Component) value;
        }
 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton insertBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
