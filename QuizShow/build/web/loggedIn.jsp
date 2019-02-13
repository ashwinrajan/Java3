

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>

 <style type="text/css">
a:link{text-decoration: none; color: blue; }
body{background-color:black; color:white; font-family:"Comic Sans MS", 
         cursive, sans-serif;}

</style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Oops!</title>
    </head>
    <body>

<div style="width:500px; margin-left:auto; margin-right:auto">
        <h1 style="color:#00FF00;">You're already logged in. Get back there!</h1>
    </div>
       
    </body>
</html>
<%
   response.setHeader("Refresh", "1.5; url=QuizPortal.jsp");
%>