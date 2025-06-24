package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import db.DBConnector;
import java.sql.*;

public final class bookmark_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>SmartShelf</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            background: linear-gradient(to right, #ffffff, #ffe4e1);\n");
      out.write("           /* background: url('images/,,,,.jpg') no-repeat center  center/cover fixed;*/\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Navbar */\n");
      out.write("        .navbar {\n");
      out.write("            width: 100%;\n");
      out.write("            background:burlywood ;\n");
      out.write("            align-items: center;\n");
      out.write("            padding: 10px 0;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: space-around;\n");
      out.write("            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.5);\n");
      out.write("            position: fixed;\n");
      out.write("            top: 0;\n");
      out.write("            left: 0;\n");
      out.write("            z-index: 1000;\n");
      out.write("            \n");
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
      out.write("            padding: 10px 15px;\n");
      out.write("            transition: 0.3s;\n");
      out.write("            border: 1px solid transparent;\n");
      out.write("        }\n");
      out.write("        .navbar ul li a:hover {\n");
      out.write("            background: white;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            border: 1px solid black;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Header */\n");
      out.write("       .msg {\n");
      out.write("              width: 100%;\n");
      out.write("             background: burlywood;\n");
      out.write("             height: 50px;/* Adjust height automatically */\n");
      out.write("    top: 80px;\n");
      out.write("    display: flex;\n");
      out.write("    justify-content: center;\n");
      out.write("    align-items: center;\n");
      out.write("    box-shadow: 0 4px 6px rgba(0, 0, 0, 0.2);\n");
      out.write("    position: relative; /* Makes it scroll with the page */\n");
      out.write("}\n");
      out.write("\n");
      out.write("         h1\n");
      out.write("         {\n");
      out.write("           font-size:x-large ;\n");
      out.write("           font-family: Arial, sans-serif;\n");
      out.write("           font-weight: bold;\n");
      out.write("         }\n");
      out.write("\n");
      out.write("\n");
      out.write("          .container {\n");
      out.write("            width: 100%;\n");
      out.write("            max-width: 1200px;\n");
      out.write("            display: flex;\n");
      out.write("            flex-wrap: wrap;\n");
      out.write("            justify-content: space-around;\n");
      out.write("            padding: 80px 20px 20px; /* Adjust padding for navbar space */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("       .card {\n");
      out.write("            width: 25%;\n");
      out.write("            height: auto;\n");
      out.write("            background: burlywood;\n");
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
      out.write("        \n");
      out.write("        .card:hover{\n");
      out.write("            transform: translateY(-10px);\n");
      out.write("            border-bottom: 2px solid black;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        .card img {\n");
      out.write("            width: 100%;\n");
      out.write("            height: 70%;\n");
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
      out.write("        .book-link {\n");
      out.write("            color: black;\n");
      out.write("            text-decoration: none;          \n");
      out.write("            font-weight: bold;\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("            transition: all 0.3s linear;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        a:hover{\n");
      out.write("            transform: scale(1.5);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .remove-btn, .logout-btn {\n");
      out.write("            background: white;\n");
      out.write("            border: none;\n");
      out.write("            margin: 5px;\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            font-size: 20px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            border-radius: 50px;\n");
      out.write("            font-weight: bold;\n");
      out.write("            font-family: Times-new-Roman;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .remove-btn{\n");
      out.write("            transition: all 0.3s linear;\n");
      out.write("        }\n");
      out.write("        .remove-btn:hover\n");
      out.write("        {\n");
      out.write("           background: linear-gradient(to left, #e8dcc2, #d4b998, #c19a6b, #a87f4f);\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("       \n");
      out.write("\n");
      out.write("        .logout-btn {\n");
      out.write("            background: white;\n");
      out.write("            color: black;\n");
      out.write("            box-shadow: 0 4px 8px rgba(0,0,0,0.5);\n");
      out.write("            font-size: 18px;\n");
      out.write("            padding: 9px 19px;\n");
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
      out.write("\n");
      out.write("   \n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <!-- Navbar -->\n");
      out.write("    <div class=\"navbar\">\n");
      out.write("    \n");
      out.write("        <div>\n");
      out.write("            <a href=\"Logout.jsp\" class=\"logout-btn\">Logout</a>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <ul>\n");
      out.write("        <li><a href=\"home.jsp\">Home</a></li>\n");
      out.write("        <li><a href=\"index.jsp\">Books</a></li>\n");
      out.write("        <li><a href=\"bookmark.jsp\">Bookmarks</a></li>\n");
      out.write("        <li><a href=\"shopping.jsp\">Shopping</a></li>\n");
      out.write("        <li><a href=\"cart.jsp\">Your Cart</a></li>\n");
      out.write("    </ul>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    <!-- Header -->\n");
      out.write("    <div class=\"msg\">\n");
      out.write("        <h1><b>Your Personal Library of the Web</b></h1>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        ");

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
        
      out.write("\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <img src=\"");
      out.print( imageUrl );
      out.write("\" alt=\"Book Cover\">\n");
      out.write("                        <div class=\"book-title\">");
      out.print( bookName );
      out.write("</div>\n");
      out.write("                        <a href=\"");
      out.print( bookLink );
      out.write("\" class=\"book-link\" target=\"_blank\"><u>Read Now</u></a>\n");
      out.write("                        <form action=\"RemoveController\" method=\"POST\">\n");
      out.write("                            <input type=\"hidden\" name=\"bookId\" value=\"");
      out.print( bookId );
      out.write("\">\n");
      out.write("                            <button type=\"submit\" class=\"remove-btn\">REMOVE</button>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("        ");

                }
            } catch (Exception e) {
                out.println("Database Connection Error: " + e.getMessage());
            }
        
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
