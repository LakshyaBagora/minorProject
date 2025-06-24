/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import db.DBConnector;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
public class CartController extends HttpServlet {

    @Override
  
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        // Get database connection
        Connection conn = DBConnector.getConnection();
        Statement st =  DBConnector.getStatement();
        
        if (conn == null) {
            System.out.println("Database connection failed!");
            
            return;
        }

        // Retrieve user email from session correctly
        HttpSession session = request.getSession();
        String email = (String) session.getAttribute("email"); 
        
       
      if (email == null) {
                System.out.println("User not logged in!");
                response.sendRedirect("login.jsp");
                return;
            }
       

        

        // Get bookId from request
        int bookId;
        try {
            bookId = Integer.parseInt(request.getParameter("bookId"));
        } catch (NumberFormatException e) {
            System.out.println("Invalid book ID format.");
                       

            return;
        }

        try {
           
        String query = "SELECT * from product WHERE id='"+bookId+"'";
            System.out.println("Query = "+query);
            ResultSet rs = st.executeQuery(query);

            String image_url = null;
            String book_name = null;
            String book_link = null;
            double bookPrice=0.0;
            

            if (rs.next()) {
                image_url = rs.getString("image_url");
                book_name = rs.getString("book_name");
                book_link = rs.getString("book_link");
                bookPrice = rs.getDouble("price");
            }

            // If book details exist, insert bookmark entry
            if (image_url != null) {
                String query2 = "INSERT INTO cart (email,book_id, image_link, book_name, book_link , price) VALUES (?, ?, ?, ?, ?,?)";
                PreparedStatement ps2 = conn.prepareStatement(query2);
                ps2.setString(1, email);
                ps2.setInt(2, bookId);
                ps2.setString(3, image_url);
                ps2.setString(4, book_name);
                ps2.setString(5, book_link);
                ps2.setDouble(6, bookPrice);


                int i = ps2.executeUpdate();

                if (i > 0) {
                    response.sendRedirect("cart.jsp"); // Bookmark added successfully
                } else {
                    response.sendRedirect("shopping.jsp"); // Failed to add bookmark
                }
                
                
            } else {
                System.out.println("Book not found.");
                // Redirect if book does not exist
            }

           
        } catch (SQLException e) {
            System.out.println(e);
            response.sendRedirect("cartalreadyexist.html");

            
        }
    
    }
    
    
    }



