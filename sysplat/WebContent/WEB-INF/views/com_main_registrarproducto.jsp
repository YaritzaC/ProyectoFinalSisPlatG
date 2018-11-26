<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<spring:url value="/" var="urlRoot" />
<!DOCTYPE html>
<html lang="es">
<head>
<title>SisPlat-G</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<spring:url value="/recursos" var="urlrecursos"></spring:url>
<link href="${urlrecursos}/css/template.css" rel="stylesheet">
</head>
<body class="app sidebar-mini rtl">
	<!-- Navbar-->
	<jsp:include page="template/header.jsp"></jsp:include>
	<main class="app-content">
	<div class="app-title">
		<div>
			<h1>
				<i class="fa fa-clipboard" style="font-size: 48px; color: orange;"></i>
				Crear Orden Compra
			</h1>
		</div>
		</div>
<!-- Tabla que estoy desarrollando --> 
		<div style="width: 300px; position: relative; left: 70%;">
			<li class="app-search"><input style="width: 300px;"
				class="app-search__input" type="search" placeholder="Search" id="searchpro">
				<button class="app-search__button">
					<i class="fa fa-search"></i>
				</button></li>
		</div>
		<div class="table-responsive"
			style="background-color: white; margin-top: 5%;">
			<table class="table table-hover" id="tablaCrear">
				<thead>
					<tr>
						<th>#</th>
						<th>Nombre</th>
						<th>Stock</th>
						<th>Precio Unitario</th>
						<th>Precio Total</th>
					</tr> 
				</thead>
				<tbody>
					<tr>
						<td>1</td>
						<td>Collar de plata</td>
						<td><input></td>
						<td>
							<div class="row">
							<div class="col-xl-3 col-lg-6 col-lg-12">
								<input type="number" id="income" name="income" value="10" style="width: 50px;">
								<p1> soles</p1>
							</div>
						</td>
						<td>
							<input value="1000" >
						</td>
					</tr>
				</tbody>
			</table>
		</div>
	<br />
	<div class="row">
		<div class="row col-md-12">
			<div class="row col-md-8"></div>
			<div class="col-md-4">
				<span class="btn btn-lg btn-primary"><i class="fa fa-search" aria-hidden="true"></i>Siguiente</span>
				<span class="btn btn-secondary btn-lg"><a style="color: white;"	href="/SISPLAT-G/Compras">Salir </a></span>
			</div>
		</div>
	</div>
	</main>
	<!-- Essential javascripts for application to work-->
	
	<script src="${urlrecursos}/js/jquery-3.2.1.min.js"></script>
	<script src="${urlrecursos}/js/popper.min.js"></script>
	<script src="${urlrecursos}/js/bootstrap.min.js"></script>
	<script src="${urlrecursos}/js/compra/ordencompra.js"></script>
	<script src="${urlrecursos}/js/main.js"></script>
	<!-- The javascript plugin to display page loading on top-->
	<script src="${urlrecursos}/js/plugins/pace.min.js"></script>
	<script type="text/javascript">
	window.alert("INGRESO DE PRODUCTOS CON ÉXITO");
	</script>
	<!-- Page specific javascripts-->
	<!-- Google analytics script-->
	<script type="text/javascript">
		if (document.location.hostname == 'pratikborsadiya.in') {
			(function(i, s, o, g, r, a, m) {
				i['GoogleAnalyticsObject'] = r;
				i[r] = i[r] || function() {
					(i[r].q = i[r].q || []).push(arguments)
				}, i[r].l = 1 * new Date();
				a = s.createElement(o), m = s.getElementsByTagName(o)[0];
				a.async = 1;
				a.src = g;
				m.parentNode.insertBefore(a, m)
			})(window, document, 'script',
					'//www.google-analytics.com/analytics.js', 'ga');
			ga('create', 'UA-72504830-1', 'auto');
			ga('send', 'pageview');
		}
	</script>
</body>
</html>
