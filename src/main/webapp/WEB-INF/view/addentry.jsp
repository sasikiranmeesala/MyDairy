<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ADD ENTRY</title>
<link rel="stylesheet" href="<c:url value="/cs/style.css"/>">
</head>
<body>

<div class="header">

<div class="first">

<img src="<c:url value="/images/dairy.jpg"/>" width="60" height="60">

</div>
<div class="second">
MY DAIRY APP
</div>
<br><br>
<hr/>

</div>
<hr/>
Welcome ${currentuser.username} 
 
<div class="bodypart">
 <a href="./signout" style="color:red">SignOut</a>
<div class="body1">

<img src="<c:url value="/images/dairy.jpg"/>">
</div>


<div class="body2">
<h1>ADD ENTRY</h1>
<form action="saveentry" method="post">

Date <input type="date" name="date" class="formcontrol"><br>
Description <input type="text" name="description"  class="formcontrol">
<input type="hidden" name="userid" value="${currentuser.id}">
<br><br><br>
<button type="submit">Save Entry</button>

</form>
</div>

</div>

</body>
</html>