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
<link href="${urlrecursos}/css_login/font-awesome.min.css"
	rel="stylesheet" type="text/css" />
<link href="${urlrecursos}/css_login/bootstrap.min.css" rel="stylesheet">
<link href="${urlrecursos}/css_login/styleFooter.css" rel="stylesheet">
<link href="${urlrecursos}/css_login/styleLogin.css" rel="stylesheet">
<link href="${urlrecursos}/css_login/styleMain.css" rel="stylesheet">
</head>
<body>

	<div class="container">
		<section id="formHolder">
			<div class="row">
				<!-- Logo  -->
				<div class="col-sm-6 brand">
					<div class="heading">
						<img src="${urlrecursos}/images/logoLogin.png">
					</div>
				</div>

				<div class="col-sm-6 form">

					<!-- Recuperacion -->
					<div class="login form-peice switched">
						<form class="login-form" action="home" method="post">
							<div class="form-group">
								<p>Te envieremos un email de recuperacion de contraseña.</p>
							</div>
							<div class="form-group">
								<label for="name">Ingresar e-mail</label> <input type="email"
									class="email" name="loginemail" id="emailR"> <span
									class="error"></span>
							</div>
							<div class="CTA">
								<input type="submit" value="Enviar" id="remember"> <a
									href="#" class="switch">VOLVER A LOGIN</a>
							</div>
						</form>
					</div>


					<!-- Login -->
					<div class="signup form-peice">
						<form class="signup-form" action="home" method="POST">
							<div class="form-group">
								<label for="loginemail">Usuario</label> <input type="text"
									class="name" name="user" id="usuario" required> <input
									type="hidden" value="1" name="opc"> <span class="error"></span>
							</div>

							<div class="form-group">
								<label for="loginPassword">Contraseña</label> <input
									type="password" class="pass" name="password" id="password"
									required> <span class="error"></span>
							</div>

							<div class="alert alert-danger"
								style="margin-top: 100px; display: none;">
								<strong>Atencion!</strong> Datos incorectos
							</div>

							<div class="dropdown">
								<select class="select" name="sedet" id="sedet">
									<option>Seleccione la sede:</option>
									<option>Tienda1</option>
									<option>Tienda2</option>
								</select>
							</div>

							<div class="CTA">
								<input type="submit" value="Ingresar" name="btnIniciar"
									id="Login"> <a href="#" class="switch">Olvidaste tu
									contraseña?</a>
							</div>
						</form>
					</div>
				</div>
			</div>
		</section>
	</div>
	<script src="${urlrecursos}/js/jquery-3.2.1.min.js"></script>
	<script src="${urlrecursos}/js/login/login.js"></script>
</body>
</html>