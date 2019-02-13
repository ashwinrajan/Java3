<%@ page import="sun.jdbc.odbc.JdbcOdbcDriver" %>
<%@ page import="java.sql.*" %>

<%
		new JdbcOdbcDriver();
		String path = "jdbc:odbc:TriviaGame";
		Connection connection = DriverManager.getConnection(path);
		Statement statement = connection.createStatement();
		ResultSet result = statement.executeQuery("SELECT * FROM GameStats");

		
		int eTimesChosen, eNumQuestAsked, eNumCorrect, ePercentCorrect;
		int nTimesChosen, nNumQuestAsked, nNumCorrect, nPercentCorrect;
		int hTimesChosen, hNumQuestAsked, hNumCorrect, hPercentCorrect;

		result.next();
		eTimesChosen = Integer.parseInt(result.getString(2));
		eNumQuestAsked = eTimesChosen * 10;
		eNumCorrect = Integer.parseInt(result.getString(3));
		ePercentCorrect = eNumCorrect / 1;

		result.next();
		nTimesChosen = Integer.parseInt(result.getString(2));
		nNumQuestAsked = nTimesChosen * 10;
		nNumCorrect = Integer.parseInt(result.getString(3));
		nPercentCorrect = nNumCorrect / 1;
		
		result.next();
		hTimesChosen = Integer.parseInt(result.getString(2));
		hNumQuestAsked = hTimesChosen * 10;
		hNumCorrect = Integer.parseInt(result.getString(3));
		hPercentCorrect = hNumCorrect / 1;

%>

<h1>Here Are The Statistics For The Trivia Game:</h1>

<br/>
<br/>
<u>Easy Difficulty</u>
<br/>
<br/>
Times Chosen: <%=eTimesChosen%>
<br/>
Number of Questions Asked: <%=eNumQuestAsked%>
<br/>
Number of Questions Correct: <%=eNumCorrect%>
<br/>
% of Questions Correct: <%=ePercentCorrect%>
<br/>
<br/>

<u>Normal Difficulty</u>
<br/>
<br/>
Times Chosen: <%=nTimesChosen%>
<br/>
Number of Questions Asked: <%=nNumQuestAsked%>
<br/>
Number of Questions Correct: <%=nNumCorrect%>
<br/>
% of Questions Correct: <%=nPercentCorrect%>
<br/>
<br/>

<u>Hard Difficulty</u>
<br/>
<br/>
Times Chosen: <%=hTimesChosen%>
<br/>
Number of Questions Asked: <%=hNumQuestAsked%>
<br/>
Number of Questions Correct: <%=hNumCorrect%>
<br/>
% of Questions Correct: <%=hPercentCorrect%>
<br/>
<br/>