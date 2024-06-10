<%@ page language="java" contentType="text/html; charset=UTF-8"
    isELIgnored="false" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<link rel="stylesheet" href="/springmvcportfolio/css/member.css">
</head>
<body>

	<form action="/springmvcportfolio/loginprocess" method="get" class="member-form">
		<div class="member-form">
			<label for="memberid">아이디: </label>
			<input type="text" name="memberid" id="memberid" required />
			<label for="password">패스워드: </label>
			<input type="password" name="password" id="passwd" required />
		</div>
		<div class="member-form">
			<input type="submit" value="로그인" />
		</div>
	</form>
	<h1>${result}</h1>
	<h3>${code}</h3>
	<h3>${msg}</h3>
</body>
</html>