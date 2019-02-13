package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


  String username = "";
  String password = "" ;
  
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

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <script>\n");
      out.write("        function validate(){\n");
      out.write("            var username=document.form.user.value;\n");
      out.write("            var password=document.form.pass.value;\n");
      out.write("            if(username==\"\"){\n");
      out.write("                alert(\"Enter Username!\");\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            if(password==\"\"){\n");
      out.write("                alert(\"Enter Password!\");\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            return true;\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("    <body style=\"background-image:url('Images/final.jpg')\">\n");
      out.write("\n");
      out.write("        <form name=\"form\" method=\"post\" action=\"http://localhost:8080/PizzaManagement/Userlogin\" onsubmit=\"javascript:return validate();\"> \n");
      out.write("            <center><img src = \"Images/pizzalogo.png\" /></center> \n");
      out.write("\n");
      out.write("            <h1 ALIGN=\"CENTER\"><FONT face=\"Magneto\" COLOR =black><b>Pizza Store Management</b></FONT></h1>\n");
      out.write("            <HR WIDTH=\"40%\" SIZE=\"3\" NOSHADE=\"NOSHADE\" COLOR =black >\n");
      out.write("\n");
      out.write("            <br/>\n");
      out.write("            <div style=\"margin: auto; width:260px; height:140px; border:2px solid black; padding:25px\">\n");
      out.write("\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                    <center><b>User Login</b></center><br> \n");
      out.write("                    <td>\n");
      out.write("                        <b> Username:</b> <br/>\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type = \"text\" name = \"user\" /> <br/>\n");
      out.write("                    </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <b> Password:</b> <br/>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type = \"password\" name = \"pass\"/> <br/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                <br/>\n");
      out.write("                <button type=\"submit\" style=\"border:0px; background:transparent\" />\n");
      out.write("                <img src=\"Images/loginButton.png\" \n");
      out.write("                     onmouseover=\"this.src='Images/loginButtonMouseOver.png';\" \n");
      out.write("                     onmouseout=\"this.src='Images/loginButton.png';\" /></button> \n");
      out.write("\n");
      out.write("                <button type=\"button\" style=\"border:0px; background:transparent\" />\n");
      out.write("                <img src=\"Images/adminButton.png\" \n");
      out.write("                     onmouseover=\"this.src='Images/adminButtonMouseOver.png';\" \n");
      out.write("                     onmouseout=\"this.src='Images/adminButton.png';\" onClick=\"parent.location='adminAccess.jsp'\"/></button>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("       \n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("    </body>\n");
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
