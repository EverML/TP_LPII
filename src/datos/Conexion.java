
package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    
    private String db = "TP_LENGUAJE_II";
    private String user = "postgres";
    private String pass = "admin";
    private String driver = "org.postgresql.Driver";
    private String url = "jdbc:postgresql://localhost:5432/"+db;
    
    
    public Connection conectar(){
        try{
           Connection link = null;
           Class.forName( driver );
           link = (Connection) DriverManager.getConnection( url, user, pass );
           return link;
        }catch (ClassNotFoundException ex){
           JOptionPane.showMessageDialog(null, ex.getMessage());
            
        }catch (SQLException ex){
           JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return null;
    }
}
