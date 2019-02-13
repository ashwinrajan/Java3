
<%
   try{ 
String authorized = (String)session.getAttribute("authorized");
if (authorized.equals("no")) 
    response.setHeader("Refresh", "0; url=login.jsp");
  
  }
  catch(Exception e){
        e.printStackTrace();
}
%>