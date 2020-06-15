<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%
    try
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaproject","root","");
        Statement smt=con.createStatement();
        String u1 =(String)session.getAttribute("username");
        String s1="select * from industryreg where username='"+u1+"'";
        ResultSet rs=smt.executeQuery(s1);
        while(rs.next())
        {
          
		
      
        
    
        
          } 
    }catch(Exception e){}%>
   
   
   
   
  
    </body>
</html>
