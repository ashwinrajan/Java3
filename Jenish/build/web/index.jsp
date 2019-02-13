<%-- 
    Document   : index
    Created on : 27-Nov-2012, 2:55:08 PM
    Author     : Jenish
--%>

<html>
    <head><title>Post Order</title></head>
    <body>
        <form action="newjsp.jsp" method=POST>
            Name:       <input type=text name=name size=20><br>       
            SSN:       <input type=text name=ssn size=20><br>
            Balance:     <input type=text name=Balance size=20><br>

            Preferred?
            <input type=radio name=option value="yes"> Yes
            <input type=radio name=option value="no"> No<p>
                <input type=submit value="Add">

        </form>
    </body>
</html>