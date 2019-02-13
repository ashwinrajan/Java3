
<%@page import="java.io.PrintWriter"%>
<%@page isErrorPage="true" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<title>Error!</title>
 <style type="text/css">
a:link{text-decoration: none; color: blue; }
body{background-color:black; color:white; font-family:"Comic Sans MS", 
         cursive, sans-serif;}

</style>
</head>
<body>
   The following error has been reported:
   <i><%= exception %></i>. Here are the details:<br/>

<% exception.printStackTrace(new PrintWriter(out)); %>

</BODY>
</HTML>

