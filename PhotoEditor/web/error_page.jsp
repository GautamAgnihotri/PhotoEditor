<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error</title>
        <link rel="stylesheet" href="assets/CSS/ErrorPage.css">
    </head>
    <body>
        <div class="container">
            <div class="imagepng">
                <img src="assets/images/error.png">
            </div>
            <div class="errortext">
                <h1>Sorry !! Something Went Wrong ...</h1><br>
                <%= exception %>
                <a href="index.jsp" id="homebtn">Home</a>
            </div>
        </div>
    </body>
</html>
