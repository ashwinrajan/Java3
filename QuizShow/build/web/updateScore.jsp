
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
      resultset = statement.executeQuery("Select * from Users");
      preparedStatement = connection.prepareStatement("Update Users Set Score = ? WHERE Username = ?");   
                  
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