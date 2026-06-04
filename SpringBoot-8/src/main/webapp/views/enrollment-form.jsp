<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Student Enrollment Form</title>

<style>

*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
}

body{
    background:linear-gradient(to right,#dbeafe,#eff6ff);
    min-height:100vh;
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

/* Form Section */
.form-wrapper{
    display:flex;
    justify-content:center;
    align-items:center;
    padding:20px 20px;
}

.container{
    width:540px;
    background:#fff;
    padding:9px;
    border-radius:12px;
    box-shadow:0 4px 12px rgba(0,0,0,0.15);
}

h2{
    text-align:center;
    color:#1e3a8a;
    margin-bottom:20px;
}

table{
    width:100%;
}

td{
    padding:9px;
}

input[type="text"],
input[type="email"],
select{
    width:100%;
    padding:10px;
    border:1px solid #ccc;
    border-radius:5px;
}

input[type="submit"]{
    background:#1e3a8a;
    color:white;
    border:none;
    padding:12px 25px;
    border-radius:5px;
    cursor:pointer;
    font-size:16px;
}

input[type="submit"]:hover{
    background:#2563eb;
}

.btn-row{
    text-align:center;
}

.message{
    text-align:center;
    color:green;
    margin-top:15px;
    font-weight:bold;
}

</style>

</head>

<body>

<div class="navbar">
    <div class="logo">Course Enroll</div>

<div class="nav-links">
    <a href="/">Home</a>
    <a href="cources">Courses</a>
    <a href="about">About</a>
    <a href="contact">Contact</a>
    <a href="enroll">Enroll Now</a>
</div>


</div>

<div class="form-wrapper">

<div class="container">

    <h2>Student Enrollment Form</h2>

    <form:form action="saveStudent" method="post" modelAttribute="student">

        <table>

            <tr>
                <td>Student Name :</td>
                <td><form:input path="name"/></td>
            </tr>

            <tr>
                <td>Student Email :</td>
                <td><form:input path="email"/></td>
            </tr>

            <tr>
                <td>Student Mobile No :</td>
                <td><form:input path="mobileNo"/></td>
            </tr>

            <tr>
                <td>Student Gender :</td>
                <td>
                    <form:radiobutton path="gender" value="Male"/> Male
                    <form:radiobutton path="gender" value="Female"/> Female
                </td>
            </tr>

            <tr>
                <td>Student Address :</td>
                <td>
                    <form:select path="address">
                        <form:option value="Pune">Pune</form:option>
                        <form:option value="Mumbai">Mumbai</form:option>
                        <form:option value="Delhi">Delhi</form:option>
                        <form:option value="Chennai">Chennai</form:option>
                    </form:select>
                </td>
            </tr>

            <tr>
                <td>Select Course :</td>
                <td>
                    <form:select path="course">
                        <form:option value="Java Full Stack">Java Full Stack</form:option>
                        <form:option value="Python Full Stack">Python Full Stack</form:option>
                        <form:option value="Data Science">Data Science</form:option>
                    </form:select>
                </td>
            </tr>

            <tr>
                <td>Preferred Timing :</td>
                <td>
                    <form:checkbox path="timing" value="Morning"/> Morning
                    <form:checkbox path="timing" value="Afternoon"/> Afternoon
                    <form:checkbox path="timing" value="Evening"/> Evening
                </td>
            </tr>

            <tr>
                <td colspan="2" class="btn-row">
                    <input type="submit" value="Enroll">
                </td>
            </tr>

        </table>

    </form:form>

    <div class="message">${msg}</div>

</div>

</div>

</body>
</html>
