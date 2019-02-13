package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Account_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      Bean.bean order = null;
      synchronized (_jspx_page_context) {
        order = (Bean.bean) _jspx_page_context.getAttribute("order", PageContext.PAGE_SCOPE);
        if (order == null){
          order = new Bean.bean();
          _jspx_page_context.setAttribute("order", order, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("order"), request);
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head></head>\n");
      out.write("<body>\n");
      out.write("    <strong>The account information has been added.</strong><br>\n");
      out.write("    <strong>The Account information is being retrieved.</strong><br>\n");
      out.write("    <strong>Name: ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((Bean.bean)_jspx_page_context.findAttribute("order")).getName())));
      out.write("</strong><br>\n");
      out.write("    ");
      out.write("\n");
      out.write("    \n");
      out.write("    <strong>Balance: ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((Bean.bean)_jspx_page_context.findAttribute("order")).getBalance())));
      out.write("</strong><br>\n");
      out.write("    <strong>Preferred?: </strong>\n");
      out.write("    \n");
      out.write("    ");
  
            String result = order.getRadio();

            if (result.equals ("yes"))
            {
        
      out.write("\n");
      out.write("        true\n");
      out.write("        ");
 } else {
      out.write("\n");
      out.write("        false  \n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("        </body>\n");
      out.write("</html>    \n");
      out.write("    \n");
      out.write("    ");
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
