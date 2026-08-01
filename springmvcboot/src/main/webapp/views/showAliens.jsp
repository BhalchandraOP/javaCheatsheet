<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>All Aliens</title>

<style>

body{

	font-family:Arial;
	background:#eef5fc;

}

.container{

	width:700px;
	margin:40px auto;
	background:white;
	padding:30px;
	border-radius:12px;
	box-shadow:0 0 15px rgba(0,0,0,.15);

}

h1{

	text-align:center;
	color:#1565c0;

}

table{

	width:100%;
	border-collapse:collapse;
	margin-top:20px;

}

th{

	background:#1976d2;
	color:white;
	padding:12px;

}

td{

	text-align:center;
	padding:10px;
	border-bottom:1px solid #ddd;

}

tr:nth-child(even){

	background:#f5f5f5;

}

button{

	margin-top:25px;
	width:100%;
	padding:10px;
	background:#1976d2;
	color:white;
	border:none;
	border-radius:5px;
	cursor:pointer;

}

button:hover{

	background:#0d47a1;

}

</style>

</head>

<body>

<div class="container">

<h1>Registered Aliens</h1>

<table>

<tr>

<th>Alien ID</th>

<th>Alien Name</th>

</tr>

<c:forEach items="${a}" var="alien">

<tr>

<td>${alien.aid}</td>

<td>${alien.aname}</td>

<td>

<form action="getAlien" method="post">

<input type="hidden"
name="aid"
value="${alien.aid}">

<input type="submit"
value="View">

</form>

</td>

</tr>

</c:forEach>

</table>

<form action="/" method="get">

<button type="submit">
Back to Home
</button>

</form>

</div>

</body>

</html>