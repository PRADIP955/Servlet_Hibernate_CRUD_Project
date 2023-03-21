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
    table, td , th{border: 1px solid green; 
       	border-collapse: collapse;
        margin-left: 160px;
        text-align:   center;}
    tr:nth-child(even) {background-color: wheat;} 
    tr:hover {background-color: coral;}
    tr{background-color:whitesmoke;}
    th{width: 200px;
        background-color: green;
        color: white;
        height: 35px;}
    h1{color:grey;
        text-align: center;
        font-family: sans-serif;}
    body{background-color: aqua;}
</style>
<body>
	<%Person person =(Person)request.getAttribute("person"); %>
	<%int id = person.getId(); %>
	<%String name = person.getName(); %>
	<%int age = person.getAge(); %>
	<%String email = person.getEmail(); %>
	<%String pass = person.getPasswrod(); %>

	<table>
	<tr>
            <th>Id</th>
            <th>Name</th>
            <th>Email</th>
            <th>Age</th>
            <th>Password</th>
     </tr>
    
	<tr >
	<td ><%= id %></td>
	<td><%= name %></td>
	<td><%= email %></td>
	<td><%= age %></td>
	<td><%= pass %></td>
	</tr>
	
	
	
	</table>

</body>
</html>