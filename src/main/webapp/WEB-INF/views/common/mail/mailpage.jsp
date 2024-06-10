<%@ page language="java" contentType="text/html; charset=UTF-8"
    isELIgnored="false" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<link rel="stylesheet" href="/springmvcportfolio/css/mail.css">
</head>
<body>
	<form action="/springmvcportfolio/mailsend" method="get" class="email-form">
		<div class="email-form">
			<label for="receiver">수신자 </label>
			<input type="text" name="receiver" id="receiver" required />
			<label for="title">제목 </label>
			<input type="text" name="title" id="title" required />	
			<label for="contents">내용 </label>
			<textarea name="contents" id="contents" rows="5" cols="5" placeholder="내용을 입력해 주세요." required></textarea>
		</div>
		<div class="email-form">
			<input type="submit" value="메일보내기" />
		</div>
	</form>
	<h1>${result}</h1>
	<h3>${code}</h3>
	<h3>${msg}</h3>
</body>
</html>