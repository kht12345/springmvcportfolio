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
<form action="/springmvcportfolio/selectMemberAll">
	<div id="wrap">
	<table border="1">
		<tr>
			<th>아이디</th>
			<th>패스워드</th>
			<th>이름</th>
			<th>주소</th>
			<th>전화번호</th>
			<th>이메일</th>
			<th>등록일자</th>
			<th>상태</th>
		</tr>			
		<c:forEach items="${memberlist}" var="member">
			<tr>
				<td>${member.memberid}</td>
				<td>${member.password}</td>
				<td>${member.name}</td>
				<td>${member.address}</td>
				<td>${member.tel}</td>
				<td>${member.email}</td>
				<td>${member.regdate}</td>
				<td>${member.status}</td>
			</tr>
		</c:forEach>
	</table>
	</div>
	<div id="pageBar">
    	<c:out value="${pageBar}" escapeXml="false"/>
    </div>
	<h3>총 ${totalData}명의 멤버가 있습니다.</h3>
	<input type ="submit" value="회원조회" />
</form>
		
</body>
</html>