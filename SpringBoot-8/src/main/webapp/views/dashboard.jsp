<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Dashboard</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background: #f4f6f9;
        margin: 0;
        padding: 0;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }

    .container {
        width: 90%;
        max-width: 1000px;
        background: #ffffff;
        padding: 25px;
        border-radius: 12px;
        box-shadow: 0 8px 20px rgba(0,0,0,0.1);
    }

    h2 {
        text-align: center;
        color: #1e3a8a;
        margin-bottom: 20px;
    }

    table {
        width: 100%;
        border-collapse: collapse;
        overflow: hidden;
        border-radius: 10px;
    }

    th {
        background: #1e3a8a;
        color: white;
        padding: 12px;
        text-transform: uppercase;
        font-size: 14px;
    }

    td {
        padding: 12px;
        text-align: center;
        border-bottom: 1px solid #ddd;
        font-size: 14px;
        color: #333;
    }

    tr:hover {
        background: #f1f5ff;
    }

    tr:nth-child(even) {
        background: #fafafa;
    }
</style>

</head>

<body>

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