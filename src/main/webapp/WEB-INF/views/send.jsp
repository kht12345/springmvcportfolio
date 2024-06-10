<%@ page language="java" contentType="text/html; charset=UTF-8" 
	isELIgnored="false" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
	function sendtest() {
		let url = "/springmvcportfolio/receive";
		fetch(url + "?num=1&message=hello")
		.then(res=>{
			res.text().then(function(text) {
				console.log(text);
			})
		})
		.catch(err=> {
			console.log(err);
		})
	}
</script>
</head>
<body>
<h2>Spring Container Test</h2>
<button onclick="sendtest()">Click</button>
</body>
</html>
