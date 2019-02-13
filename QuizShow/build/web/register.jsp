<%@ page import="java.sql.*" %>
<%@ page errorPage="errorPage.jsp" %>
<%@include file="registerConnect.jsp" %>
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
        
<%
  try{ 
  String username = "";
  String password = "";
  
  
  username = request.getParameter("username");
  password = request.getParameter("password") ;
  if(username == "" || password == ""){
        out.println("Please complete all fields to register.");
         response.setHeader("Refresh", "1.5; url=register.html");
        
         }
      if((username != "") && (password != "")){
      preparedStatement.setString(1,username);
      resultset = preparedStatement.executeQuery();
        if(resultset.next()){
           out.println("Username already exists! Please select another.");
           response.setHeader("Refresh", "1.5; url=register.html");
        }
      
           else{
         statement.executeUpdate("Insert into Users values('" + username +
                  "', '" + password + "', 0)"); 
          out.println("Welcome, " + username + "!");
          Cookie cookie = new Cookie("User", username);
          cookie.setMaxAge(-1);
          response.addCookie(cookie);
          response.setHeader("Refresh", "1.5; url=QuizPortal.jsp");
         
                 }
     }
    
   }
   
  catch(Exception e){
      e.printStackTrace();
  }

%>
           
    </body>
</html>
           