<%-- 
    Document   : Logout
    Created on : 17 Mar, 2025, 10:12:25 PM
    Author     : admin
--%>

<%@page import="db.DBConnector"%>
<%@page import="java.sql.Statement"%>
<%@page import="dto.UserDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            
           
             
            String email = (String) session.getAttribute("email"); 
            Statement st = DBConnector.getStatement(); 
            
            String Query = "UPDATE  login set token = NULL WHERE email='"+email+"'";
            int i = st.executeUpdate(Query);
            if(i>0){
                session.invalidate();
                response.sendRedirect("login.html");
            }
             
          
        %>
    </body>
</html>
