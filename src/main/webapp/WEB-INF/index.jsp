<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel = "stylesheet" type = "text/css" href = "css/style.css">
<title>Login page</title>
</head>
<body>
	<div>
		<p class = "error"><c:out value = "${ errors }" /></p>
		<p>What is the code?</p>
		<form method = "POST" action = "/code">
			<input type = "text" name = "name" >
			<button>Try Code</button>
		</form>
	</div>
	

</body>
</html>