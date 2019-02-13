
<% 
    
    String filename = request.getParameter("difficulty"); 
    session.setAttribute("difficulty", filename);
    response.sendRedirect(filename + "Quiz.jsp");
%>

