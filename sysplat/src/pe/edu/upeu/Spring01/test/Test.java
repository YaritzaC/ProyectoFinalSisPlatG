package pe.edu.upeu.Spring01.test;


import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import oracle.net.aso.e;
import pe.edu.upeu.Spring01.dao.ClienteDao;
import pe.edu.upeu.Spring01.dao.DetalleVentaDao;
import pe.edu.upeu.Spring01.dao.EmpleadoDao;
import pe.edu.upeu.Spring01.dao.HojaContratoDao;
import pe.edu.upeu.Spring01.dao.MateriaOrdenDao;
import pe.edu.upeu.Spring01.dao.OrdenTrabajoDao;
import pe.edu.upeu.Spring01.dao.ProductoDao;
import pe.edu.upeu.Spring01.dao.VentaDao;
import pe.edu.upeu.Spring01.entity.Cliente;
import pe.edu.upeu.Spring01.entity.DetalleVenta;
import pe.edu.upeu.Spring01.entity.Empleado;
import pe.edu.upeu.Spring01.entity.HojaContrato;
import pe.edu.upeu.Spring01.entity.MateriaOrden;
import pe.edu.upeu.Spring01.entity.OrdenTrabajo;
import pe.edu.upeu.Spring01.entity.Producto;
import pe.edu.upeu.Spring01.entity.Venta;

public class Test {

	public static void main(String[] args) throws SQLException {
		 conexion();
	}
	
	  static void conexion() {
	        if (conexion.getConexion() != null) {
	            System.out.println("Conexion Correcta Pero eso no quiere decir dejas de ser un fracasado :v ");
	        } else {
	            System.out.println("Conexion Incorrecta Iguales eres un fracaso :v");
	        }
	    }
}
