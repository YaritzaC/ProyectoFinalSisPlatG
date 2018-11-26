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
				<i class="fa fa-user fa-lg"></i> Comprobantes Pedidos
			</h1>
		</div>
		<ul class="app-breadcrumb breadcrumb">
			<li class="breadcrumb-item"><i class="fa fa-home fa-lg"></i></li>
			<li class="breadcrumb-item"><a href="#">Blank Page</a></li>
		</ul>
	</div>

<span><a href="/sysplat/Venta-Pedido" class="btn btn-primary">Nuevo
			Comprobante Pedido </a></span>
<%
 	int i = 0;
 %>
	<div class="table-responsive"
		style="background-color: white; margin-top: 5%;">
		<table class="table table-hover">
			<thead>
				<tr>
					<th>#</th>
					<th>Empleado</th>
					<th>Cliente</th>
					<th>Codigo</th>
					<th>Fecha</th>
					<th>Tipo Pago</th>
					<th>Total</th>
					<th>Igv</th>
					<th>Subtotal</th>
					<th>TipoDocumento</th>
					<th>Numero</th>
					<th>Serie</th>
					<th>Estado</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${listaComprobante}" var="lista">
					<%
						i++;
					%>
				<tr>
					<td><%=i%></td>
					<td>${lista.EMPL_NOMBRE} ${lista.EMPL_APELLIDO} </td>
					<td>${lista.CLI_RAZONSOCIAL} ${lista.CLI_NOMBRE} ${lista.CLI_APELLIDO} </td>
					<td>${lista.HCT_CODIGO}</td>
					<td>${lista.VNT_FECHA}</td>
					<td>${lista.VNT_TIPAGO}</td>
					<td>${lista.VNT_TOTAL}</td>
					<td>${lista.VNT_IGV}</td>
					<td>${lista.VNT_SUBTOTAL}</td>
					<td>${lista.VNT_TIPDOC}</td>
					<td>${lista.VNT_NUMERO}</td>
					<td>${lista.VNT_SERIE}</td>
					<td>${lista.VNT_ESTADO}</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>

	</main>
	<!-- Essential javascripts for application to work-->
	<script src="${urlrecursos}/js/jquery-3.2.1.min.js"></script>
	<script src="${urlrecursos}/js/popper.min.js"></script>
	<script src="${urlrecursos}/js/bootstrap.min.js"></script>
	<script src="${urlrecursos}/js/main.js"></script>
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