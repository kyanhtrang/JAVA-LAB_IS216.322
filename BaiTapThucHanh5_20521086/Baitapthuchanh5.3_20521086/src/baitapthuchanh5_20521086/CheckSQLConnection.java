/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitapthuchanh5_20521086;

import java.sql.*;

/**
 *
 * @author kyanh
 */

public class CheckSQLConnection {

    /**
     * @param args the command line arguments
     */
    
    public static Connection getMyConnection() throws ClassNotFoundException,SQLException{
        return SQLConnection.getSQLConnection();
    }
    public static void main(String[] args) throws ClassNotFoundException,SQLException{
        //getMyConnection();
        
        System.out.println("Get connection...");
        
        Connection conn = CheckSQLConnection.getMyConnection();
        
        System.out.println("Get connection "+ conn);
        System.out.println("Done");
    }
    
}
