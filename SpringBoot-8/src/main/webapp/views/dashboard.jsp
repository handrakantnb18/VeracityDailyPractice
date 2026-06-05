<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Dashboard</title>

<style>

/* Reset */
*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial,sans-serif;
}

body{
    background:#f4f7f9;
}

/* Navbar (same as your portal) */
.navbar{
    background:#1e3a8a;
    padding:15px 40px;
    display:flex;
    justify-content:space-between;
    align-items:center;
}

.logo{
    color:white;
    font-size:24px;
    font-weight:bold;
}

.nav-links a{
    color:white;
    text-decoration:none;
    margin-left:25px;
    font-size:17px;
    font-weight:bold;
}

.nav-links a:hover{
    color:#fbbf24;
}

/* Dashboard Container */
.container{
    width: 90%;
    max-width: 1100px;
    margin: 40px auto;
    background: #fff;
    padding: 25px;
    border-radius: 12px;
    box-shadow: 0 8px 20px rgba(0,0,0,0.1);
}

h2{
    text-align:center;
    color:#1e3a8a;
    margin-bottom:20px;
}

/* Table */
table{
    width:100%;
    border-collapse:collapse;
}

th{
    background:#1e3a8a;
    color:white;
    padding:12px;
}

td{
    text-align:center;
    padding:12px;
    border-bottom:1px solid #ddd;
}

tr:hover{
    background:#f1f5ff;
}

</style>
</head>

<body>

<!-- ✅ NAVBAR ADDED -->
<div class="navbar">
    <div class="logo">Course Enroll</div>

    <div class="nav-links">
        <a href="/">Home</a>
	    <a href="about">About</a>
    		<a href="contact">Contact</a>
    	</div>
</div>

<!-- Dashboard Content -->
<div class="container">

<h2>Student Dashboard</h2>

<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Course</th>
        <th>Email</th>
        <th>Address</th>
        <th>Timing</th>
        <th>Gender</th>
        <th>Course Fees</th>
        <th>Mobile No</th>
    </tr>

    <tr>
        <td>${student.id}</td>
        <td>${student.name}</td>
        <td>${student.course}</td>
        <td>${student.email}</td>
        <td>${student.address}</td>
        <td>${student.timing}</td>
        <td>${student.gender}</td>
        <td>${student.courseFees}</td>
        <td>${student.mobileNo}</td>
    </tr>
</table>

</div>

</body>
</html>