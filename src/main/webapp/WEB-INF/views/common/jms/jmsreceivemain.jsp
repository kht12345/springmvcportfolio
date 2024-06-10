<%@ page language="java" contentType="text/html; charset=UTF-8"
    isELIgnored="false" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JMS 테스트</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<script>
//<![CDATA[
/* $(document).ready(function() {
	timer = setInterval(function() {
		$.ajax( {
			url:'http://192.168.10.5:9000/springmvcportfolio/jmsreceive',
			cache: false,
			success:function(data) {
				$('#stage').html(data);
			},
			type: 'GET'
		});	
	}, 3000);
}); */

//]]>
</script>

</head>
<body>
<div id="stage" style="background-color:yellow;">
STAGE
</div>
<script>
$(document).ready(function() {
	timer = setInterval(function() {
		$.ajax( {
			url:'http://192.168.10.5:9000/springmvcportfolio/jmsreceive',
			cache: false,
			success:function(data) {
				$('#stage').html(data);
			},
			type: 'GET'
		});	
	}, 3000);
});
</script>
</body>
</html>