<!DOCTYPE html>
<%@ page import="java.sql.*" %>  
<%@ page import="java.util.Vector" %>
<%@ page import="java.util.Random" %>
<%@ page import="java.io.*" %>
<%@ page import="java.util.Scanner" %>
 <%@ page errorPage="errorPage.jsp" %>

<% 
   String question = (String)session.getAttribute("questionCount");
   Integer questionNumber = Integer.parseInt(question);
%>

<html>
<head>

<title>Quiz</title>
 <style type="text/css">
a:link{text-decoration: none; color: blue; }
body{background-color:black; color:white; font-family:"Comic Sans MS", 
         cursive, sans-serif;}

</style>
</head>
<body>
 <div style="width:200px; margin-left:auto; margin-right:auto">
        <h1 style="color:#00FF00;">Question&nbsp;<%= questionNumber %></h1>
    </div>



<% if(questionNumber == 11)
     response.sendRedirect("endOfQuiz.jsp");
     
    
%>


<%! String testRead, testRead2; %>
<%! String question, choice1, choice2, choice3, choice4, answer, picPath; %>

<%
    try{
	Connection connection;
	Statement statement;
	ResultSet results;

	connection = DriverManager.getConnection("jdbc:odbc:TriviaGame");
	statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
	

	String getCount = "SELECT COUNT(Question) FROM NormalQuestions";
	results = statement.executeQuery(getCount);
        
	results.first();
	//int totalNumQuestions = Integer.parseInt(results.getString(1));

	String query = "SELECT * FROM NormalQuestions";
	results = statement.executeQuery(query);
	
        String questionFile = "C:\\Questions.txt";
	PrintWriter printWriter = new PrintWriter(new FileOutputStream(questionFile));
	
	for (int i=0; i<10; i++)
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
		
	File questionFileRead = new File(questionFile);
	Scanner scanQuestions = new Scanner(questionFileRead);

	
	for(int j=0; j<questionNumber; j++)
	{
		question = scanQuestions.nextLine();
		choice1 = scanQuestions.nextLine();
		choice2 = scanQuestions.nextLine();
		choice3 = scanQuestions.nextLine();
		choice4 = scanQuestions.nextLine();
		answer = scanQuestions.nextLine();
		picPath = scanQuestions.nextLine();
                session.setAttribute("answer", answer);
               
                
	}
      
        ++questionNumber;
         session.setAttribute("questionCount", String.valueOf(questionNumber));
      
           
  }
    catch(Exception e){
        e.printStackTrace();
    }
%>

<div style="width: 500px; margin-left:auto; margin-right: auto;">
<form action="MediumAnswers.jsp" method="post">

<br/>
<%= question %>
<br/>
<br/>

Choice 1:
<br/>
<input type="radio" name="answers" checked="checked" value="<%= choice1 %>"  /><%= choice1 %>
<br/>
<br/>

Choice 2:
<br/>
<input type="radio" name="answers" value="<%= choice2 %>"/><%= choice2 %>
<br/>
<br/>

Choice 3:
<br/>
<input type="radio" name="answers" value="<%= choice3 %>"/><%= choice3 %>
<br/>
<br/>

Choice 4:
<br/>
<input type="radio" name="answers" value="<%= choice4 %>"/><%= choice4 %>
<br/>
<br/>

<input type="submit" value="Answer"/>
</form>
<div style="float:left; margin-left:300px; margin-top:-270px; position: 
relative; width:250px; z-index: 0"><img src="Pics/<%= picPath %>.jpg" width="250px" 
height="250px"/> </div>
    
</div>
</body>
</html>
