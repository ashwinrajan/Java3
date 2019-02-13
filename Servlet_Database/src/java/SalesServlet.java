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
import java.sql.*;
import sun.jdbc.odbc.JdbcOdbcDriver;

/**
 *
 * @author Ashwin Rajan
 */
@WebServlet(name = "SalesServlet", urlPatterns = {"/SalesServlet"})
public class SalesServlet extends HttpServlet {

    private Connection con;
    private Statement stmt;

    public void init() throws ServletException //  public void init(ServletConfig sc) throws ServletException
    {
        //  super.init(sc); //always call super.init method when overriding init

        try {
            /*
             Creates a driver & register itself with DriverManager which keeps record
             of all registered drivers. Driver hides the details of specific database
             */
            new JdbcOdbcDriver(); //or use Class.forName(arg[0]) and pass Driver class: JdbcOdbcDriver

            String url = "jdbc:odbc:Sales"; //To locate the database to which we wish to connect
            String user = "";
            String password = "";

            //finds a driver that can connect to the database
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            

        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            
            /* TODO output your page here. You may use following sample code. */
            //String query = request.getParameter("select");
            ResultSet rs = stmt.executeQuery("Select * From customer");

            ResultSetMetaData rsMetaData = rs.getMetaData();

            int cols = rsMetaData.getColumnCount();

            while (rs.next()) {
                String s = "";

                for (int i = 1; i <= cols; i++) {
                    s += rs.getString(i) + ' ';
                }

                s += "<br>";	//adding html tag

                out.println(s); //printing in the browser
            }
        } catch (Exception e) {
            e.printStackTrace();
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
