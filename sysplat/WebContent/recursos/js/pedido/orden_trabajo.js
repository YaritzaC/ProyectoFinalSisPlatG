$(document).ready(function() {
	$("#alertNotificacion").hide();
	alert("hola 111:v");
});

$("#buscarpedido").click(function() {
	var codigo = $("#codigopedido").val();
	$.get("ot", {
		"opc" : 1,
		"codigopedido" : codigo
	}, function(data) {
		alert("asas" + data);
		var x = JSON.parse(data);
		$("#nombrecliente").val(x[0].CLI_NOMBRE);
		$("#codigo").val(x[0].PED_CODIGO);
		$("#nombreproducto").val(x[0].PED_NOMBRE);
		$("#fecha").val(x[0].PED_FECHA);
		alert("121121212" + x[0].CLI_NOMBRE + "asasas");
		$("#alertNotificacion").html("Pedido buscado corectamente");
		$("#alertNotificacion").show(200);
		$("#alertNotificacion").delay(3000).hide(600);
		$("#codigopedido").val("");
		$("#tableorden").append("<tr><td>" + x[0].CLI_NOMBRE + "</td></tr>");
	});
});
