<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>University Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="university handling/unicss.css" type="text/css" rel="stylesheet">
    </head>
    <body>
        <div class="loginbox">
            <img src="university handling/avatar.png" class="avatar">
             <h1>University Login</h1>
             <form action="Uvalidate.jsp" method="post">
            <p>Username</p>
            <input type="text" name="username" placeholder="Enter Username">
            <p>Password</p>
            <input type="password" name="pass" placeholder="Enter Password">
            <input type="submit" name="ubtn" value="Login">
            
            <a href="Uregistration.jsp">Don't have an account?</a>
        </form>
        </div>
    </body>
</html>
