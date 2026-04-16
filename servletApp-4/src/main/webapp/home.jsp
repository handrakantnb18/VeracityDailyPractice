<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
* {
	margin: 0
}

h1 {
	height: 100px;
	padding-top: 30px;
}

div {
	width: 300px;
	height: 80px;
	box-shadow: 0px 0px 10px black;
	text-align: center;
	margin: 50px auto;
	padding-top: 50px;
}

a {
	font-size: 20px;
	color: white;
	background-color: rgba(0, 0, 0, 0.7);
	text-decoration: none;
}

#login {
	font-size: 20px;
	color: white;
	background-color: green;
	text-decoration: none;
	padding: 8px 15px;
	margin-top: 200px;
	margin-left: 10px;
	border-radius: 15px;
}

#register {
	font-size: 20px;
	color: white;
	background-color: red;
	text-decoration: none;
	padding: 8px 15px;
	margin-top: 200px;
	border-radius: 15px;
}
</style>
</head>
<body>

	<div id="navbar">
		
		<div id="portfolio">
			<h2>Student Management System</h2>
		</div>
		<div id="linkes">
			<a href="">Home</a>
			<a href="">About</a>
			<a href="">Contact</a>
			<a href="">Services</a>
			
		</div>
	</div>
	
	<h1 style="text-align: center; background-color: black; color: white;">Welcome
		To My Application</h1>

	<div>
		<a id="register" href="register-form">Register</a> <a id="login"
			href="login-form">Login</a>

	</div>

</body>
</html>