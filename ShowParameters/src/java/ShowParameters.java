/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ashwin Rajan
 */
@WebServlet(name = "ShowParameters", urlPatterns = {"/ShowParameters"})
public class ShowParameters extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
           String title = "Reading All Request Parameters";

	out.println("<head><title>ShowParameters Servlet</title></head>");

    out.println("<BODY BGCOLOR=\"#FDF5E6\">\n" +
                "<H1 ALIGN=CENTER>" + title + "</H1>\n" +
                "<TABLE BORDER=1 ALIGN=CENTER>\n" +
                "<TR BGCOLOR=\"#FFAD00\">\n" +
                "<TH>Parameter Name<TH>Parameter Value(s)");

    Enumeration paramNames = request.getParameterNames();

    	while(paramNames.hasMoreElements())
    	{
    	  	String paramName = (String)paramNames.nextElement();
    	  	out.print("<TR><TD>" + paramName + "<TD>");

    		String[ ] paramValues = request.getParameterValues(paramName);

      		if (paramValues.length == 1)// array is one entry long? contains only empty string
      		{
        		String paramValue = paramValues[0];
        		if (paramValue.length() == 0)	//parameter has no value
        			  out.println("<I>No Value</I>");  //displays in italic
        		else
          			out.println(paramValue);
      		}
      		else			//parameter has multiple values
      		{
        		out.println("<UL>");
        		for(int i=0; i<paramValues.length; i++)
        		{
          			out.println("<LI>" + paramValues[i]);		//values are dislayed
        		}

        		out.println("</UL>");
      		}
    	}

    	out.println("</TABLE>\n</BODY></HTML>");
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
