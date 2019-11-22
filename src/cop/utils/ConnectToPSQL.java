/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cop.utils;

/**
 *
 * @author hawk
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectToPSQL 
{
    Connection con = null;
    public ConnectToPSQL()
    {
        try 
        {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/asd","postgres", "root");
            System.out.println("Opened database successfully");
        }
        catch (ClassNotFoundException | SQLException e) 
        {
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
    }
    
    public ResultSet getResultSet(String qry){
        System.err.println(qry+"");
        ResultSet rs=null;
        try{
            if(!con.isClosed()){
                Statement stmt=con.createStatement();  
                rs=stmt.executeQuery(qry); 
            }
        }catch(Exception ex){
               System.err.println(ex+"");
        }  
        return rs;
    }
    
    public int InsertQuery(String qry){
        try{
            if(!con.isClosed()){               
               Statement statement = con.createStatement();
               statement.executeUpdate(qry);
               ResultSet rs=statement.getGeneratedKeys();
               if(rs.next())
                return rs.getInt(1);
               return 1;
            }
        }catch(Exception ex){
            System.err.println("Query:"+qry+"");
            System.err.println(ex.getMessage()+"");
            return -1;
        }
        return 0;
    }
}


