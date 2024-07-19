<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculator</title>
</head>
<body>
	<h1>Calculator</h1>
	<form action="sum" method="post">
		Number 1: <input type="number" name="num1" required><br>
		Number 2: <input type="number" name="num2" required><br>
		<input type="submit" value="Sum">
	</form>
	<br><br>
	<p>Result: ${result}</p>
</body>
</html>