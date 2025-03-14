<%@page import="db.DBConnector"%>
<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bookmark</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background: linear-gradient(to left, #f8f5eb, #e6dac5,#d4b998,#c9a275);
            /*background: url('images/background.webp') no-repeat center  center/cover fixed;*/
            display: flex;
            flex-direction: column;
            align-items: center;
        }

        /* Navbar */
        .navbar {
            width: 100%;
            background: #FAF3E0;
            margin-top:  10px;
            padding: 10px 0;
            display: flex;
            justify-content: flex-end;
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
            padding: 15px 20px;
            transition: 0.3s;
            border: 1px solid transparent;

        }
        .navbar ul li a:hover {
            background: white;
            border-radius: 5px;
            border: 1px solid black;
        }

        /* Header */
       .msg {
              width: 100%;
             background: #FAF3E0;
             height: 50px;/* Adjust height automatically */
    top: 70px;
    display: flex;
    justify-content: center;
    align-items: center;
    box-shadow: 0 4px 6px rgba(0, 0, 0, 0.2);
    position: relative; /* Makes it scroll with the page */
}

         h1
         {
           font-size:x-large ;
           font-family: Arial, sans-serif;
           font-weight: bold;
         }


          .container {
            width: 100%;
            max-width: 1200px;
            display: flex;
            flex-wrap: wrap;
            justify-content: space-around;
            padding: 80px 20px 20px; /* Adjust padding for navbar space */
        }

       .card {
            width: 25%;
            height: auto;
            background: #FAF3E0;
            margin: 10px;
            border-radius: 15px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 1.5);
            display: flex;
            flex-direction: column;
            align-items: center;
            padding: 15px;
            text-align: center;
            overflow: hidden;
            transition: all 0.3s linear;
            border-bottom: 2px solid transparent;
        }
        
        .card:hover{
            transform: translateY(-10px);
            border-bottom: 2px solid black;
            
        }
        
        
        .card img {
            width: 100%;
            height: 70%;
            object-fit: contain;
            border-radius: 5px;
        }

        .book-title {
            font-size: 1.2em;
            font-weight: bolder;
            margin: 10px 0;
        }

        .book-link {
            color: black;
            text-decoration: none;          
            font-weight: bold;
            margin-bottom: 10px;
            transition: all 0.3s linear;
        }
        
        a:hover{
            transform: scale(1.5);
        }

        .remove-btn, .logout-btn {
            background: #C2C5C7;
            border: none;
            margin: 5px;
            padding: 10px 20px;
            font-size: 20px;
            cursor: pointer;
            border-radius: 50px;
            font-weight: bold;
            font-family: Times-new-Roman;
        }
        
        .remove-btn{
            transition: all 0.3s linear;
        }
        .remove-btn:hover
        {
           background: linear-gradient(to left, #e8dcc2, #d4b998, #c19a6b, #a87f4f);

        }

       .logout-container {
            width: 100%;
            text-align: center;
            margin-top: 20px;
        }

        .logout-btn {
            background: white;
            color: black;
            box-shadow: 0 4px 8px rgba(0,0,0,0.5);
            font-size: 18px;
            padding: 12px 24px;
            text-decoration: none;
            display: inline-block;
            border-radius: 50px;
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

    <!-- Navbar -->
    <div class="navbar">
    <ul>
        <li><a href="home.jsp">Home</a></li>
        <li><a href="index.jsp">Books</a></li>
        <li><a href="bookmark.jsp">Bookmarks</a></li>
        <li><a href="shopping.jsp">Shopping</a></li>
        <li><a href="cart.jsp">Your Cart</a></li>
    </ul>
</div>

    <!-- Header -->
    <div class="msg">
        <h1><b>Your Personal Library of the Web</b></h1>
    </div>

    <div class="container">
        <%
            String email = (String) session.getAttribute("email"); 
            String query = "SELECT * FROM bookmark where email='"+email+"'";
            try {
                Statement st = DBConnector.getStatement();
                ResultSet rs = st.executeQuery(query);
                while (rs.next()) {
                    int bookId = rs.getInt("book_id");
                    String imageUrl = rs.getString("image_link");
                    String bookName = rs.getString("book_name");
                    String bookLink = rs.getString("book_link");
        %>
                    <div class="card">
                        <img src="<%= imageUrl %>" alt="Book Cover">
                        <div class="book-title"><%= bookName %></div>
                        <a href="<%= bookLink %>" class="book-link" target="_blank"><u>Read Now</u></a>
                        <form action="BookmarkController" method="POST">
                            <input type="hidden" name="bookId" value="<%= bookId %>">
                            <button type="submit" class="remove-btn">REMOVE</button>
                        </form>
                    </div>
        <%
                }
            } catch (Exception e) {
                out.println("Database Connection Error: " + e.getMessage());
            }
        %>
    </div>

    <!-- Logout Button -->
    <div class="logout-container">
        <a href="Logout.jsp" class="logout-btn">Logout</a>
    </div>

</body>
</html>

