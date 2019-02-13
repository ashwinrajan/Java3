/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Ashwin Rajan
 */
@WebServlet(name = "HttpSessionExample", urlPatterns = {"/HttpSessionExample"})
public class HttpSessionExample extends HttpServlet {

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
        // Assign a content type
		response.setContentType( "text/html" );

		// Prevent caching of server-side responses
		response.setHeader( "Cache-Control" ,  "no-cache" );

		// Create a stream for writing HTML output
		PrintStream pout = new PrintStream (response.getOutputStream());

		// Get the user session, and create one if one doesn't already exist
		HttpSession userSession = request.getSession(true);

		// Check for presence of state data in userSession
		String background = (String) userSession.getValue("background");
		String foreground = (String) userSession.getValue("foreground");

		if (background == null)
		{
			// No background stored - place default value in session
			background = getDefaultBackground();
			userSession.putValue("background", background);
		}
		if (foreground == null)
		{
			// No foreground stored - place default value in session
			foreground = getDefaultForeground();
			userSession.putValue("foreground", foreground);
		}

		// Next, check for a change in parameter from FORM
		if ( request.getParameter("background") != null)
		{
			background = request.getParameter("background");
			userSession.putValue ("background", background);
		}
		if ( request.getParameter("foreground") != null)
		{
			foreground = request.getParameter("foreground");
			userSession.putValue ("foreground", foreground);
		}


		pout.println ("<HTML><HEAD><TITLE>HttpSessionExample</TITLE></HEAD>");
		pout.println ("<BODY BGCOLOR='" + background + "' TEXT='" + foreground + "'>");
		pout.println ("This is an example of a servlet that uses HttpSession to store state info <p>\n");

		// Print form
		pout.println ("<form action='" + response.encodeUrl(request.getRequestURI()) + "' method=get>\n");
		pout.println ("Background : <input type=text name=background value='" + background + "'><br>\n");
		pout.println ("Foreground : <input type=text name=foreground value='" + foreground + "'><br>\n");
		pout.println ("<input type=submit>");
		pout.println ("</form>");

		pout.println ("<a href='" + response.encodeUrl ( request.getRequestURI() ) + "'>Hyperlink example of URL rewriting</a> - not supported by all servers");
		pout.flush();
    }
    	public String getDefaultBackground() { return "white"; }
	public String getDefaultForeground() { return "black"; }

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


