import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
   
    private static final String URL = "jdbc:mysql://localhost:3306/your_database_name";
    private static final String USER = "your_db_username"; ;
    private static final String PASSWORD = "your_db_password"; 

    public static Connection getConnection() {
       
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
