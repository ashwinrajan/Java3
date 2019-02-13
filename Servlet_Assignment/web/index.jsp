<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
    <HEAD><TITLE>Post Order</TITLE></HEAD>
    <BODY BGCOLOR="#FDF5E6">

        <FORM ACTION="http://localhost:8080/Servlet_Assignment/PostOrder">
            <CENTER>
                <IMG src="http://www.thaindian.com/images/Restaurants/india_hut_logo.jpg" width="200" height="200"><BR><BR>  
            </CENTER>    
            <B>Name:</B>      <INPUT type="text" name="name"><BR>
            <B>Password:</B>  <INPUT type="password" name="password"><BR><BR>

            <B>Flavor:</B>    <SELECT name="flavor">
                              <OPTION value="Vanilla">Vanilla</OPTION>
                              <OPTION value="Chocolate">Chocolate</OPTION>
                              <OPTION value="Strawberry">Strawberry</OPTION>
                              </SELECT><BR><BR>

            <B>Toppings:</B>  <INPUT type="checkbox" name="toppings" value="Hot Fudge">Hot Fudge
                              <INPUT type="checkbox" name="toppings" value="Butterscotch">Butterscotch 
                              <INPUT type="checkbox" name="toppings" value="Nuts">Nuts
                              <INPUT type="checkbox" name="toppings" value="Whipped Cream">Whipped Cream<BR><BR>
                       
            <INPUT type="radio" name="group1" value="eat here">Eat Here
            <INPUT type="radio" name="group1" value="take out">Take Out<BR><BR>

            <INPUT type="submit" value="Order"> <!-- Press this to submit form -->
            <INPUT type="reset">

        </FORM>
    </BODY></HTML>
