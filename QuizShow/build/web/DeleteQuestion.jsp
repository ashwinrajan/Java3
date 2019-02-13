<%@ page import="sun.jdbc.odbc.JdbcOdbcDriver" %>
<%@ page import="java.sql.*" %>

<jsp:useBean id="questDelete" scope="session" class="triviagame.QuestionTrack" />
<jsp:useBean id="difficulty" scope="session" class="triviagame.DifficultyTrack" />

<jsp:getProperty name="questDelete" property="questionToChange"/>



<%
		new JdbcOdbcDriver();
		String path = "jdbc:odbc:TriviaGame";
		Connection connection = DriverManager.getConnection(path);
		Statement statement = connection.createStatement();

		String delString = questDelete.getQuestionToChange();

		String toDelete = "DELETE FROM EasyQuestions WHERE Question='" + delString + "'";
		
		statement.executeUpdate(toDelete);
%>

Question Successfully Deleted From The Database!

<%
		response.setHeader("Refresh", "3; url=BrowseDelete.jsp");
%>


