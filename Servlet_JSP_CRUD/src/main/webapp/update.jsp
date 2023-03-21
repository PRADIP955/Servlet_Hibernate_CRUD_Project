<%@page import="com.jsp.dto.Person"%>
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
		<% Person person=(Person)request.getAttribute("per"); %>
		<form action="updatetest" method="post">
			<label>Id :</label><input name="id" value="<%= person.getId()%>" readonly="readonly"><br>
			 <label>Name :</label><input name="name" value="<%= person.getName()%>"><br>
				 <label>Age :</label><input name="age" value="<%= person.getAge()%>"><br>
				  <label>Email :</label><input name="email" value="<%= person.getEmail()%>"><br>
				 <label>Password :</label><input name="password" value="<%= person.getPasswrod()%>"><br> 
				<input type="submit" value="SAVE INFO">&nbsp;&nbsp;&nbsp;
				<button><a href="home.jsp">Home</a></button>
		</form>
	</fieldset>
</body>
</html>