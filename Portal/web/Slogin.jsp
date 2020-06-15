<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Student Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="student login handling/css/studentcss.css">
        <link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/iconic/css/material-design-iconic-font.min.css">
        <link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet">

    </head>
    <body>
        <div class="limiter">
		<div class="container-login100" style="background-image: url('images/bg-01.jpg');">
			<div class="wrap-login100">
                            <form class="login100-form validate-form" action="Svalidate.jsp" method="post" >
					<span class="login100-form-logo">
						<i class="zmdi zmdi-landscape"></i>
					</span>

                                <span class="login100-form-title p-b-34 p-t-27" style="font-family: 'Raleway', sans-serif;">
						Student Login
					</span>

					<div class="wrap-input100 validate-input" data-validate = "Enter username">
						<input class="input100" type="text" name="username" placeholder="Username" style="font-family: 'Raleway', sans-serif;">
						<span class="focus-input100" data-placeholder="&#xf207;"></span>
					</div>

					<div class="wrap-input100 validate-input" data-validate="Enter password">
						<input class="input100" type="password" name="pass" placeholder="Password" style="font-family: 'Raleway', sans-serif;">
						<span class="focus-input100" data-placeholder="&#xf191;"></span>
					</div>

					

					<div class="container-login100-form-btn">
						<button class="login100-form-btn" style="font-family: 'Raleway', sans-serif;">
							Login
						</button>
					</div>

					<div class="text-center p-t-90">
						<a class="txt1" href="Sregistration.jsp" style="font-family: 'Raleway', sans-serif;">
							Still No Account? CLICK HERE...
						</a>
					</div>
				</form>
			</div>
		</div>
	</div>
    </body>
</html>
