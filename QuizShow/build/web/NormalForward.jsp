<%

   String counter = (String)session.getAttribute("questionNumbers");
   Integer loopCounter = Integer.parseInt(counter);
   String last = (String)session.getAttribute("totalQuestions");
   Integer lastQuestion = Integer.parseInt(last);

   if(loopCounter == lastQuestion){

       session.setAttribute("questionNumbers", String.valueOf(loopCounter));
        response.sendRedirect("NormalDelete.jsp");
   }

   else{
   loopCounter++;
   session.setAttribute("questionNumbers", String.valueOf(loopCounter));
	response.sendRedirect("NormalDelete.jsp");

   }
%>