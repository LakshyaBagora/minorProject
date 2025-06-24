package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import db.DBConnector;
import java.sql.*;

public final class shopping_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Book Collection</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            background: linear-gradient(to left, #f8f5eb, #e6dac5,#d4b998,#c9a275);\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        /* Navigation Bar */\n");
      out.write("        .navbar {\n");
      out.write("            width: 100%;\n");
      out.write("            background: #FAF3E0;\n");
      out.write("            backdrop-filter: blur(10px);\n");
      out.write("            margin: 10px;\n");
      out.write("            padding: 10px 0;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: flex-end;\n");
      out.write("            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.5);\n");
      out.write("            position: fixed;\n");
      out.write("            top: 0;\n");
      out.write("            left: 0;\n");
      out.write("            z-index: 1000;\n");
      out.write("                }\n");
      out.write("        .navbar ul {\n");
      out.write("            list-style: none;\n");
      out.write("            padding: 0;\n");
      out.write("            margin: 0;\n");
      out.write("            display: flex;\n");
      out.write("            gap: 20px;\n");
      out.write("        }\n");
      out.write("        .navbar ul li {\n");
      out.write("            display: inline;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("        .navbar ul li a {\n");
      out.write("            text-decoration: none;\n");
      out.write("            color: black;\n");
      out.write("            font-size: 18px;\n");
      out.write("            padding: 15px 20px;\n");
      out.write("            transition: 0.3s;\n");
      out.write("            border: 1px solid transparent;\n");
      out.write("        }\n");
      out.write("        .navbar ul li a:hover {\n");
      out.write("            background: white;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            border: 1px solid black;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .container {\n");
      out.write("            width: 100%;\n");
      out.write("            max-width: 1200px;\n");
      out.write("            display: flex;\n");
      out.write("            flex-wrap: wrap;\n");
      out.write("            justify-content: space-around;\n");
      out.write("            padding: 80px 20px 20px; /* Adjust padding for navbar space */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .card {\n");
      out.write("            width: 25%;\n");
      out.write("            height: auto;\n");
      out.write("            background: #FAF3E0;\n");
      out.write("            margin: 10px;\n");
      out.write("            border-radius: 15px;\n");
      out.write("            box-shadow: 0 4px 8px rgba(0, 0, 0, 1.5);\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column;\n");
      out.write("            align-items: center;\n");
      out.write("            padding: 15px;\n");
      out.write("            text-align: center;\n");
      out.write("            overflow: hidden;\n");
      out.write("            transition: all 0.3s linear;\n");
      out.write("            border-bottom: 2px solid transparent;\n");
      out.write("        }\n");
      out.write("         \n");
      out.write("        .card:hover{\n");
      out.write("            transform: translateY(-10px);\n");
      out.write("            border-bottom: 2px solid black;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .card img {\n");
      out.write("            width: 100%;\n");
      out.write("            height: 70%; /* Limits image height */\n");
      out.write("            object-fit: contain;\n");
      out.write("            border-radius: 5px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .book-title {\n");
      out.write("            font-size: 1.2em;\n");
      out.write("            font-weight: bolder;\n");
      out.write("            margin: 10px 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .button-container {\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            gap: 10px;\n");
      out.write("            margin-top: 10px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .cart-btn {\n");
      out.write("            background: #C2C5C7;\n");
      out.write("            border: none;\n");
      out.write("            margin: 5px;\n");
      out.write("            padding: 12px 22px;\n");
      out.write("            font-size: 16px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            border-radius: 50px;\n");
      out.write("            font-weight: bold;\n");
      out.write("            transition: all 0.3s linear;\n");
      out.write("            font-family: Times-new-Roman;\n");
      out.write("        }\n");
      out.write("        .buy-btn {\n");
      out.write("            background: #C2C5C7;\n");
      out.write("             color: black;\n");
      out.write("            border: none;\n");
      out.write("            margin: 5px;\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            font-size: 16px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            border-radius: 50px;\n");
      out.write("            font-weight: bold;\n");
      out.write("            transition: all 0.3s linear;\n");
      out.write("            font-family: Times-new-Roman;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .cart-btn:hover\n");
      out.write("        {\n");
      out.write("        background: linear-gradient(to left, #e8dcc2, #d4b998, #c19a6b, #a87f4f);\n");
      out.write("\n");
      out.write("\n");
      out.write("        }\n");
      out.write("         \n");
      out.write("        \n");
      out.write("        .buy-btn:hover\n");
      out.write("        {\n");
      out.write("        background: linear-gradient(to left, #e8dcc2, #d4b998, #c19a6b, #a87f4f);\n");
      out.write("\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("\n");
      out.write("        .logout-container {\n");
      out.write("            width: 100%;\n");
      out.write("            text-align: center;\n");
      out.write("            margin-top: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .logout-btn {\n");
      out.write("            background: white;\n");
      out.write("            color: black;\n");
      out.write("            box-shadow: 0 4px 8px rgba(0,0,0,0.5);\n");
      out.write("            font-size: 18px;\n");
      out.write("            padding: 12px 24px;\n");
      out.write("            text-decoration: none;\n");
      out.write("            display: inline-block;\n");
      out.write("            border-radius: 50px;\n");
      out.write("            font-weight: bold;\n");
      out.write("            font-family: Times-new-Roman;\n");
      out.write("            transition: all 0.3s linear;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("         .logout-btn:hover\n");
      out.write("        {\n");
      out.write("           background: linear-gradient(to left, #e8dcc2, #d4b998, #c19a6b, #a87f4f);\n");
      out.write("           transform: scale(1.15);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("        @media (max-width: 768px) {\n");
      out.write("            .card {\n");
      out.write("                width: 45%;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        @media (max-width: 480px) {\n");
      out.write("            .card {\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<!-- Navigation Bar -->\n");
      out.write("<div class=\"navbar\">\n");
      out.write("    <ul>\n");
      out.write("        <li><a href=\"home.jsp\">Home</a></li>\n");
      out.write("        <li><a href=\"index.jsp\">Books</a></li>\n");
      out.write("        <li><a href=\"bookmark.jsp\">Bookmarks</a></li>\n");
      out.write("        <li><a href=\"shopping.jsp\">Shopping</a></li>\n");
      out.write("        <li><a href=\"cart.jsp\">Your Cart</a></li>\n");
      out.write("    </ul>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    ");

        String query = "SELECT * FROM product";
        try {
            Statement st = DBConnector.getStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                int bookId = rs.getInt("id");
                String imageUrl = rs.getString("image_url");
                String bookName = rs.getString("book_name");
                double bookPrice = rs.getDouble("price"); // Fetch price from database
    
      out.write("\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <img src=\"");
      out.print( imageUrl );
      out.write("\" alt=\"Book Cover\">\n");
      out.write("                    <div class=\"book-title\">");
      out.print( bookName );
      out.write("</div>\n");
      out.write("                    <div class=\"button-container\">\n");
      out.write("                        <form action=\"CartController\" method=\"POST\">\n");
      out.write("                            <input type=\"hidden\" name=\"bookId\" value=\"");
      out.print( bookId );
      out.write("\">\n");
      out.write("                            <button type=\"submit\" class=\"cart-btn\">ADD TO CART</button>\n");
      out.write("                        </form>\n");
      out.write("                        <form action=\"PurchaseController\" method=\"POST\">\n");
      out.write("                            <input type=\"hidden\" name=\"bookId\" value=\"");
      out.print( bookId );
      out.write("\">\n");
      out.write("                            <button type=\"submit\" class=\"buy-btn\">BUY NOW ₹");
      out.print( bookPrice );
      out.write("</button>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("    ");

            }
        } catch (Exception e) {
            out.println("Database Connection Error: " + e.getMessage());
        }
    
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Logout Button -->\n");
      out.write("<div class=\"logout-container\">\n");
      out.write("    <a href=\"Logout.jsp\" class=\"logout-btn\">Logout</a>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
