package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head><title>Session Order</title></head>\n");
      out.write("<body>\n");
      out.write("<form action=\"http://localhost:8080/SessionOrderDemo/SessionOrder\" method=GET>\n");
      out.write("  <strong><h3>Choose the items you would like to order.</h3></strong><p>\n");
      out.write("      <input type=checkbox name=Order value=\"Java Book\">          Java Book       <br>\n");
      out.write("      <input type=checkbox name=Order value=\"Baseball\">           Baseball        <br>\n");
      out.write("      <input type=checkbox name=Order value=\"Bicycle\">            Bicycle         <br>\n");
      out.write("      <input type=checkbox name=Order value=\"Dress\">              Dress           <br>\n");
      out.write("      <input type=checkbox name=Order value=\"Shirt\">              Shirt           <br>\n");
      out.write("      <input type=checkbox name=Order value=\"Shoes\">              Shoes           <br>\n");
      out.write("      <input type=checkbox name=Order value=\"Theater tickets\">    Theater tickets <br>\n");
      out.write("      <input type=checkbox name=Order value=\"Compact disk\">       Compact disk    <br>\n");
      out.write("      <input type=checkbox name=Order value=\"Cellular phone\">     Cellular phone  <br>\n");
      out.write("      <input type=checkbox name=Order value=\"Computer\">           Computer        <p>\n");
      out.write("      <input type=submit value=\"Order\">\n");
      out.write("      <input type=reset>\n");
      out.write("</form></body></html>");
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
