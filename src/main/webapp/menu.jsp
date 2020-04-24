<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<body>
	
	<h2>Válasszon ételt!</h2>
		<form action="selectedMenu">
			<select name='id'>
    <option value="${selected}" selected>${selected}</option>
    <c:forEach items="${menu}" var="menu">
        <c:if test="${menu.food != selected}">
            <option value="${menu.id}">${menu.food} ${menu.description}</option>
            <c:set var = "menuId" scope="session" value = "${menu.id}"/>
        </c:if>
    </c:forEach>
	</select>
				<input type="submit" value="OK">
	</form>


</body>
</html>