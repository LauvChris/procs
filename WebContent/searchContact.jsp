<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="Main.css" rel="stylesheet" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Contact</title>
</head>
<body>
	<form method="post" action="searchContact">
		<table border="1">
			<tr>
				<th colspan="2">
					<h2>Chercher un contact</h2>
				</th>
			</tr>
			<tr>
				<td width=50%><i>Nom </i></td>
				<td width=50%><input type="text" name="nom" size="25"></td>
			</tr>
			<tr>
				<td width=50%><i>prenom</i></td>
				<td width=50%><input type="text" name="prenom" size="25"></td>
			</tr>
			<tr>
				<td width=50%><i>mail</i></td>
				<td width=50%><input type="text" name="mail" size="25"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input class="button"
					type="submit" value="Submit" /> <input class="button" type="reset"
					value="Reset"> <a class="button" href="Main.jsp">Menu</a></td>
			</tr>
		</table>
	</form>
</body>
</html>