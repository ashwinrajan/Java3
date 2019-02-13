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
@WebServlet(name = "SetCookie", urlPatterns = {"/SetCookie"})
public class SetCookie extends HttpServlet {

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
        for (int i = 0; i < 3; i++) {
            // Default maxAge is -1, indicating cookie
            // applies only to current browsing session.
            Cookie cookie = new Cookie("Session-Cookie-" + i, "Cookie-Value-S" + i);
            response.addCookie(cookie);

            cookie = new Cookie("Persistent-Cookie-" + i, "Cookie-Value-P" + i);
            // Cookie is valid for a year, regardless of whether
            // user quits browser, reboots computer, or whatever.
            cookie.setMaxAge(60 * 60 * 24 * 365);
            response.addCookie(cookie);
        }

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String title = "Setting Cookies";

        out.println("<BODY BGCOLOR=\"#FDF5E6\">\n"
                + "<H1 ALIGN=\"CENTER\">" + title + "</H1>\n"
                + "There are six cookies associated with this page.\n"
                + "To see them, visit the\n"
                + "<A HREF=\"/servlet/myservlets.ShowCookies\">\n"
                + "<CODE>ShowCookies</CODE> servlet</A>.\n"
                + "<P>\n"
                + "Three of the cookies are associated only with the\n"
                + "current session, while three are persistent.\n"
                + "Quit the browser, restart, and return to the\n"
                + "<CODE>ShowCookies</CODE> servlet to verify that\n"
                + "the three long-lived ones persist across sessions.\n"
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
