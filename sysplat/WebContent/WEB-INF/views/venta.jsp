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
<link rel="stylesheet"
	href="${urlrecursos}/selectpicker/bootstrap-select.min.css">
</head>
<body class="app sidebar-mini rtl">
	<!-- Navbar-->
	<jsp:include page="template/header.jsp"></jsp:include>
	<main class="app-content">
	<div class="app-title">
		<div>
			<h1>
				<i class="fa fa-user fa-lg"></i> Venta
			</h1>
		</div>
	</div>
	<div class="alert alert-success alertNotificacion"
		id="alertNotificacion" role="alert"></div>
	<div class="col-sm-12" style="background-color: white; width: 100%;">
		<div class="form-group row" style="margin-top: 2%;">
			<div class="col-lg-3">

				<label>Nro comprobante</label> <input class="form-control"
					type="text" disabled="disabled" id="nroCom">
			</div>
			<div class="col-lg-3">
				<label>Serie</label> <input class="form-control" type="text"
					disabled="disabled" id="nroSer">
			</div>
			<div class="col-lg-3">
				<label for="exampleFormControlSelect1">Tipo de documento</label> <select
					class="form-control" id="tipoDo">
					<option value="Seleccione">Seleccione</option>
					<option value="Boleta">Boleta</option>
					<option value="Factura">Factura</option>
				</select>
			</div>
			<div class="col-lg-3">
				<label for="exampleFormControlSelect1">Tipo de pago</label> <select
					class="form-control" id="tipoPa">
					<option value="Seleccione">Seleccione</option>
					<option value="Contado">Contado</option>
					<option value="Tarjeta">Tarjeta</option>
				</select>
			</div>
		</div>
		<label>Cliente</label>
		<div class="form-group has-search">
			<div class="row">
				<div class="col-12">
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
			</div>
		</div>
		<div class="form-group row" style="margin-top: 2%; width:;">
			<div class="col-lg-12">
				<div class="input-group">
					<div class="input-group-append">
						<label class="input-group-text">Cliente:</label>
					</div>
					<input type="text" class="form-control" disabled="disabled"
						id="nombreCliente"> <input type="text"
						class="form-control" disabled="disabled" id="idCliente">
				</div>
			</div>

		</div>
		<label>Producto</label>
		<div class="form-group has-search">
			<div class="row">
				<div class="col-12">
					<div class="input-group">
						<select data-size="7" class="form-control" data-live-search="true"
							class="selectpicker" id="codigoPro">
							<option value="Ingrese codigo">Ingrese codigo</option>
							<c:forEach items="${listaProd}" var="pro">
								<option value="${pro.PRO_ID}">${pro.PRO_CODIGO}</option>
							</c:forEach>
						</select>
						<div class="input-group-append">
							<button class="btn btn-outline-primary" type="button"
								id="buscarProducto">
								<i class="fa fa-search"></i>
							</button>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>


	<div class="table-responsive" style="background-color: white;">
		<table class="table table-hover" id="tablePro">
			<thead>
				<tr>
					<th hidden="">Id Codigo</th>
					<th>Codigo</th>
					<th>Nombre</th>
					<th>Precio</th>
					<th>Stock</th>
					<th>Cantidad</th>
					<th>Importe</th>
					<th>Accion</th>

				</tr>
			</thead>
			<tbody>
			</tbody>
		</table>
	</div>
	<div class="col-sm-12" style="background-color: white; width: 100%;">
		<div class="form-group row" style="margin-top: 2%;">
			<div class="col-lg-2"></div>
			<div class="col-lg-2">
				<label>S/ Sub Total</label>
				<div class="input-group">
					<div class="input-group-append">
						<span class="input-group-text">$</span>
					</div>
					<input disabled="disabled" type="text" class="form-control"
						aria-label="Amount (to the nearest dollar)" id="subtotal">
				</div>
			</div>
			<div class="col-lg-1"></div>
			<div class="col-lg-2">
				<label>S/ IGV %</label>
				<div class="input-group">
					<div class="input-group-append">
						<span class="input-group-text">$</span>
					</div>
					<input disabled="disabled" type="text" class="form-control"
						aria-label="Amount (to the nearest dollar)" id="igv">
				</div>
			</div>
			<div class="col-lg-1"></div>
			<div class="col-lg-2">
				<label>S/ Total</label>
				<div class="input-group">
					<div class="input-group-append">
						<span class="input-group-text">$</span>
					</div>
					<input disabled="disabled" type="text" class="form-control"
						aria-label="Amount (to the nearest dollar)" id="total">
				</div>
			</div>
			<div class="col-lg-2"></div>
		</div>
	</div>
	<div class="col-sm-12" style="background-color: white; width: 100%;">
		<div class="form-group row" style="margin-top: 2%;">
			<div class="col-lg-4">
				<button type="button" class="btn btn-primary" id="generarVenta">Generar
					Venta</button>
				<span><a href="/sysplat/Lista-Venta"
					class="btn btn-secondary">Cancelar</a></span>
			</div>
			<div class="col-lg-8"></div>

		</div>
	</div>

	</main>
	<!-- Essential	 javascripts for application to work-->
	<script src="${urlrecursos}/js/jquery-3.2.1.min.js"></script>
	<script src="${urlrecursos}/js/popper.min.js"></script>
	<script src="${urlrecursos}/js/bootstrap.min.js"></script>
	<script src="${urlrecursos}/sweetalert/sweetalert2.min.js"></script>
	<script src="${urlrecursos}/selectpicker/bootstrap-select.min.js"></script>
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

		$(document).ready(function() {

			$("#generarVenta").attr('disabled', 'true');

			$("#alertNotificacion").hide();
			var id = $("#idEmpleado").val();
			var ids = $("#idSede").val();

			$.get("vc", {
				"opc" : 1
			}, function(data) {
				var x = JSON.parse(data);
				var compro = x[0].VNT_NUMERO;
				if (compro <= 9) {
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

		$("#buscarCliente").click(
				function() {

					// Input donde se coloca el DNI o RUC del cliente
					var cli = $("#cliente").val();

					if (cli != "") {
						$.get("hc", {
							"opc" : 1,
							"nombre" : cli
						}, function(data) {
							var x = JSON.parse(data);
							alert(data);

							//Me carga datos del cliente
							$("#nombreCliente").val(
									x.nombre + " " + x.apellido + ""
											+ x.razonsocial);
							$("#idCliente").val(x.idcliente);

							// Alert 
							$("#cliente").val("");
							$("#alertNotificacion").html(
									"Cliente buscado corectamente");
							$("#alertNotificacion").show(200);
							$("#alertNotificacion").delay(3000).hide(600);

						});
					} else {
						alert("VACIO");
						swal({
							position : 'top-end',
							type : 'error',
							title : 'Ups! Cliente no existe!',
							showConfirmButton : false,
							timer : 1500
						})
					}

				});

		$("#buscarProducto")
				.click(
						function() {
							// Habilitar boton de la venta
							$("#generarVenta").removeAttr("disabled");

							var pro = $("#codigoPro").val();
							alert(pro);
							if (pro != "Ingrese codigo") {
								alert("LLENO");
								$
										.get(
												"pc",
												{
													"opc" : 1,
													"codigo" : pro
												},
												function(data) {
													var x = JSON.parse(data);
													alert(data);
													$("#tablePro")
															.append(
																	"<tr><td hidden='true'>"
																			+ x.idproducto
																			+ "</td><td>"
																			+ x.codigo
																			+ "</td><td>"
																			+ x.nombre
																			+ "</td><td>"
																			+ x.precio
																					.toFixed(2)
																			+ "</td><td>"
																			+ x.stock
																			+ "</td><td><input min='1' max='"
																			+ x.stock
																			+ "' type='text' onchange='ActualizarTotal()' onkeyup='Total("
																			+ x.precio
																					.toFixed(2)
																			+ ",this.value)' class='form-control'></td><td><input disabled='disabled' type='text' id='importe' class='form-control'></td>"
																			+ "<td><a class='btn btn-danger edit' href='#' id='borrar' aria-label='Settings'><i class='fa fa-trash' aria-hidden='true'></i></a></td></tr>");

													alert("Estoy aca "
															+ x.idproducto);

												});
							} else {
								alert("VACIO");
								swal({
									position : 'top-end',
									type : 'error',
									title : 'Ups! Producto no existe!',
									showConfirmButton : false,
									timer : 1500
								})
							}

						});

		function Total(x, y) {
			$('table tr td')
					.keyup(
							function() {
								var fila = $(this).parent('tr').index();
								document.getElementById("tablePro").rows[fila + 1].cells[6].innerText = (x * y)
										.toFixed(2);
								ActualizarTotal();
							});
		}

		function ActualizarTotal() {
			var totales = [];
			$('#tablePro tbody tr').each(function() {
				//recibe valor = importe
				var tot = $(this).find("td").eq(6).html();
				totales.push(tot);
			});
			var total = eval(totales.join("+"));

			$("#subtotal").val(total.toFixed(2));

			var tipo = $("#tipoDo").val();
			if (tipo == "Boleta") {
				$("#igv").val("0.00");
				$("#total").val(total.toFixed(2));
			} else if (tipo == "Factura") {
				var igv = (total.toFixed(2) * 0.18);
				$("#igv").val(igv.toFixed(2));
				var tot = total + igv;
				$("#total").val(tot.toFixed(2));
			}
		}

		function EliminarProductoCarrito() {
			$('table tr td').click(function() {
				var fila = ($(this).parent('tr').index() + 1);
				alert(fila);
				$("#table tbody" + fila).remove();
			});
		}

		$(function() {
			$(document).on('click', '#borrar', function(event) {
				event.preventDefault();
				$(this).closest('tr').remove();
			});
		});

		$("#generarVenta")
				.click(
						function() {
							var idem = $("#idEmpleado").val();
							var idse = $("#idSede").val();
							var idclien = $("#idCliente").val();

							var pag = $("#tipoPa").val();
							var doc = $("#tipoDo").val();

							var subto = $("#subtotal").val();
							var to = $("#total").val();

							// Nombre del cliente
							var clien = $("#nombreCliente").val();

							alert("Soy id empleado " + idem);

							alert("Soy total " + to);

							if (idem != "" && idse != "" && idclien != ""
									&& pag != "Seleccione"
									&& doc != "Seleccione" && doc == "Boleta"
									&& total != 0.00) {
								$
										.post(
												"vc",
												{
													"opc" : 3,
													"idempleado" : idem,
													"idsede" : idse,
													"idcliente" : idclien,
													"pago" : pag,
													"total" : to,
													"documento" : doc
												},
												function() {
													alert("Llegue venta");
													swal({
														position : 'top-end',
														type : 'success',
														title : 'Venta registrada correctamente',
														showConfirmButton : false,
														timer : 1500
													})

													$("#idCliente").val("");

													$("#tipoPa").val(
															"Seleccione");
													$("#tipoDo").val(
															"Seleccione");

													$("#subtotal").val("0.00");
													$("#igv").val("0.00");
													$("#total").val("0.00");

													// Nombre del cliente
													$("#nombreCliente").val();

													//Remover tabla
													$('#tablePro tbody tr')
															.remove();

													//Deshabilitar venta
													$("#generarVenta").attr(
															'disabled', 'true');
												});

							} else if (idem != "" && idse != ""
									&& idclien != "" && pag != "Seleccione"
									&& doc != "Seleccione" && doc == "Factura"
									&& subtotal != 0.00) {
								$.post(
												"vc",
												{
													"opc" : 4,
													"idempleado" : idem,
													"idsede" : idse,
													"idcliente" : idclien,
													"pago" : pag,
													"subtotal" : subtotal,
													"documento" : doc
												},
												function() {
													alert("Llegue venta factura");
													swal({
														position : 'top-end',
														type : 'success',
														title : 'Venta con factura registrada correctamente',
														showConfirmButton : false,
														timer : 1500
													})

													$("#idCliente").val("");

													$("#tipoPa").val(
															"Seleccione");
													$("#tipoDo").val(
															"Seleccione");

													$("#subtotal").val("0.00");
													$("#igv").val("0.00");
													$("#total").val("0.00");

													// Nombre del cliente
													$("#nombreCliente").val();

													//Remover tabla
													$('#tablePro tbody tr')
															.remove();

													//Deshabilitar venta
													$("#generarVenta").attr(
															'disabled', 'true');
												});
							} else {
								alert("VACIO");
								swal({
									position : 'top-end',
									type : 'error',
									title : 'Ups! Venta fallida!',
									showConfirmButton : false,
									timer : 1500
								})
							}
						});
	</script>
</body>
</html>