<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Contact</title>
</head>
<body>
<form method="post" action="searchContact">
	<table>
		<tr>
			<th>
				<h2>Chercher un contact</h2>
			</th>
		</tr>
		<tr>
			<td><i>nom: <input type="text" name="nom" size="25"></i></td>
		</tr>
		<tr>
			<td><i>prenom: <input type="text" name="prenom" size="25"></i></td>
		</tr>
		<tr>
			<td><i>mail: <input type="text" name="mail" size="25"></i></td>
		</tr>
		<tr>
			<td>
				<input class="button" type="submit" value="Submit" /> 
				<input	class="button" type="reset" value="Reset">
			</td>
		</tr>
	</table>
</form>
</body>
</html>