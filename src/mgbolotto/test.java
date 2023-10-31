package mgbolotto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class test {

 
    public static void main(String[] args) {
        String date = "2013-12-12";
        
       String query = "SELECT winning_numbers FROM lottery_drawings WHERE drawings_date = '"+date+"'";
//       System.out.println(query);
       try(Connection conn = getDBConnection()){
           PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(query);
           ResultSet rs = (ResultSet)stmt.executeQuery();
           while(rs.next()){
             System.out.println(rs.getString("winning_numbers"));  
           }
           
       } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(MgboImplementation.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
    public static Connection getDBConnection() throws ClassNotFoundException, SQLException {
            String username = "root";
            String password = "Dhnonny23";
            String url = "jdbc:mysql://127.0.0.1:3306/mgbolotto_db?useSSL=false&serverTimezone=UTC";
            Class.forName("com.mysql.cj.jdbc.Driver");
            return (Connection) DriverManager.getConnection(url, username, password);
    }
    
    
}
