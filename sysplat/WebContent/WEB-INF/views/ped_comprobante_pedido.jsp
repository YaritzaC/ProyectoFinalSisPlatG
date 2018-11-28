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
				<i class="fa fa-user fa-lg"></i> Pedido Venta
			</h1>
		</div>
	</div>
	 <div class="alert alert-success alertNotificacion"id="alertNotificacion" role="alert"></div> 
	  <div class="alert alert-danger alertNotificacion"id="alertNotificacion2" role="alert"></div> 
	<label>Hoja Contrato:</label>
		<div class="form-group has-search">
			<div class="row">
				<div class="col-12">
					<div class="input-group">
						<input type="text" class="form-control"
							placeholder="Buscar hoja de contrato por codigo" aria-label="Username"
							aria-describedby="basic-addon1" id="codigoHoja">
						<div class="input-group-append">
							<button class="btn btn-outline-primary" type="button"
								id="buscarHoja">
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
				<label>N° comprobante</label> <input class="form-control"
					type="text" id="nroCom" disabled="disabled"
					style="">
			</div>
			<div class="col-lg-3">
				<label>Serie</label> <input class="form-control" type="text"
					placeholder="" id="nroSer" disabled="disabled" style="">
			</div>
			<div class="col-lg-3">
				<label>Tipo de documento</label> <select
					class="form-control" id="tipodoc">
					<option value="">Seleccione</option>
					<option value="Boleta">Boleta</option>
					<option value="Factura">Factura</option>
				</select>
			</div>
			<div class="col-lg-3">
				<label>Tipo de pago</label> <select
					class="form-control" id="tipopago">
					<option value="">Seleccione</option>
					<option value="Contado">Contado</option>
					<option value="Tarjeta">Tarjeta</option>
				</select>
			</div>
		</div>
		<div class="form-group row" style="margin-top: 2%;">
			<div class="col-lg-4">
				<label>Cliente</label> <input class="form-control" type="text"
					placeholder="" id="cliente" disabled="disabled" style="">
			</div>
			<div class="col-lg-4">
				<label>Codigo</label> <input class="form-control" type="text"
					placeholder="" id="codigo" disabled="disabled" style="">
			</div>
			<div class="col-lg-4">
				<label>Fecha Emitida</label> <input class="form-control" type="text"
					placeholder="" id="fecha" disabled="disabled" style="">
			</div>
		</div>
	</div>
	<div class="table-responsive" style="background-color: white;">
		<table class="table table-hover" id="tableventa">
			<thead>
				<tr>
					<th>#</th>
					<th>Nombre Producto</th>
					<th>Cantidad</th>
					<th>Precio </th>
				</tr>
			</thead>
			<tbody>
			</tbody>
		</table>
	</div>

	<div class="col-sm-12" style="background-color: white; width: 100%;">
		<div class="form-group row" style="margin-top: 2%;">
			<div class="col-lg-1"></div>
			<div class="col-lg-2">
				<label>S/ Importe Total</label>
				<div class="input-group">
					<div class="input-group-append">
						<span class="input-group-text">$</span>
					</div>
					<input type="text" id="importetotal" disabled="disabled" class="form-control"
						aria-label="Amount (to the nearest dollar)" id="importeTotal">
				</div>
			</div>
			<div class="col-lg-1"></div>
			<div class="col-lg-2">
				<label>S/ Adelanto</label>
				<div class="input-group">
					<div class="input-group-append">
						<span class="input-group-text">$</span>
					</div>
					<input type="text" id="adelanto" disabled="disabled" class="form-control"
						aria-label="Amount (to the nearest dollar)" id="adelanto">
				</div>
			</div>
			<div class="col-lg-1"></div>
			<div class="col-lg-2">
				<label>S/ Acuenta</label>
				<div class="input-group">
					<div class="input-group-append">
						<span class="input-group-text">$</span>
					</div>
					<input type="text" id="acuenta" disabled="disabled" class="form-control"
						aria-label="Amount (to the nearest dollar)" id="acuenta">
				</div>
				<div class="col-lg-1"></div>
			</div><div class="col-lg-2">
				<label>IGV(18%)</label>
				<div class="input-group">
					<div class="input-group-append">
						<span class="input-group-text">$</span>
					</div>
					<input type="text" id="igv" disabled="disabled" class="form-control"
						aria-label="Amount (to the nearest dollar)" id="mitad">
				</div>
			</div>
			<div class="col-lg-2"></div>
		</div>
	</div>
	<div class="col-sm-12" style="background-color: white; width: 100%;">
		<div class="form-group row" style="margin-top: 2%;">
			<div class="col-lg-4">
				<button type="button" class="btn btn-primary" id="generar">Generar Venta</button>
				<button type="button" class="btn btn-secondary">Cancelar</button>
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
	<!-- The javascript plugin to display page loading on top-->
	<script src="${urlrecursos}/js/plugins/pace.min.js"></script>
   <script src="${urlrecursos}/js/pedido/venta_pedido.js"></script>
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
		$(document).ready(function() {
			$("#alertNotificacion").hide();
			$("#alertNotificacion2").hide();
			$.get("vc", {
				"opc" : 1
			}, function(data) {
				var x = JSON.parse(data);
				var compro = x[0].VNT_NUMERO;
				if (compro <= 9) {
					alert("asasas");
					$("#nroCom").val("0000" + compro);
				} else if (compro <= 99) {
					$("#nroCom").val("000" + compro);
				} else if (compro <= 999) {
					$("#nroCom").val("00" + compro);
				} else if (compro <= 9999) {
					$("#nroCom").val("0" + compro);
				} else if (compro <= 99999) {
					$("#nroCom").val(compro);
				}
			});

			$.get("vc", {
				"opc" : 2
			}, function(data) {
				var x = JSON.parse(data);
				var serie = x[0].VNT_SERIE;
				if (serie <= 9) {
					$("#nroSer").val("0000" + serie);
				} else if (serie <= 99) {
					$("#nroSer").val("000" + serie);
				} else if (serie <= 999) {
					$("#nroSer").val("00" + serie);
				} else if (serie <= 9999) {
					$("#nroSer").val("0" + serie);
				} else if (serie <= 99999) {
					$("#nroSer").val(serie);
				}
			});
		});
		var idempleado = $("#idEmpleado").val();
		var idsede = $("#idSede").val();
		var precio;
		var cantidad;
		var total;
		var idhoja;
		var idcliente;
		var adelanto;
		$("#buscarHoja").click(
				function() {
					var codigo = $("#codigoHoja").val();
					$.get("vp", {
						"opc" : 1,
						"codigohoja" : codigo
					},
							function(data) {
								var x = JSON.parse(data);
								if (x == "") {
								$("#codigoHoja").val("");
									$("#alertNotificacion2").html(
											"Ingrese un codigo correcto");
									$("#alertNotificacion2").show(200);
									$("#alertNotificacion2").delay(3000).hide(600);
									
								} else {
									$("#tableventa tbody tr").remove();
									idhoja = x[0].HCT_ID;
									idcliente = x[0].CLI_ID;
									$("#cliente").val(x[0].CLI_NOMBRE);
									$("#codigo").val(x[0].HCT_CODIGO);
									$("#fecha").val(x[0].HCT_FECHA);
									$("#importetotal").val(x[0].HCT_TOTAL);
									$("#adelanto").val(x[0].HCT_ADELANTO);
									adelanto = $("#adelanto").val(x[0].HCT_ADELANTO);
									$("#acuenta").val(
											x[0].HCT_TOTAL - x[0].HCT_ADELANTO);
									$("#codigoHoja").val("");
									total = x[0].HCT_TOTAL;
									$("#tableventa").append(
											"<tr><td>" + 1 + "</td><td>"
													+ x[0].PED_NOMBRE + "</td><td>"
													+ x[0].PED_CANTIDAD + "</td><td>"
													+ x[0].PED_PRECIO + "</td></tr>");
									precio = x[0].PED_PRECIO;
									cantidad = x[0].PED_CANTIDAD;
									$("#alertNotificacion").html(
											"Hoja de contrato buscada corectamente");
									$("#alertNotificacion").show(200);
									$("#alertNotificacion").delay(3000).hide(600);
								}
							});
				});

		function limpiar(){
		   	
		}


		$("#generar")
				.click(
						function() {
							var tipodoc = $("#tipodoc").val();
							var tipopago = $("#tipopago").val();
							var igv = $("#igv").val();
							if (tipodoc == "") {
								$("#alertNotificacion2").html(
										"Seleccione un tipo de documento");
								$("#alertNotificacion2").show(200);
								$("#alertNotificacion2").delay(3000).hide(600);
							} else if (tipopago == "") {
								$("#alertNotificacion2").html(
										"Seleccione un tipo de pago");
								$("#alertNotificacion2").show(200);
								$("#alertNotificacion2").delay(3000).hide(600);
							} else if (tipodoc == "Boleta") {
								$.post("vp", {
									"opc" : 2,
									"idempleado" : idempleado,
									"idsede" : idsede,
									"idcliente" : idcliente,
									"idhoja" : idhoja,
									"tipopago" : tipopago,
									"total" : total
								}, function() {
									$.post("vp", {
										"opc" : 3,
										"precio" : precio,
										"cantidad" : cantidad
									}, function() {
										$("#alertNotificacion")
										.html(
												"Boleta creada correctamente buscada corectamente");
								$("#alertNotificacion").show(200);
								$("#alertNotificacion").delay(3000).hide(600);
								
								
									});
								});
							} else if (tipodoc == "Factura") {
								alert("Su igv es:" + (total/0.18).toFixed(2)+  "El total es: " +(total * 1.18).toFixed(2) +  "El subtotal es:" + total.toFixed(2));
								$("#importetotal").val($("#importetotal").val(total * 1.18));
								$("#acuenta").val(($("#importetotal").val(total * 1.18)) - adelanto);
								$("#igv").val();
								$.post("vp", {
									"opc" : 4,
									"idempleado" : idempleado,
									"idsede" : idsede,
									"idcliente" : idcliente,
									"idhoja" : idhoja,
									"tipopago" : tipopago,
									"total" : total
								}, function() {
									$.post("vp", {
										"opc" : 3,
										"precio" : precio,
										"cantidad" : cantidad
									}, function() {
										$("#alertNotificacion")
										.html(
								"Factura creada correctamente buscada corectamente");
								$("#alertNotificacion").show(200);
								$("#alertNotificacion").delay(3000).hide(600);
									});
								});
							}
						});

	</script>
</body>
</html>