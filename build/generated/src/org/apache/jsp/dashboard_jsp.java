package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import db.DBConnector;
import java.sql.*;

public final class dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>SmartShelf Book Dashboard</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            background: linear-gradient(to right, #ffffff, #ffe4e1);\n");
      out.write("\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            padding: 40px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .navbar {\n");
      out.write("            width: 100%;\n");
      out.write("            background:burlywood ;\n");
      out.write("            \n");
      out.write("            padding: 9px 0;\n");
      out.write("            \n");
      out.write("            display: flex;\n");
      out.write("            justify-content: space-around;\n");
      out.write("            align-items: center;\n");
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
      out.write("            \n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("        .navbar ul li a {\n");
      out.write("            text-decoration: none;\n");
      out.write("            color: black;\n");
      out.write("            font-size: 18px;\n");
      out.write("            padding: 9px 15px;\n");
      out.write("            transition: 0.3s;\n");
      out.write("            border: 1px solid transparent;\n");
      out.write("        }\n");
      out.write("        .navbar ul li a:hover {\n");
      out.write("            background: white;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            border: 1px solid black;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .main-box {\n");
      out.write("            width: 100%;\n");
      out.write("            height: 70vh;\n");
      out.write("            max-width: 1100px;\n");
      out.write("            background: burlywood;\n");
      out.write("            padding: 20px;\n");
      out.write("            margin-top: 40px;\n");
      out.write("            border-radius: 16px;\n");
      out.write("            box-shadow: 0 4px 12px rgba(0,0,0,0.1);\n");
      out.write("            display: flex;\n");
      out.write("            gap: 20px;\n");
      out.write("            justify-content: space-between;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .sub-box {\n");
      out.write("            flex: 1;\n");
      out.write("                        background:#ffffff ;\n");
      out.write("\n");
      out.write("            border-radius: 12px;\n");
      out.write("            padding: 15px;\n");
      out.write("            box-shadow: 0 2px 6px rgba(0,0,0,0.08);\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .count {\n");
      out.write("            background-color: #333333;\n");
      out.write("            color: white;\n");
      out.write("            padding: 10px;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            text-align: center;\n");
      out.write("            font-size: 16px;\n");
      out.write("            font-weight: bold;\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .book-list {\n");
      out.write("            flex: 1;\n");
      out.write("            overflow-y: auto;\n");
      out.write("            background-color: #ffffff;\n");
      out.write("            border: 2px solid #ddd;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            padding: 10px;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .book-item {\n");
      out.write("            padding: 5px 0;\n");
      out.write("            border-bottom: 2px solid #eee;\n");
      out.write("            font-size: 15px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .book-item:last-child {\n");
      out.write("            border-bottom: none;\n");
      out.write("        }\n");
      out.write("        \n");
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
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"navbar\">\n");
      out.write("    <div>\n");
      out.write("        <a href=\"Logout.jsp\" class=\"logout-btn\">Logout</a>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <ul>\n");
      out.write("        <li><a href=\"home.jsp\">Home</a></li>\n");
      out.write("        <li><a href=\"dashboard.jsp\">Dashboard</a></li>\n");
      out.write("\n");
      out.write("        <li><a href=\"index.jsp\">Books</a></li>\n");
      out.write("        <li><a href=\"bookmark.jsp\">Bookmarks</a></li>\n");
      out.write("        <li><a href=\"shopping.jsp\">Shopping</a></li>\n");
      out.write("        <li><a href=\"cart.jsp\">Your Cart</a></li>\n");
      out.write("    </ul>\n");
      out.write("</div>\n");
      out.write("    \n");
     
    String email = (String) session.getAttribute("email"); 

      out.write("\n");
      out.write("<div class=\"main-box\">\n");
      out.write("    ");

       
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
    
      out.write("\n");
      out.write("    <div class=\"sub-box\">\n");
      out.write("        <div class=\"count\">Total Books ");
      out.print( count1 );
      out.write("</div>\n");
      out.write("        <div class=\"book-list\">\n");
      out.write("            ");

                            
                   

                rsList2 = stmt4.executeQuery("SELECT book_name FROM product");
                while (rsList2.next()) {
            
      out.write("\n");
      out.write("                <div class=\"book-item\">");
      out.print( rsList2.getString("book_name") );
      out.write("</div>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    ");

            // --- Box 2 ---
            

            rsCount2 = stmt1.executeQuery("SELECT COUNT(*) FROM bookmark where email='"+email+"'");

            int count2 = rsCount2.next() ? rsCount2.getInt(1) : 0;
    
      out.write("\n");
      out.write("    <div class=\"sub-box\">\n");
      out.write("        <div class=\"count\">Bookmark: ");
      out.print( count2 );
      out.write("</div>\n");
      out.write("        <div class=\"book-list\">\n");
      out.write("            ");

                             

                rsList2 = stmt4.executeQuery("SELECT book_name FROM bookmark WHERE email='"+email+"'");
                while (rsList2.next()) {
            
      out.write("\n");
      out.write("                <div class=\"book-item\">");
      out.print( rsList2.getString("book_name") );
      out.write("</div>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    ");

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
    
      out.write("\n");
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
