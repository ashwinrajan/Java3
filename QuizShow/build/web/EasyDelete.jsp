<%@ page import="sun.jdbc.odbc.JdbcOdbcDriver" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>
<%@ page import="java.util.Scanner" %>

<jsp:useBean id="questDelete" scope="session" class="triviagame.QuestionTrack" />
<jsp:useBean id="difficulty" scope="session" class="triviagame.DifficultyTrack" />


<%! String question, choice1, choice2, choice3, choice4, answer, picPath; %>

<%
    try{
	Connection connection;
	Statement statement;
	ResultSet results;

	connection = DriverManager.getConnection("jdbc:odbc:TriviaGame");
	statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
	

	String getCount = "SELECT COUNT(Question) FROM EasyQuestions";
	results = statement.executeQuery(getCount);
        
	results.first();
	int totalNumQuestions = Integer.parseInt(results.getString(1));
	session.setAttribute("totalQuestions", String.valueOf(totalNumQuestions));

	String query = "SELECT * FROM EasyQuestions";
	results = statement.executeQuery(query);
	
    String alterFile = "C:\\AlterQuestions.txt";
	PrintWriter printWriter = new PrintWriter(new FileOutputStream(alterFile));
	
	for (int i=0; i<totalNumQuestions; i++)
	{
		results.next();
		String q = results.getString(1);
		String c1 = results.getString(2);
		String c2 = results.getString(3);
		String c3 = results.getString(4);
		String c4 = results.getString(5);
		String ans = results.getString(6);
		String pic = results.getString(7);
		
		printWriter.println(q);
		printWriter.println(c1);
		printWriter.println(c2);
		printWriter.println(c3);
		printWriter.println(c4);
		printWriter.println(ans);
		printWriter.println(pic);
	}
		printWriter.close();

		String counter = (String)session.getAttribute("questionNumbers");
		Integer loopCounter = Integer.parseInt(counter);
		
	File questionFileRead = new File(alterFile);
	Scanner scanQuestions = new Scanner(questionFileRead);

	
	for(int j=0; j<loopCounter; j++)
	{
		question = scanQuestions.nextLine();
		choice1 = scanQuestions.nextLine();
		choice2 = scanQuestions.nextLine();
		choice3 = scanQuestions.nextLine();
		choice4 = scanQuestions.nextLine();
		answer = scanQuestions.nextLine();
		picPath = scanQuestions.nextLine();
    } 
 

  }
    catch(Exception e){
        e.printStackTrace();
    }
%>

<jsp:setProperty name="questDelete" property="questionToChange" value="<%= question %>" />


Question:
<br/>
<%= question %>
<br/>
<br/>

Choice 1:
<br/>
<%= choice1 %>
<br/>
<br/>

Choice 2:
<br/>
<%= choice2 %><br/>
<br/>

Choice 3:
<br/>
<%= choice3 %><br/>
<br/>

Choice 4:
<br/>
<%= choice4 %><br/>
<br/>

Answer:
<br/>
<%= answer %>
<br/>
<br/>
<a href="EasyPrevious.jsp"> Previous </a>  &nbsp  <a href="EasyForward.jsp" >Forward </a>
<br/>
<br/>
<a href="DeleteEasyQuestion.jsp">Delete This Question</a>
<br/>
<br/>
<a href="AdminAccess.jsp">Return To Administrator Page</a>