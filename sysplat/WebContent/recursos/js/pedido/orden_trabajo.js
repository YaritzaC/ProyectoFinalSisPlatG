$(document).ready(function() {
	$("#alertNotificacion").hide();
});
var idped;
$("#buscarpedido").click(function() {
	var codigo = $("#codigopedido").val();
	$.get("ot", {
		"opc" : 1,
		"codigopedido" : codigo
	}, function(data) {
		var x = JSON.parse(data);
		idped=x[0].PED_ID;
		alert(data);
		$("#nombrecliente").val(x[0].CLI_NOMBRE);
		$("#codigo").val(x[0].PED_CODIGO);
		$("#nombreproducto").val(x[0].PED_NOMBRE);
		$("#fecha").val(x[0].PED_FECHA);
		alert("121121212" + x[0].CLI_NOMBRE + "asasas");
		$("#alertNotificacion").html("Pedido buscado corectamente");
		$("#alertNotificacion").show(200);
		$("#alertNotificacion").delay(3000).hide(600);
		$("#codigopedido").val("");
		alert(idped)
	});
});
$("#buscarmateria").click(function() {
	var materia = $("#materiaprima").val();
	$.get("ot", {
		"opc" : 2,
		"materia" : materia
	}, function(data) {
		var x = JSON.parse(data);
		alert(data);
		var i=1;
		$("#tableorden")
		.append(
				"<tr><td hidden='true'>"
				+ x.idmatpri + "</td><td>"
				+ i++
				+ "</td><td>"
				+ x.nombre
				+ "</td><td><a class='btn btn-danger edit'" +
						" href='#' id='borrar' aria-label='Settings'><i class='fa fa-trash' " +
						"aria-hidden='true'></i></a></td></tr>"	
		);	
		i++;
	});
});

$(function() {
	$(document).on('click', '#borrar', function(event) {
		event.preventDefault();
		$(this).closest('tr').remove();
	});
});
$("#generar").click(function() {
	var idem = $("#idEmpleado").val();
	alert(idped + "    "   + idem);
	
	
});






