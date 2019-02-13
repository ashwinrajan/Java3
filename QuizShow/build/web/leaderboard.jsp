
<%@ page errorPage="errorPage.jsp" %>
<%@include file="leaderboardConnect.jsp" %>
<%@ include file="testLogout.jsp" %>


<%! String username;
    Integer userScore;
    
    %>
    

    
    <html>
<head>

<title>Quiz</title>
 <style type="text/css">
a:link{text-decoration: none; color: blue; }
body{background-color:black; color:white; font-family:"Comic Sans MS", 
         cursive, sans-serif;}

div{width:500px;margin-left:35%;}
h1{
  margin-left:44%;
}

</style>


</head>
<body>
    
      <h1 style="color:#00FF00;">Leaderboard</h1>
<div>
  
    <table border="1" width="400px">
               <tr><td align="center" style="color:blue">Contestant</td><td align="center" style="color:blue">Score</td></tr>
        
                <%
                    while(resultset.next()){
                        out.println("<tr><td align=center>" + resultset.getString(1) + "</td>");
                        out.println("<td align=center>" + (resultset.getInt(2) * 100) + "</td></tr>");
                    }
                %>                                 
                
           
    </table>
                
                <form action="QuizPortal.jsp" method="post">
                    <input type="submit" value="Play Again?" />
                    <input type="button" value="Logout" onClick="parent.location='logout.jsp'"/>
                    
                </form>
                </div>
</body>
    </html>