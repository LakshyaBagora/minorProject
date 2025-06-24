/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import db.DBConnector;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author admin
 */
public class RemoveController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        Statement st =  DBConnector.getStatement();
        
        HttpSession session = request.getSession();
         String email = (String) session.getAttribute("email");  
         
         if (email == null) {
                System.out.println("User not logged in!");
                response.sendRedirect("login.html");
                return;
           }
           int bookId = 0;
        try {
            bookId = Integer.parseInt(request.getParameter("bookId"));
        } catch (NumberFormatException e) {
            System.out.println("Invalid book ID format.");
                       }

         try {
           
        String query = "delete  from bookmark WHERE book_id='"+bookId+"' and email='"+email+"'";
            System.out.println("Query = "+query);
            int i = st.executeUpdate(query);
                if (i > 0) {
                    response.sendRedirect("bookmark.jsp"); // Bookmark added successfully
                } else {
                    response.sendRedirect("index.jsp"); // Failed to add bookmark
                }
                
                
          

           
        } catch (SQLException e) {
            System.out.println(e);
            response.sendRedirect("bookmarkmsg.html");
        }
            
      }
   }
