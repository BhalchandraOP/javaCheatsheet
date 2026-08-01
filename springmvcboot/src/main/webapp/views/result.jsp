<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">

<title>Alien Details</title>

<style>

body{
	background:#eef5fc;
	font-family:Arial;
}

.container{

	width:450px;
	margin:70px auto;
	background:white;
	padding:30px;
	border-radius:12px;
	box-shadow:0 0 15px rgba(0,0,0,.15);

}

h1{

	text-align:center;
	color:#1565c0;

}

.info{

	font-size:18px;
	margin:15px 0;

}

.label{

	font-weight:bold;

}

button{

	width:100%;
	padding:10px;
	margin-top:15px;
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

<h1>Alien Details</h1>

<div class="info">

<span class="label">Alien ID :</span>

${a.aid}

</div>

<div class="info">

<span class="label">Alien Name :</span>

${a.aname}

</div>

<form action="/" method="get">

<button>

Back to Home

</button>

</form>

<form action="getAliens" method="get">

<button>

Show All Aliens

</button>

</form>

</div>

</body>

</html>