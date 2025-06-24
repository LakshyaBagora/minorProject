package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import db.DBConnector;

public final class orderSuccessfull_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            body\n");
      out.write("            {\n");
      out.write("                background:linear-gradient(to right, #ffffff, #ffe4e1) ;\n");
      out.write("               /* background: url('images/,,,,.jpg') no-repeat center  center/cover fixed;*/\n");
      out.write("                height: 100vh;\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("                justify-content: center;\n");
      out.write("                flex-direction: column;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .container\n");
      out.write("            {\n");
      out.write("                background: #e8dcc2; \n");
      out.write("                display: flex;\n");
      out.write("                justify-content: center;\n");
      out.write("                text-align: center;\n");
      out.write("                flex-direction: column;\n");
      out.write("                width: 500px;\n");
      out.write("                z-index: 1;\n");
      out.write("                box-shadow: 0 4px 8px rgba(0, 0, 0, 1.5);\n");
      out.write("                padding: 10px;\n");
      out.write("                border-radius: 10px; \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .container h1\n");
      out.write("            {\n");
      out.write("             font-size: 35px;\n");
      out.write("             \n");
      out.write("             color: blue;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("    \n");
      out.write("           \n");
      out.write("           .login-btn {\n");
      out.write("            background: #C2C5C7;\n");
      out.write("            border: none;\n");
      out.write("            font-weight: bolder;\n");
      out.write("            text-decoration: none;\n");
      out.write("            transition: all 0.3s linear;\n");
      out.write("            box-shadow: 0 4px 8px rgba(0, 0, 0, 1.5); \n");
      out.write("            color: black;\n");
      out.write("            font-size: 24px; /* Slightly bigger text */\n");
      out.write("            padding: 12px 24px; /* Bigger size */\n");
      out.write("            text-decoration: none;\n");
      out.write("            display: inline-block;\n");
      out.write("            border-radius: 50px;\n");
      out.write("            margin-top: 20px;\n");
      out.write("            width: 30%;\n");
      out.write("           \n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .login-btn:hover {\n");
      out.write("            background: linear-gradient(to left, #e8dcc2, #d4b998, #c19a6b, #a87f4f);\n");
      out.write("        }\n");
      out.write("           \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("        ");

        String email = (String)session.getAttribute("email");
        
        Statement st = DBConnector.getStatement();
        
        String query = "SELECT address from orders where email='"+email+"'";
        
        ResultSet rs = st.executeQuery(query);
        String address="";
        if(rs.next())
        {
         address = rs.getString(1);
        }

        
      out.write("\n");
      out.write("        \n");
      out.write("        <h1>ORDER SUCCESSFUL..</h1>\n");
      out.write("        <h2> your order will deliver soon on provided address \"");
      out.print(address );
      out.write("\" </h2>\n");
      out.write("        <h2> For any query and question please contact on 9039450900 number.  </h2>\n");
      out.write("\n");
      out.write("        <div><a href=\"index.jsp\" class=\"login-btn\">BOOKS</a></div>\n");
      out.write("        </div>\n");
      out.write("        </body>\n");
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
