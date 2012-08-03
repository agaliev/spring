<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<c:forEach items="${assortment}" var="article">
		<!--
		<form name="${article.name}" method="post">
			<p>${article.name}</p>
			<input type="SUBMIT" NAME="${article.name}" VALUE="buy">
			<input type="hidden" name="htmlFormName" value="${article.name}"/>
		</form>
		 -->
			<tr>
				<td>${article.name}</td>
				<td>${article.price}</td>
			</tr>		
			<a href="${flowExecutionUrl}&_eventId=add&article=${article.name}">add to cart</a>
		</c:forEach>
	</table>

	<a href="${flowExecutionUrl}&_eventId=conclude">checkout</a>
</body>
</html>