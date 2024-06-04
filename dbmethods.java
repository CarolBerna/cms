/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cafe.management.system;
import static cafe.management.system.function.con;
import static cafe.management.system.function.getConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;


/**
 *
 * @author user
 */
public class dbmethods {
    public static Vector getReport(String Query, int Fields) throws SQLException{
         Vector<Vector<String>> DetailsVector = new Vector<>();
      
                     con = getConnection();
                       Statement s = con.createStatement();
                      String query = Query;// "SELECT * FROM packages ORDER BY ID " ;
                           ResultSet rs = s.executeQuery(query);                            
                           while(rs.next())                {
                                    Vector<String> Details = new Vector<>();
                                    for(int i = 1; i< Fields + 1; i++){
                                      Details.add(rs.getString(i));  
                                    }
                                        DetailsVector.add(Details);
                                    }
                   return DetailsVector;
    }

}
    
