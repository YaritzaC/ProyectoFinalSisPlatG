$(document).ready(function () {
    ListarProd();
    VerificacionReserva();
    ListarDoc();
});

var mandata ;
$(function(){ $(".buscar").click(function(e) {
        e.preventDefault();
        mandata = $(this).attr("name"); 
        alert(mandata);
        alert("no lo se1");
});
});

$("#buscar").keyup(function () {
    var tableReg = document.getElementById('tablaCrear');
    var searchText = document.getElementById('buscar').value.toLowerCase();
    for (var i = 1; i < tableReg.rows.length; i++) {
        var cellsOfRow = tableReg.rows[i].getElementsByTagName('td');
        var encontrado = false;
        for (var j = 0; j < cellsOfRow.length && !encontrado; j++) {
            var compareWith = cellsOfRow[j].innerHTML.toLowerCase();
            if (searchText.length === 0 || (compareWith.indexOf(searchText) > -1)) {
                encontrado = true;
            }
        }
        if (encontrado) {
            tableReg.rows[i].style.display = '';
        } else {
            tableReg.rows[i].style.display = 'none';
        }
    }
});


$("#guardarOrdenCompra").click(
		function() {
			//Datos para enviar a com_agregar_orden_compra()
			var idem = $("#idEmpleado").val();
			var tipo = "Compra"
			var prove = 1;
			
			// Datos para enviar a com_agregar_detalle_compra()
			/*
			 * var stock = $("#stock").val();
			 * producto, stock , materia , precio 
			 */
			
			alert(idem);
			
			if (idem != "" && tipo != "" && prove != "") {
				alert("Control 1")
				$.post("ordenCom", {
					"opc" : 1,
					"idproveedor":prove,
					"idempleado" : idem,
					"tipo" : tipo
				}, function() {
					alert("Llegó");
					GuardarDetalle();
					swal({
						  position: 'top-end',
						  type: 'success',
						  title: 'Orden registrado correctamente',
						  showConfirmButton: false,
						  timer: 1500
						})
				});
			}
			else {
				alert("VACIO");
				swal({
					position : 'top-end',
					type : 'error',
					title : 'Ups! Orden fallido!',
					showConfirmButton : false,
					timer : 1500
				})
			}
		});

function GuardarDetalle() {
	
	// Datos para enviar a com_agregar_detalle_compra()
	/*
	 * producto, stock , materia , precio 
	 */
	var cant = $("#stock").val();
	var idpro = $("#idproducto").val();
	var idmat = 1;
	var idpreci = $("#idPrecio").val();

	alert(idem);
	
	if (cant != "" && idpro != "" && idmat != "" && idpreci !="") {
		alert("Control x1")
		$.post("ordenCom", {
			"opc" : 2,
			"idproducto":idpro,
			"idmateria" : idmat,
			"precio" : idpreci,
			"cantidad":cant
		}, function() {
			alert("Llegó");
		});
	}
	else {
		alert("VACIO");
	}
};


/*
 * Pruebasssssssssssssssssssssssss
 */
$("#registrarPrestamo").click(function () {
	
    var user = $("#idu").val();   
    if(fe_pre==="dd/mm/aaaa" || fe_dev==="dd/mm/aaaa" || aul==="" || prof==="" || user===""){
        Materialize.toast("Completar todos los campos de datos", 1980);
    }
    else  {
        if($("#tablaDetalle tbody tr").length===0)
        {
            Materialize.toast("No hay equipos seleccionados", 1980);
        }
        else{
            $.post("Pc", {"fec_pre": fe_pre, "alu": alum, "fe_devo": fe_dev, "horaPre": h_pre, "horadev": h_dev, "aula": aul, "prof": prof, "docu": docu, "user": user, "opc": 1}, function (data) {
              var x = JSON.parse(data);
                if(x===0){
                    Materialize.toast("Error, prestamo no realizado!", 1980); 
                }
                else{
                    $('#tablaDetalle tbody tr').each(function () {
                    
                    var nom = $(this).find("td").eq(0).text();
                    produ.push(nom);
                    });
                        $.ajax({
                           url: "DPC",
                           type:'POST',
                           dataType:'json',
                           data: {
                               opc:1,
                               idp:x,
                               prod:produ
                           },
                           success:function(data){
                               if (data>0){
                               }
                           },
                           error:function(){
                               
                           }
                        });
                    produ=[];  
                   Materialize.toast("Prestamo exitoso", 1980); 
                   setTimeout("location.href='Prestamo.jsp'", 2100);
                   var idrr = $("#ress").val();
                    if(idrr!=="null"){
                        $.post("Pc",{"idres":idrr,"opc":8},function(){ 
                    });
                    }
                }
            });
        } 
     
   } 
});

/*
 * 
 */


$("#dnipro").keyup(function () {
    var dni = $("#dnipro").val();
    if (dni.length === 8)
    {
        $.get("Pc", {"dni": dni, "opc": 5}, function (data) {
            var x = JSON.parse(data);
            $("#profe").val(x.nomApe);
            $("#prof").val(x.idProfesor);
            if($("#profe").val()===""){
            Materialize.toast("Error! ingresar DNI de un profesor",1980);
        }
        });
    }
});
$("#responsable").keyup(function () {

    if ($("#responsable").val() !== "" )
    {
        $('#docu').prop("disabled", false);
        $('#docu').material_select();
    }
    else{
        $('#docu').prop("disabled", true);
        $('#docu').material_select();
    }
});
function ListarDoc() {
    $.get("Pc", {"opc": 6}, function (data) {
        var x = JSON.parse(data);
        for (var i = 0; i < x.length; i++) {
            $("#docu").append("<option value='" + x[i].id + "'>" + x[i].nombre + "</option>");
        }
        $("#docu").material_select();
    });
}
function VerificacionReserva(){
        var x = $("#ress").val();
        if(x!=="null"){
            $.get("Pc", {"idd":x,"opc": 11}, function (data) {
            var y = JSON.parse(data);
            var e;
            for (var i = 0; i < y.length; i++) {
                document.getElementById("bt"+ y[i].idP +"").style.color = 'green';
                if (y[i].est === 0) {
                e  = "Mal estado";
            }
            if (y[i].est === 1) {
                e  = "Buen estado";

            }
            if (y[i].est === 2) {
                e = "Estado intermedio";

            }
                $("#tablaDetalle").append("<tr><td hidden>"+ y[i].idP +"</td><td>" + y[i].nom + "</td><td>" + e + "</td><td>" + y[i].nomTip + "</td>\n\
                <td><button class='material-icons prefix' style='background:none;border:none; color:#D84A52' onclick='eliminarEquipo(this.parentNode.parentNode.rowIndex,"+y[i].idP+")'>highlight_off</button></td></tr>");
            }
            $.get("Pc", {"idr":x,"opc": 10}, function (dat) {
                var y = JSON.parse(dat);             
                $("#fecha_pre").val(y.fe_prestamo);
                $("#fechadev").val(y.fe_devolucion);
                $("#hora_pre").val(y.hora_pre);
                $("#hora_dev").val(y.hora_devo);
                $("#aula").val(y.aula);
                $("#prof").val(y.id_profe);
                $("#profe").val(y.nom_profe);
            });
            if($("#tablaDetalle tbody tr").length===0){
                location.reload();
            }
            });
        }
        
}
function eliminarEquipo(x,y){
    document.getElementById("tablaDetalle").deleteRow(x);
    document.getElementById("bt"+y+"").style.color = 'lightblue';
    
    
}

