/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package travelappp;

/**
 *
 * @author Jayu Jain
 */
import java.sql.*;
public class TravelAppp
{
    public static void main(String args[]) throws Exception{
        
        String url,uname,pass;
        url="jdbc:mysql://localhost:3306/student";
        uname = "root";
        pass="password";
        String query = "select * from student_id";  
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,uname,pass);
        
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        rs.next();
        
        String name = rs.getString("username");
        System.out.println(name);
        
        
        st.close();
        con.close();
    }
    
}