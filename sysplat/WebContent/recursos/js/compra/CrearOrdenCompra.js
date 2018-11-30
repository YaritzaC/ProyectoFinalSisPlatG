$(document).ready(function () {
    ListarProd();
    VerificacionReserva();
    ListarDoc();
});

$('td').click(function() {
			var $this = $(this);
			col = $this.index();
			//row es la columna que toma
			row = $this.closest('tr').index();

			// Almaceno el id de la tabla en una variable
			var cantidadtemp = document.getElementById('tablaProductotemporal').tBodies[0].rows[row].cells[4].innerHTML;
			//No se que sera---------------------------------------------------------
			codmundial = document.getElementById('tablaProductotemporal').tBodies[0].rows[row].cells[5].innerHTML;
			//Obtengo la cantidad de la tabla temporal
			// Id para editar un producto
			$("#canc").val(cantidadtemp);
			//Obtenego el codigo
		});


enviarcanti.onclick = function() {
	var cantidacam = document.getElementById("stock").value;
	alert("Esta es la cantidad que me toma: "+cantidad);
	location.href = "modificar/" + cantidacam + "," + codmundial;

};



function ListarProd() {
	alert("si sale");
    $.get("ordenCom", {"opc": 4}, function (data) {
        var x = JSON.parse(data);
        alert("si sale211111111");
        $("#tablaCrear tbody tr").remove();
        for (var i = 0; i < x.length; i++) {
            $("#tablaPrestamo").append("<tr><td>" + (i + 1) + "</td><td>" + x[i].nomProd + "</td><td>" + e + "</td><td>" + x[i].stock + "</td>\n\
            <td><a href='#' id='bt"+x[i].idPro+"' class='material-icons' style='background:none;border:none; color:lightblue' onclick='productoSeleccionado("+x[i].idPro+")'>check_circle</a></td></tr>");       
        }
    });
}

function productoSeleccionado(x){
    $.get("ordenCom", {"id":x,"opc":4}, function (data) {
        var y = JSON.parse(data);
        if(document.getElementById("bt"+y.idP+"").style.color === 'green')
        {
           Materialize.toast("El equipo ya esta en la lista!", 1980);  
        }
        else{
        $("#tablaDetalle").append("<tr><td hidden>"+y.idP+"</td><td>" + y.nom + "</td><td>" + e + "</td><td>" + y.nomTip + "</td>\n\
        <td><button class='material-icons prefix' style='background:none;border:none; color:#D84A52' onclick='eliminarEquipo(this.parentNode.parentNode.rowIndex,"+y.idP+")'>highlight_off</button></td></tr>");
        document.getElementById("bt"+y.idP+"").style.color = 'green';
        }
     });
}
