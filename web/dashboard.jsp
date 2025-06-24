<%-- 
    Document   : dashboard
    Created on : 28 Apr, 2025, 11:22:58 PM
    Author     : admin
--%>
<%@page import="db.DBConnector"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>SmartShelf Book Dashboard</title>
    <style>
        body {
            background: linear-gradient(to right, #ffffff, #ffe4e1);

            font-family: Arial, sans-serif;
            display: flex;
            justify-content: center;
            padding: 40px;
        }

        .navbar {
            width: 100%;
            background:burlywood ;
            
            padding: 9px 0;
            
            display: flex;
            justify-content: space-around;
            align-items: center;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.5);
            position: fixed;
            top: 0;
            left: 0;
            z-index: 1000;
            
                }
        .navbar ul {
            list-style: none;
            padding: 0;
            margin: 0;
            display: flex;
            gap: 20px;
        }
        .navbar ul li {
            display: inline;
            
            font-weight: bold;
        }
        .navbar ul li a {
            text-decoration: none;
            color: black;
            font-size: 18px;
            padding: 9px 15px;
            transition: 0.3s;
            border: 1px solid transparent;
        }
        .navbar ul li a:hover {
            background: white;
            border-radius: 5px;
            border: 1px solid black;
        }
        
        .main-box {
            width: 100%;
            height: 70vh;
            max-width: 1100px;
            background: burlywood;
            padding: 20px;
            margin-top: 40px;
            border-radius: 16px;
            box-shadow: 0 4px 12px rgba(0,0,0,0.1);
            display: flex;
            gap: 20px;
            justify-content: space-between;
        }

        .sub-box {
            flex: 1;
                        background:#ffffff ;

            border-radius: 12px;
            padding: 15px;
            box-shadow: 0 2px 6px rgba(0,0,0,0.08);
            display: flex;
            flex-direction: column;
        }

        .count {
            background-color: #333333;
            color: white;
            padding: 10px;
            border-radius: 8px;
            text-align: center;
            font-size: 16px;
            font-weight: bold;
            margin-bottom: 10px;
        }

        .book-list {
            flex: 1;
            overflow-y: auto;
            background-color: #ffffff;
            border: 2px solid #ddd;
            border-radius: 8px;
            padding: 10px;
            
        }

        .book-item {
            padding: 5px 0;
            border-bottom: 2px solid #eee;
            font-size: 15px;
        }

        .book-item:last-child {
            border-bottom: none;
        }
        
        .logout-btn {
            background: white;
            color: black;
            box-shadow: 0 4px 8px rgba(0,0,0,0.5);
            font-size: 18px;
            padding: 9px 19px;
            text-decoration: none;
            display: inline-block;
            border-radius: 50px;
            font-weight: bold;
            font-family: Times-new-Roman;
            transition: all 0.3s linear;
        }
        
         .logout-btn:hover
        {
           background: linear-gradient(to left, #e8dcc2, #d4b998, #c19a6b, #a87f4f);
           transform: scale(1.15);
        }

    </style>
</head>
<body>
    <div class="navbar">
    <div>
        <a href="Logout.jsp" class="logout-btn">Logout</a>
        
    </div>
    
    <ul>
        <li><a href="home.jsp">Home</a></li>
        <li><a href="dashboard.jsp">Dashboard</a></li>

        <li><a href="index.jsp">Books</a></li>
        <li><a href="bookmark.jsp">Bookmarks</a></li>
        <li><a href="shopping.jsp">Shopping</a></li>
        <li><a href="cart.jsp">Your Cart</a></li>
    </ul>
</div>
    
<%     
    String email = (String) session.getAttribute("email"); 
%>
<div class="main-box">
    <%
       
        ResultSet rsCount1 = null, rsList1 = null;
        ResultSet rsCount2 = null, rsList2 = null;
        ResultSet rsCount3 = null, rsList3 = null;

        try {
            Statement stmt1 = DBConnector.getStatement();
Statement stmt2 = DBConnector.getStatement();
Statement stmt3 = DBConnector.getStatement();
Statement stmt4 = DBConnector.getStatement();
Statement stmt5 = DBConnector.getStatement();
Statement stmt6 = DBConnector.getStatement();

           

            // --- Box 1 ---
            rsCount1 = stmt1.executeQuery("SELECT COUNT(*) FROM product");
            int count1 = rsCount1.next() ? rsCount1.getInt(1) : 0;
    %>
    <div class="sub-box">
        <div class="count">Total Books <%= count1 %></div>
        <div class="book-list">
            <%
                            
                   

                rsList2 = stmt4.executeQuery("SELECT book_name FROM product");
                while (rsList2.next()) {
            %>
                <div class="book-item"><%= rsList2.getString("book_name") %></div>
            <%
                }
            %>
        </div>
    </div>

    <%
            // --- Box 2 ---
            

            rsCount2 = stmt1.executeQuery("SELECT COUNT(*) FROM bookmark where email='"+email+"'");

            int count2 = rsCount2.next() ? rsCount2.getInt(1) : 0;
    %>
    <div class="sub-box">
        <div class="count">Bookmark: <%= count2 %></div>
        <div class="book-list">
            <%
                             

                rsList2 = stmt4.executeQuery("SELECT book_name FROM bookmark WHERE email='"+email+"'");
                while (rsList2.next()) {
            %>
                <div class="book-item"><%= rsList2.getString("book_name") %></div>
            <%
                }
            %>
        </div>
    </div>
<%
            // --- Box 3 ---
            rsCount3 = stmt5.executeQuery("SELECT COUNT(*) FROM orders where email='"+email+"'");
            int count3 = rsCount3.next() ? rsCount3.getInt(1) : 0;
    %>
    <div class="sub-box">
        <div class="count">Orders: <%= count3 %></div>
        <div class="book-list">
            <%
                             

                rsList3 = stmt6.executeQuery("SELECT book_name FROM orders WHERE email='"+email+"'");
                while (rsList3.next()) {
            %>
                <div class="book-item"><%= rsList3.getString("book_name") %></div>
            <%
                }
            %>
        </div>
    </div>
    
    <%
        } catch(Exception e) {
            out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
        } finally {
            try { if (rsCount1 != null) rsCount1.close(); } catch (Exception e) {}
            try { if (rsList1 != null) rsList1.close(); } catch (Exception e) {}
            try { if (rsCount2 != null) rsCount2.close(); } catch (Exception e) {}
            try { if (rsList2 != null) rsList2.close(); } catch (Exception e) {}
            try { if (rsCount3 != null) rsCount3.close(); } catch (Exception e) {}
            try { if (rsList3 != null) rsList3.close(); } catch (Exception e) {}
           /*try { if (stmt != null) stmt.close(); } catch (Exception e) {}
            try { if (con != null) con.close(); } catch (Exception e) {}*/
        }
    %>
</div>

</body>
</html>
