<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
    	//Variaveis das operações da calculadora
    	
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calculadora</title>
</head>
<body>
	
		<form method="post" action="enviaNumeros.jsp">
			<table>
				<tr>
					<td>Numero 1:</td>
					<td><input type="text" name="num1"/>
				</tr>
				<tr>
					<td>Numero 2:</td>
					<td><input type="text" name="num2"/>
				</tr>
				<tr>
					<td><input type="submit" value="Enviar"/>
				</tr>
			</table>
		</form>
		
	
</body>
</html>