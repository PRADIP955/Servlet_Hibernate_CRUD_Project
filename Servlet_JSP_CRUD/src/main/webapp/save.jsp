<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
fieldset {
	width: 700px;
	height: 600px;
	margin: 25%;
	background-color: bisque;
}

legend {
	text-align: center;
	font-size: 30px;
}

form {
	text-align: center;
	margin-top: 80px;
}

input {
	margin-top: 30px;
}
</style>
<body>
	<fieldset>
		<legend>Welcome to New Person</legend>

		<form action="SaveTest" method="post">
			
			 <label>Name :</label><input name="name"><br>
				 <label>Age :</label><input
				name="age"><br> <label>Email :</label><input
				name="email"><br>
				 <label>Password :</label><input
				name="password"><br> 
				<input type="submit" value="SAVE INFO">
		</form>
	</fieldset>
</body>
</html>