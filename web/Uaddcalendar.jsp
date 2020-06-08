<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="utf-8" />
	<link rel="icon" type="image/png" href="assets/img/favicon.ico">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />

	<title>Calendar</title>

	<meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />
    <meta name="viewport" content="width=device-width" />


    <!-- Bootstrap core CSS     -->
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

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
    <link rel="stylesheet" type="text/css" href="eventstyle.css">
   
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
    <link href="calendarparts/vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">
    <link href="https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">
    <link href="calendarparts/vendor/select2/select2.min.css" rel="stylesheet" media="all">
    <link href="calendarparts/vendor/datepicker/daterangepicker.css" rel="stylesheet" media="all">
    <link href="calendarparts/css/main.css" rel="stylesheet" media="all">


    
    
</head>
<body>

<div class="wrapper">
    <div class="sidebar" data-color="purple" data-image="assets/img/sidebar-5.jpg">

    <!--   you can change the color of the sidebar using: data-color="blue | azure | green | orange | red | purple" -->


    	<div class="sidebar-wrapper">
            <div class="logo">
                <a href="home.jsp" class="simple-text">
                    The Portal
                </a>
            </div>

            <ul class="nav">
                
                <li>
                    <a href="Uuserprofile.jsp">
                        <i class="pe-7s-user"></i>
                        <p>User Profile</p>
                    </a>
                </li>
                <li >
                    <a href="Uevent.jsp">
                        <i class="fas fa-user-friends"></i>
                        <p>Events</p>
                    </a>
                </li>
                <li>
                
                </li>
                <li class="active">
                    <a href="Ucalendar.jsp">
                        <i class="far fa-calendar-alt"></i>
                        <p>Calendar</p>
                    </a>
                </li>
                
				
            </ul>
    	</div>
    </div>

    <div class="main-panel" >
		

          <div class="page-wrapper bg-gra-01 p-t-180 p-b-100 font-poppins">
        <div class="wrapper wrapper--w780">
            <div class="card card-3">
                <div class="card-heading"></div>
                <div class="card-body">
                    <h2 class="title">Registration Info</h2>
                    <form action="add_event_servlet" method="POST">
                        
                       <div class="input-group">
                            <input class="input--style-3" type="text" placeholder="Title" name="title">
                        </div>
                        
                         
                        
                        <div class="input-group">
                            <input class="input--style-3" type="date" placeholder="Start" name="start">
                        </div>
                        <div class="input-group">
                            <input class="input--style-3" type="date" placeholder="End" name="end">
                        </div>
                        
                        
                        <div class="p-t-10">
                            <button class="btn btn--pill btn--green" type="submit">Submit</button>
                        </div>
                       
                    </form>
                    <div  > <a  style="color: white;" href="Ucalendar.jsp">view calendar</a> </div> 

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
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
 <script type="text/javascript" src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

 
  <!-- Jquery JS-->
    <script src="calendarparts/vendor/jquery/jquery.min.js"></script>
    <!-- Vendor JS-->
    <script src="calendarparts/vendor/select2/select2.min.js"></script>
    <script src="calendarparts/vendor/datepicker/moment.min.js"></script>
    <script src="calendarparts/vendor/datepicker/daterangepicker.js"></script>

    <!-- Main JS-->
    <script src="calendarparts/js/global.js"></script>
</html>
