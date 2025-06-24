/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import db.DBConnector;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author admin
 */
public class AdressInsert extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
        Statement st = DBConnector.getStatement();

        HttpSession session = request.getSession();
        String email = (String) session.getAttribute("email"); 
        
        
        String address = request.getParameter("address");
        String pincode = request.getParameter("pincode");
        String number = request.getParameter("number");
    
        String Query = "UPDATE  orders set address = '"+address+"' , pincode = '"+pincode+"' WHERE email='"+email+"'";
            int i;
        try {
            i = st.executeUpdate(Query);
            if(i>0){
               
                response.sendRedirect("orderSuccessfull.jsp");
            }
    
        } catch (SQLException ex) {
            Logger.getLogger(AdressInsert.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }

    
    
    
}
