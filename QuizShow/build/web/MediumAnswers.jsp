
<%@ page errorPage="errorPage.jsp" %>
<!DOCTYPE html>

<html>
    <head>
        <title>
            Answer
        </title>
           <style type="text/css">
a:link{text-decoration: none; color: blue; }
body{background-color:black; color:white; font-family:"Comic Sans MS", 
         cursive, sans-serif;}
div{width:500px;
     margin-left:45%;
     margin-top:20%;}

</style>
    </head>    
    <body>
<% 
    String name;
    Integer currentScore;
    Cookie cookie;
    Cookie[] cookies = request.getCookies();
    String userAnswer = request.getParameter("answers");
    
    String answer = (String)session.getAttribute("answer");
   
    String score = (String)session.getAttribute("score");
    Integer newScore = Integer.parseInt(score);
    
     if(userAnswer.equalsIgnoreCase(answer)){
       if (cookies !=null){
	  for (int i=0; i < cookies.length; i++) {
		cookie = cookies[i];
		name = cookie.getName();
		if (name.equals("currentScore")){
			currentScore = Integer.parseInt(cookie.getValue());
                        currentScore++;
                        cookie.setValue(String.valueOf(currentScore));
                }
           }
        }
       out.println("<div>");
       out.println("<h1 style=color:#00FF00;>CORRECT!</h1></div>");
       newScore++;
       session.setAttribute("score", String.valueOf(newScore));
       
       response.setHeader("Refresh", "1.5; url=MediumQuestions.jsp");
    }
    else
       out.println("<div><h1 style=color:red>WRONG!</h1></div>");
    
    response.setHeader("Refresh", "1.5; url=MediumQuestions.jsp");
    
%>
    </body>
</html>