<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<h2>업체 정보 조회</h2>
	<form name="form3" method="POST">
		<table border="1">
			<tr>
				<td>이름</td>
				<td><input name="ename" value="${hMyInfo.hname}" readonly></td>
			</tr>
			<tr>
				<td>이메일</td>
				<td><input name="grade" value="${hMyInfo.grade}" readonly></td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td><input name="location" value="${hMyInfo.location}"></td>
			</tr>
			<tr>
				<td>직급</td>
				<td><input name="hmail" value="${hMyInfo.hmail}"></td>
			</tr>
			<tr>
				<td>상태</td>
				<td><input name="hphone" value="${hMyInfo.hphone}"></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="button" value="수정" onclick="location.href='/springmvcportfolio/#'">
					<input type="button" value="확인" onclick="location.href='/springmvcportfolio/hSuccess'">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>