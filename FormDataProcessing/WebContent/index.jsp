<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration Page</title>
<link rel="stylesheet" href="resources/css/bootstrap.css">
<script src="resources/js/jquery-3.2.0.js"></script>
<script src="WebContent/resources/js/bootstrap.js"></script>
</head>
<body>

	<div class="container">
		<h1>Registration Page</h1>
		<div class="well">
			<form action="./Register" method="GET" class="form-horizontal">

				<!-- First Name-->
				<div class="form-group">
					<label class="control-label col-sm-2" for="fName">First Name:</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" name="fName" id="fName" placeholder="Enter First Name">
					</div>
				</div>

				<!-- Last Name-->
				<div class="form-group">
					<label class="control-label col-sm-2" for="lName">Last Name:</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" name="lName" id="pwd" placeholder="Enter Last Name">
					</div>
				</div>

				<!-- EMail-->
				<div class="form-group">
					<label class="control-label col-sm-2" for="email">Email:</label>
					<div class="col-sm-10">
						<input type="email" class="form-control" name="email" id="email" placeholder="Enter Email">
					</div>
				</div>

				<!-- Password-->
				<div class="form-group">
					<label class="control-label col-sm-2" for="password">Password:</label>
					<div class="col-sm-10">
						<input type="password" class="form-control" name="password" id="password" placeholder="Enter Password">
					</div>
				</div>

				<!-- DOB-->
				<div class="form-group">
					<label class="control-label col-sm-2" for="dob">Date of Birth:</label>
					<div class="col-sm-10">
						<input type="date" class="form-control" name="dob" id="dob" placeholder="Enter Date of Birth">
					</div>
				</div>

				<!-- Languages Known-->
				<div class="form-group">
					<label class="control-label col-sm-2" for="languages">Languages Known:</label>
					<div class="col-sm-10">
						<div class="checkbox">
							<label><input type="checkbox" name="languages" value="Telugu">Telugu</label>
						</div>
						<div class="checkbox">
							<label><input type="checkbox" name="languages" value="Hindi">Hindi</label>
						</div>
						<div class="checkbox disabled">
							<label><input type="checkbox" name="languages" value="English">English</label>
						</div>
					</div>
				</div>

				<!-- Submit-->
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<button type="submit" class="btn btn-default">Submit</button>
					</div>
				</div>

			</form>
		</div>
	</div>

</body>
</html>