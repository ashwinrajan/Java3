
<%@ page errorPage="errorPage.jsp" %>
<%@ include file="testLogout.jsp" %>

<html>
    <head>
       <style type="text/css">
a:link{text-decoration: none; color: blue; }
body{background-color:black; color:white; font-family:"Comic Sans MS", 
         cursive, sans-serif;}

</style>
        <title>Quiz Portal!</title>
    </head>
    <body>
        <div style="width:200px; margin-left:auto; margin-right:auto">
        <h1 style="color:#00FF00;">Quiz Portal</h1>
    </div>
       
<div style="width: 400px; margin-left:auto; margin-right:auto">
        <%
          String name, username;
    	  Cookie cookie;
          Cookie userScore = new Cookie("currentScore", "0");
          userScore.setMaxAge(-1);
          response.addCookie(userScore);
          
          Cookie[] cookies = request.getCookies();
	  if (cookies !=null){
	  for (int i=0; i < cookies.length; i++) {
		cookie = cookies[i];
		name = cookie.getName();
		if (name.equals("User")){
			username = cookie.getValue();
                out.println("Welcome, " + username + "!");
                }
	   }
          }
          
         session.setAttribute("questionCount", "1");
         session.setAttribute("score", "0");
        %>
        <br/>
        Choose your difficulty level and you can get started!<br/>
       
       <form action="quizRedirect.jsp" method=get>
         <input type="radio" name="difficulty" value="Easy" checked="checked" />&nbsp; Simpleton<br/>
         <input type="radio" name="difficulty" value="Medium" />&nbsp; Smarter Than A 5th Grader<br/>
         <input type="radio" name="difficulty" value="Hard" />&nbsp; Too Smart For Your Own Good<br/>
         <input type="submit" value="Enter!" />
       </form>
        
</div>
    </body>
</html>
