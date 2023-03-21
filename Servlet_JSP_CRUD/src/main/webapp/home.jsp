<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
body{
	background-color: black;
}
	ul{
		list-style: none;
		display: flex;
		justify-content: space-around;
		margin-top: 0px;
		padding-top:30px;
		font-size:25px;
		height: 60px;
	}
	h1{
		text-align: center;
		color: grey;
	}
	a{
		color: aqua;
	}
</style>
<body>
	<header>
	<h1>Welcome to Person Information </h1>
	</header>
	<nav>
	<ul>
		<li><a href="save.jsp" id="cp">CREATE PERSON INFO</a></li>
		<li><a href="for_display_validate_id_pass.jsp" id="d">DISPLAY ALL INFO</a></li>
		<li><a href="update_id.jsp">EDIT PERSON INFO</a></li>
		<li><a href="geting_id_delete.jsp">DELETE PERSON INFO</a></li>
		<li><a href="geting_id.jsp">GET BY ID INFO</a></li>
	</ul>
	
	
	</nav>
</body>
</html>