<%-- 
    Document   : Sregistration
    Created on : Apr 2, 2019, 7:30:51 AM
    Author     : Acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Industry Registration</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
         <meta charset="UTF-8" />
        <!-- <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">  -->
        
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
        <meta name="description" content="Login and Registration Form with HTML5 and CSS3" />
        <meta name="keywords" content="html5, css3, form, switch, animation, :target, pseudo-class" />
        <meta name="author" content="Codrops" />
        <link rel="shortcut icon" href="../favicon.ico"> 
        <link rel="stylesheet" type="text/css" href="student login handling/css/demo.css" />
        <link rel="stylesheet" type="text/css" href="student login handling/css/style.css" />
		<link rel="stylesheet" type="text/css" href="student login handling/css/animate-custom.css" />
    </head>
    <body>
         <div class="container">
            <!-- Codrops top bar -->
           
                
                
           
            <section>				
                <div id="container_demo" >
                    <!-- hidden anchor to stop jump http://www.css3create.com/Astuce-Empecher-le-scroll-avec-l-utilisation-de-target#wrap4  -->
                    <a class="hiddenanchor" id="toregister"></a>
                    <a class="hiddenanchor" id="tologin"></a>
                    <div id="wrapper">
                        <div id="login" class="animate form">
                            <form  action="Iregvalidation" method="post" enctype="multipart/form-data"> 
                                <h1>Industry Registration</h1> 
                                <p> 
                                    <label for="email" class="uname" data-icon="u" > Your email  </label>
                                    <input id="email" name="iemail" required="required" type="text" placeholder="mymail@mail.com"/>
                                </p>
                                
                                 <p> 
                                    <label for="sname" class="uu" data-icon="u"> Username</label>
                                    <input id="user" name="iname" required="required" type="text" placeholder="eg. Fatzi12" /> 
                                </p>				
                                
                                <p> 
                                    
                                    
                           
                                    <label for="password" class="youpasswd" data-icon="p"> Your password </label>
                                    <input id="password" name="password" required="required" type="password" placeholder="eg. X8df!90EO" /> 
                                </p>
                                <p> 
                                    <label for="password" class="youpasswd" data-icon="p"> confirm password </label>
                                    <input id="password" name="password" required="required" type="password" placeholder="eg. X8df!90EO" /> 
                                </p>
				<p> 
                                    <label  class="uu" data-icon="u"> Company</label>
                                    <input id="user" name="icompany" required="required" type="text" placeholder="eg. Apple" /> 
                                </p>		
                               
                                <p> 
                                    <label  class="uu" data-icon="u"> Address</label>
                                    <input  name="iaddress" required="required" type="text"  /> 
                                </p>	
                                <p> 
                                    <label  class="uu" data-icon="u"> City</label>
                                    <input  name="icity" required="required" type="text"  /> 
                                </p>
                                <p> 
                                    <label  class="uu" data-icon="u"> Country</label>
                                    <input  name="icountry" required="required" type="text"  /> 
                                </p>
                                <p> 
                                    <label  class="uu" data-icon="u"> Postal Code</label>
                                    <input  name="ipostalcode" required="required" type="text"  /> 
                                </p>	
                                <p> 
                                    <label  class="uu" data-icon="u"> About</label>
                                    <input  name="iabout" required="required" type="text"  /> 
                                </p>	
                                <p> 
                                    <label  class="uu" data-icon=""> profile picture</label>
                                    <input type="file" name="image" required="required"/>
                                     
                                </p>	
                                <p class="login button"> 
                                    <input type="submit" value="submit"/> 
				</p>
                                
                            </form>
                        </div>

                        
						
                    </div>
                </div>  
            </section>
        </div>
    </body>
</html>

