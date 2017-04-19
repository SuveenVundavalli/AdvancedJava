<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
<style>
.container {
	padding: 20px;
}
</style>
</head>
<body>
	<div class="container">
		<table>
			<tr>
				<form action="index.jsp">
					<input type="submit" id="home" value="Home">
				</form>
			</tr>
			<tr>
				<form action="Login.jsp">
					<input type="submit" id="Login" value="Login">
				</form>
			</tr>

		</table>
		<form action="./Register" method="post">
			<input type="text" placeholder="Name*" name="uName" required>
			<input type="email" placeholder="Email*" name="uEmail" required>
			<input type="password" placeholder="Password*" name="uPassword" required>
			<input type="submit" value="Register" name="uRegister">
		</form>
	</div>
</body>
</html>