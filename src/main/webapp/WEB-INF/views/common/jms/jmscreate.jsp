<%@ page language="java" contentType="text/html; charset=UTF-8"
    isELIgnored="false" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JMS 테스트</title>
</head>
<body>
	<form action="/springmvcportfolio/jmsprocess" method="get" class="member-form">
		<div class="member-form">
			<label for="message">전송메시지</label>
			<input type="text" name="message" id="message" required /><span id="errMsg"></span>
		</div>
		<div class="member-form">
			<input type="submit" value="메시지전송" />
		</div>
	</form>
	
	<h3>${success}</h3>
</body>
</html>