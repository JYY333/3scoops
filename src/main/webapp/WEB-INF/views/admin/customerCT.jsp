<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>    
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<h1>고객센터입니다222</h1>
<title>Insert title here</title>
<link rel="stylesheet" href="../resources/css/admin/customerCT.css">
<script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous">
</script>

  <script src="https://cdn.ckeditor.com/ckeditor5/26.0.0/classic/ckeditor.js"></script>
  
 <style type="text/css">
	#result_card img{
		max-width: 100%;
	    height: auto;
	    display: block;
	    padding: 5px;
	    margin-top: 10px;
	    margin: auto;	
	}
	
.FSize { font-size: xx-large; }	
	
</style>

</head>

<body>
<%@include file="../includes/admin/cutomerCTHeader.jsp" %>

	<div class="parent">
        <div class="first"><button class="b1" type="button" onclick="location.href='/main'">공지사항</button></div>
<!--    <a href="/main">고객센터</a> -->
        <div class="first"><button class="b2" type="button" onclick="location.href='/main'">자주묻는 질문</button></div>
        <div class="first"><button class="b3" type="button" onclick="location.href='/admin/customerqna'">QnA</button></div>
        
        
        
        <!-- <div class="second">자주묻는 질문</div>
        <div class="third">QnA</div> -->
    </div>



               

</body>
</html>