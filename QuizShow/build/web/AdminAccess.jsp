<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>
		Administrative Access
	</title>
    </head>
    <body>
        <form action="AdministratorTools.jsp" method="post">
        	What task would you like to perform?
		<br/>
		<br/>
		<br/>
         <%
		   session.setAttribute("questionNumbers", "1");
		 %>
		<a href="SelectDelete.jsp">Delete A Question</a>
		<br/>
		<br/>
		<a href="SelectAdd.jsp">Add A Question</a>
		<br/>
		<br/>
		<a href="PrintReport.jsp">Print Game Statistics Report</a>
		<br/>
		<br/>               
	</form>
    </body>
</html>