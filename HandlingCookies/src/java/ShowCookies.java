/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ashwin Rajan
 */
@WebServlet(name = "ShowCookies", urlPatterns = {"/ShowCookies"})
public class ShowCookies extends HttpServlet {

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

        String title = "Active Cookies";
        out.println("<BODY BGCOLOR=\"#FDF5E6\">\n"
                + "<H1 ALIGN=\"CENTER\">" + title + "</H1>\n"
                + "<TABLE BORDER=1 ALIGN=\"CENTER\">\n"
                + "<TR BGCOLOR=\"#FFAD00\">\n"
                + "  <TH>Cookie Name\n"
                + "  <TH>Cookie Value");

        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            Cookie cookie;
            for (int i = 0; i < cookies.length; i++) {
                cookie = cookies[i];
                out.println("<TR>\n"
                        + "  <TD>" + cookie.getName() + "\n"
                        + "  <TD>" + cookie.getValue());
            }
        }
        out.println("</TABLE></BODY></HTML>");
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
