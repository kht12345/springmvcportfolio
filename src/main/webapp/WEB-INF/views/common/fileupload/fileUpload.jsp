<%@ page language="java" contentType="text/html; charset=UTF-8"
    isELIgnored="false" pageEncoding="UTF-8"%>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>File Upload Example</title>
</head>
<body>
	<form:form action="/springmvcportfolio/fileupload" method="post" enctype="multipart/form-data">
         파일을  선택해 주십시오. <br /> 
         <input type = "file" name = "file" />
         <input type = "submit" value = "업로드" />
    </form:form>
</body>
</html>