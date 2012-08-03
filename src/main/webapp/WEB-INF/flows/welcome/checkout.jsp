<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>checkout</title>
</head>
<body>
	<table border="1">
		<c:forEach items="${added}" var="article">
			<tr>
				<td>${article.name}</td>
				<td>${article.price}</td>
			</tr>
		</c:forEach>
	</table>
	<c:out value="total charge: ${total} $"></c:out>
</body>
</html>