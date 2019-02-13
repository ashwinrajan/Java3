
<%@page import="java.sql.*"%>
<%@ page errorPage="errorPage.jsp" %>
<%!
  Connection connection;
  PreparedStatement preparedStatement;
  ResultSet resultset;

  String username = "";
  String password = "" ;
  
 
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
      preparedStatement = connection.prepareStatement("SELECT Username, Password "
              + "FROM Admin WHERE Username = ? and password= ?");          
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
%>

<html>

<head>

<title>

Quiz Show
</title>

<style type="text/css">
a:link{text-decoration: none; color: blue; }
body{background-color:black; color:white; font-family:"Comic Sans MS", 
         cursive, sans-serif;}

</style>
<!--[if lt IE 9]>
<script src="http://ie7-js.googlecode.com/svn/version/2.1(beta4)/IE9.js"></script>
<![endif]-->
</head>

<body>
   <div style="width:200px; margin-left:38%; margin-right:auto; margin-top:2%">
        <h1 style="color:#00FF00;">Admin Login</h1>
    </div>
<div style="margin-right:auto; margin-left:auto; margin-top: 8%; margin-bottom: 
auto; width: 30%">
  
<form action="adminLogin.jsp" method="post">


Username: <input type="text" name="username" value="" /><br/>
Password: &nbsp;<input type="password" name="password" value="" /><br/><br />

<div style="margin-left: 10%;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" 
value="Login" 
/>
<input type="reset" name="Reset" Value="Reset" /></div>
</form>




</div>


<%

  username = request.getParameter("username");
  password = request.getParameter("password");
  Cookie cookie = new Cookie("User", username);
  cookie.setMaxAge(-1);
  

  try 
  {
    if (username != null && password != null) 
    {
      preparedStatement.setString(1,username);
      preparedStatement.setString(2, password);
      resultset = preparedStatement.executeQuery();
      if (resultset.next()) {
             session.setAttribute("authorized", "yes");
              response.setHeader("Refresh", "0; url=AdminAccess.jsp");
		response.addCookie(cookie);
              }      
                              
           else{
          %>
          
          <div style="margin-right:auto; margin-left:auto; margin-top: -12%; margin-bottom: 
auto; width: 30%; color:red">Invalid Login Information</div> 
          

       
       </body>

</html>
       <%
           
        }
     }
  }
  catch (Exception s) 
  {
    s.printStackTrace();
  }  
%>

