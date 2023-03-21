
<%@page import="com.jsp.dto.Person"%>
<%@page import="java.util.List"%>
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
	<%-- <% List<Person> list=(List)request.getAttribute("lis"); %> --%>
	<%List<Person> list=(List)request.getAttribute("abc"); %>
	<h1>Person Object All Info</h1>
	
	<table>
	<tr>
            <th>Id</th>
            <th>Name</th>
            <th>Email</th>
            <th>Age</th>
            <th>Password</th>
     </tr>
    <%for(Person e : list){  %>
	<tr >
	<td ><%= e.getId() %></td>
	<td><%= e.getName() %></td>
	<td><%= e.getEmail() %></td>
	<td><%= e.getAge() %></td>
	<td><%= e.getPasswrod() %></td>
	</tr>
	
	
	<%} %>
	</table>
	<h1><a href="home.jsp">Home</a></h1>
</body>
</html>