<%-- 
    Document   : adminAcess
    Created on : 27-Nov-2012, 6:58:41 PM
    Author     : Jenish
--%>

<html>
    <script>
        function validate(){
            var username=document.form.user.value;
            var password=document.form.pass.value;
            if(username==""){
                alert("Enter Username!");
                return false;
            }
            if(password==""){
                alert("Enter Password!");
                return false;
            }
            return true;
        }
    </script>

    <body style="background-image:url('Images/final.jpg')">

        <form name="form" method="post" action="http://localhost:8080/PizzaManagement/Adminlogin" onsubmit="javascript:return validate();"> 
            <center><img src = "Images/pizzalogo.png" /></center> 

            <h1 ALIGN="CENTER"><FONT face="Magneto" COLOR =black><b>Pizza Store Management</b></FONT></h1>
            <HR WIDTH="40%" SIZE="3" NOSHADE="NOSHADE" COLOR =black >

            <br/>
            <div style="margin: auto; width:260px; height:140px; border:2px solid black; padding:25px">

                <table>

                    <tr>
                    <center><b>Admin Login</b></center><br> 
                    <td>                     
                        <b> Username:</b> <br/>
                    </td>
                    <td>
                        <input type = "text" name = "user" /> <br/>
                    </td>
                    </tr>
                    <tr>
                        <td>
                            <b> Password:</b> <br/>
                        </td>
                        <td>
                            <input type = "password" name = "pass"/> <br/>
                        </td>
                    </tr>
                </table>
                <br/>
                 <button type="submit" style="border:0px; background:transparent" />
                <img src="Images/loginButton.png" 
                     onmouseover="this.src='Images/loginButtonMouseOver.png';" 
                     onmouseout="this.src='Images/loginButton.png';" /></button> 

                <button type="button" style="border:0px; background:transparent" />
                <img src="Images/adminButton.png" 
                     onmouseover="this.src='Images/adminButtonMouseOver.png';" 
                     onmouseout="this.src='Images/adminButton.png';" onClick="parent.location='index.jsp'"/></button>

            </div>
        </form>

    </body>
</html>