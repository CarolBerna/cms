/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cafe.management.system;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class function { 
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver"; //mysql driver url
     static final String url = "jdbc:mysql://localhost/cms"; //location of database and name
     static java.sql.Statement st;
     static Connection con;
     
     public static Connection getConnection(){
       //this method will connect to the database
        try {
            Class.forName( JDBC_DRIVER ); // load database driver class
            con = (Connection) DriverManager.getConnection( url, "root", "" );//connection to database
        } catch (SQLException ex) {
             //JOptionPane.showMessageDialog(null,"Error Update failed");   
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Error: not found 1"+ex.getMessage());//if the database does not exist
        }
         
       return con;  
     }

    
    
    
    
    
     public static String getData(String regno, String Field, String IdFld, String Table ){
        try {
            con = getConnection();
            String detail ;
        
            String query = "Select * from " + Table + " where " + IdFld + " like '" + regno + "'";
            st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
              detail = rs.getString(Field);
           return detail;
            }
            st.close();
            con.close();
            
        } catch (SQLException ex) {
            
        }
        return null;
		
		
     }
     
     
    // public boolean isItemAvailable (String query){
    
        // con = getConnection();
         
    
    //}
     public boolean isItemAvailable(String query){
        try {
            con = getConnection();
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(query);
            if (rs.next()){
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(function.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
     }
     }
     
     
   
