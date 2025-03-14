package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    String email = (String) session.getAttribute("email");
    if (email == null || email.trim().equals("")) {
        response.sendRedirect("login.html");
    }

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Home Page</title>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <style>\n");
      out.write("        * {\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        body {\n");
      out.write("            height: 100vh;\n");
      out.write("            background: linear-gradient(to left, #f8f5eb, #e6dac5, #d4b998, #c9a275);\n");
      out.write("            font-family: 'Poppins', sans-serif;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            flex-direction: column;\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 20px;\n");
      out.write("            overflow: auto;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .content {\n");
      out.write("            max-width: 800px;\n");
      out.write("            padding: 20px;\n");
      out.write("            font-size: 24px;\n");
      out.write("            color: #333;\n");
      out.write("            line-height: 1.8;\n");
      out.write("            text-shadow: 2px 2px 8px rgba(201,162,117,0.5);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #explore-btn {\n");
      out.write("            padding: 15px 40px;\n");
      out.write("            margin-top: 40px;\n");
      out.write("            font-size: 20px;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 30px;\n");
      out.write("            background-color: #ff8c00;\n");
      out.write("            color: white;\n");
      out.write("            cursor: pointer;\n");
      out.write("            opacity: 0;\n");
      out.write("            transition: opacity 0.5s ease, transform 0.3s ease;\n");
      out.write("            box-shadow: 0 5px 15px rgba(0, 0, 0, 0.2);\n");
      out.write("            display: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #explore-btn:hover {\n");
      out.write("            background-color: #e67e00;\n");
      out.write("            transform: scale(1.05);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        @media (max-width: 768px) {\n");
      out.write("            .content {\n");
      out.write("                font-size: 18px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #explore-btn {\n");
      out.write("                font-size: 18px;\n");
      out.write("                padding: 12px 30px;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body onclick=\"showAll()\">\n");
      out.write("\n");
      out.write("    <div class=\"content\" id=\"paragraph-container\"></div>\n");
      out.write("\n");
      out.write("    <button id=\"explore-btn\" onclick=\"location.href='index.jsp'\">Explore</button>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        const paragraphs = [\n");
      out.write("            \"Our electronic book-keeping system offers a smart way to store, organize, and access eBooks anytime, anywhere. It replaces traditional book management with a secure, digital solution for effortless reading.\",\n");
      out.write("            \"The system features advanced search, easy categorization, and instant access to books. With strong data protection, your collection stays safe, organized, and readily available.\",\n");
      out.write("            \"Designed for modern readers, the system promotes eco-friendly reading by reducing physical storage. It’s a convenient, sustainable solution for managing books efficiently.\"\n");
      out.write("        ];\n");
      out.write("\n");
      out.write("        const container = document.getElementById('paragraph-container');\n");
      out.write("        const exploreBtn = document.getElementById('explore-btn');\n");
      out.write("\n");
      out.write("        let paragraphIndex = 0;\n");
      out.write("        let isAnimationSkipped = false;\n");
      out.write("\n");
      out.write("        function displayParagraph(paragraph, callback) {\n");
      out.write("            const paragraphDiv = document.createElement(\"p\");\n");
      out.write("            container.appendChild(paragraphDiv);\n");
      out.write("\n");
      out.write("            const words = paragraph.split(\" \");\n");
      out.write("            let wordIndex = 0;\n");
      out.write("\n");
      out.write("            const interval = setInterval(() => {\n");
      out.write("                if (isAnimationSkipped) {\n");
      out.write("                    clearInterval(interval);\n");
      out.write("                    return;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if (wordIndex < words.length) {\n");
      out.write("                    paragraphDiv.innerHTML += words[wordIndex] + \" \";\n");
      out.write("                    wordIndex++;\n");
      out.write("                } else {\n");
      out.write("                    clearInterval(interval);\n");
      out.write("                    if (callback) callback();\n");
      out.write("                }\n");
      out.write("            }, 200);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function startParagraphs() {\n");
      out.write("            if (paragraphIndex < paragraphs.length) {\n");
      out.write("                displayParagraph(paragraphs[paragraphIndex], () => {\n");
      out.write("                    paragraphIndex++;\n");
      out.write("                    setTimeout(startParagraphs, 1000);\n");
      out.write("                });\n");
      out.write("            } else {\n");
      out.write("                exploreBtn.style.opacity = 1;\n");
      out.write("                exploreBtn.style.display = \"block\";\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function showAll() {\n");
      out.write("            if (!isAnimationSkipped) {\n");
      out.write("                isAnimationSkipped = true;\n");
      out.write("                container.innerHTML = \"\";  // Clear existing content\n");
      out.write("                paragraphs.forEach(paragraph => {\n");
      out.write("                    const p = document.createElement(\"p\");\n");
      out.write("                    p.textContent = paragraph;\n");
      out.write("                    container.appendChild(p);\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                exploreBtn.style.opacity = 1;\n");
      out.write("                exploreBtn.style.display = \"block\";\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        window.onload = () => {\n");
      out.write("            setTimeout(startParagraphs, 500);\n");
      out.write("        };\n");
      out.write("    </script>\n");
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
