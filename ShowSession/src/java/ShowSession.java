/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
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
@WebServlet(name = "ShowSession", urlPatterns = {"/ShowSession"})
public class ShowSession extends HttpServlet {

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
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        String title = "Session Tracking Example";
        HttpSession session = request.getSession(true);

        String heading;
        // Use getAttribute instead of getValue in version 2.2.
        Integer accessCount = (Integer) session.getValue("accessCount");
        if (accessCount == null) {
            accessCount = new Integer(0);
            heading = "Welcome, Newcomer";
        } else {
            heading = "Welcome Back";
            accessCount = new Integer(accessCount.intValue() + 1);
        }
        // Use setAttribute instead of putValue in version 2.2.
        session.putValue("accessCount", accessCount);

        out.println("<BODY BGCOLOR=\"#FDF5E6\">\n"
                + "<H1 ALIGN=\"CENTER\">" + heading + "</H1>\n"
                + "<H2>Information on Your Session:</H2>\n"
                + "<strong>"
                + "<TABLE BORDER=1 ALIGN=\"CENTER\">\n"
                + "<TR BGCOLOR=\"#FFAD00\">\n"
                + "  <TH>Info Type<TH>Value\n"
                + "<TR>\n"
                + "  <TD>ID\n"
                + "  <TD>" + session.getId() + "\n"
                + "<TR>\n"
                + "  <TD>Creation Time\n"
                + "  <TD>"
                + new Date(session.getCreationTime()) + "\n"
                + "<TR>\n"
                + "  <TD>Time of Last Access\n"
                + "  <TD>"
                + new Date(session.getLastAccessedTime()) + "\n"
                + "<TR>\n"
                + "  <TD>Number of Previous Accesses\n"
                + "  <TD>" + accessCount + "\n"
                + "</TR>"
                + "</TABLE>\n"
                + "</strong>"
                + "</BODY></HTML>");
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
