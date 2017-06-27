<%@page import="java.util.ArrayList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<h1>Spring MVC Hello World Example</h1>
        
        <p>Este es un saludo: ${saludo[0]}</p>
        
        <c:forEach var="listValue" items="${saludo}">
                <li>${listValue}</li>
        </c:forEach>
</body>
</html>