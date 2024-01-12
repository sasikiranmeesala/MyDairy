<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UPDATE ENTRY</title>
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
 Welcome ${user.username}
 <a href="./signout" style="color:red">SignOut</a>
<div class="bodypart">
<div class="body1">

<img src="<c:url value="/images/dairy.jpg"/>">
</div>


<div class="body2">
<h1>UPDATE ENTRY</h1>
<form action="processentryupdate">

Date <input type="text" name="date" class="formcontrol" value=" ${entry.date}" readonly ><br><br>
Description 
<textarea  name="description" rows="10" cols="30">${entry.description}</textarea>

<br><br><br>
<input type="hidden" name="userid" value="${currentuser.id}">
<input type="hidden" name="id" value="${entry.id}">
<button type="submit">Update Entry</button>

</form>
</div>

</div>

</body>
</html>