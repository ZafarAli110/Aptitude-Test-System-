
package aptitude_test_sys;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class DBConnect {
    
    Connection c;
    Statement s;
    
    public DBConnect()
    {
        try 
                {
                    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                    c=DriverManager.getConnection("JDBC:ODBC:sho","sa","123");
                    s=(Statement)c.createStatement();
                    
                } 
                catch (Exception e) 
                {
                    JOptionPane.showMessageDialog(null, "connection not build");
                }
    }
}
