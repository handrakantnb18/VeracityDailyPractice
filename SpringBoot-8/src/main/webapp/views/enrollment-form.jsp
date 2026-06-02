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
		margin: 0;
		padding: 0;
		box-sizing: border-box;
		font-family: 'sagoe UI', Tahoma, Geneva, Verdana, sans-serif;
	}
    body {
        font-family: Arial, sans-serif;
        background-color: #03acb5;
        margin: 0;
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .container {
        width: 500px;
        background: #fff;
        padding: 10px;
        border-radius: 10px;
        box-shadow: 0 0 10px rgba(0,0,0,0.15);
    }

    h2 {
        text-align: center;
        color: #333;
        margin-bottom: 20px;
    }

    table {
        width: 100%;
        border-collapse: collapse;
    }

    td {
        padding: 12px;
    }

    input[type="text"],
    select {
        width: 90%;
        padding: 8px;
        border: 1px solid #ccc;
        border-radius: 5px;
    }

    input[type="submit"] {
        background-color: #2a49a9;
        color: white;
        padding: 10px 25px;
        border: none;
        border-radius: 5px;
        cursor: pointer;
        font-size: 16px;
    }

    input[type="submit"]:hover {
        background-color: #03acb5;
    }

    .btn-row {
        text-align: center;
    }

    .message {
        text-align: center;
        color: green;
        margin-top: 15px;
    }
</style>

</head>
<body>

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

    <h5 class="message">${msg}</h5>

</div>

</body>
</html>