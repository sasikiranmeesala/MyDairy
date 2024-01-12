<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>user home page</title>
<link rel="stylesheet" href="<c:url value="/cs/style.css"/>">
</head>
<body>



<div class="header">

<div class="first">

<img src="<c:url value="/images/dairy.jpg"/>" width="60" height="60"><br><br>
WELCOME <span style="color:SteelBlue">${currentuser.username}</span>
</div>

<div class="second">
MY DAIRY APP
</div>
<br><br>

</div>
<hr/>
<a href="./signout" style="color:red" class="signout">SignOut</a>

<br><br>

<div class="userhome">


<br><br><br>

<span class="heading">List of Entries</span>

<a href="./addentry"><button type="button" class="addbtn">Add Entry</button></a>

<br><br>

<table>
<tr>
<th>Date</th>
<th colspan="3">Actions</th>
</tr>

<c:if test="${entireslist.size()==0}">
<tr><td style="font-size: 20px;color: green;text-align: center" colspan="4">Not added any list</td>
</c:if>

<c:forEach items="${entrieslist}" var="e">
<tr>
<td>
<fmt:formatDate value="${e.date}" pattern="dd/MM/yyyy"/>
</td>
<td><a href="./display?id=${e.id}">View</a></td>
<td><a href="./updateentry?id=${e.id}">Update</a></td>
<td><a href="./deleteentry?id=${e.id}">Delete</a></td> 

</tr>



</c:forEach>



</table>

</div>

</body>
</html>