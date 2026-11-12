<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Update Customer Form</title>
    <!-- Links to our unified external stylesheet -->
    <link rel="stylesheet" type="text/css" href="css/updatecss.css">
</head>
<body>

    <div class="form-container">
        <h2>Update Customer Details</h2>
        
          <c:url var="FormAction" value="/registerCustomer" />
        <form action="${FormAction}" method="POST">
            
            <!-- CRITICAL: Hidden field keeps track of the Customer ID during database submission -->
            <input type="hidden" name="id" value="${customer.id}" />
            
            <div class="form-group">
                <label for="firstName">First Name</label>
                <input type="text" id="firstName" name="firstName" value="${customer.firstName}" required placeholder="Enter first name" />
            </div>
            
            <div class="form-group">
                <label for="lastName">Last Name</label>
                <input type="text" id="lastName" name="lastName" value="${customer.lastName}" required placeholder="Enter last name" />
            </div>
            
            <div class="form-group">
                <label for="city">City</label>
                <input type="text" id="city" name="city" value="${customer.city}" required placeholder="Enter city" />
            </div>
            
            <div class="form-actions">
                <button type="submit" class="btn btn-save">Update</button>
                
                
                <c:url var="CancelLink" value="/cxinfo" />
                <a href="${CancelLink}" class="btn btn-cancel">Cancel</a>
            </div>
            
        </form>
    </div>

</body>
</html>
