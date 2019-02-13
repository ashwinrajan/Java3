<%-- 
    Document   : page1
    Created on : Nov 15, 2012, 5:05:46 PM
    Author     : Singh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>After Login</title>
    </head>
    <body>
        <center><img src = "Images/pizzalogo.png" /></center><br> 
        <form action="index.jsp,logout.jsp" method="POST">
            <center><input type="button" name="order" value="Order" onclick="parent.location='order.jsp'"/></center>
        
            <center><input type="button" name="inventory" value="Inventory"></center>
            <center><input type="button" name="view" value="View"></center>
        
            <center><input type="button" name="logout" value="Logout" onClick="parent.location='logout.jsp'"/></center>
        </form>
    </body>
</html>
