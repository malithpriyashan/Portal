<%-- 
    Document   : index
    Created on : Jul 10, 2018, 7:31:05 PM
    Author     : Saroj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <link href='calendarparts/css/fullcalendar.min.css' rel='stylesheet' />
        <link href='calendarparts/css/fullcalendar.print.min.css' rel='stylesheet' media='print' />
          <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
              <link href="assets/css/animate.min.css" rel="stylesheet"/>
    

    <link href="assets/css/light-bootstrap-dashboard.css?v=1.4.0" rel="stylesheet"/>
    <link href="assets/css/demo.css" rel="stylesheet" />
    <link href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
            <link href='http://fonts.googleapis.com/css?family=Roboto:400,700,300' rel='stylesheet' type='text/css'>
    <link href="assets/css/pe-icon-7-stroke.css" rel="stylesheet" />
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">

        <script src='calendarparts/js/moment.min.js'></script>
        <script src='calendarparts/js/jquery.min.js'></script>
        <script src='calendarparts/js/fullcalendar.min.js'></script>

       
 <script type="text/javascript" src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

        <script>
            $(document).ready(function () {

                $('#calendar').fullCalendar({
                    defaultDate: '2018-07-01',
                    editable: true,
                    eventLimit: true, // allow "more" link when too many events
                    events: "CalendarJsonServlet"
                });

            });

        </script>
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
		
       <a href="Uaddcalendar.jsp"> <button type="button" class="btn btn-primary" style="width: 100%;color:black;text-decoration: none;">Add events</button></a>
       

        <div id="calendar"></div>
 </div>
</div>

    </body>
    	<script src="assets/js/chartist.min.js"></script>
    <script src="assets/js/bootstrap-notify.js"></script>
    <script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE"></script>
	<script src="assets/js/light-bootstrap-dashboard.js?v=1.4.0"></script>

</html>
