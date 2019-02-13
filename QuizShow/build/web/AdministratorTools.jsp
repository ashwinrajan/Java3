
<%@page import="sun.jdbc.odbc.JdbcOdbcDriver" %>
<%@ page import="java.sql.*" %>


<%
		new JdbcOdbcDriver();
		String path = "jdbc:odbc:TriviaGame";
		String user = "";
		String password = "";
		Connection connection = DriverManager.getConnection(path, user, password);
		Statement statement = connection.createStatement();

		int questionDelete = Integer.parseInt(request.getParameter("QuestionDelete"));
		
		String query = "DELETE FROM EasyQuestions WHERE QuestionNumber= " + questionDelete;
		statement.executeUpdate(query);
%>

Question To Delete:
<br/>
<br/>
<%= questionDelete %>