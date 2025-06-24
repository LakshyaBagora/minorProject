 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.DBConnector;
import dto.SignupDTO;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author admin
 */
public class SignupDAO {

    public int isSignup(SignupDTO signup) {
        String username=signup.getUsername(); 
        String email=signup.getEmail();
        String password=signup.getPassword();
       
 
 
        
        Statement st = DBConnector.getStatement();
     
        try
        {
           String query = "INSERT INTO login(username,email,password) VALUES('"+username+"','"+email+"','"+password+"')";
            System.out.println("Query = "+query);
            int i = st.executeUpdate(query);
            if(i>0)
            {
               return i;
            }
            else
            {
                return 0;
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
      return 0;
    }
    
}
