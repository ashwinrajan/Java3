

<%-- declare bean object --%>
<jsp:useBean id="order"  class="Bean.bean" />
<jsp:setProperty name="order" property="*" />

<html>
<head></head>
<body>
    <strong>The account information has been added.</strong><br>
    <strong>The Account information is being retrieved.</strong><br>
    <strong>Name: <jsp:getProperty name="order" property="name" /></strong><br>
    <%--<strong>SSN: <jsp:getProperty name="order" property="ssn" /></strong><br>--%>
    
    <strong>Balance: <jsp:getProperty name="order" property="balance" /></strong><br>
    <strong>Preferred?: </strong>
    
    <%  
            String result = order.getRadio();

            if (result.equals ("yes"))
            {
        %>
        true
        <% } else {%>
        false  
        <% } %>
        </body>
</html>    
    
    