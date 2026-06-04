<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2> Student Dashboard</h2>

<table frame ="box" rules = "all" width ="100%">
	<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Course</th>
		<th>Email</th>
		<th>Address</th>
		<th>Timing</th>
		<th>Gender</th>
		<th>Course Fees</th>
		<th>MobileNo</th>
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
		<th>${student.mobileNo}</th>		
	</tr>
</table>

</body>
</html>