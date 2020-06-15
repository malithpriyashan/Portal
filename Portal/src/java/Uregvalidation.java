import javax.servlet.RequestDispatcher;
import java.io.*;  
import java.sql.*; 
import javax.sql.*;
import javax.servlet.ServletException;  
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.*;
import javax.servlet.http.Part;


 @MultipartConfig(maxFileSize = 16177216)
public class Uregvalidation extends HttpServlet {  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
String email=request.getParameter("uniemail");
            
            String name=request.getParameter("uniname");
             String city=request.getParameter("unicity");
             String country=request.getParameter("unicountry");
             String postalcode=request.getParameter("unipostalcode");
             String about=request.getParameter("uniabout");
             String address=request.getParameter("uniaddress");



            String pass=request.getParameter("unipassword");
            String confirm=request.getParameter("unipassword");
            try
            {
                
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaproject","root","");
            Statement st=con.createStatement();
            
            String query="insert into universityreg values(null,'"+email+"','"+name+"','"+city+"','"+country+"','"+postalcode+"','"+about+"','"+address+"','"+pass+"','"+confirm+"')";
            st.executeUpdate(query);
            
            

            }
            catch(Exception x)
            {
                out.println(x);
            }
            
            
            
               
            String username=request.getParameter("uniname");
            String password=request.getParameter("unipassword");
;            try
            {
                
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaproject","root","");
            Statement st=con.createStatement();
            
            String query="insert into university values(null,'"+username+"','"+password+"')";
            st.executeUpdate(query);
            
              response.sendRedirect("Ulogin.jsp.jsp");
            

            }
            catch(Exception x)
            {
                out.println(x);
            }
     
            
                
		String connectionURL = "jdbc:mysql://localhost:3306/javaproject";
		String user = "root";
		String passw = "";
 
		int result = 0;
		Connection con = null;
		Part part = request.getPart("image");
 
		if(part != null){
			try{
				Class.forName("com.mysql.jdbc.Driver");
			    con = DriverManager.getConnection(connectionURL, user, passw);
			    
			    PreparedStatement ps = con.prepareStatement("insert into profilepic(image,username) values(?,?)");
			    InputStream is = part.getInputStream();
			    ps.setBlob(1, is);
                            ps.setString(2, name);
			    result = ps.executeUpdate();
			}
			catch(Exception e){
				e.printStackTrace();
			}	
			finally{
				if(con != null){
					try{
						con.close();
					}
					catch(Exception e){
						e.printStackTrace();
					}
				}
			}
		}
     
}  
  
} 

