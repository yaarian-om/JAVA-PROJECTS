
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;


public class databaseConnection {
    
    
    final static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; // J connector Registration
    // Path for database connectivity followed by
    final static String DB_URL = "jdbc:mysql://localhost:3306/passwords"; // database name is passwords
    
    final static String USER = "root";
    final static String PASS = "";
    
    public static Connection connection(){
        
        try {
            Class.forName(JDBC_DRIVER); // for Driver Registration
            
            Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "DataBaseConnection Error = "+e);
            return null;
        }
        
    }
    
}
