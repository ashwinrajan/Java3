<%-- 
    Document   : newjsp
    Created on : 27-Nov-2012, 2:59:49 PM
    Author     : Jenish
--%>
<jsp:useBean id="sundae" class="BeanClass.Bean" />
<jsp:setProperty name="sundae" property="*" />

<%
    String[] kinds;
    int i;
%>

<html>
    <head><title>Final Exam Question #2</title></head>

    <body>
        <b>The account information had been added.</b><br>
        <b>The Account information is being retreived.</b><br>

        <b>Name:</b> <jsp:getProperty name="sundae" property="name" /> <br>
        <b>SSN:</b> <jsp:getProperty name="sundae" property="ssn" /> <br>
        <b>Balance:</b> <jsp:getProperty name="sundae" property="balance" /> <br>


        <%  
            String result = sundae.getOption();

            if (result.equals ("yes"))
            {
        %>
        true
        <% } else {%>
        false  
        <% } %>
    </body></html>