import javax.servlet.RequestDispatcher;
import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  

 
public class SAddquestion extends HttpServlet {  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
String n=request.getParameter("title");  
String p=request.getParameter("tags");  
String e=request.getParameter("question");  

          
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/javaproject","root","");  
  
PreparedStatement ps=con.prepareStatement(  
"insert into question(title,tags,question) values(?,?,?)");  
  
ps.setString(1,n);  
ps.setString(2,p);  
ps.setString(3,e);  
 
          
ps.executeUpdate();  

 
RequestDispatcher requestDispatcher = request
                    .getRequestDispatcher("/Iquestions.jsp");
          requestDispatcher.forward(request, response); 
           //response.sendRedirect("new.html");
           //return;
          
}catch (Exception e2) {System.out.println(e2);}  
          
out.close();  
}  
  
}  