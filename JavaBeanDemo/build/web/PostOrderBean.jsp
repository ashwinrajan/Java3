<!-- Echoes the user's order made in a POST request. 
-->

<jsp:useBean id="sundae" class="order.OrderBean" />
<jsp:setProperty name="sundae" property="*" />

    <%  
       String[] kinds;    
       int i;
    %>
    
<html>
<head><title>Ice Cream Servlet</title></head>
<body><h1><strong>Hi <jsp:getProperty name="sundae" property="name" />
</strong></h1><h3>

Got your order for <jsp:getProperty name="sundae" property="flavor" /> ice cream<br>

    <%  kinds = sundae.getToppings(); 
        if (kinds==null) {%>
        
with no toppings.
    <% } else {  %>
with <ul>
    <%    for(i=0; i<kinds.length; i++) { %>
          <li> <%= kinds[i] %>
    <% }  %>
</ul>
    <%  }
       String result = sundae.getPlace();
        if (result.equals("Eat here"))
        {
    %>
to eat here.
    <% } else {%>
to go  
<% } %>

</h3></body></html>

         