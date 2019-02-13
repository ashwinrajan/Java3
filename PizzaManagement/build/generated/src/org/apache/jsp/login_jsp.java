package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=iso-8859-1");
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

    String error = request.getParameter("error");
    if (error == null || error == "null") {
        error = "";
    }

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>User Login JSP</title>\n");
      out.write("        <script>\n");
      out.write("            function trim(s) \n");
      out.write("            {\n");
      out.write("                return s.replace( /^\\s*/, \"\" ).replace( /\\s*$/, \"\" );\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function validate()\n");
      out.write("            {\n");
      out.write("                if(trim(document.frmLogin.sUserName.value)==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Login empty\");\n");
      out.write("                    document.frmLogin.sUserName.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if(trim(document.frmLogin.sPwd.value)==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"password empty\");\n");
      out.write("                    document.frmLogin.sPwd.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div>");
      out.print(error);
      out.write("</div>\n");
      out.write("        <form name=\"frmLogin\" onSubmit=\"return validate();\" action=\"doLogin.jsp\" method=\"post\">\n");
      out.write("            User Name <input type=\"text\" name=\"sUserName\" /><br />\n");
      out.write("            Password <input type=\"password\" name=\"sPwd\" /><br />\n");
      out.write("            <input type=\"submit\" name=\"sSubmit\" value=\"Submit\" />\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
