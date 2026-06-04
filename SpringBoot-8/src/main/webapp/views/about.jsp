<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>About Us</title>

<style>
    body {
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
        background: #f4f7f9;
    }

    .container {
        width: 60%;
        margin: 60px auto;
        background: #fff;
        padding: 30px;
        border-radius: 10px;
        box-shadow: 0 0 10px rgba(0,0,0,0.1);
    }

    h1 {
        text-align: center;
        color: #1e3a8a;
        margin-bottom: 20px;
    }

    p {
        font-size: 16px;
        line-height: 1.6;
        color: #444;
        text-align: justify;
    }

    .highlight {
        color: #1e3a8a;
        font-weight: bold;
    }

    .team {
        margin-top: 20px;
        padding: 15px;
        background: #f0f4ff;
        border-left: 5px solid #1e3a8a;
        border-radius: 5px;
    }
</style>

</head>

<body>

<div class="container">

    <h1>About Us</h1>

    <p>
        Welcome to our <span class="highlight">Student Management System</span>. 
        This platform is designed to help colleges and institutions manage student data efficiently,
        including enrollment, records, and academic information.
    </p>

    <p>
        Our system is built using <span class="highlight">Java, JSP, Spring Boot, and MySQL</span>,
        ensuring high performance and reliability for educational institutions.
    </p>

    <div class="team">
        <h3>Our Mission</h3>
        <p>
            To simplify student data management and provide a user-friendly platform for administrators and teachers.
        </p>
    </div>

    <div class="team">
        <h3>Our Vision</h3>
        <p>
            To become a leading digital solution for educational institutions worldwide.
        </p>
    </div>

</div>

</body>
</html>