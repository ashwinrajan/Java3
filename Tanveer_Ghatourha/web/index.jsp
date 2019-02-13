<%-- 
    Document   : index
    Created on : Dec 3, 2012, 9:19:53 PM
    Author     : Ashwin Rajan
--%>

<html>
    <head>
        <title></title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <form action="Account.jsp" method=POST>
        Name:   <input type="text" name="name"><br>
        SSN:    <input type="text" name="ssn"><br>
        Balance:<input type="text" name="balance"><br>
        Preffered?<input type="radio" name="choice" value="Yes">Yes<br>
                  <input type="radio" name="choice" value="No">No<br>
        
        <input type="Submit" name="Add" value="Add">
        </form>
    </body>
</html>