<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<spring:url value="/recursos" var="urlrecursos"></spring:url>
<!--===============================================================================================-->
<link rel="icon" type="image/png"
	href="${urlrecursos}/images/icons/favicon.ico" />
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="${urlrecursos}/vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="${urlrecursos}/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="${urlrecursos}/fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="${urlrecursos}/fonts/iconic/css/material-design-iconic-font.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="${urlrecursos}/vendor/animate/animate.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="${urlrecursos}/vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="${urlrecursos}/vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="${urlrecursos}/vendor/select2/select2.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="${urlrecursos}/vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="${urlrecursos}/css/util.css">
<link rel="stylesheet" type="text/css"
	href="${urlrecursos}/css/main.css">
<!--===============================================================================================-->
<style type="text/css">
</style>
</head>
<body style="background-color: ;">

	<div class="limiter">
		<div class="container-login100">
			<div class="login100-more"
				style="background-image: url('${urlrecursos}/images/logoLogin.png');"></div>

			<div class="wrap-login100 p-l-50 p-r-50 p-t-72 p-b-50">
				<form class="login100-form validate-form" method="post"
					action="home">
					<span class="login100-form-title p-b-59"> Sign In </span>

					<div class="wrap-input100 validate-input"
						data-validate="User is required">
						<span class="label-input100">User</span> <input class="input100"
							type="text" name="user" placeholder="User"> <span
							class="focus-input100"></span>
					</div>

					<div class="wrap-input100 validate-input"
						data-validate="Password is required">
						<span class="label-input100">Password</span> <input
							class="input100" type="password" name="password"
							placeholder="*************"> <span class="focus-input100"></span>
					</div>

					<div class="wrap-input100 validate-input"
					data-validate="Sede is required">
						<div class="form-group">
							<span class="label-input100">Sede</span> <select
								class="form-control" id="sel1">
								<option>Seleccione</option>
								<option>1</option>
								<option>2</option>
							</select>
						</div>
					</div>
					<div class="container-login100-form-btn">
						<div class="wrap-login100-form-btn">
							<div class="login100-form-bgbtn"></div>
							<button class="login100-form-btn">Sign in</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>

	<!--===============================================================================================-->
	<script src="${urlrecursos}/vendor/jquery/jquery-3.2.1.min.js"></script>
	<!--===============================================================================================-->
	<script src="${urlrecursos}/vendor/animsition/js/animsition.min.js"></script>
	<!--===============================================================================================-->
	<script src="${urlrecursos}/vendor/bootstrap/js/popper.js"></script>
	<script src="${urlrecursos}/vendor/bootstrap/js/bootstrap.min.js"></script>
	<!--===============================================================================================-->
	<script src="${urlrecursos}/vendor/select2/select2.min.js"></script>
	<!--===============================================================================================-->
	<script src="${urlrecursos}/vendor/daterangepicker/moment.min.js"></script>
	<script src="${urlrecursos}/vendor/daterangepicker/daterangepicker.js"></script>
	<!--===============================================================================================-->
	<script src="${urlrecursos}/vendor/countdowntime/countdowntime.js"></script>
	<!--===============================================================================================-->
	<script src="${urlrecursos}/js/login/main.js"></script>

</body>
</html>