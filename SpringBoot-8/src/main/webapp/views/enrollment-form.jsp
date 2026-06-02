<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/tags" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form:form action="">

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
				<form:rediobutton path="gender" value="Male" />Male 
				<form:rediobutton path="gender" value="Female" />Female
			</td>
		</tr>
		<tr>
			<td>Student Address :</td>
			<td>
				<form:select path="address" />
			
				<form:option value="Pune">Pune</form:option>
				<form:option value="Pune">Mumbai</form:option>
				<form:option value="Pune">Delhi</form:option>
				<form:option value="Pune">Chennai</form:option>
					
			</td>
		</tr>
		<tr>
			<td>Select Course :</td>
			<td>
				<form:select path="course">
					<form:option value="Java Full Stack">Java Full Stack</form:option>
					<form:option value="Python Full Stacl">Java Full Stack</form:option>
					<form:option value="Data Science">Data Science</form:option>
				</form:select>
			</td>
		</tr>
		<td>Preferred Timing :</td>
			<td>
				<form:checkbox path="timing" value="Morning" />Morning 
				<form:checkbox path="timing" value="Afternoon" />Afternoon
				<form:checkbox path="timing" value="Evening" />Evening
			</td>
		</tr>
		
		<input type="submit" value="Enroll">


	</form:form>

</body>
</html>