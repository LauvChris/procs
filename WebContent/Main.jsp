<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="Main.css" rel="stylesheet" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Main</title>
</head>
<body>
<form method="post" action="displayContacts">
	<table style="width: 100%" border="1">
		<tr>
			<th><input class="button" type="submit" value="Afficher contacts" /></th>
			<th><a class="button" href="searchContact.jsp">Rechercher Contact</a></th>
		</tr>
	</table>
</form>
</body>
</html>