<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Customer</title>
    <!-- FIX: Dynamically maps the context path to ensure the stylesheet always loads -->
    <c:url var="cssUrl" value="/css/updatecss.css" />
    <link rel="stylesheet" type="text/css" href="${cssUrl}">
</head>
<body>

    <div class="form-container">
        <h2>Register New Customer</h2>
        
        <!-- FIX: Evaluates the form endpoint into /CRM/registerCustomer dynamically -->
        <c:url var="formActionUrl" value="/registerCustomer" />
        <form action="${formActionUrl}" method="POST">
            
            <div class="form-group">
                <label for="firstName">First Name</label>
                <input type="text" id="firstName" name="firstName" required placeholder="Enter first name" />
            </div>
            
            <div class="form-group">
                <label for="lastName">Last Name</label>
                <input type="text" id="lastName" name="lastName" required placeholder="Enter last name" />
            </div>
            
            <div class="form-group">
                <label for="city">City</label>
                <input type="text" id="city" name="city" required placeholder="Enter city" />
            </div>
            
            <div class="form-actions">
                <button type="submit" class="btn btn-save">Add Customer</button>
                
                <!-- FIX: Evaluates the cancel path into /CRM/cxinfo dynamically -->
                <c:url var="cancelUrl" value="/cxinfo" />
                <a href="${cancelUrl}" class="btn btn-cancel">Cancel</a>
            </div>
            
        </form>
    </div>

</body>
</html>
