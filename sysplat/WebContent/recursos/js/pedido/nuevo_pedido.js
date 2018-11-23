$(document).ready(function() {
	alert("Hola soy nuevo pedido");
});




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




$("#guardarPedido").click(
		function() {
			var idem = $("#idEmpleado").val();
			var idse = $("#idSede").val();
			var idcli = $("#idCliente").val();
			var nom = $("#nombre").val();
			var can = $("#cantidad").val();
			var pre = $("#precio").val();
			var dim = $("#dimension").val();
			var esp = $("#especificacion").val();
			var obs = $("#observacion").val();

			alert(idem + " ------ " + idse);
			
				$.post("ped", {
					"opc" : 1,
					"idempleado" : idem,
					"idsede" : idse,
					"idcliente" : idcli,
					"nombre" : nom,
					"cantidad" : can,
					"precio" : pre,
					"dimension" : dim,
					"especificacion" : esp,
					"observacion" : obs
				}, function() {
					alert("Llegó");
					swal({
						  position: 'top-end',
						  type: 'success',
						  title: 'Pedido registrado correctamente',
						  showConfirmButton: false,
						  timer: 1500
						})
						
					$("#idEmpleado").val("");
					$("#idSede").val("");
					$("#idCliente").val("");
					$("#nombre").val("");
					$("#cantidad").val("");
					$("#precio").val("");
					$("#dimension").val("");
					$("#especificacion").val("");
					$("#observacion").val("");
					$("#nombreCliente").val("");
				});
				

		});


