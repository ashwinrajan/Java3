package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PostOrderBean_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!-- Echoes the user's order made in a POST request. \r\n");
      out.write("-->\r\n");
      out.write("\r\n");
      OrderBean sundae = null;
      synchronized (_jspx_page_context) {
        sundae = (OrderBean) _jspx_page_context.getAttribute("sundae", PageContext.PAGE_SCOPE);
        if (sundae == null){
          sundae = new OrderBean();
          _jspx_page_context.setAttribute("sundae", sundae, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("sundae"), request);
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
  
       String[] kinds;    
       int i;
    
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<html>\r\n");
      out.write("<head><title>Ice Cream Servlet</title></head>\r\n");
      out.write("<body><h1><strong>Hi ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((OrderBean)_jspx_page_context.findAttribute("sundae")).getName())));
      out.write("\r\n");
      out.write("</strong></h1><h3>\r\n");
      out.write("\r\n");
      out.write("Got your order for ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((OrderBean)_jspx_page_context.findAttribute("sundae")).getFlavor())));
      out.write(" ice cream<br>\r\n");
      out.write("\r\n");
      out.write("    ");
  kinds = sundae.getToppings(); 
        if (kinds==null) {
      out.write("\r\n");
      out.write("        \r\n");
      out.write("with no toppings.\r\n");
      out.write("    ");
 } else {  
      out.write("\r\n");
      out.write("with <ul>\r\n");
      out.write("    ");
    for(i=0; i<kinds.length; i++) { 
      out.write("\r\n");
      out.write("          <li> ");
      out.print( kinds[i] );
      out.write("\r\n");
      out.write("    ");
 }  
      out.write("\r\n");
      out.write("</ul>\r\n");
      out.write("    ");
  }
       String result = sundae.getPlace();
        if (result.equals("Eat here"))
        {
    
      out.write("\r\n");
      out.write("to eat here.\r\n");
      out.write("    ");
 } else {
      out.write("\r\n");
      out.write("to go  \r\n");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("</h3></body></html>\r\n");
      out.write("\r\n");
      out.write("         ");
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
