package Employee;
import java.sql.*;
public class Main {
    public Connection c;
    public Statement s;
    public void Main() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","admin");
            s=c.createStatement();
            ResultSet resultSet=s.executeQuery("select * from login");
            while (resultSet.next()){
                System.out.println(resultSet.getString("password"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String []args){
        new Main();
    }
}
