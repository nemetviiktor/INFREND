<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	  	<p>ID: <br> id: ${menu.id}<br> </p>

		<h1 align="center">Rendelés felvétel</h1>
		<form action="addOrder">
		<table>
            <tr>
                <td><h3>Vásárló neve: </h3><p><input type="text" name="customername" required id="customername"/></p></td>
                <input type="hidden" name="foodid" id="foodid" value= "${menu.id}"/>
                <input type="hidden" name="total" id="total" value= "${menu.price}"/>
                <td><h3>Szállítási idő: </h3><p><input type="text" name="deliverytime" required id="deliverytime"/></p></td>
            </tr>
            <tr>
                <td colspan="2">
                    <p><input type="submit" value="Hozzáadás" onclick="added()"><p>
                </td>
            </tr>
	</table>
	</form>

</body>
</html>