/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;
/**
 *
 * @author Lenovo
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
    try
    {
        
        System.out.println("Connected Successfully.....");
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/lms","root","admin");
        System.out.println("Connected Successfully.");
        return con;
    }
    catch(Exception e)
    {
        System.out.println(e);
        return null;
    }
   
    }
          
}
