import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

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

PrepareStatement ps = Connection.prepareStatement(Select * from  ujjwal);
ResultSet rs = ps.executeUpdate();
 while(rs.next())
{
String name1 = rs.getString("name");
System.out.println(name1);
  

}
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
