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
@WebServlet(name = "CookieCounter", urlPatterns = {"/CookieCounter"})
public class CookieCounter extends HttpServlet {

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
        String name, value = null;
        Cookie c;
        int counter;

        response.setContentType("text/html");

        //  Try to extract the counter cookie (if one exists)
        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (int i = 0; i < cookies.length; i++) {
                c = cookies[i];
                name = c.getName();

                if (name.equals("counter")) {
                    value = c.getValue();
                }
            }
        }

        //  If possible, parse the counter value
        //  Otherwise, start over at 0.
        if (value != null) {
            counter = Integer.parseInt(value);
        } else {
            counter = 0;
        }

        //  Increment the counter
        counter++;

        //  Create a new counter cookie
        //  Cookie will exist for one year
        c = new Cookie("counter", Integer.toString(counter));
        c.setMaxAge(60 * 60 * 24 * 365);
        response.addCookie(c);

        //  Output number of visits
        PrintWriter out = response.getWriter();
        out.println("<HTML><BODY>");
        out.println("<H1>Number of visits:  " + counter);
        out.println("</H1>");
        out.println("</BODY></HTML>");
        out.close();
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
