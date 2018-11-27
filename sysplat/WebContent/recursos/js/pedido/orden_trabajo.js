$(document).ready(function() {
	$("#alertNotificacion").hide();
	$("#generar").attr('disabled','true');
});
var idped;
$("#buscarpedido").click(function() {
	var codigo = $("#codigopedido").val();
	$.get("ot", {
		"opc" : 1,
		"codigopedido" : codigo
	}, function(data) {
		var x = JSON.parse(data);
		idped = x[0].PED_ID;
		$("#nombrecliente").val(x[0].CLI_NOMBRE);
		$("#codigo").val(x[0].PED_CODIGO);
		$("#nombreproducto").val(x[0].PED_NOMBRE);
		$("#fecha").val(x[0].PED_FECHA);
		$("#alertNotificacion").html("Pedido buscado corectamente");
		$("#alertNotificacion").show(200);
		$("#alertNotificacion").delay(3000).hide(600);
		$("#codigopedido").val("");
		alert(idped)
	});
});
$("#buscarmateria")
		.click(
				function() {
					$("#generar").removeAttr("disabled");
					var materia = $("#materiaprima").val();
					$
							.get(
									"ot",
									{
										"opc" : 2,
										"materia" : materia
									},
									function(data) {
										var x = JSON.parse(data);
										alert(data);
										var i = 1;
										$("#tablita")
												.append(
														"<tr><td hidden='true'>"
																+ x.idmatpri
																+ "</td><td>"
																+ x.idmatpri
																+ "</td><td>"
																+ x.nombre
																+ "</td><td><a class='btn btn-danger edit'"
																+ " href='#' id='borrar' aria-label='Settings'><i class='fa fa-trash' "
																+ "aria-hidden='true'></i></a></td></tr>");
										
									});
				});

$(function() {
	$(document).on('click', '#borrar', function(event) {
		event.preventDefault();
		$(this).closest('tr').remove();
		alert("soy cantidad" + cantidad);
		if(cantidad ===0){
			$("#generar").attr('disabled','true');
		}
	});
});

$("#generar").click(function() {
	var idem = $("#idEmpleado").val();
	$.post("ot", {
		"opc" : 3,
		"idemp" : idem,
		"idped" : idped
	}, function() {
		$("#tablita tbody tr").each(function() {
			var idmateria = $(this).find("td").eq(0).text();
			alert(idmateria + "asasas");
			$.post("ot", {
				"opc" : 4,
				"idmateria" : idmateria
			}, function() {
			});
		});
	});
	$("#nombrecliente").val("");
	$("#codigo").val("");
	$("#nombreproducto").val("");
	$("#fecha").val("");
	$("#alertNotificacion").html("Orden de trabajo creado corectamente");
	$("#alertNotificacion").show(200);
	$("#alertNotificacion").delay(3000).hide(600);
	$("#tablita tbody tr").remove();
});

