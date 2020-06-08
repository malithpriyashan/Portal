<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="utf-8" />
	<link rel="icon" type="image/png" href="assets/img/favicon.ico">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />

	<title>Light Bootstrap Dashboard by Creative Tim</title>

	<meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />
    <meta name="viewport" content="width=device-width" />


    <!-- Bootstrap core CSS     -->
    <link href="assets/css/bootstrap.min.css" rel="stylesheet" />

    <!-- Animation library for notifications   -->
    <link href="assets/css/animate.min.css" rel="stylesheet"/>

    <!--  Light Bootstrap Table core CSS    -->
    <link href="assets/css/light-bootstrap-dashboard.css?v=1.4.0" rel="stylesheet"/>


    <!--  CSS for Demo Purpose, don't include it in your project     -->
    <link href="assets/css/demo.css" rel="stylesheet" />


    <!--     Fonts and icons     -->
    <link href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
    <link href='http://fonts.googleapis.com/css?family=Roboto:400,700,300' rel='stylesheet' type='text/css'>
    <link href="assets/css/pe-icon-7-stroke.css" rel="stylesheet" />
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
<link href="https://unpkg.com/ionicons@4.5.5/dist/css/ionicons.min.css" rel="stylesheet">

</head>
<body>

<div class="wrapper">
    <div class="sidebar" data-color="purple" data-image="assets/img/sidebar-5.jpg">

    <!--   you can change the color of the sidebar using: data-color="blue | azure | green | orange | red | purple" -->


    	<div class="sidebar-wrapper">
            <div class="logo">
                <a href="home.jsp" class="simple-text">
                    THE PORTAL
                </a>
            </div>

            <ul class="nav">
               <li >
                    <a href="Iuserprofile.jsp">
                        <i class="pe-7s-user"></i>
                        <p>User Profile</p>
                    </a>
                </li>
                <li >
                    <a href="Ievent.jsp">
                        <i class="fas fa-user-friends"></i>
                        <p>Events</p>
                    </a>
                </li>
                <li>
                <li>
                    <a href="Iquestions.jsp">
                        <i class="far fa-question-circle"></i>
                        <p>Forum</p>
                    </a>
                </li>
                <li>
                    <a href="Icalendar.jsp">
                        <i class="far fa-calendar-alt"></i>
                        <p>Calendar</p>
                    </a>
                </li>
                <li>
                    <a href="Iaddjob.jsp">
                        <i class="icon ion-md-briefcase"></i>
                        <p>Job Vacancy</p>
                    </a>
                </li>
                <li class="active">
                    <a href="Iapplicants.jsp">
                        <i class="icon ion-md-paper"></i>
                        <p>Job applicants</p>
                    </a>
                </li>
            </ul>
    	</div>
    </div>

    <div class="main-panel">
        



        <div class="content">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-md-8">
                        <div class="card">
                            <div class="header">
                                <h4 class="title">Edit Profile</h4>
                            </div>
                            <div class="content">
                                
                                <h3 class="title" style="text-align: center">Looking for a Job</h3>
                           
                           <table class="deletetable"  align="center"  style="border-collapse: collapse;width: 100%;">
                             <tr>
                             <th style="text-align: left; padding: 8px;background-color: #e91e63;color: white;">Job</th>
                             <th style="text-align: left; padding: 8px;background-color: #e91e63;color: white;">Company</th>
                             <th style="text-align: left; padding: 8px;background-color: #e91e63;color: white;">First name</th>
                             <th style="text-align: left; padding: 8px;background-color: #e91e63;color: white;">Last name</th>
                             <th style="text-align: left; padding: 8px;background-color: #e91e63;color: white;">Applicant email</th>
                             <th style="text-align: left; padding: 8px;background-color: #e91e63;color: white;">University</th>
                             <th style="text-align: left; padding: 8px;background-color: #e91e63;color: white;">Faculty</th>
                             <th style="text-align: left; padding: 8px;background-color: #e91e63;color: white;">Phone Number</th>
                             </tr>
                         
                             
                             <%
    try
    {   String company=(String)session.getAttribute("company");
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaproject","root","");
        Statement smt=con.createStatement();
      
        String s1="select * from applicants where company='"+company+"'";
        ResultSet rs=smt.executeQuery(s1);
        while(rs.next())
        {%>
        <tr>
        <td><%=rs.getString("job") %></td>
                                            <td style="text-align: center"><%=rs.getString("company") %></td>
                                            <td style="text-align: center"><%=rs.getString("fname") %></td>
                                            <td style="text-align: center"><%=rs.getString("lname") %></td>
                                            <td style="text-align: center"><%=rs.getString("stemail") %></td>
                                            <td style="text-align: center"><%=rs.getString("university") %></td>
                                            <td style="text-align: center"><%=rs.getString("faculty") %></td>
                                            <td style="text-align: center"><%=rs.getString("pno") %></td>
        </tr>
               
                       <% } %>
   <% }catch(Exception e){}%>              
  
         
                           </table>
                           

               
                                
                                
                                
                            </div>
                        </div>
                    </div>
                    
                </div>
            </div>
        </div>


   

    </div>
</div>


</body>

    <!--   Core JS Files   -->
    <script src="assets/js/jquery.3.2.1.min.js" type="text/javascript"></script>
	<script src="assets/js/bootstrap.min.js" type="text/javascript"></script>

	<!--  Charts Plugin -->
	<script src="assets/js/chartist.min.js"></script>

    <!--  Notifications Plugin    -->
    <script src="assets/js/bootstrap-notify.js"></script>

    <!--  Google Maps Plugin    -->
    <script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE"></script>

    <!-- Light Bootstrap Table Core javascript and methods for Demo purpose -->
	<script src="assets/js/light-bootstrap-dashboard.js?v=1.4.0"></script>

	<!-- Light Bootstrap Table DEMO methods, don't include it in your project! -->
	<script src="assets/js/demo.js"></script>

</html>
