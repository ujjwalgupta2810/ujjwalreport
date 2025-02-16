import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MySQLConnection_fetchdata  
{
    public static void main(String[] args) 
{
        // Database credentials
        String url = "jdbc:mysql://localhost:3306/ujjwalgupta140"; // Replace with your database name// load and register the connection
        String username = "mysql";
        String password = "mysql";

String rollno = "3";


 
        // Attempt to connect
        try (Connection connection = DriverManager.getConnection(url, username, password)) 
{ // create connection
            System.out.println("Database connection successful!");

PreparedStatement ps = connection.prepareStatement("Select * from  ujjwal");
ResultSet rs = ps.executeQuery();
 while(rs.next())
{
String name1 = rs.getString("name");
System.out.println(name1);
  

}

        }catch (SQLException e) {
            System.out.println("Failed to connect to the database!");
            e.printStackTrace();
        }
    }
}
