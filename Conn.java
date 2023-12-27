
package bank.managementsystem;
import java.sql.*;
public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        try{
            
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","SQL@20231234");
            s = c.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }
    }

    
   
}
