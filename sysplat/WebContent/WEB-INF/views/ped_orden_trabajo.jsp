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
<style type="text/css">
.letra {
	font-family: Century Gothic;
}

.has-search .form-control-feedback {
	position: absolute;
	z-index: 2;
	display: block;
	width: 2.375rem;
	height: 2.375rem;
	line-height: 2.375rem;
	text-align: center;
	pointer-events: none;
	color: #aaa;
}
</style>
</head>
<body class="app sidebar-mini rtl">
	<!-- Navbar-->
	<jsp:include page="template/header.jsp"></jsp:include>
	<main class="app-content">
	<div class="app-title">
		<div>
			<h1>
				<i class="fa fa-user fa-lg"></i> Orden Trabajo
			</h1>
		</div>
	</div>
	<div class="alert alert-success alertNotificacion"
		id="alertNotificacion" role="alert"></div>
	<label>Codigo Pedido:</label>
	<div class="form-group has-search">
		<div class="row">
			<div class="col-12">
				<div class="input-group">
					<input type="text" class="form-control"
						placeholder="Ingrese el codigo del pedido" aria-label="Username"
						aria-describedby="basic-addon1" id="codigopedido">
					<div class="input-group-append">
						<button class="btn btn-outline-primary" type="button"
							id="buscarpedido">
							<i class="fa fa-search"></i>
						</button>
					</div>
				</div>
			</div>
		</div>
	</div>

	<div class="col-sm-12" style="background-color: white; width: 100%;">
		<div class="form-group row" style="margin-top: 2%;">
			<div class="col-lg-3">
				<label>Nombre:</label> <input class="form-control" type="text"
					placeholder="" id="nombrecliente" disabled="disabled" style="">
			</div>
			<div class="col-lg-3">
				<label>Codigo Pedido:</label> <input class="form-control"
					type="text" id="codigo" disabled="disabled" style="">
			</div>
			<div class="col-lg-3">
				<label>Nombre Producto</label> <input class="form-control"
					type="text" id="nombreproducto" disabled="disabled" style="">
			</div>
			<div class="col-lg-3">
				<label>Fecha Emitida</label> <input class="form-control" type="text"
					id="fecha" disabled="disabled" style="">
			</div>
		</div>
		<label>Materia Prima</label>
		<div class="form-group has-search">
			<div class="row">
				<div class="col-12">
					<div class="input-group">
						<select data-size="7" class="form-control" data-live-search="true"
							class="selectpicker" id="materiaprima">
							<c:forEach items="${listamateria}" var="ma">
								<option value="${ma.MTP_ID}">${ma.MTP_NOMBRE}</option>
							</c:forEach>
						</select>
						<div class="input-group-append">
							<button class="btn btn-outline-primary" type="button"
								id="buscarmateria">
								<i class="fa fa-search"></i>
							</button>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="form-group row" style="margin-top: 2%;">
			<div class="table-responsive" style="background-color: white;">
				<table id="tablita" class="table table-hover">
					<thead>
						<tr>
							<th>#</th>
							<th>Nombre</th>
							<th>Editar</th>
						</tr>
					</thead>
					<tbody>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<div class="col-sm-12" style="background-color: white; width: 100%;">
		<div class="form-group row" style="margin-top: 2%;">
			<div class="col-lg-4">
				<button type="button" class="btn btn-primary" id="generar">Generar
					Orden</button>
				<span><a href="/sysplat/Lista-OT" class="btn btn-primary"">Cancelar
				</a></span>
			</div>
			<div class="col-lg-8"></div>

		</div>
	</div>


	</main>
	<!-- Essential javascripts for application to work-->
	<script src="${urlrecursos}/js/jquery-3.2.1.min.js"></script>
	<script src="${urlrecursos}/js/popper.min.js"></script>
	<script src="${urlrecursos}/js/bootstrap.min.js"></script>
	<script src="${urlrecursos}/js/main.js"></script>
	<script src="${urlrecursos}/sweetalert/sweetalert2.min.js"></script>
	<script src="${urlrecursos}/selectpicker/bootstrap-select.min.js"></script>
	<script src="${urlrecursos}/js/pedido/orden_trabajo.js"></script>
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