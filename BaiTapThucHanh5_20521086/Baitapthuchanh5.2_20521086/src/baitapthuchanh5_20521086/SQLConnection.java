/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthuchanh5_20521086;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author kyanh
 */
public class SQLConnection {
    
    public static Connection getSQLConnection() throws ClassNotFoundException,SQLException{
       String hostName = "TRANGKYANH";
       String dataBaseName = "QLKB";
       
       Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
       String connectionURL = "jdbc:sqlserver://" +hostName + ":1433;DatabaseName=" + dataBaseName + ";encrypt=true;trustServerCertificate=true;";
       
       Connection conn = DriverManager.getConnection(connectionURL,"sa","sa");
       return conn;
}
    
}
