<%@ page language="java" contentType="text/html; charset=UTF-8"
    isELIgnored="false" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인페이지</title>
<link rel="stylesheet" href="/springmvcportfolio/css/goods.css">
<script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$('#cartin').click(function() {
			/* $('form#update').attr("action", "/springmvcportfolio/registercart").attr("method", "post").submit(); */
			$('form#update').attr("action", "/springmvcportfolio/registercart").submit();
		});
	});
</script>
</head>
<body>
<form id="update" action="/springmvcportfolio/goodsupdate" method="get" class="member-form">
	<div class="goods-form">
		<label for="goodscd">상품코드</label>
		<input id="forbidden" type="text" name="goodscd" value="${goods.goodscd}" readonly="readonly" />
		<label for="goodsname">상품명</label>
		<input id="forbidden" type="text" name="goodsname" value="${goods.goodsname}" readonly="readonly" />
		<label id="bold" for="description">*상품설명</label>
		<input type="text" name="description" value="${goods.description}" required="required" />
		<label for="providercd">공급업자</label>
		<input id="forbidden"  type="text" name="providercd" value="${goods.providername}" readonly="readonly" required="required" />
		<label id="bold" for="goodscd">*상품가격</label>
		<input type="text" name="price" value="${goods.price}" required="required" />
		<label for="goodscd">등록일자</label>
		<input id="forbidden" type="text" name="regdate" value="${goods.regdate}" readonly="readonly" />
	</div>
	<div class="goods-form">
		<input type ="submit" value="수정" />
		<input type ="button" id="cartin" value="장바구니" />
	</div>
</form>
<%-- <form id="cart" action="/springmvcportfolio/registercart" method="get" class="member-form">
	<input type="hidden" name="goodscd" value="${goods.goodscd}" />
	<input type="hidden" name="goodsname" value="${goods.goodsname}" />
	<input type="hidden" name="description" value="${goods.description}" />
	<input type="hidden" name="providercd" value="${goods.providername}" />
	<input type="hidden" name="price" value="${goods.price}" />
	<input type="hidden" name="regdate" value="${goods.regdate}" />
	<input type ="button" id="cartin" value="장바구니" />
</form> --%>
	<h1>${result}</h1>
	<h3>${code}</h3>
	<h3>${msg}</h3>		
</body>
</html>