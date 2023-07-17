<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User</title>
</head>
<center><body>
<p>User</p>
<form action="save" method="get">
<input placeholder="Enter your name" name="name">
<input type="submit">
</form>

<br>
<form action="delete" method="get">
<input placeholder="Enter id to delete" name="id">
<input type="submit" value="delete">
</form>

<form action="search" method="get">
<input placeholder="Enter id to search" name="id">
<input type="submit" value="search">
</form>
</body>
</center>
</html>