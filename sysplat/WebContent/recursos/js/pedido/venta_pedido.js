$(document).ready(function() {
	$("#alertNotificacion").hide();
	$("#alertNotificacion2").hide();
	alert("hola 121aaa2:v");
	
	alert(idempleado + "asasas" + ids);
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
var idempledo = $("#id").val();
var idsede = $("#idse").val();
$("#buscarHoja").click(function() {
	var codigo = $("#codigoHoja").val();
	$.get("vp", { "opc" : 1, "codigohoja" : codigo}, function(data) {
		var x = JSON.parse(data);
		$("#cliente").val(x[0].CLI_NOMBRE);
		$("#codigo").val(x[0].HCT_CODIGO);
		$("#fecha").val(x[0].HCT_FECHA);
		$("#importetotal").val(x[0].HCT_TOTAL);
		$("#adelanto").val(x[0].HCT_ADELANTO);
		$("#acuenta").val(x[0].HCT_TOTAL-x[0].HCT_ADELANTO);
	    $("#codigoHoja").val("");
		$("#table").append("<tr><td>" + 1 + "</td><td>" + x[0].PED_NOMBRE + "</td><td>" + x[0].PED_CANTIDAD + "</td><td>" + x[0].PED_PRECIO + "</td></tr>");
		$("#alertNotificacion").html("Hoja de contrato buscada corectamente");
		$("#alertNotificacion").show(200);
		$("#alertNotificacion").delay(3000).hide(600);
			});
});


$("#generar").click(function(){
	var tipodoc=$("#tipodoc").val();
	var tipopago=$("#tipopago").val();
	if(tipodoc==""){
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
		$.get("vp", { "opc" : 2, "" : idempleado, "":idsede,"":idcliente, "": idhojacontrato, "":tipopago, "":total },
				function(data) {
			alert("asas");
			$.get("vp", { "opc" : 3, "" :idventa, "":as,"":as}, function(data) {
				
			});
		});
		
	}
	else if(tipodoc=="Factura"){
	//	$.get("vp", { "opc" : 1, "codigohoja" : codigo}, function(data) {	
	//	});
	}

	
});










