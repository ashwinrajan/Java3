/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ashwin Rajan
 */
@WebServlet(name = "FileRead", urlPatterns = {"/FileRead"})
public class FileRead extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            ServletContext context = getServletContext();

		URL url = context.getResource("/WEB-INF/Name.html");

		InputStream is = url.openStream();
		BufferedInputStream br = new BufferedInputStream (is);


		response.setContentType("text/html");

		out.println("<HTML>");
		out.println("<TITLE>");
		out.println("Read a file and display in browser");
		out.println("</TITLE>");
		out.println("<BODY>");
		out.println("<H3>");
		out.println("<I>");
		out.println("Name.html file for Name Servlet example");
		out.println("</I>");
		out.println("</H3>");

		int ch;
		boolean flag=false; // to identify when new line is encountered
		while((ch = br.read()) != -1)
		{
		//	Discard all new lines and insert a single break
			while(ch == 13 || ch == 10)   //ASCII 10 is for carriage return and ASCII 13 is linefeed
			{
				flag = true;
				ch = br.read();
			}

			if(ch == -1) break;

			if(flag)
			{
				out.print("<BR CLEAR=None>");
				flag = false;
			}
			if((char)ch == '<')
				out.print("&lt;");
			else if((char)ch == '>')
				out.print("&gt;");
			else
				out.print((char)ch);
		}
		out.println("</body>");
		out.println("</html>");
		br.close();
		out.close();
                
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
