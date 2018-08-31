<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
<head>
<link rel="stylesheet" href="./css/jquery.bxslider.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="./js/jquery.bxslider.js"></script>
  <title>카카오프렌즈 온라인 스토어</title>
	
  <script>
  
    $(document).ready(function(){
		 var result='${result}';
		 if(result!=''){
			 alert(result);
		 }
    	
    	  $('.bxslider').bxSlider({
    		  mode: 'fade',
    		  autoControls: true,
    		  pager: true,
    		  slideWidth: 1200,
    		  slideHeight:1000,
    		});
    });
  </script>	
	
</head>
 <body>
<jsp:include page="./layout/header.jsp"></jsp:include>


<div class="bxslider" >
  <div><img src="./imgs/main_slider1.jpg" ></div>
  <div><img src="./imgs/main_slider2.jpg" ></div>
  <div><img src="./imgs/main_slider3.jpg" ></div>
</div>

<jsp:include page="./layout/footer.jsp"></jsp:include>


</body>

</html>
