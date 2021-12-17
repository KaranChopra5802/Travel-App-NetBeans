/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package travelappp;
import java.awt.Component;
import java.awt.Image;
import static java.lang.constant.ConstantDescs.NULL;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

public class Mumbai extends javax.swing.JFrame
{
    public Mumbai() {
        initComponents();
    }
    
    String namePass;
    int idpass;
    String selectedImagePath;
    String path;
    String login ;
    String loc ;
    String photo ;
    String rev ;
    String add;
    int passOfID;
    
    public Mumbai(String str) {
        initComponents();
        namePass =str;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        Refresh = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(205, 194, 254));

        jLabel1.setBackground(new java.awt.Color(205, 194, 254));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Mumbai");

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(205, 194, 254));
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
        jTable1.setFillsViewportHeight(true);
        jTable1.setGridColor(new java.awt.Color(153, 255, 255));
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);

        jButton1.setBackground(new java.awt.Color(205, 194, 254));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Refresh.setBackground(new java.awt.Color(205, 194, 254));
        Refresh.setText("Refresh");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(205, 194, 254));
        jButton2.setText("Insert");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(205, 194, 254));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(205, 194, 254));
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1269, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(delete)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(406, 406, 406)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Refresh)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Refresh)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        home mf = new home();
                    new home(namePass).setVisible(true);
                    this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
int id;
    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url,username,password;
            url="jdbc:mysql://localhost:3306/travellingapp";
            username = "root";
            password = "password";
            Connection con = DriverManager.getConnection(url,username,password);
            login = "";
            loc = "";
            photo = "";
            rev = "";
            Statement st = con.createStatement();
            
            String pst = "select * from mumbai";
            
            byte b[];
            Blob blob;
            
            ResultSet rs = st.executeQuery(pst);
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            int i = 0;

            while(rs.next()) 
            {
                login = rs.getString("login_id");
                loc = rs.getString("location");
                selectedImagePath = rs.getString("photo");
                path = selectedImagePath;
                rev = rs.getString("reviews");
                id = rs.getInt("ID");
                add = loc;
                
               
                JLabel imageLabel = new JLabel();
                ImageIcon imageicon = new ImageIcon(selectedImagePath);
                Image img = imageicon.getImage().getScaledInstance(400,400, Image.SCALE_SMOOTH);
                imageLabel.setIcon(new ImageIcon(img));
                
                model.addRow(new Object[]{id,login, loc, imageLabel, rev});

                Object[] newIdentifiers = new Object[]{"ID","Username", "Location", "Photo","Review"};
                model.setColumnIdentifiers(newIdentifiers);
                jTable1.setFillsViewportHeight(true);
                jTable1.getColumn("Photo").setCellRenderer(new CellRenderer());
                
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
    }//GEN-LAST:event_RefreshActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        insert mf = new insert();
                    new insert(namePass,id).setVisible(true);
                    this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    
    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try{
            int selectedRow = jTable1.getSelectedRow();
            idpass = (int) jTable1.getValueAt(selectedRow,0); 
            passOfID = idpass;
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
                    String del = "delete from mumbai where ID='"+idpass+"'";
                    Statement stm = con.createStatement();
                    stm.execute(del);
                    JOptionPane.showMessageDialog(null, "Record Deleted", "Delete Success", 1);
                    Mumbai mf = new Mumbai();
                    new Mumbai(namePass).setVisible(true);
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
    }//GEN-LAST:event_deleteActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        int selectedRow = jTable1.getSelectedRow();
        idpass = (int) jTable1.getValueAt(selectedRow,0);
        String loc ="mumbai";
        String add = (String) jTable1.getValueAt(selectedRow,2);
        String uname = (String) jTable1.getValueAt(selectedRow,1);
        String rev = (String) jTable1.getValueAt(selectedRow,4);
         
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

                String atmt = "SELECT * FROM mumbai where ID = "+idpass;
                ResultSet rs = st.executeQuery(atmt);               
                while(rs.next())
                {
                    path = rs.getString("photo");
                    
                }
                          
            } 
            catch (Exception ex) 
            {
                Logger.getLogger(Mumbai.class.getName()).log(Level.SEVERE, null, ex);
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
        
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mumbai().setVisible(true);
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
    private javax.swing.JButton Refresh;
    private javax.swing.JButton delete;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}


