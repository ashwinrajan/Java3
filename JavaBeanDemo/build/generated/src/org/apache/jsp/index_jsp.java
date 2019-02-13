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
      out.write("        <FORM ACTION=\"http://localhost:8080/JavaBeanDemo/PostOrderBean\">\n");
      out.write("\n");
      out.write("            <strong>Name:</strong>       <input type=text name=name size=20><br>       \n");
      out.write("            <strong>Password:</strong>   <input type=password name=password size=12><p>\n");
      out.write("                <strong>Flavor:</strong>\n");
      out.write("                <select name=flavor size=3>\n");
      out.write("                    <option>Vanilla\n");
      out.write("                    <option>Chocolate\n");
      out.write("                    <option>Strawberry\n");
      out.write("                </select><p>\n");
      out.write("                <strong>Toppings:</strong>\n");
      out.write("                <input type=checkbox name=toppings value=\"Hot Fudge\">    Hot Fudge\n");
      out.write("                <input type=checkbox name=toppings value=Butterscotch>   Butterscotch\n");
      out.write("                <input type=checkbox name=toppings value=Nuts>           Nuts\n");
      out.write("            <input type=checkbox name=toppings value=\"Whipped Cream\">Whipped Cream<p>\n");
      out.write("                <input type=radio name=place value=\"Eat here\"> Eat here\n");
      out.write("            <input type=radio name=place value=\"Take out\"> Take out<p>\n");
      out.write("                <input type=submit value=\"Order\">\n");
      out.write("                <input type=reset>\n");
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
