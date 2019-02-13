
<%@page import="java.sql.*"%>
<%!
  Connection connection;
  PreparedStatement preparedStatement;
  ResultSet resultset;
  Statement statement;
  
  PreparedStatement pStatement;
  ResultSet rs;
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
    
       
      preparedStatement = connection.prepareStatement("Select NumberTimesChosen from GameStats where Difficulty= ?");   
       pStatement = connection.prepareStatement("Update GameStats set NumberTimesChosen = ? Where Difficulty= ?");         
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
      pStatement.close();
      preparedStatement.close();
      connection.close();  
    }
    catch (SQLException e) 
    {
      e.printStackTrace();
    }
  }
%>