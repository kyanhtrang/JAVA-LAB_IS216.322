/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthuchanh4_20521086;
import java.sql.*;

/**
 *
 * @author kyanh
 */
public class DatabaseConnection {
    public static Connection getMsSqlConnect() throws ClassNotFoundException,SQLException{
        String hostname = "TrangKyAnh";
        String db = "Information";
        
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");        
        String connectURL = "jdbc:sqlserver://" + hostname + ":1433;dataBaseName=" + db + ";encrypt=true;trustServerCertificate=true;";
        Connection conn = DriverManager.getConnection(connectURL, "sa", "sa");       
        return conn;
    }
}
