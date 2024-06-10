<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
 <head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
 </head>
 <body>
	<h2>내 정보 조회</h2>
	  <form name="hg" method="POST">
		<table border="1">
			<tr>
				<td>이름</td>
				<td><input name="cname" value="${cMyInfo.cname}" readonly="readonly"></td>
			</tr>
			<tr>
				<td>영문 이름</td>
				<td><input name="firstname" value="${cMyInfo.firstname}" readonly="readonly"></td>
			</tr>
			<tr>
				<td>영문 성</td>
				<td><input name="lastname" value="${cMyInfo.lastname}" readonly="readonly"></td>
			</tr>
			<tr>
				<td>이메일</td>
				<td><input name="cmail" id="cmail" value="${cMyInfo.cmail}"></td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td><input name="cphone" id="cphone" value="${cMyInfo.cphone}"></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="button" value="수정" onclick="location.href='/springmvcportfolio/updateCustomer'">
					<input type="button" value="확인" onclick="location.href='/springmvcportfolio/cSuccess'">
				</td>
			</tr>
		</table>
	  </form>
 </body>
</html>