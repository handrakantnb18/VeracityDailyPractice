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
			<td><form:input path="" /></td>
		</tr>
		<tr>
			<td>Student Email :</td>
			<td><form:input path="" /></td>
		</tr>
		<tr>
			<td>Student Mobile No :</td>
			<td><form:input path="" /></td>
		</tr>
		<tr>
		<td>Student Gender :</td>
			<td>
				<form:rediobutton path="" value="Male" />Male 
				<form:rediobutton path="" value="Female" />Female
			</td>
		</tr>
		<tr>
			<td>Student Address :</td>
			<td>
				<form:select path="" />
			
				<form:option value="Pune">Pune</form:option>
				<form:option value="Pune">Mumbai</form:option>
				<form:option value="Pune">Delhi</form:option>
				<form:option value="Pune">Chennai</form:option>
					
			</td>
		</tr>
		<tr>
			<td>Select Course :</td>
			<td>
				<form:option value="Java Full Stack">Java Full Stack</form:option>
				<form:option value="Python Full Stacl">Java Full Stack</form:option>
				<form:option value="Data Science">Data Science</form:option>
				
			</td>
		</tr>
		<td>Preferred Timing :</td>
			<td>
				<form:checkbox path="" value="Morning" />Morning 
				<form:checkbox path="" value="Afternoon" />Afternoon
				<form:checkbox path="" value="Evening" />Evening
			</td>
		</tr>
		
		<input type="submit" value="Enroll">


	</form:form>

</body>
</html>