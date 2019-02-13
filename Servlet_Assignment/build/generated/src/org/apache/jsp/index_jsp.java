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

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\n");
      out.write("<HTML>\n");
      out.write("    <HEAD><TITLE>Post Order</TITLE></HEAD>\n");
      out.write("    <BODY BGCOLOR=\"#FDF5E6\">\n");
      out.write("\n");
      out.write("        <FORM ACTION=\"http://localhost:8080/Servlet_Assignment/PostOrder\">\n");
      out.write("            <CENTER>\n");
      out.write("                <IMG src=\"http://www.thaindian.com/images/Restaurants/india_hut_logo.jpg\" width=\"200\" height=\"200\"><BR><BR>  \n");
      out.write("            </CENTER>    \n");
      out.write("            <B>Name:</B>      <INPUT type=\"text\" name=\"name\"><BR>\n");
      out.write("            <B>Password:</B>  <INPUT type=\"password\" name=\"password\"><BR><BR>\n");
      out.write("\n");
      out.write("            <B>Flavor:</B>    <SELECT name=\"flavor\">\n");
      out.write("                              <OPTION value=\"Vanilla\">Vanilla</OPTION>\n");
      out.write("                              <OPTION value=\"Chocolate\">Chocolate</OPTION>\n");
      out.write("                              <OPTION value=\"Strawberry\">Strawberry</OPTION>\n");
      out.write("                              </SELECT><BR><BR>\n");
      out.write("\n");
      out.write("            <B>Toppings:</B>  <INPUT type=\"checkbox\" name=\"toppings\" value=\"Hot Fudge\">Hot Fudge\n");
      out.write("                              <INPUT type=\"checkbox\" name=\"toppings\" value=\"Butterscotch\">Butterscotch \n");
      out.write("                              <INPUT type=\"checkbox\" name=\"toppings\" value=\"Nuts\">Nuts\n");
      out.write("                              <INPUT type=\"checkbox\" name=\"toppings\" value=\"Whipped Cream\">Whipped Cream<BR><BR>\n");
      out.write("                       \n");
      out.write("            <INPUT type=\"radio\" name=\"group1\" value=\"eat here\">Eat Here\n");
      out.write("            <INPUT type=\"radio\" name=\"group1\" value=\"take out\">Take Out<BR><BR>\n");
      out.write("\n");
      out.write("            <INPUT type=\"submit\" value=\"Order\"> <!-- Press this to submit form -->\n");
      out.write("            <INPUT type=\"reset\">\n");
      out.write("\n");
      out.write("        </FORM>\n");
      out.write("    </BODY></HTML>\n");
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
