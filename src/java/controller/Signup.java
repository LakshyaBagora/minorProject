/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dto.SignupDTO;
import dao.SignupDAO;


/**
 *
 * @author admin
 */
public class Signup extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     response.sendRedirect("login.html"); 
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         String username = request.getParameter("username");
         String email = request.getParameter("email");
         String password = request.getParameter("password");
         String cpassword = request.getParameter("cpassword");
         
         if ( password.equals(cpassword) ) {
             
             SignupDTO signup = new SignupDTO();
              signup.setUsername(username);
              signup.setEmail(email);
              signup.setPassword(password);
              signup.setCPassword(cpassword);


             
             
             SignupDAO signupdao = new SignupDAO();
             int s1 =signupdao.isSignup(signup);
             
             if (s1!=0) {
                 response.sendRedirect("thanks.html");
             } else {
                 response.sendRedirect("login.html");

             }
             
            
        } else {
             response.sendRedirect("login.html");
        }

    }



}
