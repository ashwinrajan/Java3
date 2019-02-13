package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
      out.write('\n');
      Bean.Sum sum = null;
      synchronized (_jspx_page_context) {
        sum = (Bean.Sum) _jspx_page_context.getAttribute("sum", PageContext.PAGE_SCOPE);
        if (sum == null){
          sum = new Bean.Sum();
          _jspx_page_context.setAttribute("sum", sum, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("sum"), request);
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head></head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");

            String num1 = sum.getNum1();
            String num2 = sum.getNum2();

            if (num1 == "" || num2 == "") {
        
      out.write("\n");
      out.write("\n");
      out.write("        The sum operation cannot be performed. Please type the correct value.\n");
      out.write("        \n");
      out.write("        ");
} else {
      out.write(" \n");
      out.write("        <strong>The sum of ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((Bean.Sum)_jspx_page_context.findAttribute("sum")).getNum1())));
      out.write("</strong>\n");
      out.write("\n");
      out.write("        <strong>and ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((Bean.Sum)_jspx_page_context.findAttribute("sum")).getNum2())));
      out.write(" is </strong>\n");
      out.write("\n");
      out.write("        <strong>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((Bean.Sum)_jspx_page_context.findAttribute("sum")).getTotal())));
      out.write(" </strong><br>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>  \n");
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
