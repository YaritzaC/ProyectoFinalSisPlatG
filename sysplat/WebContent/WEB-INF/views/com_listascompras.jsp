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
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
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

	<%
		int i = 0;
	%>
	<div class="col s12" style="left: 80%; width: 200px;">
		<input class="app-search__input" type="search" placeholder="Search" id="buscar">
		<button class="app-search__button"><i class="fa fa-search"></i></button>
	</div>
	<div class="table-responsive"
		style="background-color: white; margin-top: 5%;">
		<table class="table table-hover" id="tablaCrear" >
			<thead>
				<tr>
					<th>#</th>
					<th>Nombre</th>
					<th>Descripción</th>
					<th>Stock</th>
					<th scope="col" colspan="2">Acción</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${listaCompra}" var="hg">
					<%
						i++;
					%>
					<tr>
						<th scope="row"><%=i%></th>
						<td>${hg.PRO_NOMBRE}</td>
						<td>Producto de tienda</td>
						<td>${hg.PRO_STOCK}</td>
						
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<br />
	<div class="row">
		<div class="row col-md-12">
			<div class="row col-md-8"></div>
			<div class="col-md-4">
				<span class="btn btn-lg btn-primary"><a style="color: white;"
					href="/sysplat/Aceptar-Orden-de-Compra">Siguiente </a></span> <span
					class="btn btn-secondary btn-lg"><a style="color: white;"
					href="/SISPLAT-G/Compras">Salir </a></span>
			</div>
		</div>
	</div>

	</main>
	<!-- Essential javascripts for application to work-->
	<script src="${urlrecursos}/js/jquery-3.2.1.min.js"></script>
	<script src="${urlrecursos}/js/popper.min.js"></script>
	<script src="${urlrecursos}/js/bootstrap.min.js"></script>
	<script src="${urlrecursos}/js/main.js"></script>
	<script src="${urlrecursos}/js/compra/ordencompra.js"></script>
	<!-- The javascript plugin to display page loading on top-->
	<script src="${urlrecursos}/js/plugins/pace.min.js"></script>
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