<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Enrolled Students</title>

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

/* Navbar */
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

/* Page Container */
.container{
    width:90%;
    max-width:1200px;
    margin:40px auto;
    background:#fff;
    padding:25px;
    border-radius:12px;
    box-shadow:0 8px 20px rgba(0,0,0,0.1);
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
    overflow:hidden;
    border-radius:10px;
}

th{
    background:#1e3a8a;
    color:white;
    padding:12px;
    text-transform:uppercase;
    font-size:14px;
}

td{
    padding:12px;
    text-align:center;
    border-bottom:1px solid #ddd;
    font-size:14px;
}

tr:nth-child(even){
    background:#f9fafb;
}

tr:hover{
    background:#eef2ff;
}

/* Button Style (optional future use) */
.btn{
    padding:6px 12px;
    border:none;
    border-radius:6px;
    cursor:pointer;
    font-weight:bold;
}

.btn-edit{
    background:#22c55e;
    color:white;
}

.btn-delete{
    background:#ef4444;
    color:white;
}

.heading{
    text-align:right;
    margin: 30px 0 20px 0;
}

/* Title */
.heading h2{
    color:#1e3a8a;
    font-size:28px;
    margin-bottom:10px;
}

/* Total Students Badge */
.count{
    display:inline-block;
    background:#1e3a8a;
    color:white;
    padding:8px 18px;
    border-radius:25px;
    font-size:15px;
    font-weight:bold;
    box-shadow:0 4px 10px rgba(0,0,0,0.15);
}

/* Optional hover effect */
.count:hover{
    background:#2563eb;
    cursor:pointer;
}

</style>

</head>

<body>

<!-- NAVBAR -->
<div class="navbar">
    <div class="logo">Course Enroll</div>

    <div class="nav-links">
        <a href="home">Home</a>
        <a href="cources">Courses</a>
        <a href="enroll">Enroll</a>
        <a href="dashboard">Dashboard</a>
        <a href="students">Students</a>
        <a href="logout">Logout</a>
    </div>
</div>

<!-- CONTENT -->
<div class="container">

<div class ="heading">
	<h2>All Enrolled Students</h2>

<div class = "count">
	Total Students : ${students.size()}
</div>
	
</div>

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

    <c:forEach var="student" items="${students}">
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
    </c:forEach>

</table>

</div>

</body>
</html>