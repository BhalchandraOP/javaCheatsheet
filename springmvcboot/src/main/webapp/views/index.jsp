<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Alien Management System</title>

<style>

body{
	background:#eef5fc;
	font-family:Arial, Helvetica, sans-serif;
	margin:0;
	padding:0;
}

.container{
	width:650px;
	margin:40px auto;
	background:white;
	padding:30px;
	border-radius:12px;
	box-shadow:0 0 15px rgba(0,0,0,0.15);
}

h1{
	text-align:center;
	color:#1565c0;
	margin-bottom:30px;
}

.card{
	border:1px solid #ddd;
	padding:20px;
	border-radius:10px;
	margin-bottom:25px;
	background:#fafafa;
}

.card h2{
	color:#1976d2;
	margin-top:0;
	font-size:22px;
}

input[type=text]{

	width:97%;
	padding:10px;
	margin:10px 0;
	border:1px solid #ccc;
	border-radius:5px;
	font-size:15px;

}

input[type=submit]{

	width:100%;
	padding:10px;
	border:none;
	border-radius:5px;
	background:#1976d2;
	color:white;
	font-size:16px;
	cursor:pointer;

}

input[type=submit]:hover{

	background:#0d47a1;

}

.delete{

	background:#d32f2f !important;

}

.delete:hover{

	background:#b71c1c !important;

}

.view{

	background:#388e3c !important;

}

.view:hover{

	background:#1b5e20 !important;

}

</style>

</head>

<body>

<div class="container">

<h1>Alien Management System</h1>

<!-- Add Alien -->

<div class="card">

<h2>Add Alien</h2>

<form action="addAlien" method="post">

<input type="text"
name="aid"
placeholder="Enter Alien ID">

<input type="text"
name="aname"
placeholder="Enter Alien Name">

<input type="submit"
value="Save Alien">

</form>

</div>

<!-- Find Alien -->

<div class="card">

<h2>Find Alien</h2>

<form action="getAlien" method="post">

<input type="text"
name="aid"
placeholder="Enter Alien ID">

<input type="submit"
value="Find Alien">

</form>

</div>

<!-- Update Alien -->

<div class="card">

<h2>Update Alien</h2>

<form action="updateAlien" method="post">

<input type="text"
       name="aid"
       placeholder="Enter Alien ID">

<input type="text"
       name="aname"
       placeholder="Enter New Alien Name">

<input type="submit"
       value="Update Alien">

</form>

</div>

<!-- Delete Alien -->

<div class="card">

<h2>Delete Alien</h2>

<form action="deleteAlien" method="post">

<input type="text"
name="aid"
placeholder="Enter Alien ID">

<input type="submit"
value="Delete Alien"
class="delete">

</form>

</div>

<!-- Show All -->

<div class="card">

<h2>View Records</h2>

<form action="getAliens" method="get">

<input type="submit"
value="Show All Aliens"
class="view">

</form>

</div>

</div>

</body>
</html>