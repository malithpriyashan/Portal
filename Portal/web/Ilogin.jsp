<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Industry Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="industry handling/indus.css" type="text/css" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet">
    </head>
    
    <body>
        <div class="loginbox">
            <img src="industry handling/avatar.png" class="avatar">
             <h1>Industry Login</h1>
             <form action="Ivalidate.jsp" method="post" style="font-family: 'Raleway', sans-serif;">
            <p>Username</p>
            <input type="text" name="username" placeholder="Enter Username">
            <p>Password</p>
            <input type="password" name="pass" placeholder="Enter Password">
            <input type="submit" name="ubtn" value="Login">
            
            <a href="Iregistration.jsp">Don't have an account?</a>
        </form>
        </div>
    </body>
</html>
