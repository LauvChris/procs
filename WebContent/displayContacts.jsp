<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="domain.ContactDAO"%>
<%@page import="domain.Contact"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>displayContacts</title>
</head>
<body>
	<form method="post" action="removeContact">
		<table border="1">

			<tr>
				<th>ID</th>
				<th>Nom</th>
				<th>Prenom</th>
				<th></th>
				<th></th>
			</tr>
			<%
				ContactDAO contact = new ContactDAO();

				List<Contact> list = contact.getListOfContacts();
				
				for (Contact c : list) {
			%>
			<tr>
				<td><%=c.getId()%></td>
				<td><%=c.getNom()%></td>
				<td><%=c.getPrenom()%></td>
				<td>
					<a href="updateContact?param1=<%= c.getId() %>&param2=<%= c.getNom()%>&param3=<%=c.getPrenom()%>&param4=<%=c.getMail()%>" >Modifier</a>
				</td>	
				<td><input type="checkbox" value="<%= c.getId() %>" name="c1"></td>
			</tr>
			<%
				}
			%>

			<tr>
				<td colspan="5" align="center"><input type="submit" value="delete"></td>
			</tr>

		</table>
	</form>
</body>
</html>