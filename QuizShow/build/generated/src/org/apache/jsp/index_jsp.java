package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


  Connection connection;
  PreparedStatement preparedStatement;
  ResultSet resultset;

  String username;
  String password;
 
  public void jspInit() 
  {
    try 
    {
      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    }
    catch (ClassNotFoundException e) 
    {
      e.printStackTrace();
    }
    
    try 
    {
      connection = DriverManager.getConnection("jdbc:odbc:TriviaGame");
      preparedStatement = connection.prepareStatement("SELECT username, password FROM Users WHERE username = ?");          
    }
    catch (SQLException e) 
    {
      e.printStackTrace();
    }
    
   }
  
  public void jspDestroy() 
  {
    try 
    {
      resultset.close();
      preparedStatement.close();
      connection.close();  
    }
    catch (SQLException e) 
    {
      e.printStackTrace();
    }
  }

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
      out.write("\n");
      out.write('\n');
      out.write('\n');

  username = request.getParameter("username");
  password = request.getParameter("password");
  if (username == null)
   out.println("Please enter a valid username!");
  if (password == null)
      out.println("Please enter a valid password!");

      out.write("    \n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("<title>\n");
      out.write("\n");
      out.write("Quiz Show\n");
      out.write("</title>\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("a:link{text-decoration: none; color: blue; }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div style=\"margin-right:auto; margin-left:auto; margin-top: 10%; margin-bottom: \n");
      out.write("auto; width: 30%\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<form action=\"index.jsp\">\n");
      out.write("\n");
      out.write("\n");
      out.write("Username: <input type=\"text\" name=\"username\" value=\"\" /><br/>\n");
      out.write("Password: <input type=\"password\" name=\"password\" value=\"\" /><br/><br />\n");
      out.write("\n");
      out.write("<div style=\"margin-left: 10%;\"><input type=\"submit\" name=\"Submit\" value=\"Submit\" \n");
      out.write("/>&nbsp;<input type=\"reset\" name=\"Reset\" Value=\"Reset\" /></div>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("<span style=\"margin-left:4%\">First time users please <a \n");
      out.write("href=\"register.html\">register</a></span>\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");

  try 
  {
    if (!username.equals(null) && !password.equals(null)) 
    {
      preparedStatement.setString(1,username);
      resultset = preparedStatement.executeQuery();
      if (resultset.next()) 
        if(username.equals(resultset.getString(1)) && password.equals(resultset.getString(2)))
				response.sendRedirect("QuizPortal.jsp");
                     
		
      else
        out.println("Invalid Login Information"); 
        
    }
  }
  catch (SQLException s) 
  {
    s.printStackTrace();
  }  

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
