<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Information</title>
<!-- Link to the separate external stylesheet -->
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>

	<div class="container">
		<h2>Customer Management System</h2>

		<div style="margin-bottom: 20px;">
		
			<c:url var="AddLink" value="/showForm" />
			<a href="${AddLink}" class="btn btn-update">+ Add New Customer</a>
		</div>


		<table class="customer-table">
			<thead>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>City</th>
					<th colspan="2" class="actions-header">Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="customer" items="${customers}">
					<!-- URL Mapping for Update -->
					<c:url var="UpdateLink" value="updateForm">
						<c:param name="cxid" value="${customer.id}" />
					</c:url>

					<!-- URL Mapping for Delete -->
					<c:url var="DeleteLink" value="deleteData">
						<c:param name="cxid" value="${customer.id}" />
					</c:url>

					<tr>
						<td>${customer.firstName}</td>
						<td>${customer.lastName}</td>
						<td>${customer.city}</td>
						<td class="action-cell"><a href="${UpdateLink}"
							class="btn btn-update">Update</a></td>
						<td class="action-cell"><a href="${DeleteLink}"
							class="btn btn-delete"
							onclick="return confirm('Are you sure you want to delete this customer?');">Delete</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>
