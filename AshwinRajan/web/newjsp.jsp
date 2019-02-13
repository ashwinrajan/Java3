<%-- 
    Document   : newjsp
    Created on : Dec 4, 2012, 2:04:08 PM
    Author     : Ashwin Rajan
--%>

<%-- declare bean object --%>
<jsp:useBean id="sum"  class="Bean.Sum" />
<jsp:setProperty name="sum" property="*" />

<html>
    <head></head>
    <body>

        <%
            String num1 = sum.getNum1();
            String num2 = sum.getNum2();

            if (num1 == null || num2 == null) {
        %>

        The sum operation cannot be performed. Please type the correct value.<br>
        <button type="button" onclick="history.back();">Try again</button>

        <%} else {%> 
        <strong>The sum of <jsp:getProperty name="sum" property="num1" /></strong>

        <strong>and <jsp:getProperty name="sum" property="num2" /></strong>

        <strong>is <jsp:getProperty name="sum"  property="total" />.</strong><br>

        <button type="button" onclick="history.back();">Try again</button>

        <%}%>

    </body>
</html>  
