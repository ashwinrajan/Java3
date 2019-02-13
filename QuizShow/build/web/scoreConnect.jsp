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
      preparedStatement = connection.prepareStatement("SELECT score FROM Users WHERE Username = ?");   
      statement = connection.createStatement();            
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