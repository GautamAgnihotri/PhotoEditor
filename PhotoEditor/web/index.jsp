<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="error_page.jsp" %>
<%@page import=" MyEntities.User" %>
<%
User user=(User)session.getAttribute("currentUser");
if(user==null){
   
response.sendRedirect("Home.html");
}
    
%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=dev ice-width, initial-scale=1.0">
	<title>PHOTO EDITOR</title>
	
	<link rel="stylesheet" href="assets/CSS/style.css">
	<link href='https://unpkg.com/boxicons@2.0.9/css/boxicons.min.css' rel='stylesheet'>
   
</head>
<body>

	<div class="main">
		
      <div class="Tools">
      	<ul>
      		<li>
      	 		<i class='bx bxs-brightness-half'></i>
      			<p>BrightNess</p>
      		</li>
      		<li>
      			<i class='bx bxs-brush' ></i>
      			<p>Blur</p>
      		</li>
      		<li>
      			<i class='bx bxs-collection' ></i>
      			<p>GreyScale</p>
      		</li>
      		<li>
      			<i class='bx bxs-color-fill' ></i>
      			<p>Hue Rotate</p>
      		</li>
      	
			<li>
				<i class='bx bxs-magic-wand' ></i>
				<p>Saturation</p>
			</li>
			
			<li>
				<i class='bx bx-pencil'></i>
				<p>Draw</p>
			</li>
			
			<li>
				<i class='bx bx-crop'></i>
				<p>Crop</p>
			</li>
			
      		<li onclick="Download_btn()">
      			<i class='bx bx-export' ></i>
      			<p>Export</p>
      		</li>
      	</ul>
      </div>

      <div class="content">
      	
		<p id="logo"><i class='bx bx-ghost'></i>Photo Editor</p>
                <a href="profile.jsp"  id="homeLogin"><i class='bx bx-user-circle bx-sm'></i>  <%= user.getU_name()%> </a>

      	<div  class="choose_image">
      		<div class="upload_img_box">
      			<i class='bx bxs-image-add' ></i><br>
      			<input type="file" name="selectedImage" id="selectedImage" accept="image/jpeg, image/png">
      			<p id="hint">choose Image from folder </p>
      		</div>
      	</div>

      	<canvas id="image_canvas"></canvas>
        
        <div class="image_holder">
        	<button id="remove_img_btn"><i class='bx bxs-message-square-x' ></i></button>
        	<img src="" alt="img" id="image">
        </div>

        <div class="options">
        	
          <div class="option">
          	<input type="range" max="200" min="0" value="100" id="brightness" class="slider">
          	<p id="brightVal" class="show_value">100</p>
          </div>

           <div class="option">
          	<input type="range" max="40" min="0" value="0" id="blur" class="slider">
          	<p id="blurVal" class="show_value">0</p>
          </div>

           <div class="option">
          	<input type="range" max="100" min="0" value="0" id="greyScale" class="slider">
          	<p id="greyVal" class="show_value">0</p>
          </div>

           <div class="option">
          	<input type="range" max="100" min="0" value="0" id="hue" class="slider">
          	<p id="hueVal" class="show_value">0</p>
          </div>

           <div class="option">
          	<input type="range" max="100" min="1" value="1" id="saturation" class="slider">
          	<p id="saturationVal" class="show_value">1</p>
          </div>

		  <div class="option">
			
			
			<span class="dTool " id="pencil"><i class='bx bxs-pencil bx-lg' ></i></span>
			<span class="dTool" id="paint"><i class='bx bx-paint bx-lg'></i></span>
			<span class="dTool" id="spray"><i class='bx bx-spray-can bx-lg'></i></span>
			<span class="dTool" id="shape"><i class='bx bxs-shapes'></i></span>
			<span class="dTool" id="color"><input type="color" name="colorchooser" ></span>
			<span class="dTool"><input type="range" max="100" min="1" value="1" id="brushSize" class="slider"></span>
		
		  </div>

        </div>

        <button id="clearAll"><span>Reset</span><i class='bx bx-reset' ></i></button>

      </div>

	</div>

	
	
	 <script src="assets/js/indexScript.js"></script>
	
</body>
</html>
