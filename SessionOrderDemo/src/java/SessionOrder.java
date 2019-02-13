/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;
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
@WebServlet(name = "SessionOrder", urlPatterns = {"/SessionOrder"})
public class SessionOrder extends HttpServlet {

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

        //getSession method returns the current session if the argument is true
        //It creates a new session if there is no current session.
        HttpSession session = request.getSession(true);

//Order is a parameter with multiple values. Use getParameterValues method
        String[] newItems = request.getParameterValues("Order");

        //The getValue method returns the Oject associated with the argument "myItem"
        //casting it to a vector
        Vector items = (Vector) session.getValue("myItems");

        //If items is null, we have just begun a sesson and need to create a new vector to hold the orders
        if (items == null) {
            items = new Vector();
        }

//we add the newly chosen items to the vector containing previous choices
        for (int i = 0; i < newItems.length; i++) {
            items.addElement(newItems[i]);	//adds client selections
        }
//Having updated items, we use the putValue method to save it with name "myItems"
        session.putValue("myItems", items);

//Writing to browser
        out.println("<html>");
        out.println("<head><title>Session Order Servlet</title></head>");
        out.println("<body><h1><strong>Your current order is<br>");
        out.println(items + "</strong></h1><p>");
        //getId() returns a string containing unique identifier assigned to the session.
        out.println("Your session ID is:" + session.getId() + "<br>");
        out.println("</body></html>");
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
