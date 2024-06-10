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
<form action="/springmvcportfolio/searchgoods">

	<table border="1">
		<tr>
			<th>상품코드</th>
			<th>상품명</th>
			<th>상품설명</th>
			<th>공급업자</th>
			<th>상품가격</th>
			<th>등록일자</th>
		</tr>			
		<c:forEach items="${goodslist}" var="goods">
			<tr>
				<td><a href="/springmvcportfolio/goods?goodscd=${goods.goodscd}">${goods.goodscd}</a></td>
				<td>${goods.goodsname}</td>
				<td>${goods.description}</td>
				<td>${goods.providercd}</td>
				<td>${goods.price}</td>
				<td>${goods.regdate}</td>
			</tr>
		</c:forEach>
	</table>
	<input type="text" name="goodscd"  />
	<input type ="submit" value="상품조회" />
</form>
		
</body>
</html>