<%@ page import="sun.jdbc.odbc.JdbcOdbcDriver" %>
<%@ page import="java.sql.*" %>

<%
		new JdbcOdbcDriver();
		String path = "jdbc:odbc:TriviaGame";
		Connection connection = DriverManager.getConnection(path);
		Statement statement = connection.createStatement();

		String ques, c1, c2, c3, c4, ans;
		ques = request.getParameter("question");
		c1 = request.getParameter("c1");
		c2 = request.getParameter("c2");
		c3 = request.getParameter("c3");
		c4 = request.getParameter("c4");
		ans = request.getParameter("ans");

		
		String toInsert = "INSERT INTO NormalQuestions VALUES('" + ques + "','" + c1 
			+ "','" + c2 + "','" + c3 + "','" + c4 + "','" + ans + "', 'None1')";
		
		statement.executeUpdate(toInsert);
%>

Question Successfully Added To Database!

<%
		response.setHeader("Refresh", "3; url=AddNormalQuestion.html");
%>
