
<%@ page import="java.sql.*" %>

<%!
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
%>

<%
  username = request.getParameter("username");
  password = request.getParameter("password");
  if (username == null)
   out.println("Please enter a valid username!");
  if (password == null)
      out.println("Please enter a valid password!");
%>    

<html>

<head>

<title>

Quiz Show
</title>

<style type="text/css">
a:link{text-decoration: none; color: blue; }
</style>

</head>

<body>


<div style="margin-right:auto; margin-left:auto; margin-top: 10%; margin-bottom: 
auto; width: 30%">



<form action="index.jsp">


Username: <input type="text" name="username" value="" /><br/>
Password: <input type="password" name="password" value="" /><br/><br />

<div style="margin-left: 10%;"><input type="submit" name="Submit" value="Submit" 
/>&nbsp;<input type="reset" name="Reset" Value="Reset" /></div>
</form>

<span style="margin-left:4%">First time users please <a 
href="register.html">register</a></span>


</div>


</body>

</html>

<%
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
%>