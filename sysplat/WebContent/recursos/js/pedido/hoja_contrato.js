$(document).ready(function() {
	$("#alertNotificacion").hide();
	$("#alertNotificacion2").hide();

});
$("#buscarPedido").click(
		function() {
			var codigo = $("#codigoPedido").val();
			$.get("hoja", {
				"opc" : 1,
				"codigopedido" : codigo
			}, function(data) {
				var x = JSON.parse(data);
				alert(x + "sasa" + data);
				$("#cliente").val(x[0].CLI_NOMBRE);
				$("#codigo").val(x[0].PED_CODIGO);
				$("#fecha").val(x[0].PED_FECHA);
				$("#importeTotal").val((x[0].PED_CANTIDAD * x[0].PED_PRECIO));
				var total = $("#importeTotal").val();
				idpe = x[0].PED_ID;
				$("#mitadTotal").val(total / 2);
				$("#codigoPedido").val("");
				$("#tablehoja tbody tr").remove();
				$("#tablehoja").append(
						"<tr><td>" + 1 + "</td><td>" + x[0].PED_NOMBRE
								+ "</td><td>" + x[0].PED_CANTIDAD + "</td><td>"
								+ x[0].PED_PRECIO + "</td></tr>");
				$("#table tbody tr").remove();
				$("#alertNotificacion").html("Pedido buscada corectamente");
				$("#alertNotificacion").show(200);
				$("#alertNotificacion").delay(3000).hide(600);
			});
		});

$("#generarHoja").click(function() {
	var idem = $("#idEmpleado").val();
	var impor = $("#importeTotal").val();
	var ade = $("#adelanto").val();
	var mitad = $("#mitadTotal").val();
	var cliente = $("#cliente").val();
	
	if(cliente === ""){
		$("#alertNotificacion2").html("Busque un pedido para poder realizar la hoja de contrato");
		$("#alertNotificacion2").show(200);
		$("#alertNotificacion2").delay(3000).hide(600);
	}
	if(impor>ade && ade >mitad){
		$.post("hoja", {
			"opc" : 2,
			"idempleado" : idem,
			"idpedido" : idpe,
			"total" : impor,
			"adelanto" : ade
		}, function() {
			$("#alertNotificacion").html("Hoja de contrato realizado corectamente");
			$("#alertNotificacion").show(200);
			$("#alertNotificacion").delay(3000).hide(600);
			$("#tablehoja tbody tr").remove();
			$("#cliente").val("");
			$("#codigo").val("");
			$("#fecha").val("");
			$("#importeTotal").val("");
			$("#adelanto").val("");
			$("#acuenta").val("");
			$("#mitadTotal").val("");
		});
	}
	else {
		$("#alertNotificacion2").html("Ingrese un monto adecuado ");
		$("#alertNotificacion2").show(200);
		$("#alertNotificacion2").delay(3000).hide(600);
	}
});
