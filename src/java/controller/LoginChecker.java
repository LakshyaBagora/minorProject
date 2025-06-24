/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import db.DBConnector;
import dto.UserDTO;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.LoginAuthenticator;
/**
 *
 * @author admin
 */
public class LoginChecker extends HttpServlet {

     public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.sendRedirect("login.html");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException    
    {
       
        Statement st = DBConnector.getStatement();
        
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        UserDTO user = new UserDTO();
        user.setEmail(email);
        user.setPassword(password);
        
        
          
        try
        {
            String query = "SELECT token from login WHERE email='"+email+"'";
            System.out.println("Query = "+query);
             ResultSet rs = st.executeQuery(query);
            if(rs.next())
            {
              String t1=rs.getString(1);
               if(t1 == null){ 
               
                String query1 = "UPDATE  login set token = 'ABc' WHERE email='"+email+"'";
                 int i = st.executeUpdate(query1);
                 
                 if(i>0){
                LoginAuthenticator l1 = new LoginAuthenticator();
                boolean login = l1.isLogin(user);
                
                if(login)
               {
                  HttpSession session = request.getSession(true);
                  session.setAttribute("email",email);
                  response.sendRedirect("home.jsp");
                }
                else
                 {
                   response.sendRedirect("login.html");
                 }
                    } 
               }
               else
               {
                response.sendRedirect("loogeedin.html");
               }
                
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
        
       
    }

       
    }
       
    
   
