<%@ page import="java.sql.*" %>
<%@ page errorPage="errorPage.jsp" %>
<%!
  Connection connection;
  PreparedStatement preparedStatement;
  ResultSet resultset;
  Statement statement;
 
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
      statement = connection.createStatement();  
      resultset = statement.executeQuery("SELECT username, score FROM Users Order by score DESC");   
                
    }
    catch (SQLException e) 
    {
      e.printStackTrace();
    }
    
   }
  
 
%>