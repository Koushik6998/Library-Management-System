package Oracle;
import java.util.ResourceBundle;
import java.sql.*;
public class DBConnection {
    public static void main(String args[]) throws Exception {
        getConnection();
    }

 

    
    public static Connection getConnection() throws Exception {  
        //To create a resource bundle and get a bundle to oracle
        ResourceBundle rb = ResourceBundle.getBundle("oracle");
        //To get a string
        String url = rb.getString("db.url");
        //To set a username
        String username = rb.getString("db.username");
        //To set a password 
        String password = rb.getString("db.password");
      //To Create connection and to get the connection from DBconnection                    
        Connection connection=DriverManager.getConnection(url,username,password);
        return connection;

}}
