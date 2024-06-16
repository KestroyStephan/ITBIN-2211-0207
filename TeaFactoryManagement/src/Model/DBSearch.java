
package Model;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author KESTROY
 */
public class DBSearch {
    Statement stmt;
    ResultSet rs;

    public ResultSet searchUsers(){
        try{
        stmt = (Statement) DBConnection.getStatementConnection();
        rs = stmt.executeQuery("SELECT * FROM users");
        }
        catch(Exception e){

        }
        return rs;
        }
    
    
  
   
}



