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
      out.write("<HEAD>\n");
      out.write("<TITLE>A Sample FORM using POST</TITLE>\n");
      out.write("</HEAD>\n");
      out.write("<BODY BGCOLOR=\"#FDF5E6\">\n");
      out.write("<H1 ALIGN=\"CENTER\">A Sample FORM using POST</H1>\n");
      out.write("<FORM ACTION=\"http://localhost:8080/ShowParameters/ShowParameters\" METHOD=\"POST\">\n");
      out.write("Item Number: <INPUT TYPE=\"TEXT\" NAME=\"itemNum\"><BR>\n");
      out.write("Quantity: <INPUT TYPE=\"TEXT\" NAME=\"quantity\"><BR>\n");
      out.write("Price Each: <INPUT TYPE=\"TEXT\" NAME=\"price\" VALUE=\"$\"><BR>\n");
      out.write("<HR>\n");
      out.write("First Name: <INPUT TYPE=\"TEXT\" NAME=\"firstName\"><BR>\n");
      out.write("Last Name: <INPUT TYPE=\"TEXT\" NAME=\"lastName\"><BR>\n");
      out.write("Middle Initial: <INPUT TYPE=\"TEXT\" NAME=\"initial\"><BR>\n");
      out.write("Shipping Address:\n");
      out.write("<TEXTAREA NAME=\"address\" ROWS=3 COLS=40></TEXTAREA><BR>\n");
      out.write("Credit Card:<BR>\n");
      out.write("&nbsp;&nbsp;<INPUT TYPE=\"RADIO\" NAME=\"cardType\"\n");
      out.write("VALUE=\"Visa\">Visa<BR>\n");
      out.write("&nbsp;&nbsp;<INPUT TYPE=\"RADIO\" NAME=\"cardType\"\n");
      out.write("VALUE=\"Master Card\">Master Card<BR>\n");
      out.write("&nbsp;&nbsp;<INPUT TYPE=\"RADIO\" NAME=\"cardType\"\n");
      out.write("VALUE=\"Amex\">American Express<BR>\n");
      out.write("&nbsp;&nbsp;<INPUT TYPE=\"RADIO\" NAME=\"cardType\"\n");
      out.write("VALUE=\"Discover\">Discover<BR>\n");
      out.write("&nbsp;&nbsp;<INPUT TYPE=\"RADIO\" NAME=\"cardType\"\n");
      out.write("VALUE=\"Java SmartCard\">Java SmartCard<BR>\n");
      out.write("Credit Card Number:\n");
      out.write("<INPUT TYPE=\"PASSWORD\" NAME=\"cardNum\"><BR>\n");
      out.write("Repeat Credit Card Number:\n");
      out.write("<INPUT TYPE=\"PASSWORD\" NAME=\"cardNum\"><BR><BR>\n");
      out.write("<CENTER>\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Submit Order\">\n");
      out.write("</CENTER>\n");
      out.write("</FORM>\n");
      out.write("</BODY>\n");
      out.write("</HTML>");
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
