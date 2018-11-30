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
				<i class="fa fa-user fa-lg"></i> Producto
			</h1>
		</div>
	</div>
	<!-- Button to Open the Modal -->
	<button type="button" class="btn btn-primary" data-toggle="modal"
		data-target="#myModal">Open modal</button>

	<%
		int i = 0;
	%>
	<div class="table-responsive"
		style="background-color: white; margin-top: 5%;">
		<table class="table table-hover">
			<thead>
				<tr>
					<th>#</th>
					<th>Nombre</th>
					<th>Precio</th>
					<th>Stock</th>
					<th>Codigo</th>
					<th>Estado</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${listaPro}" var="pro">
					<%i++; %>
					<tr>
						<th scope="row"><%=i%></th>
						<td>${pro.PRO_NOMBRE}</td>
						<td>${pro.PRO_PRECIO}</td>
						<td>${pro.PRO_STOCK}</td>
						<td>${pro.PRO_CODIGO}</td>
						<td>${pro.PRO_ESTADO}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<!-- The Modal -->
	<div class="modal" id="myModal">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h3>Ingresar Productos</h3>
					<button type="button" class="close" data-dismiss="modal">&times;</button>
				</div>
				<!-- Modal body -->
				<div class="modal-body">
					<!-- form user info -->
					<div class="card-body">
						<form class="form" role="form" autocomplete="off">
							<div class="form-group row">
								<label class="col-lg-3 col-form-label form-control-label">Nombre</label>
								<div class="col-lg-9">
									<input class="form-control" type="text"
										placeholder="Jose Armando">
								</div>
							</div>
							<div class="form-group row">
								<label class="col-lg-3 col-form-label form-control-label">Last
									name</label>
								<div class="col-lg-9">
									<input class="form-control" type="text"
										placeholder="Guzman Gonzales">
								</div>
							</div>
							<div class="form-group row">
								<label class="col-lg-3 col-form-label form-control-label">DNI</label>
								<div class="col-lg-9">
									<input class="form-control" type="text" placeholder="74289801">
								</div>
							</div>
							<div class="form-group row">
								<label class="col-lg-3 col-form-label form-control-label">Type</label>
								<div class="col-lg-9">
									<select id="user_time_zone" class="form-control" size="0">
										<option value="Hawaii">Administrador</option>
										<option value="Central Time (US &amp; Canada)"
											selected="selected">Vendedor</option>
										<option value="Indiana (East)">Jefe de fabricaciï¿½n</option>
									</select>
								</div>
							</div>
							<div class="form-group row">
								<label class="col-lg-3 col-form-label form-control-label">Username</label>
								<div class="col-lg-9">
									<input class="form-control" type="text"
										placeholder="JoseGuzman123">
								</div>
							</div>
							<div class="form-group row">
								<label class="col-lg-3 col-form-label form-control-label">Password</label>
								<div class="col-lg-9">
									<input class="form-control" type="password"
										placeholder="123456">
								</div>
							</div>
							<div class="form-group row">
								<label class="col-lg-3 col-form-label form-control-label">Confirm</label>
								<div class="col-lg-9">
									<input class="form-control" type="password"
										placeholder="123456">
								</div>
							</div>
						</form>
					</div>
				</div>
				<!-- Modal footer -->
				<div class="modal-footer">
					<input type="reset" class="btn btn-secondary" data-dismiss="modal"
						value="Cancel"> <input id="GuardarEmpleado" type="button"
						class="btn btn-primary" value="Save Changes">
				</div>
			</div>
		</div>
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