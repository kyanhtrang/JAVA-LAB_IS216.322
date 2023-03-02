/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthuchanh5_20521086;

import java.sql.*;
/**
 *
 * @author kyanh
 */
public class CheckDatabaseConnection {
    public static Connection getMyConnection() throws SQLException, ClassNotFoundException
    {
        return DatabaseConnection.getMsSqlConnect();
    }
}
