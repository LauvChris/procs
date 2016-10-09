<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="domain.ContactDAO"%>
<%@page import="domain.Contact"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Contact</title>
</head>
<body>
<form method="POST" action="updateContact">

		<table border="1">
			<tr>
				<th colspan="2">Modifier un contact</th>
			</tr>
			<tr>
				<th>ID</th>
				<td><input type="text" name="id" size="25" value="<%= request.getAttribute("id")%>" readonly="readonly"></td>
			</tr>
			<tr>
				<th>Nom</th>
				<td><input type="text" name="nom" size="25" value="<%= request.getAttribute("nom")%>"></td>
			</tr>
			<tr>
				<th>Prénom</th>
				<td><input type="text" name="prenom" size="25" value="<%=  request.getAttribute("prenom") %>"></td>
			</tr>
			<tr>
				<th>Mail</th>
				<td><input type="text" name="mail" size="25" value="<%=  request.getAttribute("mail") %>"></td>
			</tr>
			<tr>
				<th colspan="2"><input class="button" type="submit"
					value="Submit" /></th>
			</tr>
		</table>
	</form>

</body>
</html>