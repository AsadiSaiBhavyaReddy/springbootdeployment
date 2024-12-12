<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Update Farmer</title>
</head>
<body>
    <h2>Update Farmer Details</h2>
    <form action="/updatefarmer" method="post">
        <input type="hidden" name="id" value="${farmer.id}"/>
        <label>Name:</label><input type="text" name="farmername" value="${farmer.farmername}"/><br>
        <label>Gender:</label><input type="text" name="gender" value="${farmer.gender}"/><br>
        <label>Date of Birth:</label><input type="date" name="dateofbirth" value="${farmer.dateofbirth}"/><br>
        <label>Contact No:</label><input type="text" name="contactno" value="${farmer.contactno}"/><br>
        <label>Email:</label><input type="text" name="email" value="${farmer.email}"/><br>
        <label>Product:</label><input type="text" name="product" value="${farmer.product}"/><br>
        <input type="submit" value="Update"/>
    </form>
</body>
</html>
