<%@page import="MyHelperClasses.ConnectionProvider"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <title>Sign Up | Web Photo Editor </title>

        <link rel="stylesheet" type="text/css" href="assets/CSS/SignUpCSS.css">
        <link rel="icon" href="image-solid-24.png" />
        <link href='https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css' rel='stylesheet'>
        
       
    </head>
    <body>
        <div class="signup">
            <h1>Sign Up</h1>
            
          
            <form action="registerServlet" method="post">

                <p> <i class='bx bxs-user'></i> Username</p>
                <input placeholder="Enter Username" type="text" name="Username" required/>
                <p> <i class='bx bxs-envelope'></i> Email</p>
                <input placeholder="Enter Email" type="email" name="Email" required/>
                <p> <i class='bx bx-phone'></i> Mobile No.</p>
                <input placeholder="Enter Mobile No." type="tel" name="Mobile_Number" required/>
                <p> <i class='bx bxs-lock-alt'></i> Password</p>
                <input placeholder="Enter Password" type="password" name="Pass1" required/>
                <p> <i class='bx bxs-lock-alt'></i> Confirm Password</p>
                <input placeholder="Confirm Password" type="password" name="Pass2" required/>
                <button type="submit"> Sign Up </button>
                
            </form>
        </div>
    </body>
</html>

