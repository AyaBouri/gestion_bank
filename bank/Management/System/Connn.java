import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
public class Connn {
    Connection connection;
    Statement statement;
    public Connn(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","");
            statement = (Statement) connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}