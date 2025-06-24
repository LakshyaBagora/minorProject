/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import db.DBConnector;
import dto.UserDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class LoginAuthenticator {
     public boolean isLogin(UserDTO user)
    {
        String email = user.getEmail();
        String password = user.getPassword();
        
        Statement st = DBConnector.getStatement();
        String tablePassword="";
        
        try
        {
            String query = "SELECT password from login WHERE email='"+email+"'";
            System.out.println("Query = "+query);
             ResultSet rs = st.executeQuery(query);
            if(rs.next())
            {
                tablePassword = rs.getString(1);
            }
            else
            {
                return false;
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        if(email!=null && password!=null && !email.trim().equals("") && password.equals(tablePassword))
        {
            return true;
        }
        return false;
    }    
}
