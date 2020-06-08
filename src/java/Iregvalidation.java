import javax.servlet.RequestDispatcher;
import java.io.*;  
import java.sql.*; 
import javax.sql.*;
import javax.servlet.ServletException;  
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.*;
import javax.servlet.http.Part;


 @MultipartConfig(maxFileSize = 16177216)
public class Iregvalidation extends HttpServlet {  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
String email=request.getParameter("iemail");
            
            String name=request.getParameter("iname");
            String pass=request.getParameter("password");
            String confirm=request.getParameter("password");
            String company=request.getParameter("icompany");
           
            String address=request.getParameter("iaddress");
            String city=request.getParameter("icity");
            String country=request.getParameter("icountry");
            String postalcode=request.getParameter("ipostalcode");
            String about=request.getParameter("iabout");
            try
            {
                
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaproject","root","");
            Statement st=con.createStatement();
            
            String query="insert into industryreg values(null,'"+email+"','"+name+"','"+pass+"','"+confirm+"','"+company+"','"+address+"','"+city+"','"+country+"','"+postalcode+"','"+about+"')";
            st.executeUpdate(query);
            
            

            }
            catch(Exception x)
            {
                out.println(x);
            }
            
            
            
             String username=request.getParameter("iname");
            String password=request.getParameter("password");
;            try
            {
                
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaproject","root","");
            Statement st=con.createStatement();
            
            String query="insert into industry values(null,'"+username+"','"+password+"')";
            st.executeUpdate(query);
            
              response.sendRedirect("Ilogin.jsp");
            

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

