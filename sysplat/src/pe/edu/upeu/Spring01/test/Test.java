package pe.edu.upeu.Spring01.test;


import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import oracle.net.aso.e;
import pe.edu.upeu.Spring01.dao.ClienteDao;
import pe.edu.upeu.Spring01.dao.EmpleadoDao;
import pe.edu.upeu.Spring01.dao.HojaContratoDao;
import pe.edu.upeu.Spring01.dao.OrdenTrabajoDao;
import pe.edu.upeu.Spring01.dao.ProductoDao;
import pe.edu.upeu.Spring01.dao.VentaDao;
import pe.edu.upeu.Spring01.entity.Cliente;
import pe.edu.upeu.Spring01.entity.Empleado;
import pe.edu.upeu.Spring01.entity.HojaContrato;
import pe.edu.upeu.Spring01.entity.OrdenTrabajo;
import pe.edu.upeu.Spring01.entity.Producto;
import pe.edu.upeu.Spring01.entity.Venta;

public class Test {

	public static void main(String[] args) throws SQLException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		System.out.println(context); 
		//ClienteDao dao = (ClienteDao)context.getBean("clienteDaoImp");
		 //Cliente cl = dao.buscarNatural("11111111");
		// System.out.println("Cliente " +cl.getIdcliente() + " "+ cl.getRazonsocial()+ " "+ cl.getNombre());
		//ProductoDao dao = (ProductoDao)context.getBean("productoDaoImp");
		//Producto pro = dao .buscarProducto("1");
		//System.out.println("Producto " + pro.getNombre());
		//VentaDao dao = (VentaDao)context.getBean("ventaDaoImp");
		 
		 //List<Map<String, Object>> lista = dao.numeroSerie();
	        //for(Map<String,Object> map:lista) {
	        	//System.out.println(map.get("VNT_SERIE"));
	        //}
	       // HojaContratoDao dao = (HojaContratoDao)context.getBean("hojaContratoDaoImp");
		
		
		//try {
		//	VentaDao dao = (VentaDao)context.getBean("ventaDaoImp");
		//	Venta h = new Venta(1,1,1000000,500, "Contado", 100);
		//dao.crearVentaPedidoBoleta(h);
		//} catch (Exception e) {
		//System.out.println("Error " + e);
		//}
		ClienteDao dao = (ClienteDao)context.getBean("clienteDaoImp");
		List<Map<String, Object>> lista = dao.readAll();
		for(Map<String,Object> map:lista) {
        	System.out.println(map.get("CLI_NOMBRE"));
        }
	        context.close();
	}
}
