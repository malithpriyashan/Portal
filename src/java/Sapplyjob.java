/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sudesh Niroshan
 */
public class Sapplyjob extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet StudentApplyJob</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet StudentApplyJob at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
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
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        
        String job_title = request.getParameter("job_title");
        String company_email = request.getParameter("company_email");
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String stemail = request.getParameter("stemail");
        String university = request.getParameter("university");
        String faculty = request.getParameter("faculty");
        String pnumber = request.getParameter("pnumber");
        
        PrintWriter out = response.getWriter();
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaproject","root","");  
            PreparedStatement pst = con.prepareStatement("INSERT INTO studentapplyjob (job_title,company_email,fname,lname,stemail,university,faculty,pnumber) values (?,?,?,?,?,?,?,?)");
            pst.setString(1, job_title);
            pst.setString(2, company_email);
            pst.setString(3, fname);
            pst.setString(4, lname);
            pst.setString(5, stemail);
            pst.setString(6, university);
            pst.setString(7, faculty);
            pst.setString(8, pnumber);
            
            int rs= pst.executeUpdate();
            
            if(rs>0)
            {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('You applyed job!!');");
               RequestDispatcher requestDispatcher = request.getRequestDispatcher("/Sapplyjob.jsp" );
                      requestDispatcher.forward(request, response);
                out.println("</script>");
            }
            else
            {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Something Went Wrong!!');");
                out.println("location='Applyjob.jsp'");
                out.println("</script>");
            }
            
        }
        catch (Exception e)
        {
            out.println("Error: "+e);
        }
        
        
        
        
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
