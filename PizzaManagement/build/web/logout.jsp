<%-- 
    Document   : logout
    Created on : Nov 27, 2012, 9:24:10 PM
    Author     : Singh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logout</title>
    </head>
    <body>
        <%--<h1 style="color:#00FF00;">See you again</h1> --%>
       <script>
        alert("See you again. Bye!!");
        
    </script>
<% 
   session.setAttribute("authorized", "no"); 
   session.invalidate();
   response.setHeader("Refresh", "0.1; url=index.jsp");%>
    </body>
</html>
