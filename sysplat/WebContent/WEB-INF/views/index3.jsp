<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="keywords" content="Appraise Register Form template Responsive, Login form web template,Flat Pricing tables,Flat Drop downs Sign up Web Templates, 
 Flat Web Templates, Login sign up Responsive web template, SmartPhone Compatible web template, free web designs for Nokia, Samsung, LG, SonyEricsson, Motorola web design">
<title>Login</title>
<spring:url value="/recursos" var="urlrecursos"></spring:url>

<link rel="stylesheet" type="text/css"
	href="${urlrecursos}/vendor/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="${urlrecursos}/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
	<script type="application/x-javascript">
		addEventListener("load", function () {
			setTimeout(hideURLbar, 0);
		}, false);

		function hideURLbar() {
			window.scrollTo(0, 1);
		}
	</script>
	<link href="${urlrecursos}css/font-awesome.css" rel="stylesheet">
	<link href="${urlrecursos}/css/style.css" rel='stylesheet' type='text/css' />
	<link href="//fonts.googleapis.com/css?family=Josefin+Sans:100,100i,300,300i,400,400i,600,600i,700,700i" rel="stylesheet">
	<link href="//fonts.googleapis.com/css?family=PT+Sans:400,400i,700,700i" rel="stylesheet">
</head>
<body >

	<!-- login -->
	<h1 class="wthree">Appraise Register Form</h1>
	<div class="login-section-agileits">
		<h3 class="form-head">register online today, Its'free!</h3>
		<form action="#" method="post">
			<div class="w3ls-icon">
				<span class="fa fa-user" aria-hidden="true"></span>
				<input type="text" class="lock" name="name" placeholder="username" required="" />
			</div>
			<div class="w3ls-icon">
				<span class="fa fa-lock" aria-hidden="true"></span>
				<input type="password" class="lock" id="password1" name="password" placeholder="Password" required="" />
			</div>
			<div class="w3ls-icon">
				<span class="fa fa-lock" aria-hidden="true"></span>
				<input type="password" class="lock" id="password2" name="sede" placeholder="Confirm Password" required="" />
			</div>
			<input type="submit" value="Sing in">
		</form>
	</div>

	<script type="text/javascript">
		window.onload = function () {
			document.getElementById("password1").onchange = validatePassword;
			document.getElementById("password2").onchange = validatePassword;
		}

		function validatePassword() {
			var pass2 = document.getElementById("password2").value;
			var pass1 = document.getElementById("password1").value;
			if (pass1 != pass2)
				document.getElementById("password2").setCustomValidity("Passwords do not Match");
			else
				document.getElementById("password2").setCustomValidity('');
			//empty string means no validation error
		}
	</script>

</body>
</html>