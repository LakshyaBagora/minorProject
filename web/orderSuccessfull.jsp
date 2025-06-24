<%-- 
    Document   : orderSuccessfull
    Created on : 24 Mar, 2025, 12:16:30 AM
    Author     : admin
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="db.DBConnector"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body
            {
                background:linear-gradient(to right, #ffffff, #ffe4e1) ;
               /* background: url('images/,,,,.jpg') no-repeat center  center/cover fixed;*/
                height: 100vh;
                display: flex;
                align-items: center;
                justify-content: center;
                flex-direction: column;
            }
            
            .container
            {
                background: #e8dcc2; 
                display: flex;
                justify-content: center;
                text-align: center;
                flex-direction: column;
                width: 500px;
                z-index: 1;
                box-shadow: 0 4px 8px rgba(0, 0, 0, 1.5);
                padding: 10px;
                border-radius: 10px; 
            }
            
            .container h1
            {
             font-size: 35px;
             
             color: blue;
            }
            
    
           
           .login-btn {
            background: #C2C5C7;
            border: none;
            font-weight: bolder;
            text-decoration: none;
            transition: all 0.3s linear;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 1.5); 
            color: black;
            font-size: 24px; /* Slightly bigger text */
            padding: 12px 24px; /* Bigger size */
            text-decoration: none;
            display: inline-block;
            border-radius: 50px;
            margin-top: 20px;
            width: 30%;
           
        }

        .login-btn:hover {
            background: linear-gradient(to left, #e8dcc2, #d4b998, #c19a6b, #a87f4f);
        }
           
        </style>
    </head>
    <body>
        
        <div class="container">
        <%
        String email = (String)session.getAttribute("email");
        
        Statement st = DBConnector.getStatement();
        
        String query = "SELECT address from orders where email='"+email+"'";
        
        ResultSet rs = st.executeQuery(query);
        String address="";
        if(rs.next())
        {
         address = rs.getString(1);
        }

        %>
        
        <h1>ORDER SUCCESSFUL..</h1>
        <h2> your order will deliver soon on provided address "<%=address %>" </h2>
        <h2> For any query and question please contact on 9039450900 number.  </h2>

        <div><a href="index.jsp" class="login-btn">BOOKS</a></div>
        </div>
        </body>
</html>
