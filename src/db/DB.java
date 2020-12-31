/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class DB {
    public static Connection conn=null;
    public static Statement smt=null;
    public static void Connect()
    {
       try
       {
            Class.forName("com.mysql.jdbc.Driver");//loading the driver
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/quizdb", "root", "");
            if (conn != null)
            {
                System.out.println("Connected");
            }
       }
       catch(Exception ex)
       {
            System.out.println("Not Connected "+ex);
       }
    }
    
    public static void disconnect() throws SQLException
    {
        conn.close();
    }
}
