<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<c:forEach items="${sections}" var="section">
			<li><a href="${flowExecutionUrl}&_eventId=chosen&section=${section.name}">${section.name}</a></li>
		</c:forEach>
	</ul>

</body>
</html>