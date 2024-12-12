<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>View Farmers</title>
</head>
<body>
    <h2>Farmers List</h2>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Contact No</th>
            <th>Email</th>
            <th>Product</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="farmer" items="${farmers}">
            <tr>
                <td>${farmer.id}</td>
                <td>${farmer.farmername}</td>
                <td>${farmer.contactno}</td>
                <td>${farmer.email}</td>
                <td>${farmer.product}</td>
                <td>
                    <a href="updatefarmer/${farmer.id}">Update</a> |
                    <a href="deletefarmer/${farmer.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
