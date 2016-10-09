<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>addContact</title>
</head>
<body>
<form method="post" action="newContact">

		<table border="1">
			<tr>
				<th colspan="2">Ajouter un contact</th>
			</tr>
			<tr>
				<th>Nom</th>
				<td><input type="text" name="nom" size="25"></td>
			</tr>
			<tr>
				<th>Prénom</th>
				<td><input type="text" name="prenom" size="25"></td>
			</tr>
			<tr>
				<th>Mail</th>
				<td><input type="text" name="mail" size="25"></td>
			</tr>
			<tr>
				<th>Groupe</th>
				<td><input type="text" name="groupe" size="25"></td>
			</tr>
			<tr>
				<th colspan="2"><input class="button" type="submit"
					value="Submit" /> <input class="button" type="reset" value="Reset"></th>
			</tr>
		</table>
	</form>
</body>
</html>