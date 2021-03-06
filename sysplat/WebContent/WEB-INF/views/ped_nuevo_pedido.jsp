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
<link rel="stylesheet"
	href="${urlrecursos}/sweetalert/sweetalert2.min.css">
</head>
<body class="app sidebar-mini rtl">
	<!-- Navbar-->
	<jsp:include page="template/header.jsp"></jsp:include>
	<main class="app-content">
	<div class="app-title">
		<div>
			<h1>
				<i class="fa fa-user fa-lg"></i> Crear Pedido
			</h1>
		</div>
	</div>


	<div class="col-sm-12" style="background-color: white; width: 100%;">

		<div class="form-group has-search">
			<div class="row">
				<div class="col-lg-3"></div>
				<div class="col-lg-6">
					<label>Cliente</label>
					<div class="input-group">
						<input type="text" class="form-control"
							placeholder="Buscar por DNI o RUC" aria-label="Username"
							aria-describedby="basic-addon1" id="cliente">
						<div class="input-group-append">
							<button class="btn btn-outline-primary" type="button"
								id="buscarCliente">
								<i class="fa fa-search"></i>
							</button>
						</div>
					</div>
				</div>
				<div class="col-lg-3"></div>
			</div>
		</div>
		<div class="form-group row" style="margin-top: 2%; width:;">
			<div class="col-lg-3"></div>
			<div class="col-lg-6">
				<div class="input-group">
					<div class="input-group-append">
						<label class="input-group-text">Cliente:</label>
					</div>
					<input type="text" class="form-control" disabled="disabled"
						id="nombreCliente"> <input type="text"
						class="form-control" disabled="disabled" id="idCliente">
				</div>
			</div>
			<div class="col-lg-3"></div>
		</div>
	</div>
	<div class="col-sm-12" style="background-color: white; width: 100%;">
		<div class="form-group row"">
			<div class="col-lg-3"></div>
			<div class="col-lg-6">
				<label>Nombre</label> <input type="text" class="form-control"
					placeholder="" aria-label="Username"
					aria-describedby="basic-addon1" id="nombre"> <label>Cantidad</label>
				<input type="number" min="1" class="form-control" placeholder=""
					aria-label="Username" aria-describedby="basic-addon1" id="cantidad">
				<label>Precio</label> <input type="text" class="form-control"
					placeholder="" aria-label="Username"
					aria-describedby="basic-addon1" id="precio"> <label>Dimension</label>
				<input type="text" class="form-control" placeholder=""
					aria-label="Username" aria-describedby="basic-addon1"
					id="dimension"> <label>Especificacion</label> <input
					type="text" class="form-control" placeholder=""
					aria-label="Username" aria-describedby="basic-addon1"
					id="especificacion"> <label>Observacion</label> <input
					type="text" class="form-control" placeholder=""
					aria-label="Username" aria-describedby="basic-addon1"
					id="observacion">
			</div>

			<div class="col-lg-3"></div>
		</div>
	</div>

	<div class="col-sm-12" style="background-color: white; width: 100%;">
		<div class="form-group row">
			<div class="col-lg-3"></div>
			<div class="col-lg-6">
				<input type="reset" class="btn btn-secondary" data-dismiss="modal"
					value="Cancel"> <input id="guardarPedido" type="button"
					class="btn btn-primary" value="Guardar Pedido">
			</div>

			<div class="col-lg-3"></div>
		</div>
	</div>
	</main>
	<!-- Essential javascripts for application to work-->
	<script src="${urlrecursos}/js/jquery-3.2.1.min.js"></script>
	<script src="${urlrecursos}/js/popper.min.js"></script>
	<script src="${urlrecursos}/js/bootstrap.min.js"></script>
	<script src="${urlrecursos}/sweetalert/sweetalert2.min.js"></script>
	<script src="${urlrecursos}/js/main.js"></script>
	<script src="${urlrecursos}/js/pedido/nuevo_pedido.js"></script>
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