<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Farmer Registration</title>
    <link rel="stylesheet" type="text/css" href="style.css"/>
</head>
<body>
    <%@include file="mainnavbar.jsp" %>

    <div class="form-container">
        <h3> Registration</h3>
        <form action="insertfarmer" method="post">
            <label>Enter Name:</label>
            <input type="text" name="farmername" required />
            <br/><br/>

            <label>Select Gender:</label>
            <input type="radio" name="gender" value="Male" required /> Male
            <input type="radio" name="gender" value="Female" required /> Female
            <input type="radio" name="gender" value="Other" required /> Other
            <br/><br/>

            <label>Date of Birth:</label>
            <input type="date" name="dateofbirth" required />
            <br/><br/>

            <label>Contact No:</label>
            <input type="text" name="contactno" required />
            <br/><br/>

            <label>Email:</label>
            <input type="email" name="email" required />
            <br/><br/>

            <label>Password:</label>
            <input type="password" name="password" required />
            <br/><br/>

            <label>Price:</label>
            <input type="text" name="price" required />
            <br/><br/>

            <label>Product:</label>
            <input type="text" name="product" required />
            <br/><br/>

            <label>Expert Name:</label>
            <input type="text" name="expertname" required />
            <br/><br/>

            <button type="submit">Register</button>
            <button type="reset">Clear</button>
        </form>
    </div>
</body>
</html>
