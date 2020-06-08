<%@page import="java.util.logging.Logger"%>
<%@page import="java.util.logging.Logger"%>
<%@page import="java.util.logging.Level"%>
<%@page import="java.util.logging.Level"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="utf-8" />
	<link rel="icon" type="image/png" href="assets/img/favicon.ico">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />

	<title>Forum</title>

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
                    <a href="Suserprofile.jsp">
                        <i class="pe-7s-user"></i>
                        <p>User Profile</p>
                    </a>
                </li>
                <li >
                    <a href="Sevent.jsp">
                        <i class="fas fa-user-friends"></i>
                        <p>Events</p>
                    </a>
                </li>
                <li>
                <li class="active">
                    <a href="Squestions.jsp">
                        <i class="far fa-question-circle"></i>
                        <p>Forum</p>
                    </a>
                </li>
                <li>
                    <a href="Scalendar.jsp">
                        <i class="far fa-calendar-alt"></i>
                        <p>Calendar</p>
                    </a>
                </li>
                <li >
                    <a href="Sapplyjob.jsp">
                       <i class="icon ion-md-document"></i>

                        <p>Job Application</p>
                    </a>
                </li>
                <li >
                    <a href="Svacancyapply.jsp">
                    <i class="icon ion-md-journal"></i>
                        <p>Jobs Available</p>
                    </a>
                </li>
				
            </ul>
    	</div>
    </div>

    <div class="main-panel">
		


        <div class="content">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-md-10">
                        <div class="card">
                            <div class="header">
                                <h2 class="title" style="font-family: 'Montserrat', sans-serif; text-align: center;" >Post Your Answers</h2>
                            </div>
                            <div class="content" style="height: 600px;">
                             
                                <div class="row">
                    <div class="box-panel">
                        
                        <hr>
                        <table align="center" cellpadding="10" cellspacing="10" border="0" style="width:100%;">
              
                            <%
                                 java.sql.Connection connection = null;

                                try
                                    {
                                        String driverName = "com.mysql.jdbc.Driver";
                        String connectionUrl = "jdbc:mysql://localhost:3306/";
                        String dbName = "javaproject";
                        String userId = "root";
                        String password = "";
                        
                        Class.forName(driverName);
                        connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);

                                        PreparedStatement pst = connection.prepareStatement(" SELECT * FROM question order by id desc");
                                        ResultSet rs = pst.executeQuery();
                                        while(rs.next())
                                    {
                            %>

                            <tr>

                                <td style="border-bottom: 3px dotted #F80000;padding-top: 25px; width: 1000px"><ul><li><a style="color: black;" href="Sanswerpage.jsp?id=<%=rs.getString("id")%>" ><%= rs.getString("title") %></a></li></ul></td>
                                <td> <i style="padding-right: 60px;">posted by : </i></td>
                            </tr>
                              <% 
                                    }

                                    }  
                                catch (Exception e) 
                                    {
                                        e.printStackTrace();
                                    }
                              %>
                        </table>
                    </div>
                </div>
                            </div>
                        </div>
                    </div>
                    
                </div>
            </div>
        </div>
        
        <div class="content" >
            <div class="container-fluid" >
                <div class="row">
                    <div class="col-md-10">
                        <div class="card"style="background-color:  #E0E0E0;">
                            <div class="header">
                                
                            </div>
                            <div class="content" style="height: 675px;">
                             
                                <div class="row"style="color:black;">
                    
                                     
                       
                        <!-- form login -->
                        <form class="margin-top-40" action="SAddquestion" method="post" style="margin-left: 30px;" >
               
                    <label style="color: #C93535;" >Question Title</label>
                  <input type="text" placeholder="Place your title here" class="form-control" name="title" style="width: 97%;">
                
                 <label style="color: #C93535;">Category</label>
                  <select class="questions-category form-control" tabindex="-1" aria-hidden="" name="category" style="width: 97%;">
                    <option value="IT">IT</option>
                    <option value="Business">Business</option>
                    <option value="Engineering">Engineering</option>
                    <option value="Art">Art</option>
                    <option value="Other">Other</option>
                  </select>
                
                  
               
                
                 
                    
                
                  <label style="color: #C93535;">Tags</label>
                  <input type="text" placeholder="Place your tags here" class="form-control" name="tags" style="width: 97%;">
             
                  <label style="color: #C93535;">Question Detials</label>
                  <textarea cols="12" rows="12" placeholder="Post Your Question Details Here....." name="question" class="form-control" style="width: 97%;"></textarea>
              
                <label style="color: #C93535;">Image</label>
                  <input class="input--style-4" type="file" name="image">
                  
              
                    <p style="text-align: center"><button class="btn btn-primary " value="submit">Post </button></p>
               <!-- <button class="btn btn-primary pull-right" value="reset">Reset</button>-->
              


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
