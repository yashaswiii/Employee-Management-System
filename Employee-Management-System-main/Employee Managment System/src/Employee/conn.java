package Employee;
import java.sql.*;
public class conn {
    public Connection c;
    public Statement s;

    public conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/project","root","admin");
            s = c.createStatement();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}

//jdbc:mysql://127.0.0.1:3306/?user=root
// ALTER USER ‘user’@’localhost’ IDENTIFIED WITH mysql_native_password by ‘admin’;
