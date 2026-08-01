<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration System</title>

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
    min-height:100vh;
    padding:30px;
}

.container{
    width:900px;
    background:white;
    padding:30px;
    border-radius:15px;
    box-shadow:0 12px 30px rgba(0,0,0,.25);
}

h1{
    text-align:center;
    color:#2c3e50;
}

.subtitle{
    text-align:center;
    color:gray;
    margin-bottom:25px;
}

.main{
    display:flex;
    gap:30px;
}

.left,
.right{
    flex:1;
}

.card{
    border:3px solid;
    border-radius:12px;
    padding:20px;
    margin-bottom:20px;
    background:#fafafa;
}
.card h2{
    text-align:center;
    margin-bottom:15px;
    color:#2c3e50;
}

label{
    display:block;
    margin-top:10px;
    margin-bottom:5px;
    font-weight:bold;
}

input{
    width:100%;
    padding:10px;
    border:1px solid #ccc;
    border-radius:6px;
}

.row{
    display:flex;
    gap:15px;
}

.field{
    flex:1;
}

.register{
    border-color:#2ecc71;
}
.find{
    border-color:#3498db;
}
.update{
    border-color:#f39c12;
}
.delete{
    border-color:#e74c3c;
}
.view{
    border-color:#9b59b6;
}

button,
input[type="submit"]{

    width:100%;
    margin-top:20px;
    padding:12px;
    background:#3498db;
    color:white;
    border:none;
    border-radius:6px;
    cursor:pointer;
    font-size:15px;
    transition:.3s;
}

button:hover,
input[type="submit"]:hover{
    background:#2471a3;
}

</style>

</head>
<body>

<div class="container">

    <h1>Student Registration System</h1>
    <div class="subtitle">
        Spring MVC + Spring Data JPA CRUD Demo
    </div>

    <div class="main">

        <!-- LEFT SIDE -->

        <div class="left">

            <!-- Register -->

            <div class="card register">

                <h2>Register Student</h2>

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
                            <input type="number"
                                   name="semester"
                                   min="1"
                                   max="8"
                                   required>

                        </div>

                    </div>

                    <button type="submit">
                        Register Student
                    </button>

                </form>

            </div>

            <!-- Update -->

            <div class="card update">

                <h2>Update Student</h2>

                <form action="updateStudent" method="post">

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
                            <input type="number"
                                   name="semester"
                                   min="1"
                                   max="8"
                                   required>

                        </div>

                    </div>

                    <button type="submit">
                        Update Student
                    </button>

                </form>

            </div>

        </div>

        <!-- RIGHT SIDE -->

        <div class="right">

            <!-- Find -->

            <div class="card find">

                <h2>Find Student</h2>

                <form action="getStudent" method="get">

                    <label>Student ID</label>

                    <input type="number"
                           name="sid"
                           required>

                    <button type="submit">
                        Find Student
                    </button>

                </form>

            </div>

            <!-- Delete -->

            <div class="card delete">

                <h2>Delete Student</h2>

                <form action="deleteStudent" method="post">

                    <label>Student ID</label>

                    <input type="number"
                           name="sid"
                           required>

                    <button type="submit">
                        Delete Student
                    </button>

                </form>

            </div>

            <!-- Show All -->

            <div class="card view">

                <h2>View Students</h2>

                <form action="showStudents" method="get">

                    <input type="submit"
                           value="Show All Students">

                </form>

            </div>

        </div>

    </div>

</div>

</body>
</html>