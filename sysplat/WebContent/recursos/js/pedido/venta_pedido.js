$(document).ready(function() {
	$("#alertNotificacion").hide();
	$("#alertNotificacion2").hide();
	alert("hola 121aaa2:v");
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
alert("idempleado" + idempleado + "     idsede" + idsede);
$("#buscarHoja").click(function() {
	var codigo = $("#codigoHoja").val();
	$.get("vp", { "opc" : 1, "codigohoja" : codigo}, function(data) {
		var x = JSON.parse(data);
		idhoja = x[0].HCT_ID;
		idcliente = x[0].CLI_ID;
		alert("idhoja" + idhoja);
		alert("idempleado" + idcliente);
		$("#cliente").val(x[0].CLI_NOMBRE);
		$("#codigo").val(x[0].HCT_CODIGO);
		$("#fecha").val(x[0].HCT_FECHA);
		$("#importetotal").val(x[0].HCT_TOTAL);
		$("#adelanto").val(x[0].HCT_ADELANTO);
		$("#acuenta").val(x[0].HCT_TOTAL-x[0].HCT_ADELANTO);
	    $("#codigoHoja").val("");
	    total= x[0].HCT_TOTAL;
		$("#table").append("<tr><td>" + 1 + "</td><td>" + x[0].PED_NOMBRE + "</td><td>" + x[0].PED_CANTIDAD + "</td><td>" + x[0].PED_PRECIO + "</td></tr>");
		precio=x[0].PED_PRECIO;
		cantidad=x[0].PED_CANTIDAD
		alert("soy precio" + precio + "soy cantidad " + cantidad);
		$("#alertNotificacion").html("Hoja de contrato buscada corectamente");
		$("#alertNotificacion").show(200);
		$("#alertNotificacion").delay(3000).hide(600);
			});
});

$("#generar").click(function(){
	var tipodoc=$("#tipodoc").val();
	var tipopago=$("#tipopago").val();
	if(tipodoc==""){
		alert("soy precio" + precio + "soy cantidad" + cantidad);
		$("#alertNotificacion2").html("Seleccione un tipo de documento");
		$("#alertNotificacion2").show(200);
		$("#alertNotificacion2").delay(3000).hide(600);
	}else if(tipopago==""){
		
		$("#alertNotificacion2").html("Seleccione un tipo de pago");
		$("#alertNotificacion2").show(200);
		$("#alertNotificacion2").delay(3000).hide(600);
	}
	else if(tipodoc=="Boleta"){
		alert("soy boleta");
		alert("soy precio" + tipopago);
		$.post("vp", { "opc" : 2, "idempleado" : idempleado,
			"idsede":idsede,"idcliente":idcliente, "idhoja": idhoja,
			"tipopago":tipopago, "total":total },
				function() {
				$("#alertNotificacion").html("Boleta creada correctamente buscada corectamente");
				$("#alertNotificacion").show(200);
				$("#alertNotificacion").delay(3000).hide(600);
			$.post("vp", { "opc" : 3, "precio":precio,
				"cantidad":cantidad}, function() {
					$("#alertNotificacion").html("detalle de la boleta creada correctamente buscada corectamente");
					$("#alertNotificacion").show(200);
					$("#alertNotificacion").delay(3000).hide(600);
				
			});
		});	
	}
	//else if(tipodoc=="Factura"){
	
	//	$.get("vp", { "opc" : 1, "codigohoja" : codigo}, function(data) {	
	//	});
	//}

	
});










