<%@ page language="java" contentType="text/html; charset=UTF-8"
    isELIgnored="false" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인페이지</title>
</head>
<body>
		<table border="1">
			<tr>
				<th>아이디</th>
				<th>패스워드</th>
				<th>이름</th>
				<th>주소</th>
				<th>연락처</th>
				<th>이메일</th>
				<th>가입일</th>
				<th>상태</th>
			<tr>	
			<tr>
				<td>${member.memberid}</td>
				<td>${member.password}</td>
				<td>${member.name}</td>
				<td>${member.address}</td>
				<td>${member.tel}</td>
				<td>${member.email}</td>
				<td>${member.regdate}</td>
				<td>${member.status}</td>
			<tr>				
<%-- 			<c:forEach items="${users}" var="user">
				<tr>
					<td>${user.id}</td>
					<td>${user.name}</td>
					<td>${user.email}</td>
				</tr>
			</c:forEach> --%>
		</table>
		
		<br /><br />
		<form action="/springmvcportfolio/logout">
			<input type ="submit" value="로그아웃" />
		</form>
</body>
</html>