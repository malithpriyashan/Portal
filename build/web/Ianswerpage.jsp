<%@page import="java.util.logging.Logger"%>
<%@page import="java.util.logging.Level"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.PreparedStatement"%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!doctype html>
<html lang="en">
<head>
	<meta charset="utf-8" />
	<link rel="icon" type="image/png" href="assets/img/favicon.ico">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />

	<title>Answer page</title>

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
<link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
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
                <li>
                    <a href="Ianswerpage">
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
                <li class="active">
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
                 <li>
                    <a href="Iapplicants.jsp">
                        <i class="icon ion-md-paper"></i>
                        <p>Job applicants</p>
                    </a>
                </li>
				
            </ul>
    	</div>
    </div>

    <div class="main-panel">
		


        <div class="content" >
            <div class="container-fluid">
                <div class="row">
                    <div class="col-md-10">
                        <div class="card"style="background-color:  #E0E0E0;">
                            <div class="header">
                                <h2 class="title" style="font-family: 'Montserrat', sans-serif; text-align: center;">Post Your Answers</h2>
                            </div>
                            <div class="content" style="height: 940px;margin-left: 30px;">
                             
                                <div class="row">
            <div class="box-panel" style="width: 100%">

               
              <hr>
              <!-- form login -->
              
              <%
                   java.sql.Connection connection = null;
                   
        
                    try
                    {
                       
                        //connection = Connector.ConnectDb(); create the connection here//
                        int id = Integer.valueOf(request.getParameter("id"));
                        String driverName = "com.mysql.jdbc.Driver";
                        String connectionUrl = "jdbc:mysql://localhost:3306/";
                        String dbName = "javaproject";
                        String userId = "root";
                        String password = "";
                        
                        Class.forName(driverName);
                        connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);

                        PreparedStatement pst = connection.prepareStatement(" SELECT * FROM question where id = '"+id+"'");
                        ResultSet rs = pst.executeQuery();
                        while(rs.next())
                        {
                            String title=rs.getString("title");
                            String tags = rs.getString("tags");
                            String question = rs.getString("question");
                            int qid = rs.getInt("id");
                            request.setAttribute("tags", tags);
                            request.setAttribute("title", title);
                            request.setAttribute("question", question);
                            session.setAttribute("qid", qid);
                        }
                    } 

                    catch (SQLException ex) {
                        
                    }
                %>
                <form class="margin-top-40" action="IPostAnswer" method="post">
                <div class="form-group">
                    <input type="text" placeholder="Place your title here" disabled style="color:black; font-size: 20px; font-weight: bold;width: 97%;" class="form-control" style="font-weight: bold;font-size: 20px;"  name="title" value='${title}'>
                </div>
                  <div class="form-group">
                      <label style="color: #C93535; font-size:20px;">Tags</label>
                      <input type="text" placeholder="Place your tags here" disabled class="form-control"  name="keywords" value='${tags}' style="color: black;width: 97%;">
                      <input type="hidden" display="none" name="qid" value='${qid}' style="color:#C93535;">
                      
                </div>
                <div class="form-group">
                  <label style="color:#C93535;font-size:20px;">Question Details</label>
                  <textarea cols="100" rows="12" placeholder="Post Your Question Details Here....." name="message" class="form-control" style="color:black;width: 933px;" disabled=""> ${question} </textarea>
                </div>
                 <div class="form-group">
                  <label style="color:#C9353;font-size:20px;">Image</label>
                  <input class="input--style-4" type="file" name="image">
                </div> 
                  
                  
                  <div class="form-group">
                  <label style="color: #C93535;font-size:20px;">Answer</label>
                  <textarea cols="50" rows="12" style="width: 933px;" placeholder="Post Your Answer Here....."  name="comment" class="form-control"></textarea>
                </div>
                <div style="text-align: center"><button class="btn btn-danger" value="submit"  type="submit"> Post </button> </div>
               <!-- <button class="btn btn-primary pull-right" value="reset">Reset</button>-->
               <br>
                <br>
                <br>
                <br>
                <hr style="border: 2px solid; color:#F80000;">
               
                <h2 style="text-align: center">Answers</h2>
               
               <table> 
              
              <%                  
                    try
                    {
                        int id = Integer.valueOf(request.getParameter("id"));
                        String driverName = "com.mysql.jdbc.Driver";
                        String connectionUrl = "jdbc:mysql://localhost:3306/";
                        String dbName = "javaproject";
                        String userId = "root";
                        String password = "";
                        
                        Class.forName(driverName);
                        connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);

                        //connection = Connector.ConnectDb();
                        PreparedStatement pst = connection.prepareStatement(" SELECT * FROM comment where q_id = '"+id+"' order by id ");
                        ResultSet rs = pst.executeQuery();
                        while(rs.next())
                        {
                            String answer = rs.getString("comment");
                            request.setAttribute("answer",answer);
                %>
                
              <tr>

                    <td><ul><li><%= rs.getString("comment") %></li></ul></td>
                </tr>
                
                <% 
                }

                } 
                catch (Exception e) {
                e.printStackTrace();
                }
                %>
                </table>
               


              </form>
              <!-- form login -->

            </div>
          
          </div>
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
