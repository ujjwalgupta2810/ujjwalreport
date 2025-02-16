import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class sqlEx{
public static void main(String[] args){

String url = "jdbc:mysql://localhost:3306/ujjwalgupta140";
String username = "mysql";
String password = "mysql";
try(Connection connection = DriverManager.getConnection(url, username,password)){
System.out.println("Databaseestablished");
}
catch(SQLException e){
System.out.println("Failed to connect to the database");
e.printStackTrace();
}
}
}