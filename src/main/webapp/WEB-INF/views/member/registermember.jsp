<%@ page language="java" contentType="text/html; charset=UTF-8"
    isELIgnored="false" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link rel="stylesheet" href="/springmvcportfolio/css/member.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<!-- <script type="text/javascript" src="/springmvcportfolio/js/main.js"></script> -->
<script>
	$(document).ready(function(){
		$("#memberid").change(function() {
			$.ajax({
				url: '/springmvcportfolio/validateUser',
				data: {
					memberid:$("#memberid").val()
				},
				
				success: function(responseText) {
					$("#errMsg").text(responseText);
					
					if(responseText != "") {
						$("#memberid").focus();
					}
				}
			});
		});
	});
</script>
</head>
<body>

	<form action="/springmvcportfolio/regmember" method="get" class="member-form">
		<div class="member-form">
			<label for="memberid">아이디: </label>
			<input type="text" name="memberid" id="memberid" required /><span id="errMsg"></span>
			<label for="passwd">패스워드: </label>
			<input type="password" name="passwd" id="passwd" required />
			<label for="name">이름: </label>
			<input type="text" name="name" id="name" required />
		</div>
		<div class="member-form">
			<label for="address">주소: </label>
			<input type="text" name="address" id="address" required />
			<label for="tel">연락처: </label>
			<input type="tel" name="tel" id="tel" required />      
			<label for="email">이메일: </label>
			<input type="email" name="email" id="email" required />
		</div>
		<div class="member-form">
			<input type="submit" value="회원가입" />
		</div>
	</form>
	<h1>${result}</h1>
	<h3>${code}</h3>
	<h3>${msg}</h3>
</body>
</html>
