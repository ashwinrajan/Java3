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
      BeanClass.Bean stringBean = null;
      synchronized (_jspx_page_context) {
        stringBean = (BeanClass.Bean) _jspx_page_context.getAttribute("stringBean", PageContext.PAGE_SCOPE);
        if (stringBean == null){
          stringBean = new BeanClass.Bean();
          _jspx_page_context.setAttribute("stringBean", stringBean, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("<OL>\n");
      out.write("<LI>Initial value (getProperty):\n");
      out.write("    <I>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString(org.apache.jasper.runtime.JspRuntimeLibrary.handleGetProperty(_jspx_page_context.findAttribute("name"), "message")));
      out.write("</I>\n");
      out.write("<LI>Initial value (JSP expression):\n");
      out.write("    <I>");
      out.print( stringBean.getMessage() );
      out.write("</I>\n");
      out.write("<LI>");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("ssn"), "message", "Yes", null, null, false);
      out.write("\n");
      out.write("    Value after setting property with setProperty:\n");
      out.write("    <I>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString(org.apache.jasper.runtime.JspRuntimeLibrary.handleGetProperty(_jspx_page_context.findAttribute("balance"), "message")));
      out.write("</I>\n");
      out.write("    \n");
      out.write("<LI>");
stringBean.setMessage("My favorite: Kentucky Wonder");
      out.write("\n");
      out.write("    Value after setting property with scriptlet:\n");
      out.write("    <I>");
      out.print( stringBean.getMessage() );
      out.write("</I>\n");
      out.write(" </OL>\n");
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
