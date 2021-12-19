
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title> Login Page</title>
 
        <link rel="stylesheet" type="text/css" href="assets/CSS/LoginStyleCSS.css">
       
        <link rel="icon" href="image-solid-24.png" />
        <link href='https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css' rel='stylesheet'>
    </head>
        <body>
            <div class="loginbox">
                
                <h1>Log In </h1>
                <form action="loginServlet" method="post">
                     <p> <i class='bx bxs-user'></i> Username</p>
                     <input type="text" name="email" placeholder="Enter Your Email Id">
                     <p> <i class='bx bxs-lock-alt'></i> Password</p>
                     <input type="password" name="password" placeholder="Enter Password">
                     <button type="submit">Login</button><br>
                     <a href="forgotPassword.jsp"> Forgot password?</a><br>
                     <a href="register.jsp"> Don't have an account?</a>
                 </form>
            </div>
        </body>
    
</html>
