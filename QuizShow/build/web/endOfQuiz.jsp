
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page errorPage="errorPage.jsp" %>
   <%@include file="updateScore.jsp" %>
<!DOCTYPE html>
<html>
<head>

<title>Results!</title>
 <style type="text/css">
a:link{text-decoration: none; color: blue; }
body{background-color:black; color:white; font-family:"Comic Sans MS", 
         cursive, sans-serif;}
div{width:500px;
     margin-left:32%;
     margin-top:10%;}

</style>
</head>
<body>
    
    <div>
        <h1 style="color:#00FF00;">Here Are Your Results!</h1>
              
        
      <%! Integer finalScore;  
            Integer incorrect;
            Integer points;
            String name, username;
            int oldScore, newScore;
        %>
        <%
           
    	  Cookie cookie;
            
            String score = (String)session.getAttribute("score");
            finalScore = Integer.parseInt(score);
            incorrect = 10 - finalScore;
            points = finalScore * 100;
             Cookie[] cookies = request.getCookies();
	  if (cookies !=null){
	  for (int i=0; i < cookies.length; i++) {
		cookie = cookies[i];
		name = cookie.getName();
		if (name.equals("User")){
			username = cookie.getValue();
                       
                }
	   }
          }
             
             while(resultset.next()){
               if(resultset.getString(1).equals(username)){
                   oldScore = resultset.getInt(3);
               }   
             }
             
             newScore = oldScore + finalScore;
             
             preparedStatement.setString(1, String.valueOf(newScore));
             preparedStatement.setString(2, username);
             preparedStatement.executeUpdate();
           
                    
        %>
        <h3 style="color:blue">Correct Answer(s): </h3><%=finalScore %><br/>
        <h3 style="color:blue">Incorrect Answers: </h3><%=incorrect %> <br/>
        <h3 style="color:blue">Points This Round: </h3><%=points%><br/>
        
		<br/>
        <form action="leaderboard.jsp" method="get">
            <input type="submit" value="Leaderboard" />
        </form>
    </div>
    </body>
</html>
