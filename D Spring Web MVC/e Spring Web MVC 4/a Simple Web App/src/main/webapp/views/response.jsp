<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Resp Page</title>
</head>
<body>
	<center>
		<h1 style="color: blue; text-align: center;">Displaying Data From
			an Array/Collection</h1>


		<c:forEach var="item" items="${books}">
			<p>Books name: ${item}
			 </p>
		</c:forEach>

	</center>
</body>
</html>