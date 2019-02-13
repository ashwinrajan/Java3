<%@ page errorPage="errorPage.jsp" %>
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
    
    <h1 style="color:#00FF00;">Thanks for playing!</h1>
<% 
   session.setAttribute("authorized", "no"); 
   session.invalidate();
   response.setHeader("Refresh", "1; url=login.jsp");%>


</body>
</html>