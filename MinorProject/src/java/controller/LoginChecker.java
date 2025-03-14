/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.UserDTO;
import java.io.IOException;
import java.io.PrintWriter;
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
       
        
        
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        UserDTO user = new UserDTO();
        user.setEmail(email);
        user.setPassword(password);
        
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
       
    
   
