import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {
        try{
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/training_practice", 
                "root",
            "9100563522@Dk");            
        System.out.println("Connected..!");    
        }
        catch(Exception e){
           
            e.printStackTrace();
        }
    }
}
