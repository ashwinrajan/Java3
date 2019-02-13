<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
    <HEAD><TITLE>Post Order</TITLE></HEAD>
    <BODY BGCOLOR="#FDF5E6">

        <FORM ACTION="http://localhost:8080/JavaBeanDemo/PostOrderBean">

            <strong>Name:</strong>       <input type=text name=name size=20><br>       
            <strong>Password:</strong>   <input type=password name=password size=12><p>
                <strong>Flavor:</strong>
                <select name=flavor size=3>
                    <option>Vanilla
                    <option>Chocolate
                    <option>Strawberry
                </select><p>
                <strong>Toppings:</strong>
                <input type=checkbox name=toppings value="Hot Fudge">    Hot Fudge
                <input type=checkbox name=toppings value=Butterscotch>   Butterscotch
                <input type=checkbox name=toppings value=Nuts>           Nuts
            <input type=checkbox name=toppings value="Whipped Cream">Whipped Cream<p>
                <input type=radio name=place value="Eat here"> Eat here
            <input type=radio name=place value="Take out"> Take out<p>
                <input type=submit value="Order">
                <input type=reset>

        </FORM>
    </BODY></HTML>
