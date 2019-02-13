
<%
    try{
String authorized = (String)session.getAttribute("authorized");
if (authorized.equals("yes")) {
    response.setHeader("Refresh", "0; url=loggedIn.jsp");
     
     }
    }

    catch(Exception e){
        e.printStackTrace();
}
%>