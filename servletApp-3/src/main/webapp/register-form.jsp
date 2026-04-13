<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Form</title>

<style>
	body {
		font-family: Arial, sans-serif;
		background: #f4f6f8;
		display: flex;
		justify-content: center;
		align-items: center;
		height: 100vh;
		margin: 0;
	}

	.form-container {
		background: white;
		padding: 30px;
		border-radius: 20px;
		box-shadow: 0 4px 15px rgba(0,0,0,0.1);
		width: 400px;
	}

	h1 {
		text-align: center;
		color: #333;
		margin-bottom: 20px;
	}

	table {
		width: 100%;
	}

	td {
		padding: 10px 5px;
	}

	input[type="text"],
	input[type="password"],
	select {
		width: 100%;
		padding: 10px;
		border: 1px solid #ccc;
		border-radius: 5px;
		box-sizing: border-box;
	}

	input[type="radio"] {
		margin-right: 5px;
	}

	.submit-btn {
		width: 100%;
		background: #007bff;
		color: white;
		padding: 12px;
		border: none;
		border-radius: 5px;
		cursor: pointer;
		font-size: 16px;
		margin-top: 15px;
	}

	.submit-btn:hover {
		background: #0056b3;
	}
</style>

</head>
<body>

	<div class="form-container">
		<h1>Register Form</h1>

		<form action="registration" method="post">
		
		<p style="color: green;">${msg}</p>
			<table>

				<tr>
					<td>Enter Name :</td>
					<td><input type="text" placeholder="Enter name" name="name"></td>
				</tr>

				<tr>
					<td>Enter Email :</td>
					<td><input type="text" placeholder="Enter email" name="email"></td>
				</tr>

				<tr>
					<td>Enter Password :</td>
					<td><input type="password" placeholder="Enter password" name="password"></td>
				</tr>

				<tr>
					<td>Choose Gender :</td>
					<td>
						<input type="radio" name="gender" value="Male">Male
						<input type="radio" name="gender" value="Female">Female
					</td>
				</tr>

				<tr>
					<td>Enter City :</td>
					<td>
						<select name="city">
							<option value="Pune">Pune</option>
							<option value="Mumbai">Mumbai</option>
							<option value="Hydrabad">Hydrabad</option>
							<option value="Chennai">Chennai</option>
							<option value="Goa">Goa</option>
						</select>
					</td>
				</tr>

				<tr>
					<td colspan="2">
						<button type="submit" class="submit-btn">Register</button>
					</td>
				</tr>

			</table>
		</form>
	</div>

</body>
</html>