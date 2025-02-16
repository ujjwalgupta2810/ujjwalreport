import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class MySQLConnection_update_and_delete  
{
    public static void main(String[] args) 
{
        // Database credentials
        String url = "jdbc:mysql://localhost:3306/ujjwalgupta140"; // Replace with your database name// load and register the connection
        String username = "mysql";
        String password = "mysql";

String rollno = "3";
String name1 = "ankit";

 
        // Attempt to connect
        try (Connection connection = DriverManager.getConnection(url, username, password)) 
{ // create connection
            System.out.println("Database connection successful!");


PreparedStatement ps = connection.prepareStatement("update ujjwal set name = ? where rollno =?");
ps.setString(2, rollno);
ps.setString(1, name1);
  
int i = ps.executeUpdate();

if(i>0){
System.out.println("success");
}

else 
{
System.out.println("failed");

        } 
}catch (SQLException e) {
            System.out.println("Failed to connect to the database!");
            e.printStackTrace();
        }
    }
}
