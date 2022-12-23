<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous"></script>
<link rel="stylesheet" href="/resources/css/member/login.css">

 <style>
 	.bback {
  	}
      .wrap {
        height: 800px;
        background-color: #eeeeee;
      /*    background:url('resources/img/mLogo.png')  #fff; */
      /* background-image: img src="resources/img/mLogo.png" */
      
       	background-image: url( '../resources/img/loginpic.png' ); 
        background-size: 800px;
        background-repeat: no-repeat;
        background-position: center center;
      }
      .jb:hover {
        background-color: #cccccc;
      }
    </style>


</head>
<body>

<div class="bback"><br><br></div>

<div class="wrapper">
	
	<div class="wrap">
		<form id="login_form" method="post">
			<div class="logo_wrap">
				<span>해산물 밀키트 </span><br>
				<span>ThreeScoops</span><br><br><br><br>
				<span>환영합니다!</span>
			</div>
			<div class="login_wrap"> 
				<div class="id_wrap">
						<div class="id_input_box">
						<input class="id_input" name="memberId" placeholder="아이디를 입력하세요">
					</div>
				</div>
				<div class="pw_wrap">
					<div class="pw_input_box">
						<input class="pw_iput" name="memberPw" placeholder="비밀번호를 입력하세요">
					</div>
				</div>
				
				<!--아이디 비번 잘못 입력시  -->
				<c:if test = "${result == 0 }">
					<div class = "login_warn">사용자 ID 또는 비밀번호를 잘못 입력하셨습니다.</div>
				</c:if>
				
				<div class="login_button_wrap">
					<input type="button" class="login_button" value="로그인">
				</div>			
			</div>
		</form>
		
	</div>

</div>

<script>

	/* 로그인 버튼 클릭 메서드 */
	$(".login_button").click(function(){
		
		//alert("로그인 버튼 작동");
		
		/* 로그인 메서드 서버 요청 */
		$("#login_form").attr("action", "/member/login.do");
		$("#login_form").submit();
		
	});

</script>

</body>
</html>