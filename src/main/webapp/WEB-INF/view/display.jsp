<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
 Welcome ${currentuser.username}
 
 <a href="./signout" style="color:red">SignOut</a>
<div class="bodypart">
<div class="body1">

<img src="<c:url value="/images/dairy.jpg"/>">
</div>


<div class="body2">
<h1>View ENTRY</h1>

Date ${entry.date}<br>
Description 
<textarea rows="10" cols="30">${entry.description}</textarea>

<br><br><br>
<a href="./userhomepage"><button type="submit">Back to home</button></a>


</div>

</div>

</body>
</html>