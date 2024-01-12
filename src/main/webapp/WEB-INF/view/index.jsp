<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MY DAIRY APP</title>
<link rel="stylesheet" href="<c:url value="/cs/style.css"/>">
</head>
<body>

<div class="header">

<div class="first">

<img src="<c:url value="/images/dairy.jpg"/>" width="60" height="60">

</div>

<div class="second">
MYDAIRY APP
</div>
<br><br>

</div>
<hr/>

<div class="bodypart">
<div class="body1">

<img src="<c:url value="/images/dairy.jpg"/>">
</div>


<div class="body2">
<h1>LOGIN FORM</h1>
<form action="authenticate" method="post">

Username <input type="text" name="username" class="formcontrol"><br>
Password <input type="text" name="password" class="formcontrol"><br>
<button type="submit">LOGIN</button>

</form>
<br><br>
New user <a href="./register">click here</a> to register

</div>

</div>

</body>
</html>