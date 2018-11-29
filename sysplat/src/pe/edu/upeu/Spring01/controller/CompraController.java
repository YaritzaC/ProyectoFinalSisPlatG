package pe.edu.upeu.Spring01.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

import pe.edu.upeu.Spring01.entity.Empleado;
import pe.edu.upeu.Spring01.entity.OrdenCompra;
import pe.edu.upeu.Spring01.entity.Producto;
import pe.edu.upeu.Spring01.service.CompraService;
import pe.edu.upeu.Spring01.service.DetalleOrdenCompraService;
import pe.edu.upeu.Spring01.service.OrdenCompraService;
import pe.edu.upeu.Spring01.service.ProductoService;
import pe.edu.upeu.Spring01.serviceImp.EmpleadoServiceImp;

@Controller
public class CompraController {
	
	private Gson gson;
	
	public static ArrayList<Producto> produ = new ArrayList<>();

	@Autowired
	private ProductoService productoservice;

	@Autowired
	private CompraService cmp;

	@Autowired
	private DetalleOrdenCompraService det;

	@Autowired
	private OrdenCompraService ordcompra;

	/*
	 * Mandar al menu principal
	 */
	@GetMapping("/Compras")
	public String compras() {
		System.out.println("Compras"); 
		return "com_main_main";
	}
	
	/*
	 * Modulo de compras
	 * Me lista los productos que tienen en el stock menores a 5
	 * Ya funciona no tocar
	 * 
	 * Parte numero 1.1
	 */
	
	@GetMapping("/Crear-Orden-Compras")
	public ModelAndView crearordencompra() {
		ModelAndView ma = new ModelAndView();
		ma.setViewName("com_listascompras");
		ma.addObject("listaProductosMenores", productoservice.readAllMenor());
		return ma;
	}
	
	/*
	 * Parte numero 1.2
	 */
	
	@GetMapping("/Aceptar-Orden-de-Compra")
	public ModelAndView aceptarComprapro() {
		ModelAndView ma = new ModelAndView();
		ma.setViewName("com_main_listascompras(Aceptar)");
		ma.addObject("listaCom", produ);
		return ma;
	}
	
	/*
	 * Modulo de Registrar orden compra
	 * Me lista las ordenes de compra
	 * Ya funciona no tocar
	 * 
	 * Parte numero 2.1
	 */
	
	@GetMapping("/Registrar-Orden-Compra")
	public ModelAndView registrarordencompra() {
		ModelAndView ma = new ModelAndView();
		ma.setViewName("com_main_registrarcompra");
		ma.addObject("listasCompras", det.listarordencompra());
		return ma;
	}
	
	/*
	 * Parte numero 2.2
	 */
	
	@GetMapping("/Registrar-Listas-Compras")
	public String registrarlistascompras() {
		return "com_main_registrarproductos";
	}
	
	/*
	 * Modulo de ingresar productos 
	 * Me lista las ordenes de compra
	 * Ya funciona no tocar
	 * 
	 * Parte 3.1
	 */
	
	@GetMapping("/Registrar-Listas")
	public ModelAndView registrarlistas() {
		System.out.println("com_main_registrarproducto");
		ModelAndView ma = new ModelAndView();
		ma.setViewName("com_main_registrarproducto");
		ma.addObject("listasRegistras", det.listarordencompra());
		return ma;
	}
	
	/*
	 * Parte numero 3.2
	 */
	
	@RequestMapping("/Ingresar-Productos-Comprados/{lis.ORDCOM_CODIGO}") 
	public String ingresarproductos2(@RequestParam("id") int id)
	{ 
		OrdenCompra ordencompra= new
		OrdenCompra(); ordencompra.setIdordencompra(id);
		return "redirect:/sysplat/SeEnviaLaLista"; 
		}
	
	/*
	 * Parte que me listara de acuerdo al id de la lista
	 */
	@RequestMapping(value = "/hc")
	public void cliente(HttpServletRequest request, HttpServletResponse response) throws IOException, SQLException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		int op = Integer.parseInt(request.getParameter("opc"));
		switch (op) {
		case 1:
			out.println(gson.toJson(ordcompra.traerproductos(request.getParameter("nombre"))));
			break;
		}
	}
	
	/*
	 * Modulo de Productos 
	 */
	@GetMapping("/Productos")
	public ModelAndView productos() {
		ModelAndView ma = new ModelAndView();
		ma.setViewName("com_producto");
		ma.addObject("listaPro", productoservice.readAll());
		return ma;
	}
	
	/*
	 * Modulo de Proveedor
	 */
	
	@GetMapping("/Proveedores")
	public String proveedor() {
		System.out.println("idfefesf");
		return "proveedor";
	}
	
	
	
}
