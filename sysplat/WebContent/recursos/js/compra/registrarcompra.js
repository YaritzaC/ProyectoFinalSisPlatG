$(document).ready(function() {
	$('#bt_add').click(function() {
		agregar();
	});

	$("#idproducto").click(function() {
		buscar();
	});
	ListarProd();
});

var mandata ;
$(function(){
    
    $(".buscar").click(function(e) {
        e.preventDefault();
        mandata = $(this).attr("name");
        alert(data);
    });
});

function buscar() {
	alert("Llego al buscar");
		$.post("compra", {"opc" : 1, "idcompra" : mandata},
			function(data) {
			var x = JSON.parse(data);
			alert("hola"+data);
		});
}

$("#buscarCliente").click(
		function() {
			var cli = $("#cliente").val();
			if (cli != "") {
				$.get("hc", {
					"opc" : 1,
					"nombre" : cli
				}, function(data) {
					var x = JSON.parse(data);
					alert(data);
					$("#nombreCliente").val(
							x.nombre + " " + x.apellido + "" + x.razonsocial);
					$("#idCliente").val(x.idcliente);
					$("#cliente").val("");
					$("#alertNotificacion")
							.html("Cliente buscado corectamente");
					$("#alertNotificacion").show(200);
					$("#alertNotificacion").delay(3000).hide(600);
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

// Parte que actualiza el stock
