<%-- 
    Document   : order
    Created on : Nov 27, 2012, 9:00:16 PM
    Author     : Singh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order</title>
    </head>
    <body>
        <center><h1>Order Pizza</h1></center>
        <form name="pizza" action="index.jsp" method="POST">

        <table border="0">
        <tr>
        <td><b>Name:</b></td>
        <td><input type="text" name="name" size="25"></td><br>
        </tr><tr>

        <td><b>Address:</b></td>
        <td><input type="text" name="address" size="30"></td></br>
        </tr><tr>

        <td><input type="radio" name="purchaseType" value="Home Delivery">Home Delivery</td></tr>

        <tr>
        <td><input type="radio" name="purchaseType" value="Take Away">Take Away</td></tr>

        <tr>
        <td><b>Select your pizza size: </b></td>
        </tr>

        <tr>
        <td><input type="radio" name="size" value="extra">Extra Large</td></tr>
        <br/>
        <tr>
        <td><input type="radio" name="size" value="large">Large</td></tr>
        <tr>
        <td><input type="radio" name="size" value="medium">Medium</td></tr>
        <tr>
        <td><input type="radio" name="size" value="small">Small</td></tr>
        
        <tr>
        <td><b>Select your pizza Type: </b></td>
        </tr>
        <tr>
        <td><input type="radio" name="crust" value="thick">Thick Crust</td></tr>
        <br/>
        <tr>
        <td><input type="radio" name="crust" value="thin">Thin</td></tr>
        <tr>
        <td><input type="radio" name="crust" value="pan">Pan</td></tr>
        
        <tr>
        <td><b>Select Toppings: </b></td>
        </tr>
        <tr>
        <td><input type="checkbox" name="toppings" value="mushrooms">Mushrooms</td></tr>
        <br/>
        <tr>
        <td><input type="checkbox" name="toppings" value="olives">Green Olives</td></tr>
        <tr>
        <td><input type="checkbox" name="toppings" value="peppers">Green peppers</td></tr>
        <tr>
        <td><input type="checkbox" name="toppings" value="pineapple">Pineapples</td></tr>
        <tr>
        <td><input type="checkbox" name="toppings" value="onions">Onions</td></tr>
        <tr>
        <td><input type="checkbox" name="toppings" value="tomato">tomatoes</td></tr>
        
        <tr>
        <td><b>Select Dip: </b></td>
        </tr>
        <tr>
        <td><input type="checkbox" name="dip" value="ranch">Ranch</td></tr>
        <br/>
        <tr>
        <td><input type="checkbox" name="dip" value="garlic">Garlic</td></tr>
        
        <tr>
        <td><b>Drinks: </b></td>
        </tr>
        <tr>
        <td><input type="checkbox" name="drink" value="coke">Coke</td></tr>
        <br/>
        <tr>
        <td><input type="checkbox" name="drink" value="root">Root Beer</td></tr>
       

        <tr>
        <td><input type="submit" value="Place Order"></td></tr></table>
        </form>
    </body>
</html>
