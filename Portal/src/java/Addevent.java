import javax.servlet.RequestDispatcher;
import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  

 
public class Addevent extends HttpServlet {  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
String n=request.getParameter("day");  
String p=request.getParameter("month");  
String e=request.getParameter("title");  
String c=request.getParameter("description");  
          
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/javaproject","root","");  
  
PreparedStatement ps=con.prepareStatement(  
"insert into event(day,month,title,description) values(?,?,?,?)");  
  
ps.setString(1,n);  
ps.setString(2,p);  
ps.setString(3,e);  
ps.setString(4,c);  
          
ps.executeUpdate();  

 
RequestDispatcher requestDispatcher = request
                    .getRequestDispatcher("/Ievent.jsp");
          requestDispatcher.forward(request, response); 
           //response.sendRedirect("new.html");
           //return;
          
}catch (Exception e2) {System.out.println(e2);}  
          
out.close();  
}  
  
}  