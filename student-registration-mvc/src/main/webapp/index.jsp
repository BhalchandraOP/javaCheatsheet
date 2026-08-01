<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration</title>

<style>

*{
margin:0;
padding:0;
box-sizing:border-box;
font-family:Segoe UI,Arial,sans-serif;
}

body{
background:linear-gradient(135deg,#4facfe,#00c6fb);
display:flex;
justify-content:center;
align-items:center;
height:100vh;
}

.container{
background:white;
width:420px;
padding:30px;
border-radius:15px;
box-shadow:0 12px 30px rgba(0,0,0,.25);
}

h1{
text-align:center;
color:#2c3e50;
margin-bottom:5px;
}

.subtitle{
text-align:center;
color:#777;
margin-bottom:20px;
}

label{
display:block;
font-weight:bold;
margin-top:12px;
margin-bottom:5px;
}

input{
width:100%;
padding:10px;
border:1px solid #ccc;
border-radius:6px;
font-size:15px;
}

.row{
display:flex;
gap:15px;
}

.field{
flex:1;
}

button{
margin-top:20px;
width:100%;
padding:12px;
background:#3498db;
color:white;
border:none;
border-radius:6px;
font-size:16px;
cursor:pointer;
transition:.3s;
}

button:hover{
background:#2471a3;
}

</style>
</head>

<body>

<div class="container">

<h1>Student Registration</h1>
<div class="subtitle">Spring MVC Demo Project</div>

<form action="addStudent" method="post">

<label>Student ID</label>
<input type="number" name="sid" required>

<label>Student Name</label>
<input type="text" name="sname" required>

<div class="row">

<div class="field">
<label>Branch</label>
<input type="text" name="sbranch" required>
</div>

<div class="field">
<label>Semester</label>
<input type="number" name="semester" min="1" max="8" required>
</div>

</div>

<button>Register Student</button>

</form>

</div>

</body>
</html>