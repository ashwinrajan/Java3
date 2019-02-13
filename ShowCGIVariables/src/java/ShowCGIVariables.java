/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ashwin Rajan
 */
@WebServlet(name = "ShowCGIVariables", urlPatterns = {"/ShowCGIVariables"})
public class ShowCGIVariables extends HttpServlet {

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
            String[][] variables = {
                {"REMOTE_ADDR", request.getRemoteAddr()},
                {"REMOTE_HOST", request.getRemoteHost()},
                {"SERVER_NAME", request.getServerName()},
                {"SERVER_PORT", String.valueOf(request.getServerPort())},
                {"SERVER_PROTOCOL", request.getProtocol()},
                {"SERVER_SOFTWARE", getServletContext().getServerInfo()}
            };

            String title = "Servlet Example: Showing CGI Variables";

            out.println("<head><title>Servlet Example: Showing CGI Variables</title></head>");

            out.println("<BODY BGCOLOR=\"#FDF5E6\">\n"
                    + "<H1 ALIGN=\"CENTER\">" + title + "</H1>\n"
                    + "<TABLE BORDER=1 ALIGN=\"CENTER\">\n"
                    + "<TR BGCOLOR=\"#FFAD00\">\n"
                    + "<TH>CGI Variable Name<TH>Value");

            for (int i = 0; i < variables.length; i++) {
                String varName = variables[i][0];
                String varValue = variables[i][1];

                if (varValue == null) {
                    varValue = "<I>Not specified</I>";
                }

                out.println("<TR><TD>" + varName + "<TD>" + varValue);
            }

            out.println("</TABLE></BODY></HTML>");
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
