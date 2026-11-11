<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reg Page</title>
</head>
<body>
	<h1 style="color: Orange; text-align: center;">Register Here</h1>

<div style="color: Red; text-align: center;">
	<form action="/reg" method="post">
		<table >
			<tr>
				<th>Employee Id</th>
				<td><input type="text" name="id"></td>
			</tr>

			<tr>
				<th>Employee Name</th>
				<td><input type="text" name="ename"></td>
			</tr>

			<tr>
				<th>Employee City</th>
				<td><input type="text" name="ecity"></td>
			</tr>

			<tr>
				<th>Employee Salary</th>
				<td><input type="text" name="esalary"></td>
			</tr>

			<tr>

				<td><input type="submit" value="Register"></td>
			</tr>

		</table>

	</form>
</div>
</body>
</html>