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
@WebServlet(name = "HelloWWW", urlPatterns = {"/HelloWWW"})
public class HelloWWW extends HttpServlet {

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
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            String docType =
                    "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 "
                    + "Transitional//EN\">\n";
            out.println(docType
                    + "<HTML>\n"
                    + "<HEAD><TITLE>Hello WWW</TITLE></HEAD>\n"
                    + "<BODY>\n"
                    + "<H1>Hello WWW</H1>\n"
                    + "</BODY></HTML>");
        } finally {
            out.close();
        }
    }
}

   