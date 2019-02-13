<%-- 
    Document   : index
    Created on : Nov 6, 2012, 4:30:15 PM
    Author     : Ashwin Rajan
--%>

<html>
<head><title>Session Order</title></head>
<body>
<form action="http://localhost:8080/SessionOrderDemo/SessionOrder" method=GET>
  <strong><h3>Choose the items you would like to order.</h3></strong><p>
      <input type=checkbox name=Order value="Java Book">          Java Book       <br>
      <input type=checkbox name=Order value="Baseball">           Baseball        <br>
      <input type=checkbox name=Order value="Bicycle">            Bicycle         <br>
      <input type=checkbox name=Order value="Dress">              Dress           <br>
      <input type=checkbox name=Order value="Shirt">              Shirt           <br>
      <input type=checkbox name=Order value="Shoes">              Shoes           <br>
      <input type=checkbox name=Order value="Theater tickets">    Theater tickets <br>
      <input type=checkbox name=Order value="Compact disk">       Compact disk    <br>
      <input type=checkbox name=Order value="Cellular phone">     Cellular phone  <br>
      <input type=checkbox name=Order value="Computer">           Computer        <p>
      <input type=submit value="Order">
      <input type=reset>
</form></body></html>