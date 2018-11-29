$(document).ready(function() {
	$('#bt_add').click(function() {
		agregar();
	});

	$('#idproducto').click(function() {
		buscar();
	});
	$('#manda').click(function() {
		prueba();
	});
});

var mandata ;
$(function(){
    
    $(".buscar").click(function(e) {
        e.preventDefault();
        mandata = $(this).attr("id");
        alert(mandata);
    });
});

function prueba(){
	alert("asdasd");
	alert(mandata);
}

function buscar() {
		$.get("hc", {"opc" : 1,	"nombre" : mandata}, function(data) {
			var x = JSON.parse(data);
			alert(data);
			$("#nombreCliente").val(
					x.nombre + " " + x.apellido + "" + x.razonsocial);
			$("#idCliente").val(x.idcliente);
			$("#cliente").val("");
			$("#alertNotificacion").html("Cliente buscado corectamente");
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

}
