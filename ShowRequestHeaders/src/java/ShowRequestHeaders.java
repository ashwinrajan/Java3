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
@WebServlet(name = "ShowRequestHeaders", urlPatterns = {"/ShowRequestHeaders"})
public class ShowRequestHeaders extends HttpServlet {

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
            String title = "Servlet Example: Showing Request Headers";

            out.println("<head><title>Servlet Example: Showing Request Headers</title></head>");

            out.println("<BODY BGCOLOR=\"#FDF5E6\">\n"
                    + "<H1 ALIGN=CENTER>" + title + "</H1>\n"
                    + "<B>Request Method: </B>"
                    + request.getMethod() + "<BR>\n"
                    + "<B>Request URI: </B>"
                    + request.getRequestURI() + "<BR>\n"
                    + "<B>Request Protocol: </B>"
                    + request.getProtocol() + "<BR><BR>\n"
                    + "<TABLE BORDER=1 ALIGN=CENTER>\n"
                    + "<TR BGCOLOR=\"#FFAD00\">\n"
                    + "<TH>Header Name<TH>Header Value");

            Enumeration headerNames = request.getHeaderNames();

            while (headerNames.hasMoreElements()) {
                String headerName = (String) headerNames.nextElement();
                out.println("<TR><TD>" + headerName);
                out.println("    <TD>" + request.getHeader(headerName));
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
