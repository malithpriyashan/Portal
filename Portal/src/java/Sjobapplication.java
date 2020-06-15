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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




/**
 *
 * @author Sudesh Niroshan
 */
public class Sjobapplication extends HttpServlet {

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
            out.println("<title>Servlet Applyjob</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Applyjob at " + request.getContextPath() + "</h1>");
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
        
        HttpSession session=request.getSession();
        
        String id = request.getParameter("job_id");
        String stemail = request.getParameter("stemail");
        
        Statement statement = null, 
                statement1 = null;
        ResultSet resultSet = null, 
                resultSet1 = null;
        String job=null,company = null,
                fname,
                lname,
                university,
                faculty,
                phonenumber;

        try {
            Class.forName("com.mysql.jdbc.Driver");  
        Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaproject","root","");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM industryaddjob WHERE j_id='"+id+"'");
            while(resultSet.next()){
                job = resultSet.getString("job");
                company = resultSet.getString("company");
            }
            
            session.setAttribute("job", job);
            session.setAttribute("addCompany", company);
            
            
            statement1 = connection.createStatement();
            resultSet1 = statement1.executeQuery("SELECT * FROM studentapplyjob WHERE stemail='"+stemail+"'");
            while(resultSet1.next()){
                fname = resultSet1.getString("fname");
                lname = resultSet1.getString("lname");
                university = resultSet1.getString("university");
                faculty = resultSet1.getString("faculty");
                phonenumber = resultSet1.getString("pnumber");
                
                session.setAttribute("fname", fname);
                session.setAttribute("lname", lname);
                session.setAttribute("uni", university);
                session.setAttribute("faculty", faculty);
                session.setAttribute("pno", phonenumber);
            }

                                  session.setAttribute("stemail", stemail);
  
        } catch (SQLException ex) {
            Logger.getLogger(Sjobapplication.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Sjobapplication.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
          try
    {
       Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaproject","root","");
        String job1=(String)session.getAttribute("job");
        String company1=(String)session.getAttribute("addCompany");
        String fname1=(String)session.getAttribute("fname");
        String lname1=(String)session.getAttribute("lname");
        String uni1=(String)session.getAttribute("uni");
        String faculty1=(String)session.getAttribute("faculty");
        String pno1=(String)session.getAttribute("pno");
        String email1=(String)session.getAttribute("stemail");
        
        
        
        
        
        
        
        
        PreparedStatement pst = con.prepareStatement("INSERT INTO applicants (job,company,fname,lname,stemail,university,faculty,pno) values (?,?,?,?,?,?,?,?)");
            pst.setString(1, job1);
            pst.setString(2, company1);
            pst.setString(3, fname1);
            pst.setString(4, lname1);
            pst.setString(5, email1);
            pst.setString(6, uni1);
            pst.setString(7, faculty1);
            pst.setString(8, pno1);
       
        int rs =pst.executeUpdate();

        
         
    }catch(Exception e){}
        
                   
response.sendRedirect("Svacancyapply.jsp");
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
