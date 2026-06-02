<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Enrollment Form</title>
</head>
<body>

    <h2>Student Enrollment Form</h2>

    <form:form action="saveStudent" method="post" modelAttribute="student">

        <table>

            <tr>
                <td>Student Name :</td>
                <td><form:input path="name" /></td>
            </tr>

            <tr>
                <td>Student Email :</td>
                <td><form:input path="email" /></td>
            </tr>

            <tr>
                <td>Student Mobile No :</td>
                <td><form:input path="mobileNo" /></td>
            </tr>

            <tr>
                <td>Student Gender :</td>
                <td>
                    <form:radiobutton path="gender" value="Male" /> Male
                    <form:radiobutton path="gender" value="Female" /> Female
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
                    <form:checkbox path="timing" value="Morning" /> Morning
                    <form:checkbox path="timing" value="Afternoon" /> Afternoon
                    <form:checkbox path="timing" value="Evening" /> Evening
                </td>
            </tr>

            <tr>
                <td colspan="2">
                    <input type="submit" value="Enroll">
                </td>
            </tr>

        </table>

    </form:form>

</body>
</html>