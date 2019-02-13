<%

   String counter = (String)session.getAttribute("questionNumbers");
   Integer loopCounter = Integer.parseInt(counter);
   if(loopCounter == 1){

     session.setAttribute("questionNumbers", String.valueOf(loopCounter));
   response.sendRedirect("HardDelete.jsp");
   }
   else{
   loopCounter--;
   session.setAttribute("questionNumbers", String.valueOf(loopCounter));
   response.sendRedirect("HardDelete.jsp");
   }
%>